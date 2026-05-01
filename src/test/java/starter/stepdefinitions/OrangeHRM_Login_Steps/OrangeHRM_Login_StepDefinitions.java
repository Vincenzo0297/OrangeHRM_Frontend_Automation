package starter.stepdefinitions.OrangeHRM_Login_Steps;

import UilityFunctions.WaitSeconds;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import starter.navigation.NavigateToActions;
import starter.fill.OrangeHRM_Login_Logic.OrangeHRM_Actions;
import starter.fill.OrangeHRM_Login_Logic.OrangeHRM_Path_Objects;

public class OrangeHRM_Login_StepDefinitions {

    @Given("{actor} navigates to the login page")
    public void userNavigatesToTheLoginPage(Actor actor) {
        actor.wasAbleTo(
                NavigateToActions.theLoginPage(),
                WaitSeconds.Now()
        );
    }

    @Then("{actor} enters username {string}")
    public void userEntersUsername(Actor actor, String username) {
        actor.attemptsTo(
                OrangeHRM_Actions.enterUserName(username),
                WaitSeconds.Now()
        );
    }

    @And("{actor} enters password {string}")
    public void userEntersPassword(Actor actor, String password) {
        actor.attemptsTo(
                OrangeHRM_Actions.enterPassword(password),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on login button")
    public void userClickOnLoginButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Path_Objects.CLICK_LOGIN_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} navigates to the admin page")
    public void userNavigatesToTheAdminPage(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Path_Objects.NAVIGATE_TO_ADMIN),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on dropdown menu")
    public void userClickOnDropdownMenu(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Path_Objects.CLICK_DROPDOWN_MENU),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on logout button")
    public void userClickOnLogoutButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Path_Objects.CLICK_LOGOUT_BUTTON),
                WaitSeconds.Now()
        );
    }


}
