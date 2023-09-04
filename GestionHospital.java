
/** Clase ejecutable
 * @author Wolkowyski, Micaela
 * @version 03/09/2023
 */

public class GestionHospital {
    public static void main(String [] args) {
        Localidad localidadNac = new Localidad("Resistencia", "Chaco");
        Localidad localidadViv = new Localidad("Monte Caseros","Corrientes");
        Paciente unPaciente = new Paciente(578669, "Juan Manuel Ortigoza", "Bulevar 3 de Abril",localidadNac, localidadViv);
        Hospital unHospital = new Hospital("Perrando", "Pedro Ramirez");

        unHospital.consultaDatosFiliatorios(unPaciente);

        Localidad nacimiento = new Localidad(args[0],args[1]);
        Localidad vive = new Localidad(args[2],args[3]);
        Paciente otroPaciente = new Paciente(1234, "Micaela Wolkowyski", "Ojeda 1234", nacimiento, vive);
        Hospital otroHospital = new Hospital("Garrahan", "Leonardo Ruiz");

        otroHospital.consultaDatosFiliatorios(otroPaciente);
    }
}
