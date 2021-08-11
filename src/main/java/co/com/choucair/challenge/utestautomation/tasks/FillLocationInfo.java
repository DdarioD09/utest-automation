package co.com.choucair.challenge.utestautomation.tasks;

import co.com.choucair.challenge.utestautomation.userinterface.LocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FillLocationInfo implements Task {
    private String city;
    private String postal;
    private String country;

    public FillLocationInfo(String city, String postal, String country) {
        this.city = city;
        this.postal = postal;
        this.country = country;
    }

    public static FillLocationInfo form(String city, String postal, String country) {
        return Tasks.instrumented(FillLocationInfo.class, city, postal, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(LocationPage.CITY_INPUT),
                Hit.the(Keys.DOWN).into(LocationPage.CITY_INPUT),
                Hit.the(Keys.ENTER).into(LocationPage.CITY_INPUT),
                Clear.field(LocationPage.ZIP_INPUT),
                Enter.theValue(postal).into(LocationPage.ZIP_INPUT),
                Click.on(LocationPage.COUNTRY_SELECTOR),
                Click.on(By.xpath("//div[contains(text(),'" + country + "')]")),
                Click.on(LocationPage.DEVICES_BUTTON)
        );

    }
}
