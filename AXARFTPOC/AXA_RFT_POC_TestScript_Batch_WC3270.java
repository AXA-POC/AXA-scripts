
import resources.AXA_RFT_POC_TestScript_Batch_WC3270Helper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * Description   : Functional Test Script
 * @author jonathan.h.francisco
 */
public class AXA_RFT_POC_TestScript_Batch_WC3270 extends AXA_RFT_POC_TestScript_Batch_WC3270Helper
{

	public void testMain(Object[] args) 
	{
		// launch application under test
		startApp("wc3270");
		
	
		// Window: wc3270.exe: Mainframe - wc3270
		WC3270Window().inputKeys("LOGON EMPOT18");
		WC3270Window().inputKeys("{ENTER}");
		WC3270Window().inputKeys("TEST");
		WC3270Window().inputKeys("{ENTER}");
		WC3270Window().inputKeys("{ENTER}");
		WC3270Window().inputKeys("3.1");
		WC3270Window().inputKeys("{ENTER}");
		
		WC3270Window().inputKeys("V");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("'EMPOT18.DEVOPS.JCLLIB(INS01RUN)'");
		WC3270Window().inputKeys("{ENTER}");
		WC3270Window().inputKeys("{ENTER}");
		
		
		WC3270Window().inputKeys("SUB");
		WC3270Window().inputKeys("{ENTER}");
		WC3270Window().performTest(MainframeWc3270_standardVP());
		
		WC3270Window().inputKeys("{ENTER}");
		WC3270Window().inputKeys("{ENTER}");
		WC3270Window().inputKeys("^v{ENTER}");
		WC3270Window().inputKeys("^v{ENTER}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("S{ENTER}");
		WC3270Window().inputKeys("F{BKSP}{CAPSLOCK}{CAPSLOCK}F '^v'{ENTER}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("3.4{ENTER}");
		WC3270Window().inputKeys("^v{ENTER}");
		WC3270Window().inputKeys("{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}");
		WC3270Window().inputKeys("{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}");
		WC3270Window().inputKeys("{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}");
		WC3270Window().inputKeys("{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}");
		WC3270Window().inputKeys("{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}");
		WC3270Window().inputKeys("{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}");
		WC3270Window().inputKeys("{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}");
		WC3270Window().inputKeys("{ExtDelete}{ExtDelete}{TAB}");
		WC3270Window().inputKeys("^v{ENTER}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("{TAB}");
		WC3270Window().inputKeys("V{ENTER}");
		WC3270Window().inputKeys("{ENTER}");
		WC3270Window().click(CAPTION);
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("{F3}");
		WC3270Window().inputKeys("X{ENTER}");
		WC3270Window().click(atPoint(40,40));
		WC3270Window(ANY,MAY_EXIT).click(atPoint(81,286));
		
		

		
		
	}
}

