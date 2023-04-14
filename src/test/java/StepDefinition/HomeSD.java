package StepDefinition;

import PageObjectModel.BaseClass;
import PageObjectModel.HomePOM;

import Utility.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.logging.log4j.LogManager;

import org.testng.Assert;
public class HomeSD extends BaseClass {
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		Hp = new HomePOM(Helper.getDriver());
		log=LogManager.getLogger(HomeSD.class);
		log.info("The user opens DS Algo portal link");
		Helper.openPage(Hp.url);
		
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_Get_Started_button() {
		Hp.clickGetStartedButton();
		log.info("The user clicks the Get Started button");
		}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		String ExpectedTitle="https://dsportalapp.herokuapp.com/home";
		Assert.assertEquals(ExpectedTitle, Hp.getTitle());
		log.info("The user opens DS Algo portal link");
			}

	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
		Hp = new HomePOM(Helper.getDriver());
		log=LogManager.getLogger(HomeSD.class);
		Helper.openPage("https://dsportalapp.herokuapp.com");
		Hp.clickGetStartedButton();
		Assert.assertEquals(true, Hp.SignInLink.isDisplayed());
		log.info("The user opens Home Page");
	}

	@When("The user clicks Sign In")
	public void the_user_clicks_Sign_In() {
	  Hp.clickSignInLink();
	  log.info("The user clicks Sign In");
	  
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
				Helper.NavBack();
	}

	@When("The user clicks Register")
	public void the_user_clicks_Register() {
	  Hp.clickRegisterLink();
	  log.info("The user clicks Register");
	  
	}
	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		Helper.NavBack();
	}


}
