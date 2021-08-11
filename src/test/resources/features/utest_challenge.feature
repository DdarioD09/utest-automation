# Autor: Dario Daza
@stories
Feature: Challenge Choucair
  As a new user, I want to create a new account at the Utest page

  @scenario1
  Scenario: Create a new user
    Given that Dario wants to register as a new user
    When he fill the basic information form
      | name | lastname | email               | month | day | year | language |
      | Juan | Carrillo | juan77390@correo.es | May   | 23  | 2000 | spanish  |
    And he fill the location information form
      | city | postal | country |
      | Cali | 110851 | Ecuador |
    And  he fill the device information form
      | computer | version | pcLanguage | mobile | model | os         |
      | Linux    | Ubuntu  | Bulgarian  | Wiko   | Y61   | Android 10 |
    And he create a password and accept the terms and conditions
      | password   |
      | Pas13Qd@df |
    Then he see the welcome message
      | welcomeMessage                                                          |
      | Welcome to the world's largest community of freelance software testers! |