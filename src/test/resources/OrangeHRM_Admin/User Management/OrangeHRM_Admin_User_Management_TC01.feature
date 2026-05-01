Feature: OrangeHRM Admin Test

  Scenario Outline: OrganeHRM Admin Page
    Given User navigates to the login page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on login button
    Then User navigates to the admin page
    #Add User
    And User click on the add button
    And User selects user role '<Role>'
    And User selects user status '<Status>'
    And User enter the details
    | Timothy Lewis Amiano |
    | username             |
    | password1            |
    | password1            |

    Examples:
      | Username | Password | Role  | Status  |
      | Admin    | admin123 | ESS   | Disabled |

  #Add user
  #Edit user
  #Delete user
  #Search for user
  #Validate existing user


    # run in terminal
    # mvn clean verify
    # to execute the bdd script