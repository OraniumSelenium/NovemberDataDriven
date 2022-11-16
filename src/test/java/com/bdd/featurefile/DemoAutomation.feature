@DemoAutomationSite
Feature: Demo Automation Site

Background:
Given User launches browser and open toolsqa application "https://demo.automationtesting.in/SignIn.html"


Scenario: Login functionality
And user create new step
When User click emailfield and enter a value "Test1"
And User click password and send a value "TestPass"


@test
Scenario Outline: Login with multiple data
When User click emailfield and enter a value "<Email>"
And User click password and send a value "<Password>"

Examples:
| Email | Password | 
|Test1 | TestPass |


