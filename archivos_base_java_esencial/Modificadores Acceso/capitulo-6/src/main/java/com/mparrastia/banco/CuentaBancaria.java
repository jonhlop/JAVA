package com.mparrastia.banco;

public class CuentaBancaria {
    String titular;
    TipoDeCuenta tipoDeCuenta;
    double saldo;

    final double COMISION = 1.2;

    CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipo;
        this.saldo = saldo;
    }

    CuentaBancaria(String titular, double saldo) {
        this(titular, TipoDeCuenta.AHORRO, saldo);
    }

    CuentaBancaria()
    {
        this("", TipoDeCuenta.AHORRO, 0);
    }

    void sacarDinero(double cantidad) {
        if (cantidad < 0) {
            return;
        }
        double comision = calcularComision();
        saldo -= cantidad;
        saldo -= comision;
    }

    double calcularComision() {
        switch (tipoDeCuenta) {
            case AHORRO:
                return COMISION;
            case NOMINA:
                return 0;
            default:
                return 0;
        }
    }
    void ingresarDinero(double cantidad) {
        if (cantidad < 0) {
            return;
        }
        saldo += cantidad;
    }

    void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo) {
        tipoDeCuenta = nuevoTipo;
    }

    double obtenerSaldo() {
        return saldo;
    }
}
