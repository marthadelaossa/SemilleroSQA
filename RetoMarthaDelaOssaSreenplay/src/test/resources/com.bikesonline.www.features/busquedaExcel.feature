Feature: Busqueda de 3 productos exitosomante por la caja de texto y Productos enviados desde excel

  Scenario Outline: <Caso>
    Given que me encuentro en la pagina de bikesonline <Url>
    When quiero buscar Tres productos enviados desde excel
    Then valido que sea  lo buscado

    Examples:
      | Caso             | Url                          |
      | Buscar Productos | https://www.bikesonline.com/ |
