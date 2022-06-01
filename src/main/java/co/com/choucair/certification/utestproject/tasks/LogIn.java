package co.com.choucair.certification.utestproject.tasks;


import co.com.choucair.certification.utestproject.userinterface.uTestLogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LogIn implements Task {

    public static LogIn onThePage() {
        return Tasks.instrumented(LogIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(uTestLogInPage.LOG_IN_BUTTON),
                Enter.theValue("ProfesorJose477458857JR3@gmail.com").into(uTestLogInPage.USERNAME),
                Enter.theValue("Intel972011*").into(uTestLogInPage.PASSWORD),
                Click.on(uTestLogInPage.SIGN_IN_BUTTON)
        );

    }
}
