public class CuentaBancaria {
    String titular;
    String tipoDeCuenta;
    double saldo;

    void sacarDinero(double cantidad) {
        if (cantidad < 0) {
            return;
        }
        saldo -= cantidad;
    }

    void ingresarDinero(double cantidad) {
        if (cantidad < 0) {
            return;
        }
        saldo += cantidad;
    }

    void cambiarTipoDeCuenta(String nuevoTipo) {
        tipoDeCuenta = nuevoTipo;
    }

    double obtenerSaldo() {
        return saldo;
    }
}
