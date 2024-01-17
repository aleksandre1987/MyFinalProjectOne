package DataObject;

import com.github.javafaker.Faker;

import java.util.Date;

public class ContactListData {

    static Faker faker1 = new Faker();

    public static String

    CorrectEmailField = "aleko.kikoliashvili@gmail.com",
    CorrectPasswordField = "Kokola871$",
    FirstNameField = faker1.name().firstName(),
    LastNameField = faker1.name().lastName(),
    DateOfBirthField = faker1.bothify("1987/01/11"),
    EmailField = faker1.bothify("????##@gmail.com"),
    PhoneField = faker1.phoneNumber().cellPhone(),
    StreetAddressField = faker1.address().streetAddress(),
    CityField = faker1.address().cityName(),
    StateOrProvinceField = faker1.address().state(),
    PostalCodeField = faker1.address().zipCode(),
    CountryField = faker1.country().name();



}
