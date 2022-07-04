Feature: Text box
  Yo como usuario
  quiero navegar en el menu ELEMENTS
  para validar xpath

  Scenario Outline: TEXT BOX
    Given que el abre pagina ToolsQA
    When el rellena datos de TEXT BOX
    |name|mail|currentAdress|permanentAdress|
    |<name>|<mail>|<currentAdress>|<permanentAdress>|
    Then se vera mensaje de TEXT OK


      Examples:
      |name |mail                    |currentAdress|permanentAdress|
      |David|jd.caraballoo@gmail.com|Necoclí      |Santa Fe de Ant   |