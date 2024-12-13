
package com.qa.demo_1;

import org.testng.annotations.Test;

public class TestClass extends BrowerBase{

	
	@Test
	public static void test1() throws Exception {
		
		BrowerBase.broWser();
		///Objectrepos obr = new Objectrepos(driver);
		//Objectrepos.commonMethod();		
		Objectrepos.openMultipleWindows();
		Objectrepos.handleMultipleWindows();
		
	}
}
