package StepDefinition;
import PageObjectModel.TreePOM;
import PageObjectModel.BaseClass;
import Utility.Helper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TreeSD extends BaseClass{
	
	public TreePOM tp =new TreePOM(Helper.getDriver());
	
	@When("User clicks on Getstarted button under Tree")
	public void user_clicks_on_getstarted_button_under_tree()
	{
	   tp.clickOnGetStarted(); 
	}

	@When("User clicks on Overview of Trees")
	public void user_clicks_on_overview_of_trees() 
	{
	  tp.clickOnOverviewOfTreesLink();  
	}
	@Then("User clicks on Try here under Overview of Trees")
	public void user_clicks_on_try_here_under_overview_of_trees()
	{
	    tp.clickOnTreeTryhereLink();
	}

	@When("User enters the pythonCode of Overview of Trees")
	public void user_enters_the_python_code_of_overview_of_trees() 
	{
	   tp.enterCode();
	}

	@Then("clicks on Run button of Overview of Trees")
	public void clicks_on_run_button_of_overview_of_trees() throws InterruptedException 
	{
		tp.clickOnRunBtn();
		Thread.sleep(1000);
	}

	@When("User clicks on Terminologies")
	public void user_clicks_on_terminologies() 
	{
	  tp.clickOnTerminologiesLink(); 
	}
	@When("User clicks on Try here under Terminologies")
	public void user_clicks_on_try_here_under_terminologies() 
	{
	   tp.clickOnTreeTryhereLink(); 
	}

	@When("User enters the pythonCode of Terminologies")
	public void user_enters_the_python_code_of_terminologies()
	{
	    tp.enterCode();
	    
	}

	@Then("clicks on Run button of Terminologies")
	public void clicks_on_run_button_of_terminologies() throws InterruptedException 
	{
	  tp.clickOnRunBtn();
	  Thread.sleep(1000);
	  
	}

	@When("User clicks on Types of Trees")
	public void user_clicks_on_types_of_trees()
	{
	    tp.clickOnTypesOfTreesLink();
	}
	@When("User clicks on Try here under Types of Trees")
	public void user_clicks_on_try_here_under_types_of_trees()
	{
	    tp.clickOnTreeTryhereLink();
	}

	@When("User enters the pythonCode of Types of Trees")
	public void user_enters_the_python_code_of_types_of_trees()
	{
	    tp.enterCode();
	}

	@Then("clicks on Run button of Types of Trees")
	public void clicks_on_run_button_of_types_of_trees() throws InterruptedException 
	{
	    tp.clickOnRunBtn();
	    Thread.sleep(1000);
	}
	@When("User clicks on Tree Traversals page")
	public void user_clicks_on_tree_traversals_page() 
	{
	    tp.clickOnTreeTraversalsLink();
	}

	@When("User clicks on Try here under Tree Traversals page")
	public void user_clicks_on_try_here_under_tree_traversals_page() 
	{
	  tp.clickOnTreeTryhereLink(); 
	}

	@When("User enters the pythonCode of Tree Traversals page")
	public void user_enters_the_python_code_of_tree_traversals_page()
	{
	    tp.enterCode();
	    
	}

	@Then("clicks on Run button of Tree Traversals page")
	public void clicks_on_run_button_of_tree_traversals_page() throws InterruptedException
	{
	    tp.clickOnRunBtn();
	    Thread.sleep(1000);
	}
	@When("User clicks on Traversals-Illustration page")
	public void user_clicks_on_traversals_illustration_page()
	{
	    tp.clickOnTraversalsIllustrationLink();
	}

	@When("User clicks on Try here under Traversals-Illustration page")
	public void user_clicks_on_try_here_under_traversals_illustration_page() 
	{
	    tp.clickOnTreeTryhereLink();
	}

	@When("User enters the pythonCode of Traversals-Illustration page")
	public void user_enters_the_python_code_of_traversals_illustration_page() 
	{
	    tp.enterCode();
	}

	@Then("clicks on Run button of Traversals-Illustration page")
	public void clicks_on_run_button_of_traversals_illustration_page() throws InterruptedException 
	{
	   tp.clickOnRunBtn();
	   Thread.sleep(1000);
	}

	@When("User clicks on  Binary Trees page")
	public void user_clicks_on_binary_trees_page() 
	{
	    tp.clickOnBinaryTreesLink();
	}

	@When("User clicks on Try here under  Binary Trees page")
	public void user_clicks_on_try_here_under_binary_trees_page() {
	    tp.clickOnTreeTryhereLink();
	}

	@When("User enters the pythonCode of  Binary Trees page")
	public void user_enters_the_python_code_of_binary_trees_page()
	{
	    tp.enterCode();
	}

	@Then("clicks on Run button of  Binary Trees page")
	public void clicks_on_run_button_of_binary_trees_page() throws InterruptedException
	{
	    tp.clickOnRunBtn();
	    Thread.sleep(1000);
	}

	@When("User clicks on  Types of Binary Trees page")
	public void user_clicks_on_types_of_binary_trees_page()
	{
	    tp.clickOnTypesOfBinaryTreesLink();
	}

	@When("User clicks on Try here under  Types of Binary Trees page")
	public void user_clicks_on_try_here_under_types_of_binary_trees_page()
	{
	   tp.clickOnTreeTryhereLink();
	}

	@When("User enters the pythonCode of  Types of Binary Trees page")
	public void user_enters_the_python_code_of_types_of_binary_trees_page() {
	    tp.enterCode();
	}

	@Then("clicks on Run button of  Types of Binary Trees page")
	public void clicks_on_run_button_of_types_of_binary_trees_page() throws InterruptedException 
	{
	    tp.clickOnRunBtn();
	    Thread.sleep(1000);
	}

	@When("User clicks on  Implementation in Python page")
	public void user_clicks_on_implementation_in_python_page()
	{
	   tp.clickOnImplementationInPythonLink(); 
	}

	@When("User clicks on Try here under  Implementation in Python page")
	public void user_clicks_on_try_here_under_implementation_in_python_page()
	{
	    tp.clickOnTreeTryhereLink();
	}

	@When("User enters the pythonCode of  Implementation in Python page")
	public void user_enters_the_python_code_of_implementation_in_python_page() 
	{
	    tp.enterCode();
	}

	@Then("clicks on Run button of  Implementation in Python page")
	public void clicks_on_run_button_of_implementation_in_python_page() throws InterruptedException 
	{
	   tp.clickOnRunBtn();
	}

	@When("User clicks on  Binary Tree Traversals page")
	public void user_clicks_on_binary_tree_traversals_page() 
	{
	   tp.clickOnBinaryTreeTraversalsLink();
	}

	@When("User clicks on Try here under  Binary Tree Traversals page")
	public void user_clicks_on_try_here_under_binary_tree_traversals_page()
	{
	    tp.clickOnTreeTryhereLink();
	}

	@When("User enters the pythonCode of  Binary Tree Traversals page")
	public void user_enters_the_python_code_of_binary_tree_traversals_page() 
	{
	   tp.enterCode();
	}

	@Then("clicks on Run button of  Binary Tree Traversals page")
	public void clicks_on_run_button_of_binary_tree_traversals_page() throws InterruptedException 
	{
	    tp.clickOnRunBtn();
	    Thread.sleep(1000);
	}

	@When("User clicks on  Implementation of Binary Trees page")
	public void user_clicks_on_implementation_of_binary_trees_page() 
	{
	   tp.clickOnImpementationOfBinaryTreesLink();
	}

	@When("User clicks on Try here under  Implementation of Binary Trees page")
	public void user_clicks_on_try_here_under_implementation_of_binary_trees_page() 
	{
	    tp.clickOnTreeTryhereLink();
	}

	@When("User enters the pythonCode of  Implementation of Binary Trees page")
	public void user_enters_the_python_code_of_implementation_of_binary_trees_page() 
	{
	   tp.enterCode();
	}

	@Then("clicks on Run button of Implementation of Binary Trees page")
	public void clicks_on_run_button_of_implementation_of_binary_trees_page() throws InterruptedException
	{
	    tp.clickOnRunBtn();
	    Thread.sleep(1000);
	}

	@When("User clicks on  Applications of Binary Trees page")
	public void user_clicks_on_applications_of_binary_trees_page() 
	{
	   tp.clickOnApplicationsOfBinaryTreesLink(); 
	}

	@When("User clicks on Try here under Applications of Binary Trees page")
	public void user_clicks_on_try_here_under_applications_of_binary_trees_page()
	{
	    tp.clickOnTreeTryhereLink();
	}

	@When("User enters the pythonCode of  Applications of Binary Trees page")
	public void user_enters_the_python_code_of_applications_of_binary_trees_page() 
	{
	    tp.enterCode();
	}

	@Then("clicks on Run button of Applications of Binary Trees page")
	public void clicks_on_run_button_of_applications_of_binary_trees_page() throws InterruptedException 
	{
	    tp.clickOnRunBtn();
	    Thread.sleep(1000);
	}

	@When("User clicks on  Binary Search Trees page")
	public void user_clicks_on_binary_search_trees_page()
	{
	   tp.clickOnBinarySearchTreesLink();
	}

	@When("User clicks on Try here under Binary Search Trees page")
	public void user_clicks_on_try_here_under_binary_search_trees_page()
	{
	    tp.clickOnTreeTryhereLink();
	}

	@When("User enters the pythonCode of  Binary Search Trees page")
	public void user_enters_the_python_code_of_binary_search_trees_page() 
	{
	    tp.enterCode();
	}

	@Then("clicks on Run button of Binary Search Trees page")
	public void clicks_on_run_button_of_binary_search_trees_page() throws InterruptedException
	{
	    tp.clickOnRunBtn();
	    Thread.sleep(1000);
	}

	@When("User clicks on  Implementation of BST page")
	public void user_clicks_on_implementation_of_bst_page()
	{
	    tp.clickOnImplementationOfBSTLink();
	}

	@When("User clicks on Try here under Implementation of BST page")
	public void user_clicks_on_try_here_under_implementation_of_bst_page() 
	{
	    tp.clickOnTreeTryhereLink();
	}

	@When("User enters the pythonCode of  Implementation of BST page")
	public void user_enters_the_python_code_of_implementation_of_bst_page() 
	{
	    tp.enterCode();
	}

	@Then("clicks on Run button of Implementation of BST page")
	public void clicks_on_run_button_of_implementation_of_bst_page() throws InterruptedException
	{
	   tp.clickOnRunBtn();
	   Thread.sleep(1000);
	}

}