public class CuentaCredito {
    String numeroCuenta;
    String titular;
    double saldo;

    void imprimirInfo() {
        System.out.println(" Informacion de la cuenta de credito:");
        System.out.println(" Numero de cuenta " + numeroCuenta);
        System.out.println("Titular" + titular);
        System.out.println("Saldo disponible: $" + saldo);
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        CuentaCredito cuenta1 = new CuentaCredito();
        cuenta1.numeroCuenta = "1234-5678-9012";
        cuenta1.titular = "Carlos Ramirez";
        cuenta1.saldo = 1500.75;

        cuenta1.imprimirInfo();
    }
}



