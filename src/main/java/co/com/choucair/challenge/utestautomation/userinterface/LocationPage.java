package co.com.choucair.challenge.utestautomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage extends PageObject {
    public static final Target CITY_INPUT = Target.the("City Input").located(By.id("city"));
    public static final Target ZIP_INPUT = Target.the("Zip or Postal Code Input").located(By.id("zip"));
    public static final Target COUNTRY_SELECTOR = Target.the("Country Selector")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]"));
    public static final Target DEVICES_BUTTON = Target.the("Next to Devices section button")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));
}
