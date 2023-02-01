package javapooejercicio5;

import Clase.CuentaBancaria;
import Servicio.ServicioDeCuentaBancaria;

public class javapooejercicio5 {

    public static void main(String[] args) {
        ServicioDeCuentaBancaria sdcb = new ServicioDeCuentaBancaria();
        CuentaBancaria cb1 = sdcb.crearCuentaBancaria();
        sdcb.ingresoDeDinero(cb1);
        sdcb.retiroDeDinero(cb1);
        sdcb.rapidaExtraccion(cb1);
        int balanceDeLaCuenta = sdcb.balanceDeLaCuenta(cb1);
        System.out.println("El saldo actual de la cuenta es: $" + balanceDeLaCuenta);
        sdcb.imprimirLaCuenta(cb1);

    }

}
