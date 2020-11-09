$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Ecommerce/File_1.feature");
formatter.feature({
  "line": 1,
  "name": "Sign in to Automation Practise",
  "description": "",
  "id": "sign-in-to-automation-practise",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11049192900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Create new user End To End",
  "description": "",
  "id": "sign-in-to-automation-practise;create-new-user-end-to-end",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test1234"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to \"Practise_Ecommerce_url\" Website",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I Click on \"Sign in\" link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter values in property inputbox under \"page\"",
  "rows": [
    {
      "cells": [
        "property",
        "value"
      ],
      "line": 8
    },
    {
      "cells": [
        "Email address",
        "Piyush_S_Pathak_%u@gmail.com"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Create an account\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter values in property inputbox under \"page\"",
  "rows": [
    {
      "cells": [
        "property",
        "value"
      ],
      "line": 12
    },
    {
      "cells": [
        "First name",
        "Piyush"
      ],
      "line": 13
    },
    {
      "cells": [
        "Last name",
        "Pathak"
      ],
      "line": 14
    },
    {
      "cells": [
        "Password",
        "password1234"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I validate values of inputbox from \"page\"",
  "rows": [
    {
      "cells": [
        "property",
        "value"
      ],
      "line": 17
    },
    {
      "cells": [
        "Email",
        "Piyush_S_Pathak_%u@gmail.com"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select \"10\" value from \"days\" dropdown under login page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select \"8\" value from \"months\" dropdown under login page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select \"1991\" value from \"years\" dropdown under login page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I check \"Sign up for our newsletter!\" checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I uncheck \"Receive special offers from our partners!\" checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I validate values of inputbox from \"My Store\"",
  "rows": [
    {
      "cells": [
        "property",
        "value"
      ],
      "line": 25
    },
    {
      "cells": [
        "First name",
        "Piyush"
      ],
      "line": 26
    },
    {
      "cells": [
        "Last name",
        "Pathak"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I enter values in property inputbox under \"page\"",
  "rows": [
    {
      "cells": [
        "property",
        "value"
      ],
      "line": 29
    },
    {
      "cells": [
        "Company",
        "Siemens"
      ],
      "line": 30
    },
    {
      "cells": [
        "Address",
        "Baner"
      ],
      "line": 31
    },
    {
      "cells": [
        "City",
        "Pune"
      ],
      "line": 32
    },
    {
      "cells": [
        "Zip/Postal Code",
        "00000"
      ],
      "line": 33
    },
    {
      "cells": [
        "Mobile phone",
        "9874563210"
      ],
      "line": 34
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I select \"Ohio\" value from \"State\" dropdown",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "#And I enter \"some Additional information\" values under \"Additional information\" textbox"
    }
  ],
  "line": 37,
  "name": "I click on \"Register\" button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I validate text message \"Welcome to your account\" from page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Practise_Ecommerce_url",
      "offset": 15
    }
  ],
  "location": "CommonStepDef.i_navigate_to_Website(String)"
});
formatter.result({
  "duration": 164967400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 12
    }
  ],
  "location": "CommonStepDef.i_click_On_anyLink(String)"
});
formatter.result({
  "duration": 2317836700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "page",
      "offset": 43
    }
  ],
  "location": "CommonStepDef.i_set_values_values_in_property_inputbox(String,DataTable)"
});
formatter.result({
  "duration": 3163075600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create an account",
      "offset": 12
    }
  ],
  "location": "CommonStepDef.i_click_on_button(String)"
});
formatter.result({
  "duration": 83626600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "page",
      "offset": 43
    }
  ],
  "location": "CommonStepDef.i_set_values_values_in_property_inputbox(String,DataTable)"
});
formatter.result({
  "duration": 11054500500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "page",
      "offset": 36
    }
  ],
  "location": "CommonStepDef.i_validate_values_from_inputbox(String,DataTable)"
});
formatter.result({
  "duration": 48711900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 10
    },
    {
      "val": "days",
      "offset": 26
    }
  ],
  "location": "Login.i_select_dropdown(String,String)"
});
formatter.result({
  "duration": 124983800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 10
    },
    {
      "val": "months",
      "offset": 25
    }
  ],
  "location": "Login.i_select_dropdown(String,String)"
});
formatter.result({
  "duration": 68084100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1991",
      "offset": 10
    },
    {
      "val": "years",
      "offset": 28
    }
  ],
  "location": "Login.i_select_dropdown(String,String)"
});
formatter.result({
  "duration": 69806100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "check",
      "offset": 2
    },
    {
      "val": "Sign up for our newsletter!",
      "offset": 9
    }
  ],
  "location": "CommonStepDef.i_check_checkbox(String,String)"
});
formatter.result({
  "duration": 11107747800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "uncheck",
      "offset": 2
    },
    {
      "val": "Receive special offers from our partners!",
      "offset": 11
    }
  ],
  "location": "CommonStepDef.i_check_checkbox(String,String)"
});
formatter.result({
  "duration": 11063365600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Store",
      "offset": 36
    }
  ],
  "location": "CommonStepDef.i_validate_values_from_inputbox(String,DataTable)"
});
formatter.result({
  "duration": 38927900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "page",
      "offset": 43
    }
  ],
  "location": "CommonStepDef.i_set_values_values_in_property_inputbox(String,DataTable)"
});
formatter.result({
  "duration": 15598923200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ohio",
      "offset": 10
    },
    {
      "val": "State",
      "offset": 28
    }
  ],
  "location": "CommonStepDef.i_select_dropdown(String,String)"
});
formatter.result({
  "duration": 141458500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 12
    }
  ],
  "location": "CommonStepDef.i_click_on_button(String)"
});
formatter.result({
  "duration": 1711610200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to your account",
      "offset": 25
    }
  ],
  "location": "CommonStepDef.i_validateTectMessagae(String)"
});
formatter.result({
  "duration": 64920800,
  "status": "passed"
});
formatter.after({
  "duration": 675375000,
  "status": "passed"
});
formatter.before({
  "duration": 10891264200,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Click on sign and create an account",
  "description": "",
  "id": "sign-in-to-automation-practise;click-on-sign-and-create-an-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@test1234"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "I navigate to \"Practise_Ecommerce_url\" Website",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I Click on \"SigniSdsan\" link",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I click on \"Create an account\" button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Practise_Ecommerce_url",
      "offset": 15
    }
  ],
  "location": "CommonStepDef.i_navigate_to_Website(String)"
});
formatter.result({
  "duration": 5147800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SigniSdsan",
      "offset": 12
    }
  ],
  "location": "CommonStepDef.i_click_On_anyLink(String)"
});
formatter.result({
  "duration": 1037703000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"SigniSdsan\"}\n  (Session info: chrome\u003d86.0.4240.183)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-K85M3QN3\u0027, ip: \u0027192.168.0.101\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.183, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\Piyush\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:51511}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 4fe7a058e0df53db7542832c05ca204d\n*** Element info: {Using\u003dlink text, value\u003dSigniSdsan}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat general.CommanSetpDef_Implemtation.clicOnAnyLinkFromPage(CommanSetpDef_Implemtation.java:20)\r\n\tat stepDefinition.CommonStepDef.i_click_On_anyLink(CommonStepDef.java:35)\r\n\tat ✽.And I Click on \"SigniSdsan\" link(Ecommerce/File_1.feature:43)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create an account",
      "offset": 12
    }
  ],
  "location": "CommonStepDef.i_click_on_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1351373100,
  "status": "passed"
});
});