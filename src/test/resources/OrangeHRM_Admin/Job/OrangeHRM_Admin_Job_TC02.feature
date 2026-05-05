Feature: OrangeHRM Admin Test

  Scenario Outline: OrganeHRM Admin Page
    Given User navigates to the login page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on login button
    And User navigates to the admin page
    And User select type of job '<Job>'
    #Missing clear text field
    And User click on the edit job button
    #Upload file
    And User enter details
    | Lolyou |
    | Lolyou |
    | Lolyou |
    And User click on the save button

    Examples:
      | Username | Password | Job        |
      | Admin    | admin123 | Job Titles |

    # run in terminal
    # mvn clean verify
    # to execute the bdd script