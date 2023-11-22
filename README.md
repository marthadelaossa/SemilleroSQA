#   Repositorio Semillero SQA

Este repositorio contiene los retos superados exitosamente en el semillero de Automatizacion de SQA

##  Proyecto Patron de Diseño POM 

  [Reto POM SQA](https://github.com/marthadelaossa/Semillero/tree/master/RetoMarthaDelaOssa)

  Gestor de Dependencias Gradle

##  Objetivo

  Crear un proyecto completo de Pruebas Automatizadas usando Java y Selenium, con el patron de diesño POM.
  
  Ingresar a la página https://www.bikesonline.com/ y automatizar 3 flujos, los cuales deben estar separados cada uno en un feature por aparte.
  
  Observacion: La apertura del navegador, debe utilizar lectura de Excel para darle la URL de la página al proyecto.

##  Flujos
    
 1.  El primer flujo debe realizar mínimo 2 búsquedas por la caja de texto de la página, y la data le debe ser enviada con un archivo de Excel.
  
 2. El segundo flujo debe ingresar a las categorías de la página, seleccionar una de las categorías y entrar a uno de los productos y hacerle una validación (Las validaciones se me olvidó enseñarlas entonces el martes las vemos).
 
 3. El tercer flujo debe ingresar mínimo a 5 productos desde el home y validarlos, es decir, en el home escoger un producto, hacerle una validación, volver al home, y así sucesivamente 5 veces.
 
  Está prohibido el uso de xpaths absolutos.
  Está prohibido el uso Thread.sleep, en lugar de eso pueden usar esperas implícitas.

---
  ##  Proyecto Patron de Diseño  Screenplay

  [Reto  Screenplay SQA](https://github.com/marthadelaossa/Semillero/tree/master/RetoMarthaDelaOssaSreenplay%20V%202.0/RetoMarthaDelaOssaSreenplay)

  Gestor de Dependencias Gradle

##  Objetivo

  Crear un proyecto completo de Pruebas Automatizadas usando Java y Selenium, con el patron de diesño POM.
  
  Ingresar a la página https://www.bikesonline.com/ y automatizar 4 flujos, los cuales deben estar separados cada uno en un feature por aparte.
  
  Observacion: La apertura del navegador, debe utilizar lectura de Excel para darle la URL de la página al proyecto.

##  Flujos
    
 1. El primer flujo debe realizar mínimo 3 búsquedas por la caja de texto de la página, y la data le debe ser enviada con data table desde el background.

 2. El segundo flujo debe realizar mínimo 5 búsquedas por la caja de texto de la página, y la data le debe ser enviada con examples desde el outline.

 3. El tercer flujo debe realizar mínimo 3 búsquedas por la caja de texto de la página, y la data le debe ser enviada con lectura de excel.

 4. El cuarto flujo debe ingresar a una categoría que contenga 10 o más productos, y seleccionar uno de los productos de forma aleatoria.
 
  Se debe generar el reporte de SerenityBDD.
  
  Está prohibido el uso de xpaths absolutos.
  
  Está prohibido el uso Thread.sleep, en lugar de eso pueden usar esperas implícitas, preferiblemente el WaitUntil que nos proporciona Serenity Screenplay.
    

    
