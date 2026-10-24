public class EmpleadoFijo extends Empleado {
    private double salarioBase;

    public EmpleadoFijo(String nombre, String identificador, double salarioBase) {
        super(nombre, identificador);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularPago() {
        return salarioBase;
    }
}