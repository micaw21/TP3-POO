
/** Clase ejecutable 
 * 
 * @author Wolkowyski, Micaela 
 * @version 03/09/2023
 */

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class CreaFigura {
    public static void main(String [] args){
        //Circulos
        Random unNumero = new Random();
        Random otroNumero = new Random();
        double radio1 = unNumero.nextDouble() * 100.0;
        double radio2 = otroNumero.nextDouble() * 100.0;

        Punto unPunto = new Punto();
        Punto otroPunto = new Punto(5.2, 0.5);

        Circulo unCirculo = new Circulo(radio1, unPunto);
        unCirculo.desplazar(-240, -230);
        unCirculo.caracteristicas();

        Circulo otCirculo = new Circulo(radio2, otroPunto);
        otCirculo.caracteristicas();
        System.out.println("\n" + "El mayor entre ambos es: ");
        unCirculo.elMayor(otCirculo).caracteristicas();
        System.out.println("La distancia entre ambos circulos es de: " + unCirculo.distanciaA(otCirculo));

        //Rectangulos
        Random numeroRand1 = new Random();
        Random numeroRand2 = new Random();
        Random numweoRand3 = new Random();
        Random numeroRand4 = new Random();

        double alto1 = numeroRand1.nextDouble() * 100.0;
        double ancho1 = numeroRand2.nextDouble() * 100.0;
        double alto2 = numweoRand3.nextDouble() * 100.0;
        double ancho2 = numeroRand4.nextDouble() * 100.0;

        Rectangulo unRectangulo = new Rectangulo(ancho1, alto1);
        unRectangulo.desplazar(40, -20);
        unRectangulo.caracteristicas();

        Punto origen = new Punto(7.4, 4.5);
        Rectangulo otroRectangulo = new Rectangulo(origen, ancho2, alto2);
        otroRectangulo.caracteristicas();
        System.out.println("\n" + "El mayor entre ambos es: ");
        unRectangulo.elMayor(otroRectangulo).caracteristicas();
        System.out.println("La distancia entre ambos rectangulos es de: " + unRectangulo.distanciaA(otroRectangulo));

         //Menu
        Scanner teclado = new Scanner(System.in);
        int respuesta;
        ArrayList<Circulo> listaCirculos = new ArrayList<>();
        ArrayList<Rectangulo> listaRectangulos = new ArrayList<>();
        

        do {
            System.out.println("\t" + "****** MENU ******");
            System.out.println("1 - Crear un Circulo");
            System.out.println("2 - Desplazar Circulo");
            System.out.println("3 - Mostrar Caracteristicas de Circulo");
            System.out.println("4 - Calcular Perimetro de Circulo");
            System.out.println("5 - Calcular Superficie de Circulo");
            System.out.println("6 - Calcular distancia a otro Circulo");
            System.out.println("7 - Calcular el mayor entre dos circulos");
            System.out.println("8 - Crear un Rectangulo");
            System.out.println("9 - Desplazar un Rectangulo");
            System.out.println("10 - Mostrar Caracteristicas de Rectangulo");
            System.out.println("11 - Calcular Perimetro de Rectangulo");
            System.out.println("12 - Calcular Superficie de Rectangulo");
            System.out.println("13 - Calcular distancia de un Rectangulo a otro");
            System.out.println("14 - Calcular el mayor entre dos rectangulos");
            System.out.println("0 - Salir");
            respuesta = teclado.nextInt();

            switch(respuesta) {
                case 0:
                break;
                case 1:
                    double radio, x, y;
                    System.out.println("Ingrese el radio: ");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la coordenada x del centro: ");
                    x = teclado.nextDouble();
                    System.out.println("Ingrese la coordenada y del centro: ");
                    y = teclado.nextDouble();
                    Punto point = new Punto(x,y);
                    Circulo circulo = new Circulo(radio, point);
                    listaCirculos.add(circulo);
                    System.out.println("Circulo de radio: " + radio + " " + "centro: " + point.coordenadas() + " " + "agregado a la lista de figuras");
                break;
                case 2:
                    if(listaCirculos.isEmpty() == false) {
                        double coordx, coordy;
                        System.out.println("Ingrese coordenada x para desplazar el circulo: ");
                        coordx = teclado.nextDouble();
                        System.out.println("Ingrese coordenada y para desplazar el circulo: ");
                        coordy = teclado.nextDouble();
                        System.out.println("La lista posee " + listaCirculos.size() + " " + "circulo/s, elija uno de ellos para desplazar: ");
                        listaCirculos.get(teclado.nextInt()-1).desplazar(coordx, coordy);
                        System.out.println("Circulo desplazado!");
                    } else {
                        System.out.println("No hay circulos en lista");
                    }
                break;
                case 3:
                    if(listaCirculos.isEmpty() == false) {
                        System.out.println("La lista posee " + listaCirculos.size() + " " + "circulo/s, elija uno de ellos para mostrar sus caracteristicas: ");
                        listaCirculos.get(teclado.nextInt()-1).caracteristicas();
                    } else {
                        System.out.println("No hay circulos en lista");
                    }
                break;
                case 4:
                    if(listaCirculos.isEmpty() == false) {
                        System.out.println("La lista posee " + listaCirculos.size() + " " + "circulo/s, elija uno de ellos para calcular su perimetro: ");
                        System.out.println("Su perimetro es: " + listaCirculos.get(teclado.nextInt()-1).perimetro());
                    } else {
                        System.out.println("No hay circulos en lista");
                    }
                break;
                case 5:
                    if(listaCirculos.isEmpty() == false) {
                        System.out.println("La lista posee " + listaCirculos.size() + " " + "circulo/s, elija uno de ellos para calcular su superficie: ");
                        System.out.println("Su superficie es: " + listaCirculos.get(teclado.nextInt()-1).superficie());
                    } else {
                        System.out.println("No hay circulos en lista");
                    }
                break;
                case 6:
                    if(listaCirculos.isEmpty() == false) {
                        int primerCirculo;
                        System.out.println("La lista posee " + listaCirculos.size() + " " + "circulo/s, elija uno de ellos para calcular su distancia a otro circulo: ");
                        primerCirculo = teclado.nextInt()-1;
                        System.out.println("La lista posee " + listaCirculos.size() + " " + "circulo/s, elija otro de ellos para calcular la distancia hacia este: ");
                        System.out.println(listaCirculos.get(primerCirculo).distanciaA(listaCirculos.get(teclado.nextInt()-1)));
                    } else {
                        System.out.println("No hay circulos en lista");
                    }
                break;
                case 7:
                    if(listaCirculos.isEmpty() == false) {
                        int circulo1;
                        System.out.println("La lista posee " + listaCirculos.size() + " " + "circulo/s, elija uno de ellos para calcular cual es mayor: ");
                        circulo1 = teclado.nextInt()-1;
                        System.out.println("La lista posee " + listaCirculos.size() + " " + "circulo/s, elija otro de ellos para calcular el mayor: ");
                        listaCirculos.get(circulo1).elMayor(listaCirculos.get(teclado.nextInt()-1)).caracteristicas();
                    } else {
                        System.out.println("No hay circulos en lista");
                    }
                break;
                case 8:
                    double alto, ancho, coorx, coory;
                    System.out.println("Ingrese el alto: ");
                    alto = teclado.nextDouble();
                    System.out.println("Ingrese el ancho: ");
                    ancho = teclado.nextDouble();
                    System.out.println("Ingrese la coordenada x del centro: ");
                    coorx = teclado.nextDouble();
                    System.out.println("Ingrese la coordenada y del centro: ");
                    coory = teclado.nextDouble();
                    Punto orig = new Punto(coorx,coory);
                    Rectangulo rectangulo = new Rectangulo(orig, ancho, alto);
                    listaRectangulos.add(rectangulo);
                    System.out.println("Se a agregado un rectangulo a la lista!");
                break;
                case 9:
                    if(listaRectangulos.isEmpty() == false) {
                        double locx, locy;
                        System.out.println("Ingrese coordenada X para desplazar el rectangulo: ");
                        locx = teclado.nextDouble();
                        System.out.println("Ingrese coordenada Y para desplazar el rectangulo: ");
                        locy = teclado.nextDouble();
                        System.out.println("La lista posee " + listaRectangulos.size() + " " + "rectangulo/s, elija uno de ellos para desplazar: ");
                        listaRectangulos.get(teclado.nextInt()-1).desplazar(locx, locy);
                        System.out.println("Rectangulo desplazado!");
                    } else {
                        System.out.println("No hay rectangulos en lista");
                    }
                break;
                case 10:
                    if(listaRectangulos.isEmpty() == false) {
                        System.out.println("La lista posee " + listaRectangulos.size() + " " + "rectangulos/s, elija uno de ellos para mostrar sus caracteristicas: ");
                        listaRectangulos.get(teclado.nextInt()-1).caracteristicas();
                    } else {
                        System.out.println("No hay rectangulos en lista");
                    }
                break;
                case 11:
                    if(listaRectangulos.isEmpty() == false) {
                        System.out.println("La lista posee " + listaRectangulos.size() + " " + "rectangulo/s, elija uno de ellos para calcular su perimetro: ");
                        System.out.println("Su perimetro es: " + listaRectangulos.get(teclado.nextInt()-1).perimetro());
                    } else {
                        System.out.println("No hay rectangulos en lista");
                    }
                break;
                case 12:
                    if(listaRectangulos.isEmpty() == false) {
                        System.out.println("La lista posee " + listaRectangulos.size() + " " + "rectangulos/s, elija uno de ellos para calcular su superficie: ");
                        System.out.println("Su superficie es: " + listaRectangulos.get(teclado.nextInt()-1).superficie());
                    } else {
                        System.out.println("No hay rectangulos en lista");
                    }
                break;
                case 13:
                    if(listaRectangulos.isEmpty() == false) {
                        int primerRectangulo;
                        System.out.println("La lista posee " + listaRectangulos.size() + " " + "rectangulo/s, elija uno de ellos para calcular su distancia a otro rectangulo: ");
                        primerRectangulo = teclado.nextInt()-1;
                        System.out.println("La lista posee " + listaRectangulos.size() + " " + "rectangulo/s, elija otro de ellos para calcular la distancia hacia este: ");
                        System.out.println(listaRectangulos.get(primerRectangulo).distanciaA(listaRectangulos.get(teclado.nextInt()-1)));
                    } else {
                        System.out.println("No hay rectangulos en lista");
                    }
                break;
                case 14:
                    if(listaRectangulos.isEmpty() == false) {
                        int rectangulo1;
                        System.out.println("La lista posee " + listaRectangulos.size() + " " + "rectangulo/s, elija uno de ellos para calcular cual es mayor: ");
                        rectangulo1 = teclado.nextInt()-1;
                        System.out.println("La lista posee " + listaRectangulos.size() + " " + "rectangulo/s, elija otro de ellos para calcular el mayor: ");
                        listaRectangulos.get(rectangulo1).elMayor(listaRectangulos.get(teclado.nextInt()-1)).caracteristicas();
                    } else {
                        System.out.println("No hay rectangulos en lista");
                    }
                break;
                default:
                    System.out.println("Valor erroneo");
                break;
            }
        } while (respuesta != 0);
    }
}