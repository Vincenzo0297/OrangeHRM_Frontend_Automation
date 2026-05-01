Feature: OrangeHRM Login and Logout Test

  Scenario Outline: OrganeHRM Login and Logout Page
    Given User navigates to the login page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on login button
    And User navigates to the admin page
    And User click on dropdown menu
    And User click on logout button

    Examples:
      | Username | Password |
      | Admin    | admin123 |

    # run in terminal
    # mvn clean verify
    # to execute the bdd script