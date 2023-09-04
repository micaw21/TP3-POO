/** Clase ejecutable
 * @author Wolkowyski, Micaela
 * @version 04/09/2023
 */
import java.util.*;

public class CrearEmpleadoConJefe {
    public static void main(String [] args) {
        Calendar fechaIngreso = new GregorianCalendar();
        fechaIngreso.set(Calendar.YEAR, 2018);
        fechaIngreso.set(Calendar.MONTH, Calendar.AUGUST);
        fechaIngreso.set(Calendar.DAY_OF_MONTH, 21);
        Calendar otraFecha = new GregorianCalendar();
        otraFecha.set(Calendar.YEAR, 2020);
        otraFecha.set(Calendar.MONTH, Calendar.SEPTEMBER);
        otraFecha.set(Calendar.DAY_OF_MONTH, 4);
        EmpleadoConJefe gerente = new EmpleadoConJefe(2045649603, "Wolkowyski", "Micaela", 60000, fechaIngreso);
        EmpleadoConJefe unEmpleado = new EmpleadoConJefe(2036565002, "Hemmings","Luke",10000, otraFecha, gerente);
        gerente.mostrarPantalla();
        unEmpleado.mostrarPantalla();
        if(unEmpleado.esAniversario() == true) {
            System.out.println("------ Permiso de Salida por Aniversario ------");
            System.out.println("Debido a que en el día de la fecha usted a ingresado a trabajar a la empresa");
            System.out.println("se le otorgará este permiso de salida para que pueda retirarse 1 hora más temprano");
            System.out.println("Feliz aniversario" + " " + unEmpleado.apeYnom());
            System.out.println("Atte. " + unEmpleado.getJefe().apeYnom());
        } else {
            System.out.println("No es el aniversario de ingreso!");
        }
    }
}