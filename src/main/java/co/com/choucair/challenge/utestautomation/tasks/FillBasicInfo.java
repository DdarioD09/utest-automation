package co.com.choucair.challenge.utestautomation.tasks;

import co.com.choucair.challenge.utestautomation.userinterface.BasicInfoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class FillBasicInfo implements Task {
    private String name;
    private String lastname;
    private String email;
    private String month;
    private String day;
    private String year;
    private String language;

    public FillBasicInfo(String name, String lastname, String email, String month, String day, String year, String language) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.language = language;
    }

    public static FillBasicInfo form(String name, String lastname, String email, String month,
                                     String day, String year, String language) {
        return Tasks.instrumented(FillBasicInfo.class, name, lastname, email, month, day, year, language);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(BasicInfoPage.FIRSTNAME_INPUT),
                Enter.theValue(lastname).into(BasicInfoPage.LASTNAME_INPUT),
                Enter.theValue(email).into(BasicInfoPage.EMAIL_INPUT),
                SelectFromOptions.byVisibleText(month).from(BasicInfoPage.MONTH_SELECTOR),
                SelectFromOptions.byVisibleText(day).from(BasicInfoPage.DAY_SELECTOR),
                SelectFromOptions.byVisibleText(year).from(BasicInfoPage.YEAR_SELECTOR),
                Enter.theValue(language).into(BasicInfoPage.LANGUAGE_INPUT).thenHit(Keys.ENTER),
                Click.on(BasicInfoPage.LOCATION_BUTTON)
        );
    }
}
