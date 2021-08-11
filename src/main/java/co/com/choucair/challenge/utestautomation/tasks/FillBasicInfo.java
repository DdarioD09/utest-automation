package co.com.choucair.challenge.utestautomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillBasicInfo implements Task {

    public static FillBasicInfo form() {
        return Tasks.instrumented(FillBasicInfo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
