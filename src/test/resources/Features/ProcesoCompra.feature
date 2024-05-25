Feature: Compra de un usuario registrado con dirección

  Scenario: Usuario realiza una compra completa en la tienda
    Given el usuario está registrado
    And el usuario tiene una dirección registrada en su cuenta
    When el usuario inicia sesión en la tienda
    And el usuario navega por las categorías de productos
    And el usuario selecciona un producto
    And el usuario añade el producto al carrito
    And el usuario revisa los productos en el carrito
    And el usuario decide proceder al pago
    Then la dirección registrada del usuario debería ser seleccionada automáticamente como dirección de envío
    When el usuario selecciona su método de envío preferido
    And el usuario selecciona Pay check Money Order como método de pago
    And el usuario proporciona los detalles requeridos del método de pago
    And el usuario revisa todos los detalles del pedido
    And el usuario confirma el pedido
    Then el pedido debería ser procesado y registrado en el sistema
    And el usuario debería recibir una confirmación del pedido
    And el usuario debería ver los detalles del pedido en su cuenta
