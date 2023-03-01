$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Besto.feature");
formatter.feature({
  "name": "User want to order the food",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the invalid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the chrome browser and maximize the window of besto app",
  "keyword": "Given "
});
formatter.match({
  "location": "Bestobites.to_launch_the_chrome_browser_and_maximize_the_window_of_besto_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the besto app",
  "keyword": "When "
});
formatter.match({
  "location": "Bestobites.to_launch_the_url_of_the_besto_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the account button",
  "keyword": "And "
});
formatter.match({
  "location": "Bestobites.to_click_the_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass invalid username in phone field of besto app",
  "keyword": "And "
});
formatter.match({
  "location": "Bestobites.to_pass_invalid_username_in_phone_field_of_besto_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass invalid password in password field of besto app",
  "keyword": "And "
});
formatter.match({
  "location": "Bestobites.to_pass_invalid_password_in_password_field_of_besto_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button of besto app",
  "keyword": "And "
});
formatter.match({
  "location": "Bestobites.to_click_the_login_button_of_besto_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check the output of besto app",
  "keyword": "And "
});
formatter.match({
  "location": "Bestobites.to_check_the_output_of_besto_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser of besto app",
  "keyword": "Then "
});
formatter.match({
  "location": "Bestobites.close_the_browser_of_besto_app()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User goes to add the masala dosa",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the chrome browser and maximize the window of besto app",
  "keyword": "Given "
});
formatter.match({
  "location": "Bestobites.to_launch_the_chrome_browser_and_maximize_the_window_of_besto_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hits the url of besto app",
  "keyword": "When "
});
formatter.match({
  "location": "Bestobites.user_hits_the_url_of_besto_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the  dosa in dropdown labeled",
  "keyword": "And "
});
formatter.match({
  "location": "Bestobites.user_select_the_dosa_in_dropdown_labeled()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cspan class\u003d\"lte-tab\" data-filter\u003d\"10\"\u003e...\u003c/span\u003e is not clickable at point (656, 554). Other element would receive the click: \u003cdiv class\u003d\"js-cookie-consent cookie-consent\" id\u003d\"cookie\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d109.0.5414.120)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MEENAM\u0027, ip: \u002726.244.144.38\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.4.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 109.0.5414.120, chrome: {chromedriverVersion: 109.0.5414.74 (e7c5703604da..., userDataDir: C:\\Users\\91763\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52598}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 5c1d68c8b863d8ecc304208e84cc874e\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy16.click(Unknown Source)\r\n\tat org.base.BaseClasss.clickBtn(BaseClasss.java:61)\r\n\tat org.stepdefinition.Bestobites.user_select_the_dosa_in_dropdown_labeled(Bestobites.java:77)\r\n\tat ✽.user select the  dosa in dropdown labeled(src/test/resources/Besto.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user select the masala dosa in list",
  "keyword": "And "
});
formatter.match({
  "location": "Bestobites.user_select_the_masala_dosa_in_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user check the available time",
  "keyword": "And "
});
formatter.match({
  "location": "Bestobites.user_check_the_available_time()"
});
formatter.result({
  "status": "skipped"
});
});