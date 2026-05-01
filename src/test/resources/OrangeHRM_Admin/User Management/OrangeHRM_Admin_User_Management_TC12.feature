Feature: OrangeHRM Admin Test

  Scenario Outline: OrganeHRM Admin Page
    Given User navigates to the login page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on login button
    Then User navigates to the admin page
    #Edit User
    And User click on the edit button
    And User selects user role '<Role>'
    And User selects user status '<Status>'
    And User edit the details
    | Rosanna Ryan Pagac   |
    | username             |
    And User click on change password checkbox
    And User edit passwords
      | Password123! |
      | Password123! |
    When User click save button

    Examples:
      | Username | Password | Role  | Status     |
      | Admin    | admin123 | ESS   | Disabled   |

  #Add user
  #Edit user
  #Delete user
  #Search for user
  #Validate existing user


    # run in terminal
    # mvn clean verify
    # to execute the bdd script