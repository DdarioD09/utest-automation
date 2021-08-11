package co.com.choucair.challenge.utestautomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {
    public static final Target BECOME_BUTTON = Target.the("Become a uTester button")
            .located(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div/a"));
}
