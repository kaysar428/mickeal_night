package Expedia_Element_Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Expedia_Utilities_Pages.Driver;

public class Expedia_CreateAccountPage {

	private WebDriver driver;
	
	public Expedia_CreateAccountPage(){
		this.driver=Driver.getInstance();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="header-account-menu")
	 public WebElement AccountHomePage;
	
	@FindBy(id="account-register")
	public WebElement CreateAnAccount;
	
	@FindBy(id="create-account-firstname")
	public WebElement FirstName;
	
	@FindBy(id="create-account-lastname")
	public WebElement LastName;
	
	@FindBy(id="mail")
	public WebElement TempEmail;
	
	@FindBy(id="create-account-emailId")
	public WebElement Email;
	
	@FindBy(id="create-account-password")
	public WebElement Password;
	
	@FindBy(id="create-account-confirm-password")
	public WebElement ConfirmPasswrod;
	
	@FindBy(id="create-account-expedia-policy")
	public WebElement TermOfPolicy;
	
	@FindBy(id="create-account-submit-button")
	public WebElement ClickCreateAccountButton;

 
public void Expedia_HomePage_Element(String accountpage, String accounthomepage, String firstname,String lastname, 
	          	String email, String password, String policy, String ClickAccount ){
	
	   
	AccountHomePage.click();
	FirstName.sendKeys(firstname);
	LastName.sendKeys(lastname);
	Email.sendKeys(email);
	Password.sendKeys(password);
	TermOfPolicy.click();
	ClickCreateAccountButton.click();
	
		
}

}
