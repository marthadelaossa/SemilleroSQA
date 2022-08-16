#language: en
Feature: Busqueda de un producto exitosomante de forma aleatoria

  Scenario Outline: <Caso>
    Given que me encuentro en la pagina de bikesonline <Url>
    When quiero buscar un producto de forma aleatoria
    Then valido lo buscado

    Examples:
      | Caso             | Url                          |
      | Buscar Productos | https://www.bikesonline.com/ |