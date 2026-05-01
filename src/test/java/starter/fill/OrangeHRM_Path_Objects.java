package starter.fill;

import net.serenitybdd.screenplay.targets.Target;

public class OrangeHRM_Path_Objects {

    public static Target ENTER_USERNAME_FIELD = Target.the("username")
            .locatedBy("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");

    public static Target ENTER_PASSWORD_FIELD = Target.the("password")
            .locatedBy("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");

    public static Target CLICK_LOGIN_BUTTON = Target.the("click login")
            .locatedBy("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

    public static Target NAVIGATE_TO_ADMIN = Target.the("navigate to admin")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");

    public static Target CLICK_DROPDOWN_MENU = Target.the("click dropdown menu")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li");

    public static Target CLICK_LOGOUT_BUTTON = Target.the("click logout button")
            .locatedBy("//div[contains(@class, 'oxd-topbar-header-userarea')]/ul/li/span/..//li[4]/a");
}
