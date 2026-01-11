// Clase que representa un pedido de tipo Encomienda
// Hereda de la clase base Pedido
public class PedidoEncomienda extends Pedido {

    // Constructor de la clase PedidoEncomienda
    // Inicializa los atributos heredados y define el tipo de pedido como "Encomienda"
    public PedidoEncomienda(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Encomienda");
    }

    // Método sobrescrito de la clase Pedido
    // Define la lógica específica para la asignación de repartidor
    // en pedidos de encomienda, validando peso y embalaje
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Validando peso y embalaje... OK");
    }

    // Método sobrecargado que recibe el nombre del repartidor
    // Ejecuta primero la lógica propia del pedido de encomienda
    // y luego asigna el repartidor indicado
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor();
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}
