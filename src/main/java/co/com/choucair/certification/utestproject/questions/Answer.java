package co.com.choucair.certification.utestproject.questions;

import co.com.choucair.certification.utestproject.userinterface.uTestLogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String verifyEmail = Text.of(uTestLogInPage.VERIFY_EMAIL).viewedBy(actor).asString();
        if (question.equals(verifyEmail)){
            result = true;
        }else {
            result = false;
        }

        return result;
    }


}
