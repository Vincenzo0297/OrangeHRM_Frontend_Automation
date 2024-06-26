package starter.navigation;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToActions {

    public static Performable theLoginPage() {
        String environment = "environments." + Serenity.environmentVariables().getProperty("environment", "default");
        return Task.where("{0} navigates to login page",
                Open.url(Serenity.environmentVariables().getProperty(environment + ".webdriver.base.url"))
        );
    }
}
