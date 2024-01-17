package DataObject;

import com.github.javafaker.Faker;

public class LogInData {

static Faker faker1 = new Faker();

public static String

    CorrectEmailField = "aleko.kikoliashvili@gmail.com",
    CorrectPasswordField = "Kokola871$",
    InCorrectEmailField = faker1.bothify("????##@gmail.com"),
    InCorrectPassowrd = faker1.bothify("???##??");




}
