package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LinkedListPOM  {

	public WebDriver driver;
	
	// Using FindBy for locating elements
	@FindBy(xpath="//a[@href='linked-list']")
	WebElement linkedlist_getstarted;

	@FindBy(xpath="//a[@href='introduction']")
	WebElement linkedlist_introduction;

	@FindBy(linkText="Creating Linked LIst")
	WebElement  linkedlist_creatinglinkedlist;

	@FindBy(xpath="//a[@href='types-of-linked-list']")
	WebElement linkedlist_typesoflinkedlist;

	@FindBy(xpath="//a[@href='implement-linked-list-in-python']")
	WebElement linkedlist_implementlinkedlist;

	@FindBy(xpath="//a[@href='traversal']")
	WebElement linkedlist_traversal;
	
	@FindBy(xpath="//a[@href='insertion-in-linked-list']")
	WebElement linkedlist_insertion;

	@FindBy(xpath="//a[@href='deletion-in-linked-list']")
	WebElement linkedlist_deletion;

	@FindBy(xpath ="//a[text()='Try here>>>']")
	WebElement linkedlist_tryhereBtn;

	@FindBy(xpath = "//form/div/div/div/textarea")
	WebElement linkedlist_texteditor; 

	@FindBy(xpath ="//button[text()='Run']")
	WebElement linkedlist_runBtn;
	
	public LinkedListPOM(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	

	//Methods to click on LinkedList

		public void clickOnGetStarted()
		{
			
			linkedlist_getstarted.click();
		}
		
		
		public void clickOnIntroduction()
		{
			
			linkedlist_introduction.click();
		}
		
		public void clickOncreatinglinkedlistlink()
		{
		
			linkedlist_creatinglinkedlist.click();
		}
		
		public void clickOntypesoflinkedlistlink()
		{
			
			linkedlist_typesoflinkedlist.click();
			
		}
		
		public void clickOnimplementlinkedlistlink()
		{
			
			linkedlist_implementlinkedlist.click();
		}
		
		public void clickOntraversallink()
		{
			
			linkedlist_traversal.click();
		}
		
		public void clickoninsertionlink()
		{
			linkedlist_insertion.click();
		}
		
		public void clickondeletionlink()
		{
			linkedlist_deletion.click();
		}
		
		public void entercode()
		{
			
			linkedlist_texteditor.sendKeys("print(\"Linked List \" \");");
		}
		
		
		public void clickOnrunBtn()
		{
			
			linkedlist_runBtn.click();
		}
		
		public void clickOntryhereBtn()
		{
			
			linkedlist_tryhereBtn.click();
		}
		
//	public void displayAlertMsg()
//		{
//		String alertMessage = driver.switchTo().alert().getText();
//		System.out.print(alertMessage);
//		Assert.assertEquals(true, null);
//		}
		
		
	}
