public class Main {
    public static void main(String[] args) {
        CuentaDigital cuenta = new CuentaDigital("Ana Pérez", "CD-98765", 1000.0, 500.0);

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: $" + cuenta.consultarSaldo());
        System.out.println("----------------------\n");

        boolean res1 = cuenta.depositar(200.0);
        imprimirResultado("Prueba 1 (Depósito $200)", res1, cuenta.consultarSaldo());

        boolean res2 = cuenta.retirar(300.0);
        imprimirResultado("Prueba 2 (Retiro $300)", res2, cuenta.consultarSaldo());

        boolean res3 = cuenta.depositar(-50.0);
        imprimirResultado("Prueba 3 (Depósito -$50)", res3, cuenta.consultarSaldo());

        
        boolean res4 = cuenta.retirar(2000.0);
        imprimirResultado("Prueba 4 (Retiro $2000 - Sin fondos)", res4, cuenta.consultarSaldo());

        
        boolean res5 = cuenta.retirar(250.0);
        imprimirResultado("Prueba 5 (Retiro $250 - Supera límite diario)", res5, cuenta.consultarSaldo());
    }
    private static void imprimirResultado(String operacion, boolean exito, double saldoActual) {
        System.out.println(operacion + " -> " + (exito ? "ÉXITO" : "RECHAZADA"));
        System.out.println("Saldo actualizado: $" + saldoActual + "\n");
    }
}