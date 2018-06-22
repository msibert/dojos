# Modelo de problema

## Asignación de aulas

En la Universidad de la Matanza, se dispone de un lugar llamado CAU (Centro Atención Unificado), 
el cual se encarga de asignar aulas y laboratorios bajo solicitud de los docentes. Dada una solicitud, 
debe devolverse un aula y una etiqueta, que indique que aula fue asignada y permita pegarse en la puerta 
de la misma (Ej: "Aula: Lab B").

- Dado un conjunto de Aulas disponibles, se solicita una de ellas con capacidad para al menos 10 personas. 
Ej: [{nombre:”Lab A”, capacidad:5},{nombre:”Lab B”, capacidad:15}] -> "Aula: Lab B"

- Dado el mismo listado, se solicita un aula para 30 personas. Se espera como respuesta: 
“No hay aula disponible” Ej: [{nombre:”Lab A”, capacidad:5},{nombre:”Lab B”, capacidad:15}] -> “No hay aula disponible”

[Lista completa de requerimientos](https://docs.google.com/document/d/1PjtEB4CMJLMYpQl03Yq51OaEFJPuCohUiYlokl4kA8M/edit?usp=sharing)

### Metodología

Programación orientada a objetos + TDD

### Lenguaje

![technology JAVA 8](https://img.shields.io/badge/technology-Java%208-green.svg)

### Agenda

1. Planteo de problema (5 minutos)
2. Codificación (30 - 40 minutos)
3. Puesta en común (Hasta el final)

## Pasos para realizar el workshop 

1. Forkeamos el repo:

2. Clonamos nuestro fork:

    ```bash
        https://github.com/msibert/dojos.git
    ```


### Pasos específicos para java

1. Ejecutamos los tests

    ```bash
        mvn test
        ( Estando en la carpeta que contiene el pom.xml )
    ```

1. Generamos el reporte de cobertura

    ```bash
        mvn jacoco:report
        ( Estando en la carpeta que contiene el pom.xml )
    ```

#### Qué necesito?

1. Maven 3+ ( brew install maven )
2. JDK  1.8

## Pasos para realizar el workshop


## Qué necesito?

1. Notebook para realizar workshop (si queres hacerlo, sino podes venir a compartir tus experiencias)
2. Ganas de compartir tu solución.
