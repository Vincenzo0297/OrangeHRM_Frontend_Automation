package starter.fill.OrangeHRM_Admin_Logic;

import net.serenitybdd.screenplay.targets.Target;

public class OrangeHRM_Admin_Path {

    public static Target NAVIGATE_TO_ADMIN = Target.the("navigate to admin")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");

    public static Target CLICK_ADD_BUTTON = Target.the("click add button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");

    public static Target ENTER_EMPLOYEE_NAME = Target.the("enter employee name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");

    public static Target ENTER_USER_NAME = Target.the("enter user name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");

    public static Target ENTER_PASSWORD = Target.the("enter password")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");

    public static Target ENTER_CONFIRM_PASSWORD = Target.the("enter confirm password")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
}
