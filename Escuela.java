
/**Permite crear y manipular objetos de tipo Escuela
* @author Wolkowyski, Micaela
* @version 03/09/2023
*/

public class Escuela {
    //Atributos
    private String nombre;
    private String domicilio;
    private String director;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo Escuela
     * @return No devuelve ningun valor
     * @param p_nombre de tipo String, utilizado para asignar el nuevo valor de nombre
     * @param p_domicilio de tipo String, utilizado para asignar el nuevo valor del domicilio
     * @param p_director de tipo String, utilizado para asignar el nuevo valor del director
     * @exception No dispara ninguna excepcion
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }

    //Setters y Getters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    private void setDirector(String p_director) {
        this.director = p_director;
    }

    /** Retorna el nombre
     * @param No utiliza parametros
     * @return Devuelve un String
     * @exception No dispara ninguna excepcion
     */
    public String getNombre() {
        return this.nombre;
    }

    /** Retorna el domicilio
     * @param No utiliza parametros
     * @return Devuelve un String
     * @exception No dispara ninguna excepcion
     */
    public String getDomicilio() {
        return this.domicilio;
    }

    /** Retorna el director
     * @param No utiliza parametros
     * @return Devuelve un String
     * @exception No dispara ninguna excepcion
     */
    public String getDirector() {
        return this.director;
    }

    //Metodos
    /** Imprime por pantalla el recibo con los datos de la escuela y del docente
     * @return No devuelve ningun valor
     * @param p_docente de tipo Docente, utilizado para obtener sus datos
     * @exception No dispara ninguna excepcion
     */
    public void imprimirRecibo(Docente p_docente) {
        System.out.println("Escuela: " + this.getNombre() + "      " + "Domicilio: " + this.getDomicilio() + "       " + "Director: " + this.getDirector());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Docente: " + p_docente.getNombre());
        System.out.println("Sueldo: ............................" + "\t" + "$" + p_docente.calcularSueldo());
        System.out.println("Sueldo Basico: ....................." + "\t" + "$" + p_docente.getSueldo());
        System.out.println("Asignacion Familiar: ..............." + "\t" + "$" + p_docente.getAsignFam() + "\n");
    }

}