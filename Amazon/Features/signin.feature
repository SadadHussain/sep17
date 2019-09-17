@signin
Feature: Amazon login feature test
Scenario: User should be able to signin by using valid credentials
Given go to home page
When click on hello signin
And enter valid user name
And enter valid password
And click on submit vutton
Then user profile should be appeared
