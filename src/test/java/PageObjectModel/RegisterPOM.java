package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.NoSuchElementException;

public class RegisterPOM extends BaseClass{
	
	public static WebDriver webdriver;
	
	public RegisterPOM(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//input[@value='Register']")
	public WebElement RegisterButton;
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement UsernameField;
	
	@FindBy(xpath = "//input[@name='password1']")
	public WebElement PasswordField;	
	
	@FindBy(xpath = "//input[@name='password2']")
	public WebElement PasswordConfirmationField;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	public WebElement SignOutLink;
	
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	public WebElement RegisterSuccessMsg;
	
	public void clickRegisterButton() {
		RegisterButton.click();
	}
	public void clickUsernameField() {
		UsernameField.click();
	}
	public void clickPasswordField() {
		PasswordField.click();
	}
	public void clickPasswordConfirmationField() {
		PasswordConfirmationField.click();
	}
	public void clickSignOutLink() {
		SignOutLink.click();
	}

	public void CheckRegisterSuccessMsg() {
try {
	
	if(SignOutLink.isDisplayed())
	{
		clickSignOutLink();
	}
	else {
		System.out.println("NoSignout Link");
	}
}
catch(NoSuchElementException e)
{
	
}
	}
	

	public void FillRegisterForm(String username,String password,String passwordconfirmation,String Msg) throws InterruptedException
	{
		UsernameField.click();
		UsernameField.sendKeys(username);
		PasswordField.sendKeys(password);
		PasswordConfirmationField.sendKeys(passwordconfirmation);
				
	}
	
}
