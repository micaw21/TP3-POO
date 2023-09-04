

/** Permite crear y manipular objetos de tipo Mujer
 * @author Wolkowyski, Micaela
 * @version 03/09/2023
 */

public class Mujer {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad; 
    private String estadoCivil;
    private Hombre esposo;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo Mujer
     * @return No devuelve ningun valor 
     * @param p_nombre de tipo String, utilizado para asignar el valor del nombre
     * @param p_apellido de tipo String, utilizado para asiganr el valor del apellido
     * @param p_edad de tipo int, utilizado para asignar el valor de edad
     * @exception No dispara ninguna excepcion
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
    }

    /** Permite instanciar objetos de tipo Mujer
     * @return No devuelve ningun valor
     * @param p_nombre de tipo String, utilizado para asignar el valor del nombre
     * @param p_apellido de tipo String, utilizado para asignar el valor del apellido
     * @param p_edad de tipo int, utilizado para asignar el valor de edad
     * @param p_esposo de tipo Hombre, utilizado para asignar el valor de esposo
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casada");
        this.setEsposo(p_esposo);
    }

    //Setters y Getters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    private void setEdad(int p_edad) {
        this.edad = p_edad;
    }

    private void setEstadoCivil(String p_estado) {
        this.estadoCivil = p_estado;
    }

    private void setEsposo(Hombre p_esposo) {
        this.esposo = p_esposo;
    }

    /** Retorna el nombre
     * @param No utiliza parametros
     * @return Devuelve un String
     * @exception No dispara ninguna excepcion
     */
    public String getNombre() {
        return this.nombre;
    }

    /** Retorna el apellido
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara ninguna excepcion
     */
    public String getApellido() {
        return this.apellido;
    }

    /** Retorna la edad
     * @param No utiliza parametros
     * @return Retorna un int
     * @exception No dispara ninguna excepcion
     */
    public int getEdad() {
        return this.edad;
    }

    /** Retorna el estado civil
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara ninguna excepcion
     */
    public String getEstado() {
        return this.estadoCivil;
    }

    /** Retorna el esposo
     * @param No utiliza parametros
     * @return Retorna un objeto de tipo Hombre
     * @exception No dispara ninguna excepcion
     */
    public Hombre getEsposo() {
        return this.esposo;
    }

    //Metodos
    /** Asigna el cónyuge indicado por parámetro
     * @return No retorna ningun valor
     * @param p_hombre de tipo Hombre, utilizado para asignar el cónyuge
     * @exception No dispara ninguna excepcion
     */
    public void casarseCon(Hombre p_hombre) {
        this.setEsposo(p_hombre);
        this.setEstadoCivil("Casada");
    }
    
    /** Coloca null en el atributo del cónyuge
     * @param No utiliza parametros
     * @return No retorna ningun valor
     * @exception No dispara ninguna excepcion
     */
    public void divorcio() {
        this.setEsposo(null);
        this.setEstadoCivil("Divorciada");
    }

    /** Retorna los datos de la mujer, tales como el nombre, el apellido y su edad
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara ninguna excepcion
     */
    public String datos() {
        return (this.getNombre() + " " + this.getApellido() + " " + "de" + " " + this.getEdad() + " " + "años");
    }

    /** Imprime por pantalla el estado civil
     * @param No utiliza parametros
     * @return No retorna ningun valor
     * @exception No dispara ninguna excepcion
     */
    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " " + "-" + this.getEstado());
    }

    /** Retorna los datos de los casados
     * @param No utiliza parametros
     * @return No retorna ningun valor
     * @exception No dispara ninguna excepcion
     */
    public void casadaCon() {
        System.out.println(this.datos() +" " + "está casada con " + this.getEsposo().datos());
    }
}

