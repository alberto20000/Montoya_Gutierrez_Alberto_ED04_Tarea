 package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            operativa_cuenta(cuenta1, 2300, 'r');
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            operativa_cuenta(cuenta1, 695, 'i');
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    public static void operativa_cuenta(CCuenta cuenta, float cantidad, char operacion) throws Exception {
        if (operacion == 'r') {
            cuenta.retirar(cantidad);
            System.out.println("Se ha retirado " + cantidad + " euros.");
        } else if (operacion == 'i') {
            cuenta.ingresar(cantidad);
            System.out.println("Se ha ingresado " + cantidad + " euros.");
        } else {
            throw new Exception("Operación no válida");
        }
        System.out.println("El nuevo saldo es " + cuenta.estado());
    }
}