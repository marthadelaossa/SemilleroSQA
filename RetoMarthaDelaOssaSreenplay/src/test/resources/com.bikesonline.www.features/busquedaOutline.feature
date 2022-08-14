#language: en
Feature: Busqueda de 5 productos exitosomante por la caja de texto

  Scenario Outline: <Caso><Producto>
    Given que me encuentro en la pagina de bikesonline <Url>
    When quiero buscar el <Producto>
    Then valido que sea el <Producto>

    Examples:
      | Caso               | Producto | Url                          |
      | Buscar el Producto | Polygon  | https://www.bikesonline.com/ |
      | Buscar el Producto | Helmet   | https://www.bikesonline.com/ |
      | Buscar el Producto | Bike     | https://www.bikesonline.com/ |
      | Buscar el Producto | Inner    | https://www.bikesonline.com/ |
      | Buscar el Producto | Light    | https://www.bikesonline.com/ |


