Feature: To validate FreeCrm application

Scenario Outline: To login to application
Given browser is launched and navigated to the url
When user enters "<username>" and "<password>" and click on login button
Then verify the tiltle

Examples:
|username|password|
|vineethavg118@gmail.com|@Bn!bdJ8pudaJLs|












