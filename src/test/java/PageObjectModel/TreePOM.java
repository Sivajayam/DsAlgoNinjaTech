package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Helper;

import org.openqa.selenium.Alert;
public class TreePOM {
	public TreePOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	// Using FindBy for locating elements
	@FindBy(xpath="//a[@href='tree']")
	WebElement getstarted;

	@FindBy(linkText="Overview of Trees")
	WebElement overviewOfTreeslink;

	@FindBy(linkText="Terminologies")
	WebElement terminologieslink;
	
	@FindBy(linkText="Types of Trees")
	WebElement typesOfTreeslink;

	@FindBy(xpath="//a[@href='tree-traversals']")
	WebElement treeTraversalslink;
	
	@FindBy(linkText="Traversals-Illustration")
	WebElement traversalsIllustrationlink;

	@FindBy(linkText="Binary Trees")
	WebElement binaryTreeslink;
	
	@FindBy(linkText="Types of Binary Trees")
	WebElement typesOfBinaryTreeslink;

	@FindBy(xpath="//a[@href='implementation-in-python']")
	WebElement implementationInPythonlink;
	
	@FindBy(linkText="Binary Tree Traversals")
	WebElement binaryTreeTraversalslink;

	@FindBy(linkText="Implementation of Binary Trees")
	WebElement impementationOfBinaryTreeslink;
	
	@FindBy(linkText="Applications of Binary trees")
	WebElement applicationsOfBinaryTreeslink;

	@FindBy(xpath="//a[@href='binary-search-trees']")
	WebElement binarySearchTreeslink;
	
	@FindBy(xpath="//a[@href='implementation-of-bst']")
	WebElement implementationOfBSTlink;
	@FindBy (xpath = "//a[@href='/tryEditor']")
	WebElement tree_tryEditor;
	@FindBy (xpath ="//form/div/div/div/textarea")
	WebElement tree_textEditor; 
	@FindBy(xpath ="//button[text()='Run']")
	WebElement tree_runBtn;
	@FindBy(xpath ="//pre[@id='output']")
	WebElement tree_outputText;
	

	public void clickOnGetStarted()
	{
		// TODO Auto-generated method stub
		getstarted.click();
	}
	
	public void clickOnOverviewOfTreesLink()
	{
		// TODO Auto-generated method stub
		overviewOfTreeslink.click();
	}
	
	public void clickOnTerminologiesLink()
	{
		// TODO Auto-generated method stub
		terminologieslink.click();
	}
	public void clickOnTypesOfTreesLink()
	{
		// TODO Auto-generated method stub
		typesOfTreeslink.click();
	}
	
	public void clickOnTreeTraversalsLink()
	{
		// TODO Auto-generated method stub
		treeTraversalslink.click();
	}
	public void clickOnTraversalsIllustrationLink()
	{
		// TODO Auto-generated method stub
		traversalsIllustrationlink.click();
	}
	
	public void clickOnBinaryTreesLink()
	{
		// TODO Auto-generated method stub
		binaryTreeslink.click();
	}
	public void clickOnTypesOfBinaryTreesLink()
	{
		// TODO Auto-generated method stub
		typesOfBinaryTreeslink.click();
	}
	
	public void clickOnImplementationInPythonLink()
	{
		// TODO Auto-generated method stub
		implementationInPythonlink.click();
	}
	public void clickOnBinaryTreeTraversalsLink()
	{
		// TODO Auto-generated method stub
		binaryTreeTraversalslink.click();
	}
	
	public void clickOnImpementationOfBinaryTreesLink()
	{
		// TODO Auto-generated method stub
		impementationOfBinaryTreeslink.click();
	}
	public void clickOnApplicationsOfBinaryTreesLink()
	{
		// TODO Auto-generated method stub
		applicationsOfBinaryTreeslink.click();
	}
	
	public void clickOnBinarySearchTreesLink()
	{
		// TODO Auto-generated method stub
		binarySearchTreeslink.click();
	}
	public void clickOnImplementationOfBSTLink()
	{
		// TODO Auto-generated method stub
		implementationOfBSTlink.click();
	}
	public void clickOnTreeTryhereLink() {
		tree_tryEditor.click();
		
	}
	public void enterCode()  
	{
		tree_textEditor.sendKeys("print(\"Hello Everyone\" \");");
		//textEditor.sendKeys(pythonCode);
			}
	public void enterErrorCode()  
	{
		//tree_textEditor.sendKeys("print(\"Hello Everyone\" \");");
		tree_textEditor.sendKeys("pythonCode");
			}
	
	public void clickOnRunBtn()
	{
		tree_runBtn.click();	
	}
	
	public String getOutput()
	{
	//driver.waitForElement(outputText);
		String output=tree_outputText.getText();
		
		return output;
		
	}
	public void alertaccept()
	{
	Alert al = Helper.getDriver().switchTo().alert();
    // click on OK to accept with accept()
    al.accept();
    
	}


}