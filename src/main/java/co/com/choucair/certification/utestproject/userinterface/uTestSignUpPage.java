package co.com.choucair.certification.utestproject.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class uTestSignUpPage extends PageObject {
    public static final Target SIGN_UP_BUTTON = Target.the("button that shows us the application form to sign up").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRST_NAME = Target.the("where Jose writes his first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where Jose writes his name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where Jose writes his email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where Jose selects his birth month").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("where Jose selects his birth day").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("where Jose selects his birth year").located(By.id("birthYear"));
    public static final Target NEXT_LOCATION_BUTTON = Target.the("button that takes Jose to fill the fields with his location").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target INPUT_ZIP = Target.the("where Jose writes his zip code").located(By.id("zip"));
    public static final Target NEXT_DEVICES_LAST_STEP_BUTTON_ = Target.the("button that shows to Jose first, the devices he use and, followed by the fields to enter the password and accept privacy terms").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD = Target.the("where Jose enters his new password").located(By.id("password"));
    public static final Target INPUT_PASSWORD_AGAIN = Target.the("where Jose enters again the password to confirm").located(By.id("confirmPassword"));
    public static final Target CLICK_ACCEPT_TERMS =Target.the("where Jose clicks on a terms checkbox to accept them ").located(By.name("termOfUse"));
    public static final Target CLICK_ACCEPT_PRIVACY =Target.the("where Jose clicks on a privacy policies checkbox to accept and get his account").located(By.name("privacySetting"));
    public static final Target NEXT_COMPLETE_SET_UP_BUTTON_ = Target.the("button that ends the application form and confirm the creation of the new user").located(By.xpath("//a[@class='btn btn-blue']"));
}





