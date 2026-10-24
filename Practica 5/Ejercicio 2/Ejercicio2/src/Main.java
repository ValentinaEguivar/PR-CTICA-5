public class Main {
    public static void main(String[] args) {
        
        Producto p1 = new Producto("Café Americano", 30.0);
        Producto p2 = new Producto("Rebanada de Pastel", 50.0);
        Producto p3 = new Producto("Frappé", 40.0);

        Pedido miPedido = new Pedido();
        miPedido.agregarProducto(p1);
        miPedido.agregarProducto(p2);
        miPedido.agregarProducto(p3);
        miPedido.mostrarRecibo();
    }
}