// Clase que representa un pedido de tipo Express
// Hereda de la clase base Pedido
public class PedidoExpress extends Pedido {

    // Constructor de la clase PedidoExpress
    // Inicializa los atributos heredados y define el tipo de pedido como "Express"
    public PedidoExpress(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Express");
    }

    // Método sobrescrito de la clase Pedido
    // Implementa la lógica específica para pedidos express,
    // asignando el repartidor más cercano con disponibilidad inmediata
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Repartidor más cercano con disponibilidad inmediata encontrado.");
    }

    // Método sobrecargado que recibe el nombre del repartidor
    // Ejecuta la lógica propia del pedido express y luego asigna el repartidor indicado
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor();
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}
