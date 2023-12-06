Feature: Add 2 items to the shopping cart

  @addToCart
  Scenario: Adding two items to the shopping cart
    Given  El usuario está en la página de inicio de OpenCart
    When   El usuario agrega el primer artículo al carrito
    And    El usuario agrega el segundo artículo al carrito
    Then   Los dos artículos están en el carrito de compras