package co.com.choucair.challenge.utestautomation.questions;

import co.com.choucair.challenge.utestautomation.userinterface.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String nameCourse = Text.of(AccountPage.WELCOME_TEXT).viewedBy(actor).asString();
        if (question.equals(nameCourse)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
