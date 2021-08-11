package co.com.choucair.challenge.utestautomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillDevicesInfo implements Task {

    public static FillDevicesInfo form() {
        return Tasks.instrumented(FillDevicesInfo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
