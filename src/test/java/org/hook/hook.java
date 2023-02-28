package org.hook;


import base.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hook extends BaseClass{
	@Before
	public void laun() {
		// TODO Auto-generated method stub
//		LaunchBrowserChrome();
		System.out.println("hi");
	}
@After(order = 1)
public void clo() {
	System.out.println("hello");
	// TODO Auto-generated method stub
closeEntireBrowser();
}

}




