package co.com.choucair.challenge.utestautomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage extends PageObject {
    public static final Target PC_SELECTOR = Target.the("Pc reference selector")
            .locatedBy("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span");
    public static final Target VERSION_SELECTOR = Target.the("Pc version selector")
            .locatedBy("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span");
    public static final Target LANGUAGE_SELECTOR = Target.the("Pc language selector")
            .locatedBy("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span");
    public static final Target MOBILE_SELECTOR = Target.the("Mobile reference selector")
            .locatedBy("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span");
    public static final Target MODEL_SELECTOR = Target.the("Mobile model selector")
            .locatedBy("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span");
    public static final Target OS_SELECTOR = Target.the("Mobile operating system selector")
            .locatedBy("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span");
    public static final Target LAST_STEP_BUTTON = Target.the("Button to next last step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
