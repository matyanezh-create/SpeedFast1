// Clase principal del programa
// Permite ejecutar y probar el funcionamiento del sistema de pedidos
public class Main {

    public static void main(String[] args) {

        // Se crean objetos utilizando la clase base Pedido
        // pero instanciando distintas subclases.
        // Esto demuestra el uso de polimorfismo.
        Pedido comida = new PedidoComida(
                1,
                "Casa de Gokú - Monte Paoz"
        );

        Pedido encomienda = new PedidoEncomienda(
                2,
                "Corporación Cápsula - Ciudad del Oeste"
        );

        Pedido express = new PedidoExpress(
                3,
                "Torre de Karin - Tierra Sagrada"
        );

        // Se invoca el método asignarRepartidor(String)
        // Esta es la versión sobrecargada del método.
        // El comportamiento ejecutado corresponde a la clase real del objeto,
        // lo que evidencia sobrescritura de métodos.
        comida.asignarRepartidor("Goku");
        System.out.println();

        // Llamada al método sobrecargado en un objeto PedidoEncomienda
        // Se ejecuta la lógica específica definida en la subclase.
        encomienda.asignarRepartidor("Vegeta");
        System.out.println();

        // Llamada al método sobrecargado en un objeto PedidoExpress
        // Se ejecuta la versión sobrescrita del método en esta subclase.
        express.asignarRepartidor("Gohan");
    }
}
