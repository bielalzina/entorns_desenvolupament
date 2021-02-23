/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        
        operativa_cuenta(2500F);
    }

    private static void operativa_cuenta(Float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        
        
        System.out.println("OPERATIVA BANCARIA"); // 2a versió
        System.out.println("------------------"); // 2a versió

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            System.out.println("Retiro de cuenta");
            cuenta1.retirar(2300);
            saldoActual = cuenta1.estado();
            System.out.println("El saldo actual es "+ saldoActual );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
            saldoActual = cuenta1.estado();
            System.out.println("El saldo actual es "+ saldoActual );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
