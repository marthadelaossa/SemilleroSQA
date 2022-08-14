#languague: en
  #languague: en
Feature: Busqueda de tres productos exitosomante por la caja de texto

    Background:
      Given que me encuentro en la pagina de bikesonline https://www.bikesonline.com/

    Scenario:  Buscar productos
      When quiero buscar tres productos
        | producto |
        | Polygon  |
      Then valido que sea lo que busco

  Scenario:  Buscar productos
    When quiero buscar tres productos
      | producto |
      | Short    |
    Then valido que sea lo que busco

  Scenario:  Buscar productos
    When quiero buscar tres productos
      | producto |
      | Flats    |
    Then valido que sea lo que busco