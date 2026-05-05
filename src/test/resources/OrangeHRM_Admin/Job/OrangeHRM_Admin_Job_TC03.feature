Feature: OrangeHRM Admin Test

  Scenario Outline: OrganeHRM Admin Page
    Given User navigates to the login page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on login button
    And User navigates to the admin page
    And User select type of job '<Job>'
    And User click on the pay grades add button
    And User enter pay grade name '<PayGradeName>'
    And User click on the pay grade save button

    Examples:
      | Username | Password | Job        | PayGradeName |
      | Admin    | admin123 | Pay Grades | My name is   |

    # run in terminal
    # mvn clean verify
    # to execute the bdd script