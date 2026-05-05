package starter.stepdefinitions.OrangeHRM_Admin_Steps;

import UilityFunctions.WaitSeconds;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @And("{actor} selects user role {string}")
    public void selectUserRole(Actor actor, String role) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.selectDropdownOption("User Role", role)
        );
    }

    @And("{actor} selects user status {string}")
    public void selectUserStatus(Actor actor, String status) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.selectDropdownOption("Status", status)
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

    @When("{actor} click save button")
    public void userClickSaveButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_SAVE_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the edit button")
    public void userClickOnTheEditButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_EDIT_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} edit the details")
    public void userEditTheDetails(Actor actor, List<String> editDetais) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.editEmployeeName(editDetais.get(0)),
                OrangeHRM_Admin_Actions.editUserName(editDetais.get(1))
        );
    }

    @And("{actor} click on change password checkbox")
    public void userClickOnChangePasswordCheckbox(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_CHANGE_PASSWORD_CHECKBOX),
                WaitSeconds.Now()
        );
    }

    @And("{actor} edit passwords")
    public void userEditPasswords(Actor actor, List<String> editPasswords) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.editPassword(editPasswords.get(0)),
                OrangeHRM_Admin_Actions.editConfirmPassword(editPasswords.get(1))
        );
    }

    @And("{actor} search for Users")
    public void userSearchForUsers(Actor actor, List<String> searchUsers) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.searchUsername(searchUsers.get(0)),
                OrangeHRM_Admin_Actions.searchEmployeename(searchUsers.get(1))
        );
    }

    @And("{actor} select type of job {string}")
    public void userSelectTypeOfJobJob(Actor actor, String job) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.selectJobOption("Job", job),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the add button for job")
    public void userClickOnTheAddButtonForJob(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_ADD_JOB),
                WaitSeconds.Now()
        );
    }

    @And("{actor} enter details")
    public void userEnterDetails(Actor actor, List<String> JobDetails) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.enterJobTitles(JobDetails.get(0)),
                OrangeHRM_Admin_Actions.enterJobDescription(JobDetails.get(1)),
                OrangeHRM_Admin_Actions.enterJobNotes(JobDetails.get(2))
        );
    }

    @And("{actor} click on the save button")
    public void userClickOnTheSaveButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_JOB_SAVE_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the edit job button")
    public void userClickOnTheEditJobButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_JOB_EDIT_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the pay grades add button")
    public void userClickOnThePayGradesAddButton(Actor actor) {
        actor.attemptsTo(
            Click.on(OrangeHRM_Admin_Path.CLICK_PAY_GRADE_ADD_BUTTON),
            WaitSeconds.Now()
        );
    }

    @And("{actor} enter pay grade name {string}")
    public void userEnterPayGradeNamePayGradeName(Actor actor, String PayGradeName) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.enterPayGradeName(PayGradeName)
        );
    }

    @And("{actor} click on the pay grade save button")
    public void userClickOnThePayGradeSaveButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_PAY_GRADE_SAVE_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the pay grade edit button")
    public void userClickOnThePayGradeEditButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_PAY_GRADE_EDIT_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} edit pay grade name {string}")
    public void userEditPayGradeNameEditPayGradeName(Actor actor, String editPayGradeName) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.editPayGradeName(editPayGradeName)
        );
    }

    @And("{actor} click on the edit save button")
    public void userClickOnTheEditSaveButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_PAY_GRADE_EDIT_SAVE_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the add currencies button")
    public void userClickOnTheAddCurrenciesButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_ADD_CURRECNCIES_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} select currency {string}")
    public void userSelectCurrencyCurrency(Actor actor, String selectCurrency) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.selectCurrency("Currency", selectCurrency)
        );
    }

    @And("{actor} add the currencies details")
    public void userAddTheCurrenciesDetails(Actor actor, List<String> currenciesDetails) {
        actor.attemptsTo(
                OrangeHRM_Admin_Actions.enterMinSalary(currenciesDetails.get(0)),
                OrangeHRM_Admin_Actions.enterMaxSalary(currenciesDetails.get(1))
        );
    }

    @And("{actor} click on the currencies save button")
    public void userClickOnTheCurrenciesSaveButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHRM_Admin_Path.CLICK_CURRECNCIES_SAVE_BUTTON),
                WaitSeconds.Now()
        );
    }
}
