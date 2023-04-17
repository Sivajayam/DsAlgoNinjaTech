package StepDefinition;


import java.util.List;

import org.testng.Assert;

import PageObjectModel.BaseClass;
import PageObjectModel.DataStructurePOM;
import Utility.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DataStructureSD extends BaseClass {
	
	public DataStructurePOM DSp =new DataStructurePOM(Helper.getDriver());
	
	@When("The user click on Get started button in Data Structure")
	public void the_user_click_on_get_started_button_in_data_structure() {
		
	   DSp.clickOngetStartedDataStructure();
	}

	@When("The user click the link  with title Time Complexity")
	public void the_user_click_the_link_with_title_time_complexity() {
	    DSp.clkTimeComplexity();
	}

	@Then("The user click on Data Strucure Try here")
	public void the_user_click_on_data_strucure_try_here() {
	    DSp.clickOnDataStructureTryHere();
	}

	@And("The user input the Python code in Data Structure")
	public void the_user_input_the_python_code() {
	   DSp.enterCode();
	}

	@Then("The user click on run button")
	public void the_user_click_on_run_button() throws InterruptedException {
	   DSp.clickOnRun();
	   Thread.sleep(1000);
	}
	@When("The user click on Get started button in Data Structure for invalid code")
	public void the_user_click_on_get_started_button_in_data_structure_for_invalid_code() {
		DSp.clickOngetStartedDataStructure();
	}


	@When("The user click on Data Strucure Try here for invalid code")
	public void the_user_click_on_data_strucure_try_here_for_invalid_code() {
		DSp.clickOnDataStructureTryHere();
	}

	@When("The user click the link  with title Time Complexity for invalid code")
	public void the_user_click_the_link_with_title_time_complexity_for_invalid_code() {
	    DSp.clkTimeComplexity();
	}

	
	@Then("The user input the Python code in Data Structure for invalid code")
	public void the_user_input_the_python_code_in_data_structure_for_invalid_code() {
	    
	}

	@When("User enter the invalid Python code")
	public void user_enter_the_invalid_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException 
	{
		List<List<String>>data=pythonCode.cells();
		 DSp.InValidenterCode(data.get(0).get(0)); 
	}
	

	@When("User Clicks on Run button for invalid code")
	public void user_clicks_on_run_button_for_invalid_code() throws InterruptedException
	{
	    DSp.clickOnRun();
	   
	    Thread.sleep(1000);
	}
	@Then("User Verify the error message for invalid code")
	public void user_verify_the_error_message_for_invalid_code() throws InterruptedException 
	{
		String actualMsg = DSp.getErrormsg();
		//System.out.println("Errormsg" +actualMsg);
		Assert.assertEquals(actualMsg,"NameError: name 'Hello' is not defined on line 1", "Result do not match");
		Thread.sleep(1000);
		
	}


	@Then("user is navigated to home page {string}")
	public void user_is_navigated_to_home_page(String string) {
		Helper.NavBack();
		Helper.NavBack();
		Helper.NavBack();
	
	}




}