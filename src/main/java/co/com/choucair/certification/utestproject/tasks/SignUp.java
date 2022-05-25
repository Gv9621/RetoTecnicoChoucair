package co.com.choucair.certification.utestproject.tasks;

import co.com.choucair.certification.utestproject.userinterface.uTestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SignUp implements Task{

    public static SignUp onThePage() { return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(uTestSignUpPage.SIGNUP_BUTTON),
                Enter.theValue("Jose").into(uTestSignUpPage.INPUT_FIRST_NAME),
                Enter.theValue("Rodriguez").into(uTestSignUpPage.INPUT_LAST_NAME),
                Enter.theValue("ProfesorJose477458857@gmail.com").into(uTestSignUpPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("September").from(uTestSignUpPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("7").from(uTestSignUpPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("1996").from(uTestSignUpPage.SELECT_YEAR),
                Click.on(uTestSignUpPage.NEXT_BUTTON),
                Enter.theValue("G96F+70H").into(uTestSignUpPage.INPUT_ZIP),
                Click.on(uTestSignUpPage.NEXT_BUTTON2),
                Click.on(uTestSignUpPage.NEXT_BUTTON2),
                Enter.theValue("Intel972011*").into(uTestSignUpPage.INPUT_PASSWORD),
                Enter.theValue("Intel972011*").into(uTestSignUpPage.INPUT_PASSWORD_AGAIN),
                Click.on(uTestSignUpPage.CLICK_ACCEPT_TERMS),
                Click.on(uTestSignUpPage.CLICK_ACCEPT_PRIVACY),
                Click.on(uTestSignUpPage.NEXT_BUTTON3)
        );

    }
}
