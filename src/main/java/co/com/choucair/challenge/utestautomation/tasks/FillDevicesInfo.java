package co.com.choucair.challenge.utestautomation.tasks;

import co.com.choucair.challenge.utestautomation.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class FillDevicesInfo implements Task {
    private String computer;
    private String version;
    private String pcLanguage;
    private String mobile;
    private String model;
    private String os;

    public FillDevicesInfo(String computer, String version, String pcLanguage, String mobile, String model, String os) {
        this.computer = computer;
        this.version = version;
        this.pcLanguage = pcLanguage;
        this.mobile = mobile;
        this.model = model;
        this.os = os;
    }

    public static FillDevicesInfo form(String computer, String version, String pcLanguage,
                                       String mobile, String model, String os) {
        return Tasks.instrumented(FillDevicesInfo.class, computer, version, pcLanguage, mobile, model, os);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DevicesPage.PC_SELECTOR),
                Click.on(By.xpath("//div[contains(text(),'" + computer + "')]")),
                Click.on(DevicesPage.VERSION_SELECTOR),
                Click.on(By.xpath("//div[contains(text(),'" + version + "')]")),
                Click.on(DevicesPage.LANGUAGE_SELECTOR),
                Click.on(By.xpath("//div[contains(text(),'" + pcLanguage + "')]")),
                Click.on(DevicesPage.MOBILE_SELECTOR),
                Click.on(By.xpath("//div[contains(text(),'" + mobile + "')]")),
                Click.on(DevicesPage.MODEL_SELECTOR),
                Click.on(By.xpath("//div[contains(text(),'" + model + "')]")),
                Click.on(DevicesPage.OS_SELECTOR),
                Click.on(By.xpath("//div[contains(text(),'" + os + "')]")),
                Click.on(DevicesPage.LAST_STEP_BUTTON)
        );
    }
}
