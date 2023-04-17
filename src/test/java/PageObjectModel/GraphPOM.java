package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPOM {
	public GraphPOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	// Using FindBy for locating elements
	@FindBy(xpath="//a[@href='graph']")
	WebElement getstarted;

	@FindBy(xpath="//a[@class='list-group-item']")
	WebElement graphlink;

	@FindBy(xpath="//a[@href='graph-representations']")
	WebElement graphrepresentationslink;
	@FindBy (xpath = "//a[@href='/tryEditor']")
	WebElement graph_tryEditor;
	@FindBy (xpath ="//form/div/div/div/textarea")
	WebElement textEditor; 
	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBtn;
	@FindBy(xpath ="//pre[@id='output']")
	WebElement outputText;
	
	
	public void clickOnGetStarted()
	{
		// TODO Auto-generated method stub
		getstarted.click();
	}
	
	public void clickOnGraphLink()
	{
		// TODO Auto-generated method stub
		graphlink.click();
	}
	
	public void clickOnGraphRepresentationsLink()
	{
		// TODO Auto-generated method stub
		graphrepresentationslink.click();
	}
	public void clickOnGraphTryhereLink() {
		graph_tryEditor.click();
		
	}
	public void enterCode()  
	{
		textEditor.sendKeys("print(\"Hello Everyone\" \");");
		//textEditor.sendKeys(pythonCode);
		
	}
	public void clickOnRunBtn()
	{
		runBtn.click();	
	}
	
	public String getOutput()
	{
	//driver.waitForElement(outputText);
		String output=outputText.getText();
		
		return output;
		
	}
	
	
}