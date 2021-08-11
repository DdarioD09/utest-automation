package co.com.choucair.challenge.utestautomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillLocationInfo implements Task {
    public static FillLocationInfo form() {
        return Tasks.instrumented(FillLocationInfo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
