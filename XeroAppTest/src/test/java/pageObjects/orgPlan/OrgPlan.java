package pageObjects.orgPlan;

import pageObjects.login.Login;
import pageObjects.login.ValidLogin;
import pageObjects.login.WrongPswd;
import pageObjects.login.WrongUn;
import pageObjects.login.ForgotPswd;
import utilities.ExcelData;

public class OrgPlan {

	   public static void main(String[] a) throws Exception{
		   OrgPlan.testOrgPlanTestCase();
	    }
		
		public static void testOrgPlanTestCase() throws Exception{
			
			String dt_path = "/Users/sakeerthi/Documents/ModuleData.xls";
			String[][] excelData = ExcelData.readExcelData(dt_path, "Sheet1");
			
			OrgTrail.test(excelData);
			
			
		}
}
