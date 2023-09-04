
/** Permite crear y manipular objetos de tipo Paciente
 * @author Wolkowyski, Micaela
 * @version 03/09/2023
 */

public class Paciente {
    //Atributos
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo Paciente
     * @return No devuelve ningun valor 
     * @param p_historia de tipo int, utilizado para asignar el valor de la historia clinica
     * @param p_nombre de tipo String, utilizado para asignar el valor del nombre
     * @param p_domicilio de tipo String, utilizado para asignar el valor del domicilio
     * @param p_localidadNacido de tipo Localidad, utilizado para asignar el estado de la localidad donde nacio
     * @param p_localidadVive de tipo Localidad, utilizado para asignar el estado de la localidad donde vive
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive) {
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }

    //Setters y Getters
    private void setHistoriaClinica(int p_historia) {
        this.historiaClinica = p_historia;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    private void setNacido(Localidad p_localidadNacido) {
        this.localidadNacido = p_localidadNacido;
    }

    private void setVive(Localidad p_localidadVive) {
        this.localidadVive = p_localidadVive;
    }

    /** Retorna la historia clinica
     * @param No utiliza parametros
     * @return Devuelve un int
     * @exception No dispara ninguna excepcion
     */
    public int getHistoriaClinica() {
        return this.historiaClinica;
    }

    /** Retorna el nombre
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara ninguna excepcion
     */
    public String getNombre() {
        return this.nombre;
    }

    /** Retorna el domicilio
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara ninguna excepcion
     */
    public String getDomicilio() {
        return this.domicilio;
    }

    /** Retorna la localidad donde nacio
     * @param No utiliza parametros
     * @return Retorna un objeto de tipo Localidad
     * @exception No dispara ninguna excepcion
     */
    public Localidad getNacido() {
        return this.localidadNacido;
    }

    /** Retorna la localidad donde vive
     * @param No utiliza parametros
     * @return Retorna un objeto de tipo Localidad
     * @exception No dispara ninguna excepcion
     */
    public Localidad getVive() {
        return this.localidadVive;
    }

    //Metodos
    /** Imprime por pantalla los datos del paciente, su historia clinica, su domicilio y la localidad donde vive
     * @param No utiliza paramtros
     * @return No retorna ningun valor
     * @exception No dispara ninguna excepcion
     */
    public void mostrarDatosPantalla() {
        System.out.println("Paciente: " + this.getNombre() + "     " + "Historia Clinica: " + this.getHistoriaClinica() + "     " + "Domicilio: " + this.getDomicilio());
        this.localidadVive.mostrar();
    }

    /** Retorna una cadena con datos del paciente tales como su nombre, su historia clinica, su domicilio y la localidad donde vive
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return Retorna un String
     */
    public String cadenaDeDatos() {
        return (this.getNombre() + " ...... " + this.getHistoriaClinica() + " ...... " + this.getDomicilio() + " " + "-" + " " + this.getVive().getNombre() + " " + "-" + " " + this.getVive().getProvincia()); 
    }
}
