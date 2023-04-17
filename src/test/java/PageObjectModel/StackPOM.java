package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPOM {

	public WebDriver driver;
	
	@FindBy(xpath="//a[@href='stack']")
	WebElement stack_getstarted;

	@FindBy(xpath="//a[@href='operations-in-stack']")
	WebElement stack_operationsInStacklink;

	@FindBy(xpath="//a[@href='implementation']")
	WebElement stack_implementationlink;

	@FindBy(xpath="//a[@href='stack-applications']")
	WebElement stack_applicationslink;

	@FindBy(xpath ="//a[text()='Try here>>>']")
	WebElement stack_tryhereBtn;


	@FindBy(xpath = "//form/div/div/div/textarea")
	WebElement stack_texteditor; 

	@FindBy(xpath ="//button[text()='Run']")
	WebElement stack_runBtn;
	
	public StackPOM(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnGetStarted()
	{
	
		stack_getstarted.click();
	}
	
	public void clickOnOperationsInStackLink()
	{
	
		stack_operationsInStacklink.click();
	}
	
	public void clickOnImplementationLink()
	{
	
		stack_implementationlink.click();
	}
	
	public void clickOnApplicationsLink()
	{
		
		stack_applicationslink.click();
	}
		
	public void clickOntryhereBtn()
	{
		
		stack_tryhereBtn.click();
	}
	
	public void entercode()
	{
		
		stack_texteditor.sendKeys("print(\"Stack \" \");");
	}
	public void entercode_1()
	{
		stack_texteditor.sendKeys("print(Stack_invalid);");
	}
	
	public void clickOnrunBtn()
	{
		
		stack_runBtn.click();
	}
	public String getErrormsg() 
	{
		String errormsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errormsg;
	}


}