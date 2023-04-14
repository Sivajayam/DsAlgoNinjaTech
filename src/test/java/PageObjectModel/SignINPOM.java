package PageObjectModel;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.ExcelSheet;


public class SignINPOM extends BaseClass{
	
//private static final String WorkSheetName = null;

public static WebDriver webdriver;
	
	public SignINPOM(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement UsernameField1;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement PasswordField1;	
	
	@FindBy(xpath = "//input[@value='Login']")
	public WebElement LogInButton;
	
	@FindBy(xpath = "//div[contains(text(),'You are logged in')]")
	public WebElement SuccessLogInMsg;
	
	public void clickUsernameField1() {
		UsernameField1.click();
	}
	public void clickPasswordField1() {
		PasswordField1.click();
	}
	
	public void clickLogInButton() {
		LogInButton.click();
	}
	public void EnterUsername(String username) throws InterruptedException
	{
		UsernameField1.click();
		UsernameField1.sendKeys(username);
		Thread.sleep(1000);
	}
	public void EnterPassword(String password) throws InterruptedException
	{
		PasswordField1.click();
		PasswordField1.sendKeys(password);
		Thread.sleep(1000);
	}
	public void checkSuccessMsg()
	{
		String successmsg= SuccessLogInMsg.getText();
		Assert.assertEquals(successmsg,"You are logged in" );
	}
	
	public void FillSignInForm(String sheetname) throws IOException, InterruptedException
	{
		 ExcelSheet reader =new ExcelSheet();
		 try {
		 Object data[][]=reader.getTestData("WorkSheetName");
				
					String username, password;

						for (int i = 0; i < data.length; i++) {
							username = null;
							password = null;
							for (int j = 0; j < data[i].length; j++) {
								if (j == 0) {
									username = (String) data[i][j];
								}
								if (j == 1) {
									password = (String) data[i][j];
								}
							}
							if (username != null && password != null) {
								if(username.equalsIgnoreCase("null")) {
									username = "";
								}
								if(password.equalsIgnoreCase("null")) {
									password = "";
								}
								//System.out.println("User Name: " + username);
								//System.out.println("Password: " + password);
								EnterUsername(username);
								EnterPassword(password);
								clickLogInButton();
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
	}
	
}
