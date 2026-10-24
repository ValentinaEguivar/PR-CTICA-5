public class EntregaAuto extends Entrega {
    private double kilometros;

    public EntregaAuto(String destino, double kilometros) {
        super(destino); // Llama al constructor de la clase base
        this.kilometros = kilometros;
    }

    @Override
    public double calcularCosto() {
        return 50.0 + (kilometros * 25.0); // En auto hay tarifa base de $50 + $25 por km
    }
}