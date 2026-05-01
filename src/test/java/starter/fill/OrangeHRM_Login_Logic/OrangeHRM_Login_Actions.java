package starter.fill.OrangeHRM_Login_Logic;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class OrangeHRM_Login_Actions {

    public static Performable enterUserName(String username) {
        return Task.where("{0} enters username",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(username).into(OrangeHRM_Logic_Path.ENTER_USERNAME_FIELD)
                        );
                }
        );
    }

    public static Performable enterPassword(String password) {
        return Task.where("{0} enters password",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(password).into(OrangeHRM_Logic_Path.ENTER_PASSWORD_FIELD)
                        );
                }
        );
    }
}
