import StepObject.LogInSteps;
import Utils.BrowserUrl;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LogInData.*;

public class LogIn extends BrowserUrl {

    @Test

    public void CorrectLogInlData() throws InterruptedException {

        LogInSteps steps = new LogInSteps(driver);

        steps.Emailfield(CorrectEmailField);
        steps.Passwordfield(CorrectPasswordField);
        Thread.sleep(1000);
        steps.sumbitbutton();
        Thread.sleep(2000);


    }
    @Test

    public void IncorrectLogInData() throws InterruptedException {
        LogInSteps steps = new LogInSteps(driver);

        steps.Emailfield(InCorrectEmailField);
        Thread.sleep(1000);
        steps.Passwordfield(InCorrectPassowrd);
        steps.sumbitbutton();
        Thread.sleep(2000);

        String
                expectedResult = "Incorrect username or password",
                actualResult = driver.findElement(By.id("error")).getText();

        Assert.assertEquals(actualResult, expectedResult);


    }




}
