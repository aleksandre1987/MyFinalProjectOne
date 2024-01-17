import StepObject.ContactListSteps;
import Utils.BrowserUrl;
import org.testng.annotations.Test;

import static DataObject.ContactListData.*;

public class ContactList extends BrowserUrl {

    @Test

    public void AddContactList() throws InterruptedException {
        ContactListSteps steps = new ContactListSteps(driver);

        steps.Emailfield(CorrectEmailField);
        steps.Passwordfield(CorrectPasswordField);
        Thread.sleep(1000);
        steps.Sumbitbutton();
        Thread.sleep(1000);
        steps.AddNewContact();
        steps.firstnamefield(FirstNameField);
        steps.lastnamefield(LastNameField);
        Thread.sleep(1000);
        steps.dateofbirth(DateOfBirthField);
        steps.Emailfield(EmailField);
        steps.phonefield(PhoneField);
        Thread.sleep(1000);
        steps.streetaddressfield(StreetAddressField);
        steps.cityfield(CityField);
        steps.stateorprovince(StateOrProvinceField);
        Thread.sleep(1000);
        steps.postalcodefield(PostalCodeField);
        steps.countryfield(CountryField);
        Thread.sleep(1000);
        steps.sumbitfield();
        Thread.sleep(3000);





    }
}
