package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BrowserUrl {

    protected WebDriver driver = new ChromeDriver();

   @BeforeMethod

    public void OpenBrowser(){
       driver.manage().window().maximize();
       driver.get("https://thinking-tester-contact-list.herokuapp.com/");
   }
   @AfterSuite

    public void CloseBrowser(){
       driver.quit();
   }













}
