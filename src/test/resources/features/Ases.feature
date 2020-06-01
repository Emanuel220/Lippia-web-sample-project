Feature: Como persona beneficiada necesito buscar en Anses informacion

  @Smoke
  Scenario Outline: La Persona busca por <valor>

    Given La Persona esta en la pagina del Anses
    When La Persona busca la palabra <valor>
    Then El Cliente verifica que los resultados se muestren corectamente <resultado>

    Examples:
      |valor|resultado|
      |monotributo social|Social|
      |Créditos ANSES|Créditos|
      |Actualización de DNI|DNI|
      |Tarifa Social de Gas|Tarifa|

  @Smoke @Anses
    Scenario Outline: La persona selecciona por <menu>

    Given La Persona esta en la pagina del Anses
    When La Persona selecciona el menu  <valor>
    Then El Cliente verifica que la pagina es la correcta <valor>

    Examples:
      |menu|valor|
      |Embarazo y nacimiento|Embarazo y nacimiento|
      |Hijos|Hijos|
      |Educación|Educación|
      |Trabajo|Trabajo|



