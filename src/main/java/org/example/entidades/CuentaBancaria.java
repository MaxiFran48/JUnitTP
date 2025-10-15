package org.example.entidades;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(){
        saldo = 0.0;
    }

    public void ingresarDinero(double dinero) {
        saldo += dinero;
        System.out.println("Se depositaron $" + dinero + ", su saldo actual es de $" + saldo + "\n");
    }

    public void retirarDinero(double dinero) {
        if (dinero > saldo) throw new IllegalArgumentException("El dinero retirado debe ser menor al saldo en cuenta");
        saldo -= dinero;
        System.out.println("Se retiraron $" + dinero + ", su saldo actual es de $" + saldo + "\n");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int dinero) {
        this.saldo = dinero;
    }
}
