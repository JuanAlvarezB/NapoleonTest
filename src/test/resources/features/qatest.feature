# language: en
# Author: Juan Camilo Alvarez Barrios

@stories
Feature:
  The user wants to enter the sahitest website and validate several options

  @stage1
  Scenario: The user accesed to for a website sahitest to verify Sahi Test

    Given the user want to automate access to the sahitest's website
    When the user enters the iframe section and right-click on window open test
    Then the user verifies that he is on the expected page with the following text Sahi Tests

  @stage2
  Scenario: The user accesed to for a website sahitest to verify Not found Page

    Given the user want to automate access to the sahitest's website
    When the user enters the iframe section and right-click on Error Page
    Then the user verifies that he is on the eror page with the following text Not Found

  @stage3an4
  Scenario: the user wants to buy several books and verify the total amount

    Given the user logs in with the credential user: test, and pass: secret.
    When the user buys the books cantJava 2, cantRuby 5, and cantPython 2
    Then the user verifies the total amount cantJava 2, cantRuby 5, and cantPython 2


  @stage5
  Scenario: The user accesed to for a website sahitest to verify Sahi Test

    Given the user want to automate access to the sahitest's website
    When  the user navigates through the main menu of the website and select an option
    Then the user when returning to the main menu validates the label Sahi Tests
