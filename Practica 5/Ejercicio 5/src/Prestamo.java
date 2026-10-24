public class Prestamo {
    private Libro libro;
    private Lector lector;
    private boolean activo;
    private int diaVencimiento; 

    
    public Prestamo(Libro libro, Lector lector, int diaActual) {
        if (libro.prestar()) {
            this.libro = libro;
            this.lector = lector;
            this.activo = true;
            this.diaVencimiento = diaActual + 7; // Regla: Los préstamos duran 7 días
            System.out.println("-> Préstamo APROBADO: '" + libro.getTitulo() + "' entregado a " + lector.getNombre());
        } else {
            this.activo = false;
            System.out.println("-> Préstamo RECHAZADO: El libro '" + libro.getTitulo() + "' ya se encuentra prestado.");
        }
    }

    public void registrarDevolucion() {
        if (this.activo) {
            this.libro.devolver();
            this.activo = false;  
            System.out.println("-> Devolución REGISTRADA: '" + libro.getTitulo() + "' devuelto por " + lector.getNombre());
        } else {
            System.out.println("-> Error: Este préstamo no está activo.");
        }
    }
    public void verificarVencimiento(int diaActual) {
        if (this.activo && diaActual > this.diaVencimiento) {
            System.out.println("AVISO: El préstamo de '" + libro.getTitulo() + "' está VENCIDO.");
        } else if (this.activo) {
            System.out.println("ESTADO: El préstamo de '" + libro.getTitulo() + "' está al corriente.");
        }
    }
}