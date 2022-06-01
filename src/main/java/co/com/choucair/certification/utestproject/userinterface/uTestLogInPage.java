package co.com.choucair.certification.utestproject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestLogInPage extends PageObject{

    public static final Target LOG_IN_BUTTON= Target.the("where Jose clicks to initiate his session").located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']/ul[2]/li[1]/a[1]"));
    public static final Target USERNAME = Target.the("where Jose puts his username").located(By.id("username"));
    public static final Target PASSWORD = Target.the("where Jose puts his password").located(By.id("password"));
    public static final Target SIGN_IN_BUTTON = Target.the("where Jose clicks to sign in").located(By.name("login"));
    public static final Target VERIFY_EMAIL = Target.the("where we can see Jose create his user, he just needs to check the email").located(By.xpath("//a[@id='action-link']"));

}
