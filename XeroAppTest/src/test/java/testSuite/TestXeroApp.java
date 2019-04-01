package testSuite;

import pageObjects.accounts.Account;
import pageObjects.freeTrial.FreeTrial;
import pageObjects.login.Login;
import pageObjects.logout.Logout;
import pageObjects.orgPlan.OrgPlan;
import pageObjects.tab.Tab;
import pageObjects.uploadImage.UploadImage;
import utilities.ExcelData;

public class TestXeroApp {

	public static void main(String[] args) throws Exception {
		String dt_path = "/Users/sakeerthi/Documents/Workspace/XeroComApp/src/test/java/ModuleData.xls";
		String[][] excelData = ExcelData.readExcelData(dt_path, "Sheet1");
		
		Login.testLoginTestCase(excelData);
		FreeTrial.testFreeTrailTestCase(excelData);
		Tab.test(excelData);
		Logout.test(excelData);
		UploadImage.test(excelData);
		//OrgPlan.testOrgPlanTestCase();
		Account.test(excelData);

	}

}
