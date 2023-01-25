package testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class Testcase {

	LoginPage loginPage;

	@BeforeClass
	public void setup() {
		BaseTest.startBrowser();
		loginPage = new LoginPage();
	}

	@Test(dataProvider = "logindata")
	public void loginTest(String s1, String s2) {
		loginPage.checklogin(s1, s2);

	}

	@DataProvider(name = "logindata")
	public Object[][] loginData() {
		return new Object[][] { { "abhi7354@yahoo.co.in", "Test1234@" } };

	}

	@AfterClass
	public void clean() {
		// BaseTest.cleanup();
	}
}
