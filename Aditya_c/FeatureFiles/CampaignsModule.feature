Feature: Integration Test.
Scenario Outline: Testing integration between components.
Given User launches the browser
When he enters url "http://192.168.44.128:8080"
Then Login page with title "Zoho CRM - Sign in" should be displayed
When he enters username "rashmi@dell.com" and password "123456"
And It should accept the credentials
Then Home page with title "Zoho CRM - Home Page" should be displayed
When he clicks on Campaigns major tab
Then All Campaigns page with title "Zoho CRM - Displaying Custom View Details" should be displayed
When he clicks on New Campaign button
Then Create Campaign page with title "Zoho CRM - Create Campaign" should be displayed
When he enters the Campaign Name as "<campname>"
And he select an option in the Type dropdown
And he select an option in the Status dropdown
And he enters the Start Date as "<sdate>"
And he enters the End Date as "<edate>"
And he enters the Expected Revenue as "<erev>"
And he enters the Budgeted Cost as "<budcost>"
And he enters the Actual Cost as "<actcost>"
And he enters the Expected Response as "<eres>"
And he enters the Num Sent as "<num>"
And he clicks on Save button
Then Campaign details page with title "Zoho CRM - Campaign Details" should be displayed with the following data:"<campname>""Conference""Complete""<sdate>""<edate>""<erev>""<budcost>""<actcost>""<eres>""<num>"
    
 

Examples:
|campname|sdate|edate|erev|budcost|actcost|eres|num|
|LG Dual Invertor AC|03/29/2025|04/29/2025|90980|30000|85990|0|2|