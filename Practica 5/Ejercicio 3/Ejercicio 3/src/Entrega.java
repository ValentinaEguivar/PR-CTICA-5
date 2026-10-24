public class Entrega {
    protected String destino;

    public Entrega(String destino) {
        this.destino = destino;
    }
    public double calcularCosto() {
        return 0.0; 
    }
    public double calcularCosto(double recargoExtra) {
        return calcularCosto() + recargoExtra; 
    }

    public String getDestino() {
        return destino;
    }
}