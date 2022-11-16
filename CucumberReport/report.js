$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:DemoAutomation.feature");
formatter.feature({
  "name": "Demo Automation Site",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DemoAutomationSite"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User launches browser and open toolsqa application \"https://demo.automationtesting.in/SignIn.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Toolsqa_Register.user_launches_browser_and_open_toolsqa_application(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DemoAutomationSite"
    }
  ]
});
formatter.step({
  "name": "user create new step",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click emailfield and enter a value \"Test1\"",
  "keyword": "When "
});
formatter.match({
  "location": "DemoAutomation.user_click_emailfield_and_enter_a_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click password and send a value \"TestPass\"",
  "keyword": "And "
});
formatter.match({
  "location": "DemoAutomation.user_click_password_and_send_a_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Login with multiple data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User click emailfield and enter a value \"\u003cEmail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click password and send a value \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "Test1",
        "TestPass"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User launches browser and open toolsqa application \"https://demo.automationtesting.in/SignIn.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Toolsqa_Register.user_launches_browser_and_open_toolsqa_application(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login with multiple data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DemoAutomationSite"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User click emailfield and enter a value \"Test1\"",
  "keyword": "When "
});
formatter.match({
  "location": "DemoAutomation.user_click_emailfield_and_enter_a_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click password and send a value \"TestPass\"",
  "keyword": "And "
});
formatter.match({
  "location": "DemoAutomation.user_click_password_and_send_a_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:RegistrationForm.feature");
formatter.feature({
  "name": "Register form",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User launches browser and open toolsqa application \"https://demoqa.com/automation-practice-form\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Toolsqa_Register.user_launches_browser_and_open_toolsqa_application(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate text fields in register form",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click the firstname and send a value \"Test Firstest lastnamtName\"",
  "keyword": "When "
});
formatter.match({
  "location": "Toolsqa_Register.user_click_the_firstname_and_send_a_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click the lastname fields and send \"e\" as a testdata",
  "keyword": "And "
});
formatter.match({
  "location": "Toolsqa_Register.user_click_the_lastname_fields_and_send_as_a_testdata(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click email and send a value \"abc@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Toolsqa_Register.user_click_email_and_send_a_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});