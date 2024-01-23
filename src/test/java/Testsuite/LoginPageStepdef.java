package Testsuite;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pagelogin.HomePageLogin;
import Pagelogin.Homepageverif;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepdef {
@Before
public void init() {
	Config.configchrome();
	Config.driver=new ChromeDriver();
	Config.maximaizewindow();
}
	@Given("admin in the login page")
	public void admin_in_the_login_page() {
	   Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	}

	@When("admin enter corect logni {string} and correct password {string}")
	public void admin_enter_corect_logni_and_correct_password(String log, String pass) {
		HomePageLogin homepage=new  HomePageLogin(Config.driver);
	    homepage.connect(log, pass);
	}

	@Then("admin is director to the homepage that contains {string}")
	public void admin_is_director_to_the_homepage_that_contains(String Expectedmessage) {
		 Homepageverif home =new Homepageverif(Config.driver);
		    String Actuelmessage=home.verifmessage();
		    Assert.assertEquals(Expectedmessage, Actuelmessage);
	}
	@When("admin enter corect logni {string} and incorrect password {string}")
	public void admin_enter_corect_logni_and_incorrect_password(String log, String pass) {
		HomePageLogin homepage=new  HomePageLogin(Config.driver);
	    homepage.connect(log, pass);
	}

	@Then("admin is still in login page that contains {string}")
	public void admin_is_still_in_login_page_that_contains(String Expectedmessage) {
		HomePageLogin home =new HomePageLogin(Config.driver);
	    String Actuelmessage=home.verifmessage();
	    Assert.assertEquals(Expectedmessage, Actuelmessage);
}
}