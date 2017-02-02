# AppiumQuiz

Answers to bonus questions:

A. We can clean app cache using drive.resetApp() or using flag -full-reset (implemented)

B. We can use element.getLocation() and then assert it if we know where it should be!(implemented) 

C.  If we use SeleniumGrid (https://github.com/seleniumhq/selenium-google-code-issue-archive) we can specify for each of the server instances, it’s own config file 
with --nodeconfig config.json,therefore we can check from within the test code (Java for example) which version of Android or even which OS is the device running and execute the relevant test scenario/s accordingly.

D.I would write custom framework similar to: https://github.com/sameer49/Appium-Grid-For-Android and off-course use the concept of threads. 
I have identified 2 approaches:

1. Execute tests and spawn new Appium server instances directly from Java.
2. First we spawn predefined number of Appium servers with the help of an shell script and then just deploy the tests to these different server instances (devices).
