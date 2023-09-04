
/** Permite crear y manipular objetos de tipo Docente
 *  @author Wolkowyski, Micaela
 *  @version 03/09/2023
 */

public class Docente {
    //Atributos
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo Docente
     * @return No retorna ningun valor
     * @exception No dispara ninguna excepcion
     * @param p_nombre de tipo String, utilizado para asignar el nuevo valor del nombre
     * @param p_grado de tipo String, utilizado para asignar el nuevo valor del grado
     * @param p_sueldo de tipo double, utilizado para asignar el nuevo valor del sueldo
     * @param p_asignacionFam de tipo double, utilizado para asignar el valor de la asignacion familiar
     */
    public Docente(String p_nombre, String p_grado, double p_sueldo, double p_asignacionFam) {
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldo(p_sueldo);
        this.setAsignacionFam(p_asignacionFam);
    }

    //Setters y Getters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setGrado(String p_grado) {
        this.grado = p_grado;
    } 

    private void setSueldo(double p_sueldo) {
        this.sueldoBasico = p_sueldo;
    }

    private void setAsignacionFam(double p_asignacionFam) {
        this.asignacionFamiliar = p_asignacionFam;
    }

    /** Retorna el nombre
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara ninguna excepcion
     */ 
    public String getNombre() {
        return this.nombre;
    }

    /** Retorna el grado
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara ninguna excepcion
     */ 
    public String getGrado() {
        return this.grado;
    }

    /** Retorna el importe del sueldo basico 
     * @param No utiliza parametros
     * @return Retorna un double
     * @exception No dispara ninguna excepcion
     */ 
    public double getSueldo() {
        return this.sueldoBasico;
    }

    /** Retorna el importe de la asignacion familiar
     * @param No utiliza parametros
     * @return Retorna un double
     * @exception No dispara ninguna excepcion
     */ 
    public double getAsignFam() {
        return this.asignacionFamiliar;
    }

    //Metodos
    /** Calcula el sueldo, sumando el importe del sueldo basico más el importe de la asignación familiar
     * @param No utiliza parametros
     * @return Retorna un double
     * @exception No dispara ninguna excepcion
     */ 
    public double calcularSueldo() {
        return this.getSueldo() + this.getAsignFam();
    }
}