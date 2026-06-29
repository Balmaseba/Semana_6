# Llanquihue Tour

## Autor del proyecto

* **Nombre completo:** Sebastián Alejandro Reinoso Ortega
* **Sección:** DESARROLLO ORIENTADO A OBJETOS I_001A
* **Carrera:** ANALISTA PROGRAMADOR COMPUTACIONAL
* **Sede:** Online

---

## Descripción general del sistema

Este proyecto corresponde a una actividad de la asignatura **Desarrollo Orientado a Objetos I**. Se trata de una aplicación desarrollada en **Java** que simula la gestión de distintos servicios turísticos ofrecidos en la zona del **Lago Llanquihue**.

El sistema utiliza una estructura basada en **herencia**, donde la clase `ServicioTuristico` actúa como clase base y es extendida por las clases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`, cada una incorporando atributos específicos de su tipo de servicio.

La clase `GestorServicios` es la encargada de crear los distintos objetos y mostrar su información por consola mediante el uso del método `toString()`. El objetivo principal del proyecto es aplicar conceptos fundamentales de la **Programación Orientada a Objetos**, tales como **herencia, encapsulamiento, constructores, sobrescritura de métodos, reutilización de código y organización modular mediante paquetes**.

---

## Estructura general del proyecto

📁 src/

├── 📁 ui/                  # Clase principal con el método Main
    ├── 📄 Main.java
├── 📁 data/                # Clase encargada de crear y mostrar los servicios 
    ├── 📄 GestorServicios.java

└── 📁 model/               # Clases del dominio del sistema

    ├── 📄 ServicioTuristico.java

    ├── 📄 RutaGastronomica.java

    ├── 📄 PaseoLacustre.java

    └── 📄 ExcursionCultural.java

---

## Instrucciones para ejecutar el proyecto

1. Clonar el repositorio o descargar el proyecto.

2. Abrir el proyecto en **IntelliJ IDEA** o **Apache NetBeans**.

3. Verificar que el proyecto compile correctamente.

4. Ejecutar el archivo `Main.java` ubicado en el paquete `ui`.

5. El sistema creará automáticamente distintos servicios turísticos y mostrará por consola la información correspondiente a:

   * Rutas gastronómicas.
   * Paseos lacustres.
   * Excursiones culturales.

---

## Funcionalidades principales

* Creación de objetos mediante constructores.
* Implementación de una jerarquía de herencia.
* Reutilización de atributos y métodos desde una clase base.
* Sobrescritura del método `toString()` en cada clase derivada.
* Visualización de los servicios turísticos por consola.

---

## Tecnologías utilizadas

* **Java**
* **Programación Orientada a Objetos**
* **Herencia**
* **Encapsulamiento**
* **Constructores**
* **Sobrescritura de métodos (`toString`)**
* **Organización modular mediante paquetes**

---

## Repositorio GitHub

https://github.com/Balmaseba/Semana_6

**Fecha de entrega:** 29/06/2026
