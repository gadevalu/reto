Feature: El usuario puede añadir varios articulos al carrito

  Scenario: Como usuario quiero logearme para hacer compras
    Given Que el usuario esta en la pagina de inicio
    And Que el usuario hace clic en el boton de singin
    When El usuario ingrese su email
    And El usuario ingrese su contrasena
    Then El usuario hace clic en el boton singin
    Given El usuario hace clic en Mujeres
    When El usuario hace clic en Tops
    Given Las blusas de User Clicks
    And El usuario hace clic en adicionar al carrito
    Then Que el usuario hace clic en continuar comprando