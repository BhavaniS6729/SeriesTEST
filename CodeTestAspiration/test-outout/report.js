$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Aspiration.feature");
formatter.feature({
  "line": 1,
  "name": "Aspiration Testing",
  "description": "",
  "id": "aspiration-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "HomePage Validation",
  "description": "",
  "id": "aspiration-testing;homepage-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user lands on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Spend Save Link",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.user_lands_on_HomePage()"
});
formatter.result({
  "duration": 6277879351,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.user_clicks_on_Spend_Save_Link()"
});
formatter.result({
  "duration": 2642769326,
  "status": "passed"
});
formatter.uri("SpendSave.feature");
formatter.feature({
  "line": 1,
  "name": "SpendAndSave Page testing",
  "description": "",
  "id": "spendandsave-page-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "SpendAndSave Page Validation",
  "description": "",
  "id": "spendandsave-page-testing;spendandsave-page-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Save and Spend Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Two cards are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate the Two card products, Aspiration and Aspiration Plus",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on cardOne Get Aspiration",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate input field for email address to signup is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on x",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on cardTwo Get Aspiration Plus",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "validate the modal with monthly and yearly plans appear",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "validate Yearly radio button with bigAmount is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "validate monthly radio button with smallAmount is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SpendAndSaveStepDef.user_is_on_Save_and_Spend_Page()"
});
formatter.result({
  "duration": 6407419,
  "status": "passed"
});
formatter.match({
  "location": "SpendAndSaveStepDef.cards_are_displayed()"
});
formatter.result({
  "duration": 33226892,
  "status": "passed"
});
formatter.match({
  "location": "SpendAndSaveStepDef.validate_the_card_products_Aspiration_and_Aspiration_Plus()"
});
formatter.result({
  "duration": 45016204,
  "status": "passed"
});
formatter.match({
  "location": "SpendAndSaveStepDef.click_on_card_Get_Aspiration()"
});
formatter.result({
  "duration": 63815518,
  "status": "passed"
});
formatter.match({
  "location": "SpendAndSaveStepDef.validate_input_field_for_email_address_to_signup_is_displayed()"
});
formatter.result({
  "duration": 1132551,
  "error_message": "java.lang.NullPointerException\n\tat com.qa.stepDefs.SpendAndSaveStepDef.validate_input_field_for_email_address_to_signup_is_displayed(SpendAndSaveStepDef.java:68)\n\tat ✽.Then validate input field for email address to signup is displayed(SpendSave.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "location": "SpendAndSaveStepDef.click_on_x()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SpendAndSaveStepDef.click_on_card_Get_Aspiration_Plus()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SpendAndSaveStepDef.validate_the_modal_with_monthly_and_yearly_plans_appears()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SpendAndSaveStepDef.validate_Yearly_radio_button_with_bigAmount_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SpendAndSaveStepDef.validate_monthly_radio_button_with_smallAmount_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
});