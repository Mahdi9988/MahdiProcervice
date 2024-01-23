package Pagelogin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class Homepageverif {

	@FindBy (tagName="h6")
	WebElement webdashbordelement;
	@FindBy (xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")
	List<WebElement> menus;
	
	public Homepageverif (WebDriver driver) {
		PageFactory.initElements(Config.driver, this);
	}
	public String verifmessage() {
		String actuelmessage = webdashbordelement.getText();
		return actuelmessage;
	}
	public void clictomenubyname (String menuName) {
		for(WebElement menu:menus) {
			if (menu.getText().contains(menuName)) {
				menu.click();
			}
		}
	}
}
