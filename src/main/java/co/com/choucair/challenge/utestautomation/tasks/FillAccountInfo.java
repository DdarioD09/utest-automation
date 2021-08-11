package co.com.choucair.challenge.utestautomation.tasks;

import co.com.choucair.challenge.utestautomation.userinterface.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class FillAccountInfo implements Task {
    private String password;

    public FillAccountInfo(String password) {
        this.password = password;
    }

    public static FillAccountInfo form(String password) {
        return Tasks.instrumented(FillAccountInfo.class, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(AccountPage.PASS_INPUT),
                Enter.theValue(password).into(AccountPage.CONFIRM_PASS_INPUT)
        );
    }
}
