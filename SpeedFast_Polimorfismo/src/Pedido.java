// Clase base que representa un pedido genérico dentro del sistema
// Sirve como superclase para los distintos tipos de pedidos
public class Pedido {

    // Identificador único del pedido
    protected int idPedido;

    // Dirección donde se debe realizar la entrega
    protected String direccionEntrega;

    // Tipo de pedido (Comida, Encomienda o Express)
    protected String tipoPedido;

    // Constructor de la clase Pedido
    // Inicializa los atributos comunes a todos los pedidos
    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    // Método genérico para asignar un repartidor
    // Este método será sobrescrito en las clases hijas
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor...");
    }

    // Método sobrecargado que recibe el nombre del repartidor
    // Permite asignar explícitamente un repartidor al pedido
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
