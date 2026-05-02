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
      # Missing clear text field
    And User edit the details
    | Rosanna Ryan Pagac   |
    | username             |
    When User click save button

    Examples:
      | Username | Password | Role    | Status     |
      | Admin    | admin123 | Admin   | Disabled   |

    # run in terminal
    # mvn clean verify
    # to execute the bdd script