# Autor: Dario Daza
@stories
Feature: Challenge Choucair
  As a new user, I want to create a new account at the Utest page

  @scenario1
  Scenario: Create a new user
    Given that Dario wants to register as a new user
      #| strUser   | strPassword |
      #| TuUsuario | TuClave |
    When he fill the personal information form
    And he fill the location information form
    And  he fill the device information form
    And he create a password and accept the terms and conditions
      #| strCourse               |
      #| Metodologia Bancolombia |
    Then he see the welcome message
      #| strCourse               |
      #| Metodologia Bancolombia |