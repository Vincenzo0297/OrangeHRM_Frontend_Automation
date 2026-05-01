package starter.fill.OrangeHRM_Admin_Logic;
import UilityFunctions.WaitSeconds;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import starter.fill.OrangeHRM_Login_Logic.OrangeHRM_Logic_Path;

public class OrangeHRM_Admin_Actions {

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

    public static Performable selectUserRole(String role) {
        return Task.where("{0} select user role",
                actor -> {
                        actor.attemptsTo(

                        );
                });
    }
}
