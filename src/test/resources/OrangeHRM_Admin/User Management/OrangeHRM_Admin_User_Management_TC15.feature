Feature: OrangeHRM Admin Test

  Scenario Outline: OrganeHRM Admin Page
    Given User navigates to the login page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on login button
    Then User navigates to the admin page
    #Search for user
    And User selects user role '<Role>'
    And User selects user status '<Status>'
    And User search for Users
    | Adam       |
    | Adam       |
    #Validate existing user

    Examples:
      | Username | Password |  Role  | Status      |
      | Admin    | admin123 |  ESS   | Enabled     |




    # run in terminal
    # mvn clean verify
    # to execute the bdd script