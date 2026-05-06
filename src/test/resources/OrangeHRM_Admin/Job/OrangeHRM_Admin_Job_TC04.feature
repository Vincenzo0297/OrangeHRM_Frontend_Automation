Feature: OrangeHRM Admin Test

  Scenario Outline: OrganeHRM Admin Page
    Given User navigates to the login page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on login button
    And User navigates to the admin page
    And User select type of job '<Job>'
    #Edit
    And User click on the pay grade edit button
    And User edit pay grade name '<editPayGradeName>'
    And User click on the edit save button
    And User click on the add currencies button
    And User select currency '<Currency>'
    And User add the currencies details
      |  100     |
      |  3000    |
    And User click on the currencies save button

    Examples:
      | Username | Password | Job        | editPayGradeName | Currency                    |
      | Admin    | admin123 | Pay Grades | lOLYOU           | HKD - Hong Kong Dollar      |

    # run in terminal
    # mvn clean verify
    # to execute the bdd script