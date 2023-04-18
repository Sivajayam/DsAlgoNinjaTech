package PageObjectModel;
/*Author: Sivashankari*/
import org.apache.logging.log4j.Logger;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  static WebDriver driver;
	public static WebDriverWait wait;	
	
public RegisterPOM Rp;
public HomePOM Hp;
public SignINPOM Sp;
public DataStructurePOM DSp;
public ArrayPOM Ap;
public LinkedListPOM ll;
public StackPOM st;
public QueuePOM qp;
public TreePOM tp;
public GraphPOM gp;
public Logger log;


public BaseClass() 
{
	driver = Helper.getDriver();
	
}
public WebDriver initializeWebdriver(String browser)throws  Exception {
	
	if (browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	else if (browser.equalsIgnoreCase("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	} 
	else {
		throw new RuntimeException("BrowserType Not Supported");

	}
	      //Setting implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.manage().window().maximize();
			
			//Setting WebDriverWait with max timeout value of 20 seconds
			wait =new WebDriverWait(driver,Duration.ofSeconds(20));
			return driver;

	
}

	
}	



