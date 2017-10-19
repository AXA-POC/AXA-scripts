
import java.util.concurrent.TimeUnit;
import resources.AXA_RFT_POC_TestScript_BatchHelper;
import com.rational.test.ft.*;
import javax.swing.JOptionPane;
/**
 * Description   : Batch test script
 * @author jonathan.h.francisco
 */
public class AXA_RFT_POC_TestScript_Batch extends AXA_RFT_POC_TestScript_BatchHelper
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
		Application().inputKeys(dpString("tsoLogon"));
		Application().inputKeys("{ENTER}");
		Application().inputKeys(dpString("password"));
		Application().inputKeys("{ENTER}");
		TimeUnit.SECONDS.sleep(2);
		Application().inputKeys("{ENTER}");
		
		//ISPF screen
		ISPFoptionField1().setText(dpString("option1"));
		Application().inputKeys("{ENTER}");
		LibraryUtilityOptionField().setText(dpString("option2"));
		datasetName().setText(dpString("datasetName"));
		Application().inputKeys("{ENTER}");
		TimeUnit.SECONDS.sleep(2);
		Application().inputKeys("{ENTER}");
		
		//submit and navigate to SDSF
		commandField().setText(dpString("commandSubmit"));
		Application().inputKeys("{ENTER}");
		TimeUnit.SECONDS.sleep(2);
		submitMessage().performTest( submitVerificationVP() );
		Application().inputKeys("{ENTER}");
		TimeUnit.SECONDS.sleep(2);
		Application().inputKeys("{ENTER}");
		commandField().setText(dpString("commandSDSF"));
		Application().inputKeys("{ENTER}");
		Application().inputKeys("{ENTER}");
		commandInput().setText(dpString("commandInput"));
		Application().inputKeys("{ENTER}");
		leftField().setText("s");
		Application().inputKeys("{ENTER}");
		SDSFoutputCommandInput().setText("f 'MAXIMUM CONDITION CODE WAS 0'");
		Application().inputKeys("{ENTER}");
		TimeUnit.SECONDS.sleep(2);
		findTextOutput().performTest( processingCompleteVerificationVP() );
		
		// back to ISPF
		for(int i=1; i<5; i++){
			Application().inputKeys("{F3}");
		}
		
		ISPFoptionField1().setText(dpString("ISPFoption"));
		Application().inputKeys("{ENTER}");
		DsNameLevel().setText(dpString("dsNameLevel"));
		Application().inputKeys("{ENTER}");
		
		
		// view contents of dataset 
		Application().inputKeys("{TAB}");
		Application().inputKeys("{TAB}");
		Application().inputKeys("v");
		Application().inputKeys("{ENTER}");
		Application().inputKeys("{ENTER}");
		Application().inputKeys("{F3}");
		Application().inputKeys("{TAB}");
		Application().inputKeys("v");
		Application().inputKeys("{ENTER}");
		Application().inputKeys("{ENTER}");
		Application().inputKeys("{F3}");
		
		
	}
}

