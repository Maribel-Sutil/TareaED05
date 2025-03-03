public class Main {
    public static void main(String[] args) {
        /**
         * Al refactorizar los otros dos archivos genera errores en este para solucionarlo habría que refactorizarlo tambien
         */
        // Crea un pedido para un cliente normal
        Pedido pedido1 = new Pedido(new Cliente(false, "Juan", 1));
        pedido1.procesarPedido(101, false); // Actualiza para usar el método unificado

        // Crea un pedido para un cliente VIP
        Pedido pedido2 = new Pedido(new Cliente(true, "Juan de todos los santos", 2));
        pedido2.procesarPedido(101, true); // Actualiza para usar el método unificado

        // Convierte al cliente 1 en VIP y procesa un nuevo pedido de 1000 €
        pedido1.getCliente().setEsVip(true);
        pedido1.procesarPedido(1000, true); // Actualiza para usar el método unificado
    }

}
