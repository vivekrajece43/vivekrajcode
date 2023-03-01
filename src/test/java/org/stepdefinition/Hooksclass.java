package org.stepdefinition;

import org.base.BaseClasss;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass extends BaseClasss {
	@Before(order = 1)
	//precondition
	private void precondition1() {
		launchBrowser();
		System.out.println("launch the browser");
		

	}
	@Before(order =2)
	private void precondition2() {
		windowMaximize();
		

	}
	@Before(order = 3,value = "@Regression")
	private void precondition3() {
		System.out.println("precondition 3");

	}
	
	
	@After(order = 10,value ="@Regression")
    //postcondition
	private void postcondition5() {
		System.out.println("Take screen shot of scenerio");

	}
	@After(order = 4)
	private void postcondition4() {
		closeEntireBrowser();
		System.out.println("close entire browser");

	}
}
