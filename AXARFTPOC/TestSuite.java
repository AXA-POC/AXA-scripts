
import resources.TestSuiteHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Test Suite
 * @author jonathan.h.francisco
 */
public class TestSuite extends TestSuiteHelper
{

	public void testMain(Object[] args) 
	{
		// call online test script
		callScript("AXARFTPOC_TestScript_Online");
		
		// call batch test script
		callScript("AXARFTPOC_TestScript_Batch");
		
	}
}

