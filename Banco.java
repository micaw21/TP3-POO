
/** Clase Ejecutable
 * @author Wolkowyski, Micaela
 * @version 03/09/2023
 */

import java.util.*;

public class Banco {
    public static void main(String [] args) {
        Calendar cumpleanios = new GregorianCalendar();
        cumpleanios.set(Calendar.YEAR, 2003);
        cumpleanios.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cumpleanios.set(Calendar.DAY_OF_MONTH, 3);
        Persona unaPersona = new Persona(45649603, "Micaela", "Wolkowyski", cumpleanios);
        CajaDeAhorro cajaAhorro = new CajaDeAhorro(12345, unaPersona);
        CuentaCorriente cuentaCte = new CuentaCorriente(4561, unaPersona, 1000);

        cuentaCte.extraer(1600);
        cajaAhorro.depositar(1000);
        cajaAhorro.extraer(100);
        cajaAhorro.extraer(900);
        cajaAhorro.extraer(100);
        cajaAhorro.depositar(900);
        cajaAhorro.extraer(100);
        cajaAhorro.extraer(100);
        cajaAhorro.extraer(100);
        cajaAhorro.extraer(100);
        cajaAhorro.extraer(100);
        cajaAhorro.extraer(100);
        cajaAhorro.extraer(100);
        cajaAhorro.extraer(100);
        cajaAhorro.extraer(100);
        

        Scanner teclado = new Scanner(System.in);
        int respuesta1;
        int respuesta2;
        double monto;

        if(unaPersona.esCumpleaños()) {
            System.out.println("Feliz Cumpleaños " + unaPersona.apeYNom() + "!!! :)");
        }

        do {
            System.out.println("\t" + " - Banco - ");
            System.out.println("Elija una cuenta: ");
            System.out.println("1 - Caja de Ahorro");
            System.out.println("2 - Cuenta Corriente");
            System.out.println("0 - Salir");
            respuesta1 = teclado.nextInt();

            if(respuesta1 == 1) {
                System.out.println("Elija una operacion: ");
                System.out.println("1 - Depósito");
                System.out.println("2 - Extracción");
                System.out.println("3 - Mostrar datos de cuenta");
                respuesta2 = teclado.nextInt();
                switch (respuesta2) {
                    case 1:
                        System.out.println("Ingrese el monto a depositar: ");
                        monto = teclado.nextDouble();
                        cajaAhorro.depositar(monto);
                    break;
                    case 2:
                        System.out.println("Ingrese el monto a extraer: ");
                        monto = teclado.nextDouble();
                        cajaAhorro.extraer(monto);
                    break;
                    case 3:
                        cajaAhorro.mostrar();
                    break;
                    default:
                        System.out.println("Valor erróneo!");
                    break;
                }
            } else if (respuesta1 == 2) {
                System.out.println("Elija una operacion: ");
                System.out.println("1 - Depósito");
                System.out.println("2 - Extracción");
                System.out.println("3 - Mostrar datos de cuenta");
                respuesta2 = teclado.nextInt();
                switch (respuesta2) {
                    case 1:
                        System.out.println("Ingrese el monto a depositar: ");
                        monto = teclado.nextDouble();
                        cuentaCte.depositar(monto);
                    break;
                    case 2:
                        System.out.println("Ingrese el monto a extraer: ");
                        monto = teclado.nextDouble();
                        cuentaCte.extraer(monto);
                    break;
                    case 3:
                        cuentaCte.mostrar();
                    break;
                    default:
                        System.out.println("Valor erróneo!");
                    break;
                }
            }
        } while (respuesta1 != 0);
    }
}