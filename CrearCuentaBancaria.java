/** Clase Ejecutable
 *  @author Wolkowyski, Micaela
 *  @version 03/09/2023
 */

import java.util.Scanner;

public class CrearCuentaBancaria {
    public static void main(String [] args) {
        Persona unaPersona = new Persona(45649603,"Micaela","Wolkowyski",2003);
        Persona otraPersona = new Persona(36565002, "Harry", "Styles", 1994);

        CuentaBancaria unaCuenta = new CuentaBancaria(Integer.valueOf(args[0]), unaPersona);
        CuentaBancaria otraCuenta = new CuentaBancaria(Integer.valueOf(args[1]), otraPersona, 1000000);

        System.out.println(unaCuenta.toString());
        System.out.println("\n" + otraCuenta.toString());

        Scanner teclado = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("\t" + "- Menu -");
            System.out.println("1 - Depositar");
            System.out.println("2 - Extraer");
            System.out.println("3 - Mostrar datos de cuenta");
            System.out.println("0 - Salir");
            respuesta = teclado.nextInt();

            switch(respuesta) {
                case 0:
                break;
                case 1:
                    int cuenta;
                    double monto;
                    System.out.println("Elija una cuenta a depositar: ");
                    System.out.println(unaCuenta.getNroCuenta() + " " + otraCuenta.getNroCuenta());
                    cuenta = teclado.nextInt();
                    System.out.println("Ingrese un monto a depositar: ");
                    monto = teclado.nextDouble();
                    if(cuenta == unaCuenta.getNroCuenta()) {
                        unaCuenta.depositar(monto);
                    } else if (cuenta == otraCuenta.getNroCuenta()){
                        otraCuenta.depositar(monto);
                    } else {
                        System.out.println("El numero de cuenta ingresado no existe!");
                    }
                break;
                case 2:
                    int cuenta2;
                    double monto2;
                    System.out.println("Elija una cuenta para extraer: ");
                    System.out.println(unaCuenta.getNroCuenta() + " " + otraCuenta.getNroCuenta());
                    cuenta2 = teclado.nextInt();
                    System.out.println("Ingrese un monto a extraer: ");
                    monto2 = teclado.nextDouble();
                    if(cuenta2 == unaCuenta.getNroCuenta() && monto2 >= unaCuenta.getSaldo()) {
                        unaCuenta.extraer(monto2);
                    } else if (cuenta2 == otraCuenta.getNroCuenta() && monto2 >= otraCuenta.getSaldo()){
                        otraCuenta.extraer(monto2);
                    } else {
                        System.out.println("Error!");
                    }
                break;
                case 3:
                    int cuenta3;
                    System.out.println("Elija una cuenta: ");
                    System.out.println(unaCuenta.getNroCuenta() + " " + otraCuenta.getNroCuenta());
                    cuenta3 = teclado.nextInt();
                    if(cuenta3 == unaCuenta.getNroCuenta()) {
                        unaCuenta.mostrar();
                    } else if (cuenta3 == otraCuenta.getNroCuenta()){
                        otraCuenta.mostrar();
                    } else {
                        System.out.println("El numero de cuenta ingresado no existe!");
                    }
                break;
                default:
                    System.out.println("Valor Erroneo");
                break;
            }
        } while (respuesta != 0);
    }
}
