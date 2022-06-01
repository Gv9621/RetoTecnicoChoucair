package co.com.choucair.certification.utestproject.stepdefinitions;

import co.com.choucair.certification.utestproject.questions.Answer;
import co.com.choucair.certification.utestproject.tasks.LogIn;
import co.com.choucair.certification.utestproject.tasks.OpenUp;
import co.com.choucair.certification.utestproject.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestProjectStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that jose wants to create a new user in uTest website$")
    public void thatJoseWantsToCreateANewUserInUTestWebsite() {
        OnStage.theActorCalled("Jose").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fills out the form to create a new user$")
    public void heFillsOutTheFormToCreateANewUser() {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.onThePage(),OpenUp.thePage(), LogIn.onThePage());
    }

    @Then("^he sees a button indicating (.*) which means his account was created but he needs to confirm first$")
    public void heSeesAButtonIndicatingResendConfirmationEmailWhichMeansHisAccountWasCreatedButHeNeedsToConfirmFirst(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }


}

