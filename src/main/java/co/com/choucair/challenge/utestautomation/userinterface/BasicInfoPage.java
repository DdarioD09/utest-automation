package co.com.choucair.challenge.utestautomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BasicInfoPage extends PageObject {
    public static final Target FIRSTNAME_INPUT = Target.the("First Name Input").located(By.id("firstName"));
    public static final Target LASTNAME_INPUT = Target.the("Last Name Input").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Email Input").located(By.id("email"));
    public static final Target MONTH_SELECTOR = Target.the("birthMonth selector").located(By.id("birthMonth"));
    public static final Target DAY_SELECTOR = Target.the("birthDay selector").located(By.id("birthDay"));
    public static final Target YEAR_SELECTOR = Target.the("birthYear selector").located(By.id("birthYear"));
    public static final Target LANGUAGE_INPUT = Target.the("Language Input").located(By.xpath(
            "//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[5]/div[2]/div[1]/input[1]"));
    public static final Target LOCATION_BUTTON = Target.the("Next to form location button").located(By.xpath("//span[contains(text(),'Next: Location')]"));
}
