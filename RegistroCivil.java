/** Clase ejecutable
 * @author Wolkowyski, Micaela
 * @version 03/09/2023
 */

public class RegistroCivil {
    public static void main(String [] args){
        Hombre unHombre = new Hombre("Harry","Styles",29);
        Mujer unaMujer = new Mujer("Taylor","Swift",33);
        unHombre.datos();
        unaMujer.datos();
        unHombre.casarseCon(unaMujer);
        unaMujer.casarseCon(unHombre);
        System.out.println("------ Certificado de Casamiento ------");
        unHombre.casadoCon();
        unaMujer.casadaCon();
        System.out.println("---------------------------------------");
        unHombre.mostrarEstadoCivil();
        unaMujer.mostrarEstadoCivil();
        unHombre.divorcio();
        unaMujer.divorcio();
        unHombre.mostrarEstadoCivil();
        unaMujer.mostrarEstadoCivil();
    }
}
