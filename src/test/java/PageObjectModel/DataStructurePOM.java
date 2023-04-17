package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DataStructurePOM {
	public WebDriver driver;
	public DataStructurePOM(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//a[text()='Sign in']")
	 WebElement signinlink;
	
	@FindBy(xpath = "//input[@name='username']")
	 WebElement UsernameField1;
	
	@FindBy(xpath = "//input[@name='password']")
	 WebElement PasswordField1;	
		
		@FindBy(xpath = "//input[@value='Login']")
	WebElement signinButton;
		

    @FindBy (xpath=("//h5[text()='Data Structures-Introduction']/..//a[text()='Get Started']")) WebElement getStartedDataStructure;
	@FindBy (xpath =("//a[text()=\"Time Complexity\"]"))WebElement TimeComplexity;
	@FindBy (xpath =("//a[text()=\"Try here>>>\"]"))WebElement DataStructureTryHere;
	@FindBy (xpath = ("//form[@id='answer_form']/div/div/div[1]/textarea")) WebElement enterCode;
	@FindBy (xpath ="//form/div/div/div/textarea")WebElement textEditor; 
	@FindBy (xpath = ("//form[@id='answer_form']//button")) WebElement Run;
	@FindBy (id = ("output")) WebElement outputPythonCode;
	
	public void clicksigninlink() {
		signinlink.click();
	}
	public void clickUsernameField1() {
		UsernameField1.click();
	}
	public void clickPasswordField1() {
		PasswordField1.click();
	}
	public void FillsigninForm(String UserName,String Password) throws InterruptedException
	{
		UsernameField1.click();
		UsernameField1.sendKeys(UserName);
		Thread.sleep(1000);
		PasswordField1.sendKeys(Password);
		Thread.sleep(1000);
	}
	public void clickLogInButton() {
		signinButton.click();
	}
	public void clickOngetStartedDataStructure() {
		getStartedDataStructure.click();
	}
		
		
		public void clkTimeComplexity() {
			TimeComplexity.click();
		}
		public void clickOnDataStructureTryHere() {
			 
			DataStructureTryHere.click();
		}
		
		public void enterCode()  
		{
			textEditor.sendKeys("print(\"Hello Everyone\" \");");
			//textEditor.sendKeys(pythonCode);
		}	
		public void InValidenterCode(String pythonCode) throws InterruptedException {
			//LoggerLoad.info("User enter the valid print statement");
			textEditor.sendKeys(pythonCode);
		} 
		public void clickOnRun() {
			
			Run.click();		
		}
		public String getErrormsg()
		{
			String errormsg = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			return errormsg; 
		}
		public String DataStructure_outputPythonCode()
		{
	
			String outputPythonCode=DataStructure_outputPythonCode();
			
			return outputPythonCode;
		}	
		
		//public void navigateback(){
		   //navigateback();
		//}

}