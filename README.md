# Shared DTOs
DTOS públicos para reutilizarlos en los módulos a realizar para el proyecto en conjunto de la materia de **Ingeniería de Software**.
El objetivo de este repositorio es recopilar todos los DTOs públicos que pueden existir en los módulos de cada equipo y que puedan
ser accesible mediante esta librería, consiguiendo repetir menos código en cada proyecto.

## Agregar depdenccia
En el archivo ``build.gradle`` en el apartado de repositorios agrega el repositorio de **jitpack**.
```groovy
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}
```

Luego, en la sección de dependencías agrega el nombre de la dependencia y la versión a utilizar.

```groovy
dependencies{
  // X.X.X se debe reeemplazar por la versión de la librería
  implementation 'com.github.xsismadn3ss:shared-dtos:vX.X.X'
}
```

## Jitpack releases
🔗 [jitpack.io/#xsismadn3ss/shared-dtos](https://jitpack.io/#xsismadn3ss/shared-dtos)