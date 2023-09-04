
/** Permite crear y manipular objetos de tipo Hospital
 * @author Wolkowyski, Micaela
 * @version 03/09/2023
 */

public class Hospital {
    //Atributos
    private String nombreHospital;
    private String nombreDirector;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo Hospital
     * @return No retorna ningun valor
     * @param p_nombreHospital de tipo String, utilizado para asignar el valor del nombre del hospital
     * @param p_nombreDirector de tipo String, utilizado para asignar el valor del nombre del director
     * @exception No dispara ninguna excepcion
     */
    public Hospital(String p_nombreHospital, String p_nombreDirector) {
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }

    //Setters y Getters
    private void setNombreHospital(String p_nombreHospital) {
        this.nombreHospital = p_nombreHospital;
    }

    private void setNombreDirector(String p_nombreDirector) {
        this.nombreDirector = p_nombreDirector;
    }

    /** Retorna el nombre del hospital
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara ninguna excepcion
     */
    public String getNombreHospital() {
        return this.nombreHospital;
    }

    /** Retorna el nombre del director
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara ninguna excepcion
     */
    public String getNombreDirector() {
        return this.nombreDirector;
    }

    //Metodos
    /** Retorna los datos del hosppital y del paciente
     * @return No retorna ningun valor 
     * @param p_paciente de tipo Paciente, utilizado para obtener sus datos
     * @exception No dispara ninguna excepcion
     */
    public void consultaDatosFiliatorios(Paciente p_paciente) {
        System.out.println("Hospital: " + this.getNombreHospital() + "     " + "Director: " + this.getNombreDirector());
        System.out.println("----------------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
    }
}
