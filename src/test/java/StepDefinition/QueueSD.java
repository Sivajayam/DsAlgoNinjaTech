package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjectModel.BaseClass;
import PageObjectModel.QueuePOM;
import Utility.Helper;


public class QueueSD extends BaseClass
{
	public QueuePOM qp =new QueuePOM(Helper.getDriver());
	
	@When("User clicks on Getstarted button under Queue")
	public void user_clicks_on_getstarted_button_under_queue() {
	    qp.clickOnGetStartedQueue();  
	}

	@When("User clicks on Implementation of Queue in Python")
	public void user_clicks_on_implementation_of_queue_in_python() 
	{
	   qp.clickOnImplementationOfQueue();
	}

	@When("User clicks on Try here under Implementation of Queue in Python")
	public void user_clicks_on_try_here_under_implementation_of_queue_in_python() 
	{
	   qp.clickOnQueueTryhereLink();
	}

	@When("User enters the pythonCode of Implementation of Queue in Python")
	public void user_enters_the_python_code_of_implementation_of_queue_in_python()
	{
	    qp.Queue_enterCode();
	}

	@When("clicks on Run button of Implementation of Queue in Python")
	public void clicks_on_run_button_of_implementation_of_queue_in_python() throws InterruptedException 
	{
	   qp.clickOnRunBtn(); 
	   Thread.sleep(1000);
	    
	     
	}
	@Then("User clicks on Implementation using collections deque")
	public void user_clicks_on_implementation_using_collections_deque()
	{
	  qp.clickOnImplentationCollection(); 
	}

	@When("User clicks on Try here under Implementation using collections deque")
	public void user_clicks_on_try_here_under_implementation_using_collections_deque()
	{
	   qp.clickOnQueueTryhereLink(); 
	}

	@When("User enters the pythonCode of Implementation using collections deque")
	public void user_enters_the_python_code_of_implementation_using_collections_deque()
	{
	    qp.Queue_enterCode();
	}

	@When("clicks on Run button of Implementation using collections deque in Python")
	public void clicks_on_run_button_of_implementation_using_collections_deque_in_python() throws InterruptedException
	{
	    qp.clickOnRunBtn();
	    Thread.sleep(1000);
	}
	@Then("User clicks on Implementation using array")
	public void user_clicks_on_implementation_using_array()
	{
	   qp.clickOnImplementationArray(); 
	}

	@When("User clicks on Try here under Implementation using array")
	public void user_clicks_on_try_here_under_implementation_using_array()
	{
	    qp.clickOnQueueTryhereLink();
	}

	@When("User enters the pythonCode of Implementation using array")
	public void user_enters_the_python_code_of_implementation_using_array()
	{
	    qp.Queue_enterCode();
	}

	@When("clicks on Run button of Implementation using array")
	public void clicks_on_run_button_of_implementation_using_array() throws InterruptedException
	{
	   qp.clickOnRunBtn(); 
	   Thread.sleep(1000);
	}

	@Then("User clicks on Implementation using Queue Operations")
	public void user_clicks_on_implementation_using_queue_operations() 
	{
	   qp.clickOnQueueOperations();
	}

	@When("User clicks on Try here under Queue Operations")
	public void user_clicks_on_try_here_under_queue_operations()
	{
	    qp.clickOnQueueTryhereLink();
	}

	@When("User enters the pythonCode of Queue Operations")
	public void user_enters_the_python_code_of_queue_operations() 
	{
	    qp.Queue_enterCode();
	}

	@When("clicks on Run button of Queue Operations")
	public void clicks_on_run_button_of_queue_operations() throws InterruptedException
	{
	   qp.clickOnRunBtn();
	   Thread.sleep(1000);
	  
	}


	
}