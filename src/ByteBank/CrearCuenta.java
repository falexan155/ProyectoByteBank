package ByteBank;

public class CrearCuenta {
    public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 200;
        System.out.println("primeraCuenta = " + primeraCuenta.saldo);
        primeraCuenta.saldo +=100;
        System.out.println("primeraCuenta = " + primeraCuenta.saldo);

        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo = 50;
        System.out.println("Primera cuenta tiene " + primeraCuenta.saldo);
        System.out.println("Segunda cuenta tiene " + segundaCuenta.saldo);
        System.out.println("primeraCuenta = " + primeraCuenta);
        System.out.println("segundaCuenta = " + segundaCuenta);
    }
}
