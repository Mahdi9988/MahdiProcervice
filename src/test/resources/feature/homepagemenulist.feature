#Author: Mahdi
Feature: Consultation of the home page menus

  Scenario Outline: accessed the list of menus on the home page
    Given user connected to the home page
    When user clicks on menu "<menu>"
    Then the menu page is displayed

    Examples: 
      | menu        |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Claim       |
