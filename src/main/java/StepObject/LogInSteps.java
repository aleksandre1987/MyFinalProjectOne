package StepObject;


import PageObject.LogInObject;
import Utils.BrowserUrl;
import org.openqa.selenium.WebDriver;

public class LogInSteps extends LogInObject {

    WebDriver driver;

    public LogInSteps(WebDriver driver1){
        driver = driver1;
    }
    public void Emailfield(String email){
        driver.findElement(EmailField).sendKeys(email);
    }
    public void Passwordfield(String password){
        driver.findElement(PasswordField).sendKeys(password);
    }
    public void sumbitbutton(){
        driver.findElement(SumbitButton).click();
    }



}
