Feature: To validate FreeCrm application
@tag1
Scenario Outline: To login to application
Given browser is launched and navigated to the url
When user enters "<username>" and "<password>" and click on login button
Then verify the tiltle

Examples:
|username|password|
|vineethavg118@gmail.com|@Bn!bdJ8pudaJLs|


@tag2
Scenario: To verify login functionality

Given browser is launched and navigated to the url 
Then verify the title 
Then verify the username
Then take a screenshot
Then logout from the application
And close the browser











