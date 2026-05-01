Feature: OrangeHRM Admin Test

  Scenario Outline: OrganeHRM Admin Page
    Given User navigates to the login page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on login button
    And User navigates to the admin page

    Examples:
      | Username | Password |
      | Admin    | admin123 |


    # run in terminal
    # mvn clean verify
    # to execute the bdd script