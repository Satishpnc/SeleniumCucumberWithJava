$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login",
  "description": "This feature deals with the login functionality",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login with valid credentials",
  "description": "",
  "id": "facebook-login;login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on facebook homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I logged into facebook",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "facebook-login;login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "facebook-login;login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "abcd134@gmail.com",
        "abcd1234"
      ],
      "line": 11,
      "id": "facebook-login;login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1879843553,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login with valid credentials",
  "description": "",
  "id": "facebook-login;login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on facebook homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"abcd134@gmail.com\" and \"abcd1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I logged into facebook",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.iAmOnFacebookHomepage()"
});
formatter.result({
  "duration": 2208495940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd134@gmail.com",
      "offset": 15
    },
    {
      "val": "abcd1234",
      "offset": 39
    }
  ],
  "location": "StepDefinition.iEnterValidAnd(String,String)"
});
formatter.result({
  "duration": 637633902,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "duration": 1856378688,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iLoggedIntoFacebook()"
});
formatter.result({
  "duration": 51559942,
  "status": "passed"
});
formatter.after({
  "duration": 75421287,
  "status": "passed"
});
formatter.before({
  "duration": 744895200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "facebook-login;login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on facebook homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter the users email address as email:\"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter the following",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17
    },
    {
      "cells": [
        "abc123@gmail.com",
        "abc123"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I will get a notification for invalid username/password",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.iAmOnFacebookHomepage()"
});
formatter.result({
  "duration": 1797601065,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 42
    }
  ],
  "location": "StepDefinition.iEnterTheUsersEmailAddressAsEmail(String)"
});
formatter.result({
  "duration": 221312,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_enter_the_following(DataTable)"
});
formatter.result({
  "duration": 608712085,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "duration": 30281774543,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iWillGetANotificationForInvalidUsernamePassword()"
});
formatter.result({
  "duration": 373302,
  "status": "passed"
});
formatter.after({
  "duration": 78044075,
  "status": "passed"
});
});