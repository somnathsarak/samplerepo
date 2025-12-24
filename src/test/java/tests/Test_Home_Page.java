package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

@Listeners(base.MyListeners.class)
public class Test_Home_Page extends BaseClass {
	

	    @Test
	    public void loginTest() {
	    	LoginPage ref = new LoginPage(driver);
	    	ref.enterUsername();
	    }
	}
