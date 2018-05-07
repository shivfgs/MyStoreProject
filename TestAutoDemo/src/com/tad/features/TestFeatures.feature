Feature: User registration at MyStore application

@SmokeTest
Scenario: Register user with valid email address
GIVEN  MyStore Application is opened
WHEN   User clicks Sign in link
AND    User enters valid email address
AND    User clicks on Create an account button
AND    User enters all the required data create an account page
AND    User Click Create an account button
THEN   User verifies that Registration is successful
AND    User verifies the FirstName and LastName at My Account page

@RegressionTest
Scenario: Register user with invalid email address
GIVEN  MyStore Application is opened
WHEN   User clicks Sign in link
AND    User enters <invalid-email> address
AND    User clicks on Create an account button
THEN   User verifies the registration error message.

Examples:
|invalid-email|
|test-user@@gmail.com|

@SmokeTest
Scenario: Verify the Megamenu functionality
GIVEN  MyStore Application is opened
WHEN   User navigates on Megamenu[Dress-> Summer dresses]
THEN   User verifies that Summer dresses-MyStore page opens
AND    User verifies the page Title

@RegressionTest
Scenario: Verify the Sort By functionality for price at Summer dresses page
GIVEN  MyStore Application is opened
WHEN    User navigates on Megamenu[Dress-> Summer dresses]
AND    User Selects value "Price: Lowest first" from the Sort By combo box
THEN   User verifies that product grid is rearranged as lowest first order
AND    User Selects value "Price: Highest first" from the Sort By combo box
AND    User verifies that product grid is rearranged as highest first order

@RegressionTest
Scenario: Select the product and verify the cart Summary
GIVEN  MyStore Application is opened
AND    User navigates on Megamenu[Dress-> Summer dresses]
WHEN   User selects a "<blue>" colour product
AND    User clicks to Add to cart button
AND    User clicks to checkout button
THEN   User verifies that cart summery page opens.
AND    User verifies the name of the product
AND    User verifies the color of the product
AND    User verifies the quantity of the product




