package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.NavigateToActions;
import starter.fill.EnterCheckoutDetailsActions;

public class StepDefinitions {

    @Given("{actor} navigates to the login page")
    public void userNavigatesToTheLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateToActions.theLoginPage());
    }

    @Then("{actor} enters username {string}")
    public void userEntersUsernameUsername(Actor actor, String username) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.enterFirstName(username)
        );
    }
}
