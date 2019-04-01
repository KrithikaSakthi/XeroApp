package pageObjects.freeTrial;

import utilities.ExcelData;

public class FreeTrial {

		
		public static void testFreeTrailTestCase(String[][] excelData) throws Exception{
			
			SignUP.test(excelData);
			SignUpXdc.test(excelData);
			SignUpPrivacy.test(excelData);
			SignUpOffer.test(excelData);
			SignUpOffer.test(excelData);
			
		}
}
