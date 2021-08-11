package co.com.choucair.challenge.utestautomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TermsConditionsPage extends PageObject {
    public static final Target STAY_INFO_BOX = Target.the("Stay informed checkbox")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span");
    public static final Target TERMS_BOX = Target.the("Terms of use checkbox")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]");
    public static final Target POLICY_BOX = Target.the("Security policy checkbox")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]");
    public static final Target SETUP_BUTTON = Target.the("Complete setup button").located(By.id("laddaBtn"));
}
