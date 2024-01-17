package StepObject;

import PageObject.ContactListObject;
import org.openqa.selenium.WebDriver;

 public class ContactListSteps extends ContactListObject {

    WebDriver driver;

    public ContactListSteps(WebDriver driver1){
        driver = driver1;
    }
    public void Emailfield(String email){
        driver.findElement(EmailField).sendKeys(email);
    }
    public void Passwordfield(String password){
        driver.findElement(PasswordField).sendKeys(password);
    }
    public void Sumbitbutton(){
        driver.findElement(SumbitButton).click();
    }
    public void AddNewContact(){
        driver.findElement(AddNweContact).click();
    }
    public void firstnamefield(String firstname){
        driver.findElement(FirstName).sendKeys(firstname);
    }
    public void lastnamefield(String lastname){
        driver.findElement(LastName).sendKeys(lastname);
    }
    public void dateofbirth(String datebirth){
        driver.findElement(DateOfBirth).sendKeys(datebirth);
    }
    public void emailfield(String addemail){
        driver.findElement(Email).sendKeys(addemail);
    }
    public void phonefield(String phone){
        driver.findElement(Phone).sendKeys(phone);
    }
    public void streetaddressfield(String address){
        driver.findElement(StreetAddress).sendKeys(address);
    }
    public void cityfield(String city){
        driver.findElement(City).sendKeys(city);
    }
    public void stateorprovince(String stateprovinve){
        driver.findElement(StateOrProvince).sendKeys(stateprovinve);
    }
    public void postalcodefield(String postalcode){
        driver.findElement(PostalCode).sendKeys(postalcode);
    }
    public void countryfield(String country){
        driver.findElement(Country).sendKeys(country);
    }
    public void sumbitfield(){
        driver.findElement(Sumbit).click();
    }









}
