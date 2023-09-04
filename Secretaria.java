
/** Clase ejecutable
 * @author Wolkowyski, Micaela
 * @version 03/09/2023
 */

public class Secretaria {
    public static void main(String [] args){
        Docente unDocente = new Docente(args[0],args[1],1600,1290);
        Escuela unaEscuela = new Escuela("Manuel Belgrano","Irigoyen 1580", "Leopoldo Juez");
        unaEscuela.imprimirRecibo(unDocente);

        Docente otroDocente = new Docente("Taylor Swift", "6to", 2000, 1600);
        Escuela otraEscuela = new Escuela("Mecenas", "Lavalle 148","Harry Styles");

        otraEscuela.imprimirRecibo(otroDocente);
    }
}
