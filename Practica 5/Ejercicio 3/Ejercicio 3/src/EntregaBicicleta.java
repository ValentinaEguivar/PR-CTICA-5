public class EntregaBicicleta extends Entrega {
    private double kilometros;
    public EntregaBicicleta(String destino, double kilometros) {
        super(destino); 
        this.kilometros = kilometros;
    }
    @Override
    public double calcularCosto() {
        return kilometros * 15.0; 
    }
}