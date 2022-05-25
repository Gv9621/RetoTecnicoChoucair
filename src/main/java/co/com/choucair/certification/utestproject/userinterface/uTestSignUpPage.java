package co.com.choucair.certification.utestproject.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class uTestSignUpPage extends PageObject {
    public static final Target SIGNUP_BUTTON = Target.the("button that shows us the form to sign up").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name of the user").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name of the user").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email of the user").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where do we select the birth month").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("where do we select the birth month").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("where do we select the birth month").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("button that shows us the next form to sign up").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target INPUT_ZIP = Target.the("where do we type our zip code").located(By.id("zip"));
    public static final Target NEXT_BUTTON2 = Target.the("second button that shows us the next form to sign up").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD = Target.the("where do we type the new password").located(By.id("password"));
    public static final Target INPUT_PASSWORD_AGAIN = Target.the("where do we type the new password").located(By.id("confirmPassword"));
    public static final Target CLICK_ACCEPT_TERMS =Target.the("where we accept the terms of the web site ").located(By.name("termOfUse"));
    public static final Target CLICK_ACCEPT_PRIVACY =Target.the("where we accept the terms of the web site ").located(By.name("privacySetting"));
    public static final Target NEXT_BUTTON3 = Target.the("third button that shows us the next form to sign up").located(By.xpath("//a[@class='btn btn-blue']"));
}





