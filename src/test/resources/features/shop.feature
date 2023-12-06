Feature: Realizar el checkout en Opencart

  @test
  Scenario: Checkout como Guest
    Given El usuario está en la página del carrito de Opencart
    When El usuario agrega dos productos al carrito
    And El usuario visualiza el carrito
    And El usuario completa el Checkout como invitado
    Then El usuario finaliza la compra hasta la confirmación





