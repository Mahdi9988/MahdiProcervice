#Author: Mahdi Hadj Daoud
Feature: OrangeHRM Login Test
Background:
Given admin in the login page

  Scenario: Login with valid credatials
    When admin enter corect logni "Admin" and correct password "admin123"
    Then admin is director to the homepage that contains "Dashboard"

  Scenario: Login with invalide credatials
    When admin enter corect logni "Admin" and incorrect password "azerty"
    Then admin is still in login page that contains "Invalid credentials"
