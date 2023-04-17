package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class QueuePOM {
	
	public QueuePOM(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[5]//a")
	WebElement getStartedQueue;
	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	WebElement implementationOfQueue;
	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	WebElement implentationCollection;
	@FindBy(xpath = "//a[text()='Implementation using array']")
	 WebElement implementationArray;
	@FindBy(xpath ="//a[text()='Queue Operations']")
	WebElement queueOperations;
	@FindBy (xpath = "//a[@href='/tryEditor']")
	WebElement queue_tryHere;
	@FindBy (xpath ="//form/div/div/div/textarea")
	WebElement queue_textEditor; 
	@FindBy(xpath ="//button[text()='Run']")
	WebElement queue_runBtn;
	@FindBy(xpath ="//pre[@id='output']")
	WebElement queue_outputText;
	

	public void clickOnGetStartedQueue() {
		getStartedQueue.click();
	}
	public void clickOnImplementationOfQueue() {
		implementationOfQueue.click();
	}
	public void clickOnImplentationCollection() {
		implentationCollection.click();
	}
	public void clickOnImplementationArray() {
		implementationArray.click();
	}
	public void clickOnQueueOperations() {
		queueOperations.click();
	}
	public void clickOnQueueTryhereLink() {
		queue_tryHere.click();
		
	}
	public void Queue_enterCode()  
	{
		queue_textEditor.sendKeys("print(\"Hello Everyone\" \");");
		//textEditor.sendKeys(pythonCode);
		
	}
	public void clickOnRunBtn()
	{
		queue_runBtn.click();	
	}
	
	public String Queue_getOutput()
	{
	//driver.waitForElement(outputText);
		String output=queue_outputText.getText();
		
		return output;
		
	}
	

}