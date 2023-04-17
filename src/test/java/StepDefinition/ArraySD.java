package StepDefinition;
import PageObjectModel.ArrayPOM;
import PageObjectModel.BaseClass;
import Utility.Helper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraySD extends BaseClass {
	
	public ArrayPOM Ap =new ArrayPOM(Helper.getDriver());

	@When("The user click on Get started button in Array")
	public void the_user_click_on_get_started_button_in_array() {
		
		  Ap.clickOnGetStartedArray();

	}

	@When("The user click the link  with title Arrays in Python")
	public void the_user_click_the_link_with_title_arrays_in_python() {
	    Ap.clkArraysInPython();
	}
	@Then("The user click on Arrays in Python Try here")
	public void the_user_click_on_arrays_in_python_try_here() {
	    Ap.clickOnTryHere();
	}


	@Then("The user input the Python code in Arrays in Python")
	public void the_user_input_the_python_code_in_arrays_in_python() {
	   Ap.enterCode();
	}
	@Then("The user click on Arrays in Python run button")
	public void the_user_click_on_arrays_in_python_run_button() throws InterruptedException {
	   Ap.clickOnRun();
	   Thread.sleep(1000);
	}
	@When("The user click the link  with title Arrays Using List")
	public void the_user_click_the_link_with_title_arrays_using_list() {
	    Ap.clickArraysUsingList();
	}

	@Then("The user click on Arrays Using List Try here")
	public void the_user_click_on_arrays_using_list_try_here() {
	   Ap.clickOnTryHere();
	}

	@Then("The user input the Python code in Arrays Using List")
	public void the_user_input_the_python_code_in_arrays_using_list() {
	   Ap.enterCode();
	   }

	@Then("The user click on Arrays Using List run button")
	public void the_user_click_on_arrays_using_list_run_button()throws InterruptedException { 
	    Ap.clickOnRun();
	    Thread.sleep(1000);
	}
	
	@When("The user click the link  with title Basic Operations in lists")
	public void the_user_click_the_link_with_title_basic_operations_in_lists() {
	   Ap.clickOnBasicOperations();
	}

	@Then("The user click on Basic Operations in lists Try here")
	public void the_user_click_on_basic_operations_in_lists_try_here() {
	   Ap.clickOnTryHere();
	}

	@Then("The user input the Python code in Basic Operations in lists")
	public void the_user_input_the_python_code_in_basic_operations_in_lists() {
	    Ap.enterCode();
	}

	@Then("The user click on Basic Operations in lists run button")
	public void the_user_click_on_basic_operations_in_lists_run_button() throws InterruptedException {
	    Ap.clickOnRun();
	    Thread.sleep(1000);
	}

	@When("The user click the link  with title Applications of Array")
	public void the_user_click_the_link_with_title_applications_of_array() {
	    Ap.clickOnApplicationsOfArray();
	}

	@Then("The user click on Applications of Array Try here")
	public void the_user_click_on_applications_of_array_try_here() {
	    Ap.clickOnTryHere();
	}

	@Then("The user input the Python code in Applications of Array")
	public void the_user_input_the_python_code_in_applications_of_array() {
	    Ap.enterCode();
	}

	@Then("The user click on Applications of Array run button")
	public void the_user_click_on_applications_of_array_run_button() throws InterruptedException{
	    Ap.clickOnRun();
	    Thread.sleep(1000);
	}
	@Then("The user click the link  with title Practice Questions")
	public void the_user_click_the_link_with_title_practice_questions() {
	    Ap.clickOnPracticeQues();
	    
	}

	@When("The user click the link  with title Search the array")
	public void the_user_click_the_link_with_title_search_the_array() {
	   Ap.clickOnSearchArray();
	   Helper.NavBack();
	}

	
	
	@When("The user click the link  with title Max Consecutive Ones")
	public void the_user_click_the_link_with_title_max_consecutive_ones() {
	    Ap.clickOnMaxConsecutiveOnes();
	    Helper.NavBack();
	}

	//@When("The user input the Python code in Max Consecutive Ones")
	//public void the_user_input_the_python_code_in_max_consecutive_ones() {
	    //Ap.enterCode();
	//}

	//@Then("The user click on Max Consecutive Ones run button")
	//public void the_user_click_on_max_consecutive_ones_run_button() throws InterruptedException {
	    //Ap.clickOnRun();
	    //Thread.sleep(1000);
	//}

	//@When("The user input the Python code in Search the array")
	//public void the_user_input_the_python_code_in_search_the_array() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	//}

	@When("The user click the link  with title Find Numbers with Even Numbres of Digits")
	public void the_user_click_the_link_with_title_find_numbers_with_even_numbres_of_digits() {
	    Ap.clickOnFindEvenNum();
	    Helper.NavBack();
	}

	@When("The user click the link  with title Squares of Sorted Array")
	public void the_user_click_the_link_with_title_squares_of_sorted_array() {
	    Ap.clickOnFindSquares();
	    Helper.NavBack();
	}


}