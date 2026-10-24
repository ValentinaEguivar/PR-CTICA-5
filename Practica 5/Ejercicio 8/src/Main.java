public class Main {
    public static void main(String[] args) {
        ValidadorClave validador = new ValidadorClave();
        
        System.out.println("Prueba 1 (Corta y sin mayuscula): " + validador.esValida("hola"));
        System.out.println("Prueba 2 (Valida): " + validador.esValida("Hola1234"));
        System.out.println("Prueba 3 (Con espacio): " + validador.esValida("Hola 1234"));
        System.out.println("Prueba 4 (Nula): " + validador.esValida(null));
    }
}