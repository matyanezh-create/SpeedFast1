SpeedFast – Polimorfismo en Java
Descripción

Proyecto desarrollado en Java para la asignatura Desarrollo Orientado a Objetos II, cuyo objetivo es aplicar herencia, polimorfismo, sobrescritura y sobrecarga de métodos mediante un sistema de pedidos para la empresa ficticia SpeedFast.

Estructura
src/
├── Pedido.java
├── PedidoComida.java
├── PedidoEncomienda.java
├── PedidoExpress.java
└── Main.java

- Funcionamiento

Pedido es la clase base con atributos y métodos comunes.

PedidoComida, PedidoEncomienda y PedidoExpress sobrescriben el método asignarRepartidor() con lógica específica.

Se implementa la sobrecarga asignarRepartidor(String nombreRepartidor).

En Main se instancian objetos usando la clase base, demostrando polimorfismo.

El sistema muestra una salida clara y diferenciada por consola.

- Cómo ejecutar el proyecto

Abrir IntelliJ IDEA.

Seleccionar Open y cargar la carpeta del proyecto.

Verificar que el proyecto esté configurado como Java Application.

Ejecutar la clase Main.

Revisar la salida en la consola.
