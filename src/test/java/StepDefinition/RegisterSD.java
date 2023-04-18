package StepDefinition;



import org.apache.logging.log4j.LogManager;

import PageObjectModel.BaseClass;
import PageObjectModel.RegisterPOM;
import Utility.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSD extends BaseClass {
	@Given("The user is on the Register page")
	public void the_user_is_on_the_register_page() {
		Rp = new RegisterPOM(Helper.getDriver());
		log=LogManager.getLogger(RegisterSD.class);
		log.info("The user is on the Register page");
	}
	

@When("The user fills the form {string} {string}  {string} {string}")
public void the_user_fills_the_form(String UserName, String Password, String PasswordConfirmation, String Msg) throws InterruptedException {
	 Rp.FillRegisterForm(UserName, Password, PasswordConfirmation,Msg);
	 log.info("The user fills the form");
}
	

	@Then("The user clicks RegisterButton")
	public void the_user_clicks_register_button() throws InterruptedException {
	  	Rp.RegisterButton.click();
	    
	   
	  	Rp.CheckRegisterSuccessMsg();
	  	log.info("The user clicks RegisterButton");
	
	}
			
	}






