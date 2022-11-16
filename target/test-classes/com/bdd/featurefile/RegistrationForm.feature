Feature: Register form


Background:
Given User launches browser and open toolsqa application "https://demoqa.com/automation-practice-form"



Scenario: Validate text fields in register form
When User click the firstname and send a value "Test Firstest lastnamtName"
And User click the lastname fields and send "e" as a testdata
And User click email and send a value "abc@gmail.com"


@reg @smoke
Scenario Outline: Multiple test data
When User click the firstname and send a value "<FirstName>"
And User click the lastname fields and send "<LastName>" as a testdata
And User click email and send a value "<Email>"

Examples:
| FirstName | LastName | Email |
|Test FirstName |test lastname|abc@gmail.com|
|Test FirstName1 |test lastname1|def@gmail.com|
|Test FirstName2 |test lastname2|ttt@gmail.com|

Scenario: Validate radio button

