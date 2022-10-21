Feature: Application Login


Scenario: Home page login 
Given User is on Home page
When User login with "jin" and pass "123"
Then Home page appears
And Cards displayed are "true"

Scenario: Home page login 
Given User is on Home page
When User login with "john" and pass "321"
Then Home page appears
And Cards displayed are "false"