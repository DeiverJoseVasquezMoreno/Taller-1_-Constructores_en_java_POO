public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Sin definir";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public String toString() {
        return "Número de cuenta: " + numeroCuenta + ", Saldo: " + saldo + ", Tipo de cuenta: " + tipoCuenta;
    }
}
