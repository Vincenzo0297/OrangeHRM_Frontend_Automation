package starter.fill;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterCheckoutDetailsActions {

    public static Performable enterFirstName(String username) {
        return Task.where("{0} enters first name '" + username + "'",
                Enter.theValue(username).into(OrangeHRM_Path_Objects.ENTER_USERNAME_FIELD)
        );
    }

}
