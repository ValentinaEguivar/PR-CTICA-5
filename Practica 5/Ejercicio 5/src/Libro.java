public class Libro {
    private String titulo;
    private boolean disponible; 

    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true; 
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }
    public boolean prestar() {
        if (this.disponible) {
            this.disponible = false; 
            return true;
        }
        return false; 
    }

    public void devolver() {
        this.disponible = true;
    }
}