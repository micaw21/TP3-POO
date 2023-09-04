import java.util.*;

/** Permite crear y manipular objetos de tipo EmpleadoConJefe
 * @author Wolkowyski, Micaela
 * @version 04/09/2023
 */

public class EmpleadoConJefe {
    //Atributos
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso = Calendar.getInstance();
    private EmpleadoConJefe jefe;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo EmpleadoConJefe
     * @return No retorna ningun valor
     * @param p_cuil tipo long, se utiliza para asignar el nuevo valor de cuil.
     * @param p_apellido tipo String, se utiliza para asignar el nuevo valor de apellido.
     * @param p_nombre tipo String, se utiliza para asignar el nuevo valor de nombre.
     * @param p_importe tipo Double, se utiliza para asignar el nuevo valor de importe.
     * @param p_fecha tipo Calendar, utilizado para asignar la fecha de ingreso
     * @param p_jefe de tipo EmpleadoConJefe, utilizado para asignar el jefe
     * @exception No dispara ninguna excepcion
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }

    /** Permite instanciar objetos de tipo EmpleadoConJefe
     * @return No retorna ningun valor
     * @param p_cuil tipo long, se utiliza para asignar el nuevo valor de cuil.
     * @param p_apellido tipo String, se utiliza para asignar el nuevo valor de apellido.
     * @param p_nombre tipo String, se utiliza para asignar el nuevo valor de nombre.
     * @param p_importe tipo Double, se utiliza para asignar el nuevo valor de importe.
     * @param p_fecha tipo Calendar, utilizado para asignar la fecha de ingresoram p_fecha
     * @exception No dispara ninguna excepcion
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }

    /** Permite instanciar objetos de tipo EmpleadoConJefe
     * @return No retorna ningun valor
     * @exception No dispara ninguna exepcion
     * @param p_cuil tipo long, se utiliza para asignar el nuevo valor de cuil.
     * @param p_apellido tipo String, se utiliza para asignar el nuevo valor de apellido.
     * @param p_nombre tipo String, se utiliza para asignar el nuevo valor de nombre.
     * @param p_importe tipo Double, se utiliza para asignar el nuevo valor de importe.
     * @param p_anio tipo int, se utiliza para asignar el nuevo valor de anio.
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }

    //Setters y Getters
    private void setFechaIngreso(Calendar p_fecha) {
        this.fechaIngreso = p_fecha;
    }

    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setSueldoBasico(double p_importe) {
        this.sueldoBasico = p_importe;
    }

    private void setAnioIngreso(int p_anio) {
        this.fechaIngreso.set(Calendar.YEAR, p_anio);
    }

    private void setJefe(EmpleadoConJefe p_jefe) {
        this.jefe = p_jefe;
    }

    /** Retorna la fecha de ingreso
     * @param No utiliza parametros
     * @return Retorna un objeto de tipo Calendar
     * @exception No dispara ninguna excepcion
     */
    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    /** Retorna el CUIL
     * @param No utiliza parametros.
     * @return Devuelve un long.
     * @exception No dispara ninguna excepcion.
     */
    public long getCuil() {
        return this.cuil;
    }
    
    /** Retorna el apellido.
     * @param No utiliza parametros.
     * @return Devuelve un String.
     * @exception No dispara ninguna excepcion.
     */
    public String getApellido() {
        return this.apellido;
    }
    
    /** Retorna el nombre 
     * @param No utiliza parametros.
     * @return Devuelve un String.
     * @exception No dispara ninguna excepcion.
     */
    public String getNombre() {
        return this.nombre;
    }

    /** Retorna el sueldo.
     * @param No utiliza parametros.
     * @return Devuelve un double.
     * @exception No dispara ninguna excepcion.
     */
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    
    /** Retorna el anio de ingreso.
     * @param No utiliza parametros.
     * @return Devuelve un int.
     * @exception No dispara ninguna excepcion.
     */
    public int getAnioIngreso() {
        return this.fechaIngreso.get(Calendar.YEAR);
    }

    /** Retorna el jefe
     * @param No utiliza parametros
     * @return Devuelve un objeto de tipo EmpleadoConJefe
     * @exception No dispara ninguna excepcion
     */
    public EmpleadoConJefe getJefe() {
        return this.jefe;
    }

    //Metodos

    /** Calcula la antiguedad laboral del empleado.
     * @param No utiliza parametros.
     * @return Devuelve un int.
     * @exception No dispara ninguna excepcion.
     */
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return(anioHoy - this.getAnioIngreso());
    }

    /** Calcula descuentos del sueldo.
     * @param No utiliza parametros.
     * @return Devuelve un double.
     * @exception No dispara ninguna excepcion.
     */
    private double descuento() {
        return (this.getSueldoBasico() - (this.getSueldoBasico() * 0.02) - 1500);
    }

    /** Calcula el adicional del sueldo segun su antiguedad.
     * @param No utiliza parametros.
     * @return Devuelve un double.
     * @exception No dispara ninguna excepcion.
     */
    private double adicional() {
        if(this.antiguedad() < 2) {
            return (this.getSueldoBasico() + (this.getSueldoBasico() * 0.02));
        } else if (this.antiguedad() >= 2 && this.antiguedad() < 10) {
            return(this.getSueldoBasico() + (this.getSueldoBasico() * 0.04));
        } else {
            return(this.getSueldoBasico() + (this.getSueldoBasico() * 0.06));
        }
    }

    /** Calcula el sueldo neto.
     * @param No utiliza parametros.
     * @return Devuelve un double.
     * @exception No dispara ninguna excepcion.
     */
    public double sueldoNeto() {
        return(this.getSueldoBasico() + this.adicional() - this.descuento());
    }

    /** Retorna el nombre y apellido.
     * @param No utiliza parametros.
     * @return Devuelve un String.
     * @exception No dispara ninguna excepcion.
     */
    public String nomYape() {
        return (this.getNombre() + " " + this.getApellido());
    }

    /** Retorna el apellido y nombre.
     * @param No utiliza parametros.
     * @return Devuelve un String.
     * @exception No dispara ninguna excepcion.
     */
    public String apeYnom() {
        return(this.getApellido() + "," + " " + this.getNombre());
    }

    /** Muestra por pantalla nombre y apellido, cuil, antiguedad y el sueldo neto.
     * @param No utiliza parametros.
     * @return No retorna nada.
     * @exception No dispara ninguna excepcion.
     */
    public void mostrarPantalla() {
        System.out.println("Nombre y Apellido: " + this.nomYape());
        System.out.println("CUIL: " + this.getCuil() + " " + "Antiguedad: " + this.antiguedad() + " " + "anios de servicio");
        System.out.println("Sueldo Neto: " + " " + "$" + this.sueldoNeto());
        if(this.getJefe() == null) {
            System.out.println("GERENTE GENERAL" + "\t");
        } else {
            System.out.println("Responde a: " + this.getJefe().apeYnom() + "\t");
        }
    }

    /** Retorna una linea conteniendo CUIL, apellido y nombre y sueldo neto.
     * @param No utiliza parametros.
     * @return Devuelve un String.
     * @exception No dispara ninguna excepcion.
     */
    public String mostrarLinea() {
        return(this.getCuil() + "\t" + this.apeYnom() + " " + ".................." + " " + "$" + this.sueldoNeto());
    }

    /** Retorna true si es el aniversario de la fecha de ingreso a la empresa
     * @param No utiliza parametros
     * @return Retorna un boolean
     * @exception No dispara ninguna excepcion
     */
    public boolean esAniversario() {
        Calendar fechaHoy = new GregorianCalendar();
        return ((fechaHoy.get(Calendar.DAY_OF_MONTH) == fechaIngreso.get(Calendar.DAY_OF_MONTH)) && (fechaHoy.get(Calendar.MONTH) == fechaIngreso.get(Calendar.MONTH)));
    }
}