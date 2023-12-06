Feature: Compra de productos

  @test
  Scenario: Agregar dos productos al carrito de compras
    Given El usuario se encuentra en la pagina de incio de la tienda
    And Selecciona el producto "Macbook" y lo agrega al carrito
    And Selecciona el producto dos "Iphone" y lo agrega al carrito
    And El usuario hace click en el carrito de compras
    And El usuario hace click en el boton "Checkout"
    Then El usuario se encuentra en la pagina del Checkout
