public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro("1984 - George Orwell");
        Lector lector1 = new Lector("Carlos Ruiz", "L-100");
        Lector lector2 = new Lector("María Gómez", "L-101");

        System.out.println("--- INTENTO 1: PRÉSTAMO VÁLIDO ---");
        Prestamo prestamo1 = new Prestamo(miLibro, lector1, 1);

        System.out.println("\n--- INTENTO 2: LIBRO YA PRESTADO ---");
        Prestamo prestamo2 = new Prestamo(miLibro, lector2, 2);

        System.out.println("\n--- VERIFICACIÓN DE VENCIMIENTO (Reto) ---");
        prestamo1.verificarVencimiento(10);

        System.out.println("\n--- DEVOLUCIÓN ---");
        prestamo1.registrarDevolucion();
    }
}