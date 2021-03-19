Feature: Cucumber project Git.

  Background: navigate

    Given the user navigate  to the page
    When   user enter the "Admin" and "admin123"
    Then  user click the login button

    Scenario: Orange page

      When user clicks the admin function
      Then user click first checkboxes are selected
      And click on top of username 2 times
      And validate usernames are listed in descending order
#