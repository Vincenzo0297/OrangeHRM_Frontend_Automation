package starter.fill.OrangeHRM_Admin_Logic;
import UilityFunctions.WaitSeconds;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OrangeHRM_Admin_Actions {

    public static Performable selectDropdownOption(String label, String value) {
        return Task.where("{0} selects " + value + " from " + label,
                actor -> {
                        actor.attemptsTo(
                                Click.on(OrangeHRM_Admin_Path.DROPDOWN_BY_LABEL.of(label)),
                                WaitUntil.the(OrangeHRM_Admin_Path.OPTION.of(value), isVisible())
                                        .forNoMoreThan(5).seconds(),
                                Click.on(OrangeHRM_Admin_Path.OPTION.of(value))
                        );
                });
    }

    public static Performable enterEmployeeName(String employeeName) {
        return Task.where("{0} enter employee name",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(employeeName).into(OrangeHRM_Admin_Path.ENTER_EMPLOYEE_NAME),
                                WaitSeconds.Now()
                        );
                });
    }

    public static Performable enterUserName(String username) {
        return Task.where("{0} enter user name",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(username).into(OrangeHRM_Admin_Path.ENTER_USER_NAME),
                                WaitSeconds.Now()
                        );
                });
    }

    public static Performable enterPassword(String password) {
        return Task.where("{0} enter password",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(password).into(OrangeHRM_Admin_Path.ENTER_PASSWORD),
                            WaitSeconds.Now()
                    );
                });
    }

    public static Performable enterConfirmPassword(String confirmPassword) {
        return Task.where("{0} enter confirm password",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(confirmPassword).into(OrangeHRM_Admin_Path.ENTER_CONFIRM_PASSWORD),
                            WaitSeconds.Now()
                    );
                });
    }

    public static Performable editEmployeeName(String employeName) {
        return Task.where("{0} edit employee name",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(employeName).into(OrangeHRM_Admin_Path.EDIT_EMPLOYEE_NAME),
                                WaitSeconds.Now()
                        );
                });
    }

    public static Performable editUserName(String userName) {
        return Task.where("{0} edit user name",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(userName).into(OrangeHRM_Admin_Path.EDIT_USER_NAME),
                            WaitSeconds.Now()
                    );
                });
    }

    public static Performable editPassword(String password) {
        return Task.where("{0} edit password",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(password).into(OrangeHRM_Admin_Path.EDIT_PASSWORD),
                            WaitSeconds.Now()
                    );
                });
    }

    public static Performable editConfirmPassword(String confirmPassword) {
        return Task.where("{0} edit confirm password",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(confirmPassword).into(OrangeHRM_Admin_Path.EDIT_CONFIRM_PASSWORD),
                            WaitSeconds.Now()
                    );
                });
    }

    public static Performable searchUsername(String username) {
        return Task.where("{0} search user name",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(username).into(OrangeHRM_Admin_Path.SEARCH_USER_NAME),
                            WaitSeconds.Now()
                    );
                });
    }

    public static Performable searchEmployeename(String employeename) {
        return Task.where("{0} enter employee name",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(employeename).into(OrangeHRM_Admin_Path.SEARCH_EMPLOYEE_NAME),
                            WaitSeconds.Now()
                    );
                });
    }

    public static Performable selectJobOption(String label, String value) {
        return Task.where("{0} selects " + value + " from " + label,
                actor -> {
                    actor.attemptsTo(
                            Click.on(OrangeHRM_Admin_Path.JOB_DROPDOWN_BY_LABEL),
                            WaitUntil.the(OrangeHRM_Admin_Path.JOB_OPTION.of(value), isVisible())
                                    .forNoMoreThan(10).seconds(),
                            Click.on(OrangeHRM_Admin_Path.JOB_OPTION.of(value))
                    );
                });
    }

    public static Performable enterJobTitles(String enterJobTitles) {
        return Task.where("{0} enter job title",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(enterJobTitles).into(OrangeHRM_Admin_Path.ENTER_JOB_TITLE),
                                WaitSeconds.Now()
                        );
                });
    }

    public static Performable enterJobDescription(String enterJobDescription) {
        return Task.where("{0} enter job description",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(enterJobDescription).into(OrangeHRM_Admin_Path.ENTER_JOB_DESCRIPTION),
                            WaitSeconds.Now()
                    );
                });
    }

    public static Performable enterJobNotes(String enterJobNotes) {
        return Task.where("{0} enter job notes",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(enterJobNotes).into(OrangeHRM_Admin_Path.ENTER_JOB_NOTES),
                            WaitSeconds.Now()
                    );
                });
    }

    public static Performable enterPayGradeName(String payGradeName) {
        return Task.where("{0} enter pay grade name",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(payGradeName).into(OrangeHRM_Admin_Path.ENTER_PAY_GRADE_NAME)
                        );
                });
    }

    public static Performable editPayGradeName(String editPayGradeName) {
        return Task.where("{0} edit pay grade name",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(editPayGradeName).into(OrangeHRM_Admin_Path.EDIT_PAY_GRADE_NAME),
                                WaitSeconds.Now()
                        );
                });
    }

    public static Performable selectCurrency(String label, String value) {
        return Task.where("{0} selects " + value + " from " + label,
                actor -> {
                    actor.attemptsTo(
                            Click.on(OrangeHRM_Admin_Path.DROPDOWN_CURRENCY.of(label)),
                            WaitUntil.the(OrangeHRM_Admin_Path.CURRECNY_OPTION.of(value), isVisible())
                                .forNoMoreThan(5).seconds(),
                            Click.on(OrangeHRM_Admin_Path.CURRECNY_OPTION.of(value))
                    );
                });
    }

//    public static Performable selectDropdownOption(String label, String value) {
//        return Task.where("{0} selects " + value + " from " + label,
//                actor -> {
//                    actor.attemptsTo(
//                            Click.on(OrangeHRM_Admin_Path.DROPDOWN_BY_LABEL.of(label)),
//                            WaitUntil.the(OrangeHRM_Admin_Path.OPTION.of(value), isVisible())
//                                    .forNoMoreThan(5).seconds(),
//                            Click.on(OrangeHRM_Admin_Path.OPTION.of(value))
//                    );
//                });
//    }

    public static Performable enterMinSalary(String enterMinSalary) {
        return Task.where("{0} enter min salary",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(enterMinSalary).into(OrangeHRM_Admin_Path.ENTER_MIN_SALARY),
                            WaitSeconds.Now()
                    );
                });
    }

    public static Performable enterMaxSalary(String enterMaxSalary) {
        return Task.where("{0} enter max salary",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(enterMaxSalary).into(OrangeHRM_Admin_Path.ENTER_MAX_SALARY),
                            WaitSeconds.Now()
                    );
                });
    }
}
