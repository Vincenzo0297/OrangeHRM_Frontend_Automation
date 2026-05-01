Feature: OrangeHRM Login Test

  Scenario Outline: OrganeHRM Login Page
    Given User navigates to the login page
    Then User enters username '<Username>'

    Examples:
      | Username |
      | Admin    |

#

    # run in terminal
    # mvn clean verify
    # to execute the bdd script