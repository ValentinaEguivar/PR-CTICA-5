public class Pedido {
    private Producto[] productos; 
    private int contador; 

    public Pedido() {
        this.productos = new Producto[3]; 
        this.contador = 0;
    }

    public void agregarProducto(Producto p) {
        if (contador < 3) {
            this.productos[contador] = p;
            this.contador++;
        } else {
            System.out.println("El pedido está lleno. Máximo 3 productos.");
        }
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        
        for (int i = 0; i < contador; i++) {
            subtotal = subtotal + productos[i].getPrecio();
        }
        return subtotal;
    }

    public double calcularTotal() {
        double subtotal = calcularSubtotal();
        
        if (subtotal > 100) {
            return subtotal * 0.90; 
        }
        return subtotal;
    }

    public void mostrarRecibo() {
        System.out.println("--- TICKET DE LA CAFETERÍA ---");
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + productos[i].getNombre() + ": $" + productos[i].getPrecio());
        }
        System.out.println("------------------------------");
        
        double subtotal = calcularSubtotal();
        System.out.println("Subtotal: $" + subtotal);
        
        if (subtotal > 100) {
            System.out.println("¡Aplica descuento del 10%!");
        }
        
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}