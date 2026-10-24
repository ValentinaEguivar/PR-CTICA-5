public class EmpleadoComision extends Empleado {
    private double ventasTotales;
    private double porcentajeComision;

    public EmpleadoComision(String nombre, String identificador, double ventasTotales, double porcentajeComision) {
        super(nombre, identificador);
        this.ventasTotales = ventasTotales;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularPago() {
        return ventasTotales * porcentajeComision;
    }
}