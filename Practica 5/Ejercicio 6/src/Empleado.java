public class Empleado {
    protected String nombre;
    protected String identificador;

    public Empleado(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public double calcularPago() {
        return 0.0;
    }

    public String getNombre() {
        return nombre;
    }
}