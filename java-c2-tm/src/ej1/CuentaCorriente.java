package ej1;

public class CuentaCorriente {

    private double saldo;

    public CuentaCorriente() { }

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente ctaCorriente) {
        this.saldo = ctaCorriente.getSaldo();
    }

    public void ingreso(double monto) {
        saldo += monto;
    }

    public void egreso(double monto) {
        saldo -= monto;
    }

    public void reintegro(double monto, CuentaCorriente ctaCorrienteDestino) {
        ctaCorrienteDestino.egreso(monto);
        ingreso(monto);
    }

    public void transferencia(double monto, CuentaCorriente ctaCorrienteDestino) {
        egreso(monto);
        ctaCorrienteDestino.ingreso(monto);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
