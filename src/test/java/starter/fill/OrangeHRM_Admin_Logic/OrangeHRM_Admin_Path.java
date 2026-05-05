package starter.fill.OrangeHRM_Admin_Logic;

import net.serenitybdd.screenplay.targets.Target;

public class OrangeHRM_Admin_Path {

    public static Target NAVIGATE_TO_ADMIN = Target.the("navigate to admin")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");

    public static Target CLICK_ADD_BUTTON = Target.the("click add button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");

    // Dropdown based on label (User Role, Status, etc.)
    public static Target DROPDOWN_BY_LABEL = Target.the("Dropdown for {0}")
            .locatedBy("//label[normalize-space()='{0}']/following::div[contains(@class,'oxd-select-text-input')][1]");

    // Dropdown option
    public static Target OPTION = Target.the("Option {0}")
            .locatedBy("//div[@role='option' and normalize-space()='{0}']");

    public static Target ENTER_EMPLOYEE_NAME = Target.the("enter employee name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");

    public static Target ENTER_USER_NAME = Target.the("enter user name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");

    public static Target ENTER_PASSWORD = Target.the("enter password")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");

    public static Target ENTER_CONFIRM_PASSWORD = Target.the("enter confirm password")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");

    public static Target CLICK_SAVE_BUTTON = Target.the("click save button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");

    public static Target CLICK_EDIT_BUTTON = Target.the("click edit button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[2]");

    public static Target EDIT_EMPLOYEE_NAME = Target.the("edit employee name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");

    public static Target EDIT_USER_NAME = Target.the("edit user name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");

    public static Target CLICK_CHANGE_PASSWORD_CHECKBOX = Target.the("click change password checkbox")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[5]/div/div[2]/div/label/span/i");

    public static Target EDIT_PASSWORD = Target.the("edit password")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");

    public static Target EDIT_CONFIRM_PASSWORD = Target.the("edit confirm password")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");

    public static Target SEARCH_USER_NAME = Target.the("search user name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");

    public static Target SEARCH_EMPLOYEE_NAME = Target.the("search employee name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input");

    public static Target JOB_DROPDOWN_BY_LABEL = Target.the("click dropdown menu job")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]");

    public static Target JOB_OPTION = Target.the("select job type")
            .locatedBy("//ul[contains(@class,'oxd-dropdown-menu')]//a[normalize-space()='{0}']");

    public static Target CLICK_ADD_JOB = Target.the("click add job")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button");

    public static Target ENTER_JOB_TITLE = Target.the("enter job title")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input");

    public static Target ENTER_JOB_DESCRIPTION = Target.the("enter job description")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea");

    public static Target ENTER_JOB_NOTES = Target.the("enter job notes")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea");

    public static Target CLICK_JOB_SAVE_BUTTON = Target.the("click save job button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]");

    public static Target CLICK_JOB_EDIT_BUTTON = Target.the("click edit button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[4]/div/button[2] ");
}
