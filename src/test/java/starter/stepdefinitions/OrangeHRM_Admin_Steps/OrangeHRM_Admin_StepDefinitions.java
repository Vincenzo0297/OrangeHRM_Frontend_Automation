package starter.stepdefinitions.OrangeHRM_Admin_Steps;

import UilityFunctions.WaitSeconds;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import starter.fill.OrangeHRM_Admin_Logic.OrangeHRM_Admin_Actions;
import starter.fill.OrangeHRM_Admin_Logic.OrangeHRM_Admin_Path;

import java.util.List;

public class OrangeHRM_Admin_StepDefinitions {

    @Then("{actor} navigates to the admin page")
    public void userNavigatesToTheAdminPage(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.NAVIGATE_TO_ADMIN),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the add button")
    public void userClickOnTheAddButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_ADD_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} select user role {string}")
    public void userSelectUserRoleRole(Actor actor, String role) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.selectUserRole(role),
                WaitSeconds.Now()
        );
    }

    @And("{actor} enter the details")
    public void userEnterTheDetails(Actor actor, List<String> UserDetails) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.enterEmployeeName(UserDetails.get(0)),
                OrangeHRM_Admin_Actions.enterUserName(UserDetails.get(1)),
                OrangeHRM_Admin_Actions.enterPassword(UserDetails.get(2)),
                OrangeHRM_Admin_Actions.enterConfirmPassword(UserDetails.get(3))
        );
    }


}
