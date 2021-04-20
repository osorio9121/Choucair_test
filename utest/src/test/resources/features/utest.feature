#Autor: Daniel_Osorio
@stories
Feature: Utest
  As a user, I want to show how to automate in screenplay, for can pass the Choucair test.


  @scenario1
  Scenario Outline: Join in utest

    Given than Luisa wants to register in a new platform

    When she fills the fields that contains hers personal information
      |strName  |strLast  |strEmail  |strMonth  |strDay  |strYear  |
      |<strName>|<strLast>|<strEmail>|<strMonth>|<strDay>|<strYear>|
    Then she can create her user in the page utest
