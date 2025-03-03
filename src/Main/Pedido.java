public class Pedido {
    /**
     * Paso a método privado y paso a la línea siguiente "this.cliente=cliente;", me parece más correcto y legible
     */
    private Cliente cliente;
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Realizo el encapsulamiento con get y set
     */
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Unifico el código para evitar código repetido usando métodos uno para calcular el descuento
     * y otro para calcular el precio final y mostrar el resultado
     */

    public void procesarPedido(double total, boolean esVip) {
        double descuento = calcularDescuento(total,esVip);
        double precioFinal = total - descuento;
        mostrarMensaje(precioFinal, descuento, esVip);
    }

    private double calcularDescuento(double total, boolean esVip) {
        double porcentajeDescuento = (esVip) ? 0.15 : 0.10;
        return (total > 100) ? total*porcentajeDescuento : 0;
    }
    private void mostrarMensaje(double precioFinal, double descuento, boolean esVip) {
        String tipoPedido = esVip ? "Pedido VIP" : "Pedido";
        if (descuento > 0) {
            System.out.println(tipoPedido + " aprobado. Total: " + precioFinal + " descuento aplicado: " + descuento);
        }else{
            System.out.println(tipoPedido + " aprobado. Total: " + precioFinal);
        }
    }

}
