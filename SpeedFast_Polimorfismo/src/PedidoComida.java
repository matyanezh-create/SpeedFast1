// Clase que representa un pedido de tipo Comida
// Hereda de la clase base Pedido
public class PedidoComida extends Pedido {

    // Constructor de la clase PedidoComida
    // Inicializa los atributos heredados y define el tipo de pedido como "Comida"
    public PedidoComida(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Comida");
    }

    // Método sobrescrito de la clase Pedido
    // Implementa la lógica específica para la asignación de repartidor en pedidos de comida
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando mochila térmica... OK");
    }

    // Método sobrecargado que recibe el nombre del repartidor
    // Llama al método sobrescrito para ejecutar las validaciones propias del pedido
    // y luego asigna el repartidor indicado
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor();
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}
