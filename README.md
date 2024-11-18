# 🐾 Parcial-POO  

**Repositorio del proyecto "Zoo" desarrollado en Java con Ant. Simula un zoológico utilizando principios de Programación Orientada a Objetos (POO); desarrollado con el fin de presentar como parcial de la materia POO en la Uniagustiniana.**  

Este proyecto incluye la creación de un modelo basado en clases, asociaciones y jerarquías. Los datos son ingresados por consola y al final de la ejecución se muestra un resumen con toda la información ingresada.

---

## 📂 Estructura del Repositorio  

```plaintext
Parcial-POO/
├── Zoo/                  # Proyecto principal en Java
│   ├── src/
│   │   ├── clases/
│   │   │   ├── Animal.java
│   │   │   ├── Ave.java
│   │   │   ├── Mamifero.java
│   │   │   ├── Cuidador.java
│   │   │   ├── Veterinario.java
│   │   │   ├── Zoologico.java
│   │   │   ├── Habitat.java
│   │   │   └── Principal.java
│   └── build.xml         # Archivo de construcción de Ant
├── Imgs/
│   └── UML.png # Diagrama de clases (Hecho en Lucidchart)
└── README.md             # Este archivo
```

---

## 🖼️ Diagrama de Clases
El diseño del proyecto se realizó en Lucidchart, modelando las relaciones entre las clases:

<img src="https://github.com/dvchinx/Parcial-POO/blob/main/Imgs/UML.png" alt="ScreenShot" width="350">

---

## 📋 Descripción del Proyecto
El proyecto Zoo es una aplicación de consola que simula la gestión de un zoológico. Utiliza POO para modelar las siguientes entidades y relaciones:

- Zoologico: `Clase principal` que contiene la información general del zoológico.
- Animal: Clase base que representa a un animal genérico.
- Ave: `Subclase` de `Animal` que hereda sus atributos y métodos.
- Mamifero: `Subclase` de `Animal` que hereda sus atributos y métodos.
- Cuidador: `Asociado` con `Habitat`, representa al personal que cuida los hábitats.
- Veterinario: `Asociado` con `Animal`, representa al personal encargado de la salud de los animales.
- Habitat: Clase que representa los espacios asignados a los animales.
- Principal: Clase con el `método main`, donde se interactúa con el usuario mediante la consola usando la libreria `Scanner`.
