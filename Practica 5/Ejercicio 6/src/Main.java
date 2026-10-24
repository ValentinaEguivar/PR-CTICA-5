public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new EmpleadoFijo("Laura", "EMP-001", 1500.0);
        empleados[1] = new EmpleadoPorHora("Pedro", "EMP-002", 40, 15.0);
        empleados[2] = new EmpleadoComision("Sofia", "EMP-003", 5000.0, 0.10);

        System.out.println("PAGOS DE EMPLEADOS");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i].getNombre() + ": $" + empleados[i].calcularPago());
        }
    }
}