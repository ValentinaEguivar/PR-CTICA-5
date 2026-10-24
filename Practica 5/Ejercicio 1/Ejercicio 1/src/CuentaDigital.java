public class CuentaDigital {
    private String titular;
    private String identificador;
    private double saldo;
    private double limiteDiario;
    private double retiradoHoy;
    public CuentaDigital(String titular, String identificador, double saldoInicial, double limiteDiario) {
        this.titular = titular;
        this.identificador = identificador;
        this.limiteDiario = limiteDiario;
        this.retiradoHoy = 0.0;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
        }
    }

    
    public boolean depositar(double monto) {
        
        if (monto <= 0) {
            return false; 
        }
        this.saldo += monto;
        return true; 
    }

    public boolean retirar(double monto) {
        
        if (monto <= 0) {
            return false;
        }
       
        if (monto > this.saldo) {
            return false;
        }
        
        if ((this.retiradoHoy + monto) > this.limiteDiario) {
            return false;
        }

        
        this.saldo -= monto;
        this.retiradoHoy += monto;
        return true;
    }

    
    public double consultarSaldo() {
        return this.saldo;
    }
    
    public String getTitular() {
        return this.titular;
    }
}