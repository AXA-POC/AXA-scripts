
import java.util.concurrent.TimeUnit;
import resources.AXA_RFT_POC_TestScript_OnlineHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
import javax.swing.JOptionPane;


/**
 * Description   : Online test script
 * @author jonathan.h.francisco
 */
public class AXA_RFT_POC_TestScript_Online extends AXA_RFT_POC_TestScript_OnlineHelper
{


	public void testMain(Object[] args) throws InterruptedException 
	{
		// launch the application under test
		startApp("Extension for Terminal Applications");
		
		// connect
		host().setText(dpString("host"));
		terminalType().select(dpString("terminalType"));
		port().setText(dpString("port"));
		screenSize().select(dpString("screenSize"));
		connectButton().click();
		
		// sign in
		Application().inputKeys("L CICSTS52");
		Application().inputKeys("{ENTER}");
		Application().inputKeys(dpString("Username"));
		Application().inputKeys("{TAB}");
		Application().inputKeys("{TAB}");
		Application().inputKeys(dpString("password"));
		Application().inputKeys("{ENTER}");
		
		// MK00 screen login
		Application().inputKeys("MK00");
		Application().inputKeys("{ENTER}");
		Application().inputKeys(dpString("maintenanceScreenUsername"));
		Application().inputKeys("{ENTER}");
		
		// enter last name
		if (dpString("lastName") != null && !dpString("lastName").isEmpty()) {
			mk00_lastName().setText(dpString("lastName"));
		}
		
		// enter first name
		if (dpString("firstName") != null && !dpString("firstName").isEmpty()) {
			mk00_firstName().setText(dpString("firstName"));
		}

		Application().inputKeys("{ENTER}");
		
		
		TimeUnit.SECONDS.sleep(2);
		String messageText = (String) mk00_messageText().getProperty("text");

		if (messageText.trim().equals(dpString("confirmationMessageString"))) {
			logTestResult(dpString("confirmationMessageString") + " message string found", true);
		} else {
			logTestResult(dpString("confirmationMessageString") + " message string not found", false);
		}
		
		
		// press enter while there are more matching names
		/*
		TimeUnit.SECONDS.sleep(2);
		String strMoreMessage = (String) mk00_messageText().getProperty("text");
		while (strMoreMessage.toLowerCase().contains(dpString("host"))){
			Application().inputKeys("{ENTER}");
			strMoreMessage = (String) mk00_messageText().getProperty("text");
		}
		*/
		
		//JOptionPane.showMessageDialog(null, strValue, "Info", JOptionPane.INFORMATION_MESSAGE);
		//mk00_messageText().performTest(mk00_moretext_checkpointVP());
		
		Application().close();
		TimeUnit.SECONDS.sleep(2);
	}
}

