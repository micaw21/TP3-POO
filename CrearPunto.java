

/** Clase Ejecutable
 * @author Wolkowyski, Micaela
 * @version 31/08/2023
 */

public class CrearPunto {
    public static void main(String [] args) {
        Punto unPunto = new Punto(Double.valueOf(args[0]), Double.valueOf(args[1]));
        Punto otroPunto = new Punto(Double.valueOf(args[3]), Double.valueOf(args[4]));

        System.out.println(unPunto.distanciaA(otroPunto));
        unPunto.desplazar(Double.valueOf(args[5]), Double.valueOf(args[6]));
        unPunto.mostrar();
        System.out.println(otroPunto.coordenadas());
    }
}
