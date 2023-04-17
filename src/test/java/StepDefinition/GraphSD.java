package StepDefinition;
import Utility.Helper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjectModel.BaseClass;
import PageObjectModel.GraphPOM;


public class GraphSD extends BaseClass {
	
	public GraphPOM gp =new GraphPOM(Helper.getDriver());

	@When("User clicks on Getstarted button under Graph")
	public void User_clicks_on_Getstarted_button_under_Graph() {
		gp.clickOnGetStarted();
	}

	@When("User clicks on Graph")
	public void user_clicks_on_graph()
	{
		gp.clickOnGraphLink();
	}
	@When("User clicks on Try here under Graphpagevalidation")
	public void user_clicks_on_try_here_under_graphpagevalidation()
	{
	   gp.clickOnGraphTryhereLink(); 
	}
	@When("User enters the pythonCode of Graphpagevalidation")
	public void user_enters_the_python_code_of_graphpagevalidation() 
	{
		gp.enterCode();
	}
	//@When("User enters the pythonCode")
	//public void user_enters_the_python_code(io.cucumber.datatable.DataTable dataTable)
	//{
	 //  gp.enterCode(pythonCode);
	//}

	@When("clicks on Run button of Graphpagevalidation")
	public void clicks_on_run_button_of_graphpagevalidation() throws InterruptedException 
	{
	    gp.clickOnRunBtn();
	    Thread.sleep(1000);
	    
//	    Helper.NavBack();
	}
	//@When("User clicks on GetStarted button under Graph for second time")
	//public void user_clicks_on_get_started_button_under_graph_for_second_time()
	//{
	//  gp.clickOnGetStarted();  
	//}

	@When("User clicks on GraphRepresentations")
	public void user_clicks_on_graph_representations() {
	   gp.clickOnGraphRepresentationsLink();
	}

	@When("User clicks on Try here under GraphRepresentations")
	public void user_clicks_on_try_here_under_graph_representations()
	{
	    gp.clickOnGraphTryhereLink();
	}

	@When("User enters the pythonCode of GraphRepresentations")
	public void user_enters_the_python_code_of_graph_representations()
	{
	    gp.enterCode();
	}

	@When("clicks on Run button of GraphRepresentations")
	public void clicks_on_run_button_of_graph_representations() throws InterruptedException
	{
		gp.clickOnRunBtn();
	    Thread.sleep(1000);
		    
	    Helper.NavBack();  
	}

	@Then("user is navigated to Graph_home page {string}")
	public void user_is_navigated_to_Graph_home_page(String url) {
	   Helper.getDriver().get(url);
		
	}
}