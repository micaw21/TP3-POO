/** Clase ejecutable
 * @author Wolkowyski, Micaela
 * @version 03/09/2023
 */
import java.util.*;

public class Empresa {
    public static void main(String [] args){
        Calendar fechaIngreso = new GregorianCalendar();
        fechaIngreso.set(Calendar.YEAR, 2020);
        fechaIngreso.set(Calendar.MONTH, Calendar.SEPTEMBER);
        fechaIngreso.set(Calendar.DAY_OF_MONTH, 4);
        Empleado unEmpleado = new Empleado(2045649603, "Micaela", "Wolkowyski", 6000, fechaIngreso);
        if(unEmpleado.esAniversario() == true) {
            System.out.println("------ Permiso de Salida por Aniversario ------");
            System.out.println("Debido a que en el día de la fecha usted a ingresado a trabajar a la empresa");
            System.out.println("se le otorgará este permiso de salida para que pueda retirarse 1 hora más temprano");
            System.out.println("Feliz aniversario" + " " + unEmpleado.apeYNombre() + " " + ":)");
        } else {
            System.out.println("No es el aniversario de ingreso!");
        }
    }
}
