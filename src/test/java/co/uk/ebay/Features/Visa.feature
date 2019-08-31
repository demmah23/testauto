Feature: Payment

Scenario: Method
	Given that I am able to get unto “https://www.next.co.uk/"
	And managed to get to the checkout page
	And register as a new customer
	And selected a delivery method
	When I enter valid  visa card number
	And enter a valid name
	And enter a valid expiry date 
	And enter valid security code
	And I click the payment button
	Then i should be taken to the payment successful page