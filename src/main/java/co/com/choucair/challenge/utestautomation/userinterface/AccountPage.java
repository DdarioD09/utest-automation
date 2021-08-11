package co.com.choucair.challenge.utestautomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountPage extends PageObject {
    public static final Target PASS_INPUT = Target.the("Password Input").located(By.id("password"));
    public static final Target CONFIRM_PASS_INPUT = Target.the("Confirm password Input").located(By.id("confirmPassword"));
    public final static Target WELCOME_TEXT = Target.the("Welcome message").located(By.xpath("//h1"));
}
