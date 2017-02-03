# AppiumQuiz

I have written the assignment in Java programming language and used IntelliJ. In the course of testing the mopub_v4.11.0.apk application, I have also made a short clip in which the reviewer can observe the (I hope) correct execution of test scenario.
The clip can be found at: https://goo.gl/NO833I


Answers to bonus questions:

A. We can clean app cache using drive.resetApp() or using flag -full-reset (implemented)

B. We can use element.getLocation() and then assert it, if we know where it should be positioned!(implemented) 

C. If we use SeleniumGrid we can specify for each of the server instances, it’s own config file with --nodeconfig config.json, therefore we can check for each of the devices from within the test code (Java for example) which version of Android or even which OS is the device running and execute the relevant test scenario/s accordingly. The test script would be therefore "device independent".


D. I would write custom framework similar to: https://github.com/sameer49/Appium-Grid-For-Android and off-course use the concept of threads. 
I have identified 3 approaches:

1. Execute tests and spawn new Appium server instances directly from Java (with the help of "CommandPrompt" class).
2. Spawn predefined number of Appium servers with the help of an shell script and then just deploy the tests to these different server instances (devices).
3. Using the "AppiumServiceBuilder" class we could spawn server instances (similar to 1.). 

All of the above mentioned methods are pretty similar.
