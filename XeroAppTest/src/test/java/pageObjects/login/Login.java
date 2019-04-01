package pageObjects.login;


import utilities.ExcelData;


public class Login {

	
	public static void testLoginTestCase(String[][] excelData) throws Exception{
		ValidLogin.test(excelData);
		WrongPswd.test(excelData);
		WrongUn.test(excelData);
		ForgotPswd.test(excelData);
		
	}
}
