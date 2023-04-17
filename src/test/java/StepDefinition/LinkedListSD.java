package StepDefinition;


import PageObjectModel.BaseClass;
import PageObjectModel.LinkedListPOM;
import Utility.Helper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListSD extends BaseClass{

	
	public LinkedListPOM ll =new LinkedListPOM(Helper.getDriver());

@When("User clicks on Getstarted button under Linked List")
public void user_clicks_on_getstarted_button_under_linked_list() {
	//log=LogManager.getLogger(LinkedListSD.class);
    ll.clickOnGetStarted();
 
	//log.info("The user clicks the get started button");
}

@Then("User clicks on Introduction in Linked List page")
public void user_clicks_on_introduction_in_linked_list_page() {
	
	ll.clickOnIntroduction();
	//log.info("The user clicks Introduction in Linked List");
   
}

@When("User clicks on Try here button in Introduction of Linked List page")
public void user_clicks_on_try_here_button_in_introduction_of_linked_list_page() {
	
	ll.clickOntryhereBtn();
	//log.info("The user clicks Try here button in Introduction in Linked List");
    
}

@When("User enters the Python code in text editor in Introduction of Linked List page")
public void user_enters_the_python_code_in_text_editor_in_introduction_of_linked_list_page() {
	
	ll.entercode();
	//log.info("The user enters Python code in Introduction in Linked List");

}

@When("clicks on Run button in Introduction of Linked List page")
public void clicks_on_run_button_in_introduction_of_linked_list_page() throws InterruptedException {
	
	ll.clickOnrunBtn();
	Thread.sleep(1000);
	//log.info("The user clicks run button in Linked List");
    
}

@Then("User clicks on Creating Linked List in Linked List page")
public void user_clicks_on_creating_linked_list_in_linked_list_page() {
	
	ll.clickOncreatinglinkedlistlink();
	//log.info("The user clicks Creating Linked List in Linked List");
    
}

@When("User clicks on Try here button in Creating Linked List in Linked List page")
public void user_clicks_on_try_here_button_in_creating_linked_list_in_linked_list_page() {
	
	ll.clickOntryhereBtn();
	//log.info("The user clicks try here button in creating Linked List");
   
}

@When("User enters the Python code in text editor in Creating Linked List in Linked List page")
public void user_enters_the_python_code_in_text_editor_in_creating_linked_list_in_linked_list_page() {
	
	ll.entercode();
	//log.info("The user enters python code in creating Linked List");
  
}

@When("clicks on Run button in Creating Linked List in Linked List page")
public void clicks_on_run_button_in_creating_linked_list_in_linked_list_page() throws InterruptedException {
 
	ll.clickOnrunBtn();
	Thread.sleep(1000);
	//log.info("The user clicks run button in creating Linked List");
}

@Then("User clicks on Types of Linked List in Linked List page")
public void user_clicks_on_types_of_linked_list_in_linked_list_page() {
	
	ll.clickOntypesoflinkedlistlink();
	//log.info("The user clicks types of Linked List");

}

@When("User clicks on Try here button in Types of Linked List in Linked List page")
public void user_clicks_on_try_here_button_in_types_of_linked_list_in_linked_list_page() {
	
	ll.clickOntryhereBtn();
//	log.info("The user clicks try here button in types of Linked List");
   
}

@When("User enters the Python code in text editor in Types of Linked List in Linked List page")
public void user_enters_the_python_code_in_text_editor_in_types_of_linked_list_in_linked_list_page() {
	
	ll.entercode();
//	log.info("The user enters python code in types of Linked List");
    
}

@When("clicks on Run button in Types of Linked List in Linked List page")
public void clicks_on_run_button_in_types_of_linked_list_in_linked_list_page() throws InterruptedException {
   
	ll.clickOnrunBtn();
	Thread.sleep(1000);
	//log.info("The user clicks run button in types of Linked List");
}

@Then("User clicks on Implement Linked List in python in Linked List page")
public void user_clicks_on_implement_linked_list_in_python_in_linked_list_page() {
	
	ll.clickOnimplementlinkedlistlink();
//	log.info("The user clicks Implement Linked List");
   
}

@When("User clicks on Try here button in Implement Linked List in python in Linked List page")
public void user_clicks_on_try_here_button_in_implement_linked_list_in_python_in_linked_list_page() {
	
	ll.clickOntryhereBtn();
	//log.info("The user clicks try here button in Implement Linked List");
   
}

@When("User enters the Python code in text editor in Implement Linked List in python in Linked List page")
public void user_enters_the_python_code_in_text_editor_in_implement_linked_list_in_python_in_linked_list_page() {
	
	ll.entercode();
	//log.info("The user enters python code in Implement Linked List");
    
}

@When("clicks on Run button in Implement Linked List in python in Linked List page")
public void clicks_on_run_button_in_implement_linked_list_in_python_in_linked_list_page() throws InterruptedException {
	
	ll.clickOnrunBtn();
	Thread.sleep(1000);
	//log.info("The user clicks run button Implement Linked List");
}

@Then("User clicks on Traversal in Linked List page")
public void user_clicks_on_traversal_in_linked_list_page() {
	
	ll.clickOntraversallink();
	//log.info("The user clicks traversal in Linked List");
    
}

@When("User clicks on Try here button in Traversal of Linked List page")
public void user_clicks_on_try_here_button_in_traversal_of_linked_list_page() {
	
	ll.clickOntryhereBtn();
	//log.info("The user clicks try here button in traversal in Linked List");
    
}

@When("User enters the Python code in text editor in Traversal of Linked List page")
public void user_enters_the_python_code_in_text_editor_in_traversal_of_linked_list_page() {

	ll.entercode();
	//log.info("The user enters python code in traversal in Linked List");
}

@When("clicks on Run button in Traversal of Linked List page")
public void clicks_on_run_button_in_traversal_of_linked_list_page() throws InterruptedException {
	
	ll.clickOnrunBtn();
	Thread.sleep(1000);
	//log.info("The user clicks run button in traversal in Linked List");
   
}

@Then("User clicks on Insertion in Linked List page")
public void user_clicks_on_insertion_in_linked_list_page() {
	
	ll.clickoninsertionlink();
	//log.info("The user clicks insertion in Linked List");
  
}

@When("User clicks on Try here button in Insertion of Linked List page")
public void user_clicks_on_try_here_button_in_insertion_of_linked_list_page() {
	
	ll.clickOntryhereBtn();
	//log.info("The user clicks try here button in insertion in Linked List");
    
}

@When("User enters the Python code in text editor in Insertion of Linked List page")
public void user_enters_the_python_code_in_text_editor_in_insertion_of_linked_list_page() {
	
	ll.entercode();
	//log.info("The user enters python code in insertion in Linked List");
    
}

@When("clicks on Run button in Insertion of Linked List page")
public void clicks_on_run_button_in_insertion_of_linked_list_page() throws InterruptedException {
	
	ll.clickOnrunBtn();
	Thread.sleep(1000);
	//log.info("The user clicks run button in insertion in Linked List");
    
}

@Then("User clicks on Deletion in Linked List page")
public void user_clicks_on_deletion_in_linked_list_page() {
	
	ll.clickondeletionlink();
//	log.info("The user clicks deletion in Linked List");
   
}

@When("User clicks on Try here button in Deletion of Linked List page")
public void user_clicks_on_try_here_button_in_deletion_of_linked_list_page() {
	
	ll.clickOntryhereBtn();
	//log.info("The user clicks try here button in deletion in Linked List");
}

@When("User enters the Python code in text editor in Deletion of Linked List page")
public void user_enters_the_python_code_in_text_editor_in_deletion_of_linked_list_page() {
	
	ll.entercode();
	//log.info("The user enters python code in deletion in Linked List");
   
}

@When("clicks on Run button in Deletion of Linked List page")
public void clicks_on_run_button_in_deletion_of_linked_list_page() throws InterruptedException {
   
	ll.clickOnrunBtn();
	Thread.sleep(1000);
	//log.info("The user clicks run button in deletion in Linked List");
}
}