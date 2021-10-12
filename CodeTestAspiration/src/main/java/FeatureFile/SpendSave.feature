Feature: SpendAndSave Page testing

Scenario: SpendAndSave Page Validation

    Given user is on Save and Spend Page
    Then Two cards are displayed 
 	Then validate the Two card products, Aspiration and Aspiration Plus
 	Then click on cardOne Get Aspiration 
 	Then validate input field for email address to signup is displayed
 	Then click on x
 	Then click on cardTwo Get Aspiration Plus
 	Then validate the modal with monthly and yearly plans appear
 	Then validate Yearly radio button with bigAmount is displayed
 	Then validate monthly radio button with smallAmount is displayed