@ProductFeature
Feature: Product feature
  Description: This feature will be used to login the swag lab

  Background: 
    Given User is on Swag Lab application
    When user enters  username "<Username>"
    And user enters  pasword "<password>"
    And user clicks on Login button
    Then User should be able to see the Productpage

  @ProductSelection
  Scenario Outline: Verify that user is able to add the single product to cart
    Given User is on the Productpage
    When user selects the Product and clicks on add to cart button "<Product>"
    Then Product added successfully to the cart

    Examples: 
      | Product                 |
      | Sauce Labs Bolt T-Shirt |

  @DataTable
  Scenario: Verify that user is ablt add multiple products to the cart using datatable
    Given User is on the Productpage
    And User selects the products and clicks on add to cart button
      | Field    | value                    |
      | Product1 | Sauce Labs Backpack      |
      | Product2 | Sauce Labs Bike Light    |
      | Product3 | Sauce Labs Bolt T-Shirt  |
      | Product4 | Sauce Labs Fleece Jacket |
    Then User should be able to see the products in cart
