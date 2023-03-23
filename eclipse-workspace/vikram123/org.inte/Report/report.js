$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cha9.feature");
formatter.feature({
  "name": "To validate the MYNTRA web application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "To validate the search tshirt product then close window and check bag",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "cha10.to_launch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url to myntra application",
  "keyword": "When "
});
formatter.match({
  "location": "cha10.to_launch_url_to_myntra_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To search Tshirt",
  "keyword": "And "
});
formatter.match({
  "location": "cha10.to_search_Tshirt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select first product and select  size",
  "keyword": "And "
});
formatter.match({
  "location": "cha10.select_first_product_and_select_size()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the add to bag",
  "keyword": "And "
});
formatter.match({
  "location": "cha10.click_the_add_to_bag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the tab",
  "keyword": "And "
});
formatter.match({
  "location": "cha10.close_the_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click bag icon and Screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "cha10.click_bag_icon_and_Screenshot()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d111.0.5563.65)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PRADEEPA\u0027, ip: \u0027192.168.1.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 111.0.5563.65, chrome: {chromedriverVersion: 111.0.5563.64 (c710e93d5b63..., userDataDir: C:\\Users\\vikra\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50052}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: bec92aabfd253a177ee36c0dbeb858aa\n*** Element info: {Using\u003dxpath, value\u003d(//a[text()\u003d\u0027Beauty\u0027])[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat base.BaseClass.findElement(BaseClass.java:137)\r\n\tat org.inte.cha10.click_bag_icon_and_Screenshot(cha10.java:91)\r\n\tat ✽.Click bag icon and Screenshot(src/test/resources/cha9.feature:10)\r\n",
  "status": "failed"
});
});