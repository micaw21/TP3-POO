/** Clase ejecutable 
 * 
 * @author Wolkowyski, Micaela 
 * @version 24/08/2023
 */

import java.util.Scanner;

public class GestionStock {
    public static void main(String [] args) {
        Laboratorio unLaboratorio = new Laboratorio("Colgate SA", "Scalabrini Ortiz 5524", "54-11-4239-8447");
        Producto unProducto = new Producto(21, "Perfumeria", "Jabon Deluxe", 5.25, unLaboratorio);

        unProducto.ajuste(500);
        unProducto.mostrar();
        unProducto.ajuste(200);
        unProducto.mostrar();
        unProducto.mostrarLinea();

        //Menu
        Scanner teclado = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("\t" + "-- Menu --");
            System.out.println("1 - Mostrar datos");
            System.out.println("2 - Ajuste de Stock");
            System.out.println("3 - Ajustar Porcentaje de Punto de Reposicion");
            System.out.println("4 - Ajustar Existencia Minima de Producto");
            System.out.println("0 - Salir");
            respuesta = teclado.nextInt();
            switch (respuesta) {
                case 1:
                    unProducto.mostrar();
                break;
                case 2:
                    System.out.println("Ingrese el monto a agregar o quitar del stock: ");
                    unProducto.ajuste(teclado.nextInt());
                break;
                case 3:
                    System.out.println("Ingrese el nuevo porecentaje de punto de reposicion: ");
                    unProducto.ajustarPtoRepo(teclado.nextDouble());
                break;
                case 4:
                    System.out.println("Ingrese el nuevo valor de existencia minima: ");
                    unProducto.ajustarExistMin(teclado.nextInt());
                break;
                default:
                    System.out.println("Respuesta erronea");
                break;
            }
        } while (respuesta != 0);
        
        
    }
}
