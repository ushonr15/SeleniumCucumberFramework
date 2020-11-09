Feature: Sign in to Automation Practise 

@test1234 
Scenario: Create new user End To End 
	And I navigate to "Practise_Ecommerce_url" Website 
	And I Click on "Sign in" link 
	And I enter values in property inputbox under "page" 
		|property |value|
		|Email address|Piyush_S_Pathak_%u@gmail.com|
	And I click on "Create an account" button 
	And I enter values in property inputbox under "page" 
		|property |value|
		|First name|Piyush|
		|Last name|Pathak|
		|Password|password1234|
	And I validate values of inputbox from "page" 
		|property |value|
		|Email |Piyush_S_Pathak_%u@gmail.com|	
	And I select "10" value from "days" dropdown under login page 
	And I select "8" value from "months" dropdown under login page 
	And I select "1991" value from "years" dropdown under login page 
	And I check "Sign up for our newsletter!" checkbox 
	And I uncheck "Receive special offers from our partners!" checkbox 
	And I validate values of inputbox from "My Store" 
		|property |value|
		|First name|Piyush|
		|Last name|Pathak|	
	And I enter values in property inputbox under "page" 
		|property |value|
		|Company|Siemens|
		|Address |Baner|	
		|City | Pune |
		|Zip/Postal Code|00000|
		|Mobile phone|9874563210|
	And I select "Ohio" value from "State" dropdown 
	#And I enter "some Additional information" values under "Additional information" textbox 
	And I click on "Register" button 
	Then I validate text message "Welcome to your account" from page 
	
@test1234 
Scenario: Click on sign and create an account 
	And I navigate to "Practise_Ecommerce_url" Website 
	And I Click on "SigniSdsan" link 
	And I click on "Create an account" button 
	
	
	
@test12345 
Scenario: Click on sign and login 
	And I navigate to "Practise_Ecommerce_url" Website 
	And I Click on "Sign in" link 
	And I enter values in property inputbox under "page" 
		|property |value|
		|Email address|Piyush_S_Pathak_%u@gmail.com|
	And I enter values in property inputbox under "Already registered?" 
		|property |value|
		|Email address|Piyush_S_Pathak_%u@gmail.com|
		