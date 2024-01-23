package Pagelogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageLogin {

@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
WebElement username;
@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
WebElement password;
@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
WebElement boutonlogin;
@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
WebElement verif;
public HomePageLogin (WebDriver driver) {
	PageFactory.initElements(Config.driver, this);
}
public void connect (String log,String pass) {
	Config.attente(10);
	System.out.println("okk");
	username.sendKeys(log);
	password.sendKeys(pass);
	boutonlogin.click();
}
public String verifmessage () {
	String actuelmessage=verif.getText();
	return actuelmessage;
}
}
