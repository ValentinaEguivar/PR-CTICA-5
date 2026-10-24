public class Main {
    public static void main(String[] args) {
        
        Entrega[] entregas = new Entrega[2];
        
        
        entregas[0] = new EntregaBicicleta("Centro (Bici)", 2.0);
        entregas[1] = new EntregaAuto("Afueras (Auto)", 10.0);

        System.out.println("--- TARIFARIO DE ENTREGAS ---");
        
       
        for (int i = 0; i < entregas.length; i++) {
            System.out.println("Destino: " + entregas[i].getDestino());
            
            System.out.println("Costo normal: $" + entregas[i].calcularCosto());
            
            System.out.println("Costo con recargo por lluvia ($20): $" + entregas[i].calcularCosto(20.0));
            System.out.println("-");
        }
    }
}