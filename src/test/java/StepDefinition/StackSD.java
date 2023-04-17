package StepDefinition;


import org.testng.Assert;
import PageObjectModel.BaseClass;
import PageObjectModel.StackPOM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utility.Helper;
import org.apache.logging.log4j.LogManager;

public class StackSD extends BaseClass {
	
public StackPOM st =new StackPOM(Helper.getDriver());
	
@When("User clicks on Getstarted button under Stack")
public void user_clicks_on_getstarted_button_under_stack() {
	log=LogManager.getLogger(StackSD.class);
	st.clickOnGetStarted();
	
	log.info("The user clicks the get started button");
 
}

@Then("User clicks on Operations in Stack")
public void user_clicks_on_operations_in_stack() {
	
	st.clickOnOperationsInStackLink();
	log.info("The user clicks Operations in Stack");
  
}

@When("User clicks on Try here in Operations in Stack")
public void user_clicks_on_try_here_in_operations_in_stack() {
	
	st.clickOntryhereBtn();
	log.info("The user clicks Try here in Operations in Stack");
	  
}

@When("User enters the Python code in Operations in Stack")
public void user_enters_the_python_code_in_operations_in_stack() {
	
	st.entercode();
	log.info("The user enters the Python code in Operations in Stackk");
	  

}

@When("clicks on Run button in Operations in Stack")
public void clicks_on_run_button_in_operations_in_stack() throws InterruptedException {
	
	st.clickOnrunBtn();
	Thread.sleep(1000);
	log.info("The user clicks Run button in Operations in Stack");
	  
 
}

//@Then("user is navigated to home page {string}")
//public void user_is_navigated_to_home_page(String string) {
//   Helper.NavBack();
//   Helper.NavBack();
//   Helper.NavBack();
// // log.info("The user is navigated to home page");
//   
//}

@Then("User clicks on Implementation in Stack")
public void user_clicks_on_implementation_in_stack() {
	
	st.clickOnImplementationLink();
	log.info("The user clicks Implementation in Stack");
	  

}

@When("User clicks on Try here in Implementation in Stack")
public void user_clicks_on_try_here_in_implementation_in_stack() {
	
	st.clickOntryhereBtn();
	log.info("The user clicks Try here in Implementation in Stack");
	  
   
}

@When("User enters the Python code in Implementation in Stack")
public void user_enters_the_python_code_in_implementation_in_stack() {
	
	st.entercode();
	log.info("The user enters the Python code in Implementation in Stack");
	  

}

@When("clicks on Run button in Implementation in Stack")
public void clicks_on_run_button_in_implementation_in_stack() throws InterruptedException {
	
	st.clickOnrunBtn();
	Thread.sleep(1000);
	log.info("The user clicks Run button in Implementation in Stack");
	  
}

@Then("User clicks on Applications in Stack")
public void user_clicks_on_applications_in_stack() {
	
	st.clickOnApplicationsLink();
	log.info("The user clicks Applications in Stack");
	  

}

@When("User clicks on Try here in Applications in Stack")
public void user_clicks_on_try_here_in_applications_in_stack() {
	
	st.clickOntryhereBtn();
	log.info("The user clicks Try here in Applications in Stack");
	  
   
}

@When("User enters the invalid Python code in Applications in Stack")
public void user_enters_the_invalid_python_code_in_applications_in_stack() {

	st.entercode_1();
	log.info("The user enters the invalid Python code in Applications in Stack");
	  
}

@When("clicks on Run button in Applications in Stack")
public void clicks_on_run_button_in_applications_in_stack() throws InterruptedException {
	
	st.clickOnrunBtn();
	Thread.sleep(1000);
	String actualMsg = st.getErrormsg();
	Assert.assertEquals(actualMsg,"NameError: name 'Stack_invalid' is not defined on line 1", "Result do not match");
	log.info("The user clicks Run button in Applications in Stack");
	  
	
}

}