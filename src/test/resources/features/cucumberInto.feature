Feature: BBC Registration


  Scenario Outline: invalid password entered
    Given I am on the registration page
    When I input the necessary details with the password details <password>
    Then I receive the corresponding error <error>


    Examples:

    |     password        |                                  error                                               |
    |       "hello"       |   "Sorry, that password is too short. It needs to be eight characters or more."      |
    |      "password"     |   "Sorry, that password isn't valid. Please include something that isn't a letter."  |
    |      "12345678"     |   "Sorry, that password isn't valid. Please include a letter."                       |
    |     "password1"     |   "Sorry, that password isn't valid. Make sure it's hard to guess."                  |