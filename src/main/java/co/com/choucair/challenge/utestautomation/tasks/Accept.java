package co.com.choucair.challenge.utestautomation.tasks;

import co.com.choucair.challenge.utestautomation.userinterface.TermsConditionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Accept implements Task {
    public static Accept termsAndConditions() {
        return Tasks.instrumented(Accept.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TermsConditionsPage.STAY_INFO_BOX),
                Click.on(TermsConditionsPage.TERMS_BOX),
                Click.on(TermsConditionsPage.POLICY_BOX),
                Click.on(TermsConditionsPage.SETUP_BUTTON)
        );

    }
}
