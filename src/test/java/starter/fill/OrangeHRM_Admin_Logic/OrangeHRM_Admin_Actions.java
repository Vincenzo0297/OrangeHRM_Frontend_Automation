package starter.fill.OrangeHRM_Admin_Logic;
import UilityFunctions.WaitSeconds;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

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
}
