
package Clase;

public class CuentaBancaria {
    private int numeroDeCuenta;
    private long DNI;
    private int saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroDeCuenta, long DNI, int saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getnumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setnumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getsaldoActual() {
        return saldoActual;
    }

    public void setsaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
}
