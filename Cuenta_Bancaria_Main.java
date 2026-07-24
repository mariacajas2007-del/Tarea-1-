public class Cuenta_Bancaria_Main {
    public static void main(String[] args)
     {
        
    Cuenta_Bancaria c1 = new Cuenta_Bancaria("Gabriella Alvarez", "001", 2500);
    Cuenta_Bancaria c2 = new Cuenta_Bancaria("Fabian Ruiz", "002", 1500);

    c1.depositar(2400);
    c2.depositar(750);

    if (c1.retirar(500)) {
        System.out.println("El retiro fue exitoso");
    }

    else {
        System.out.println("No hay saldo suficiente");
    }

    if (c2.retirar(800)) {
        System.out.println("El retiro fue exitoso");
    }

    else {
        System.out.println("No hay saldo suficiente");
    }

    for (int i = 1; i <= 5; i++) {
        c1.depositar(500);
        System.out.println("Depósito #" + i + " realizado.");
    }

    System.out.println();
    System.out.println("Saldo final de c1: Q" + c1.consultarSaldo());
    System.out.println("Saldo final de c2: Q" + c2.consultarSaldo());
    }
}
