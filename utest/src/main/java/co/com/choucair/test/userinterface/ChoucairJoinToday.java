package co.com.choucair.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairJoinToday {
    public static final Target JOIN_BUTTON = Target.the("button tha show us the form to Join").located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target INPUT_NAME = Target.the("where do we write the name").located(By.id("firstName"));

    public static final Target INPUT_LAST = Target.the("where do we write the last name").located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("where do we write the email").located(By.id("email"));

    public static final Target BIRTH_MONTH = Target.the("where do we write the birthdays month").located(By.id("birthMonth"));

    public static final Target BIRTH_DAY = Target.the("where do we write the birthdays day").located(By.id("birthDay"));

    public static final Target BIRTH_YEAR = Target.the("where do we write the birthdays year").located(By.id("birthYear"));

    public static final Target LOCATION_BUTTON = Target.the("button tha show us pass to the next page").located(By.className("btn btn-blue"));

    public static final String NAME_USER = "Daniel";
}
