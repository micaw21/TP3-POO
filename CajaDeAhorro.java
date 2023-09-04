/** Permite crear y manipular objetos de tipo CajaDeAhorro
 * @author Wolkowyski, Micaela
 * @version 03/09/2023
 */

public class CajaDeAhorro {
    //Atributos
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;

    //Metodos Constructores
    /** Permite instanciar objetos de tipo CajaDeAhorro
     * @return No retorna ningun valor
     * @param p_nroCuenta de tipo int, utilizado para asignar el valor del nro de cuenta
     * @param p_titular de tipo Persona, utilizado para asignar el valor del titular
     * @exception No dispara ninguna excepcion
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0.0);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular);
    }

    /** Permite instanciar objetos de tipo CajaDeAhorro
     * @return No retorna ningun valor
     * @param p_nroCuenta de tipo int, utilizado para asignar el valor del nro de cuenta
     * @param p_titular de tipo Persona, utilizado para asignar el valor del titular 
     * @param p_saldo de tipo double, utilizado para asignar el importe del saldo
     * @exception No dispara ninguna excepcion
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular);
    }

    //Getters and Setters
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    private void setExtraccionesPosibles(int p_extracciones) {
        this.extraccionesPosibles = p_extracciones;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    } 

    /** Retorna el nombre
     * @param No utiliza parametros
     * @return Retorna un int
     * @exception No dispara ninguna excepcion
     */
    public int getNroCuenta() {
        return this.nroCuenta;
    }

    /** Retorna el importe del saldo
     * @param No utiliza parametros
     * @return Retorna un double
     * @exception No dispara ninguna excepcion
     */
    public double getSaldo() {
        return this.saldo;
    }

    /** Retorna el valor de extraccion posible
     * @param No utiliza parametros
     * @return Retorna un int
     * @exception No dispara ninguna excepcion
     */
    public int getExtraccionesPosibles() {
        return this.extraccionesPosibles;
    }

    /** Retorna el titular
     * @param No utiliza parametros
     * @return Retorna un objeto de tipo Persona
     * @exception No dispara ninguna excepcion
     */
    public Persona getTitular() {
        return this.titular;
    }

    //Metodos
    /** Devuelve true si se cumplen las condiciones para poder extraer
     * @exception No dispara ninguna excepcion
     * @param p_importe de tipo double, utilizado para saber si cumple las condiciones
     * @return Retorna un boolean
     */
    private boolean puedeExtraer(double p_importe) {
        if(p_importe <= this.getSaldo() && this.getExtraccionesPosibles() != 0) {
            return true;
        } else {
            return false;
        }
    }

    /** Realiza la extracción al saldo dado un importe como parámetro y disminuye las extracciones posibles
     * @return No devuelve ningun valor
     * @param p_importe de tipo double, utilizado como importe de extracción
     * @exception No dispara ninguna excepcion
     */
    private void extraccion(double p_importe) {
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
        System.out.println("Extracción completada!");
    }

    /** Coordina la operación de extracción si se cumplen las condiciones
     * @exception No dispara ninguna excepcion
     * @param p_importe de tipo double, utilizado como importe de extracción
     * @return No devuelve ningun valor
     */
    public void extraer(double p_importe) {
        if(this.puedeExtraer(p_importe)) {
            this.extraccion(p_importe);
        } else if (this.getExtraccionesPosibles() == 0) {
            System.out.println("No tiene habilitadas más extracciones!");
        } else {
            System.out.println("No puede extraer más que el saldo!");
        }
    }

    /** Deposita al saldo el importe pasado como parámetro
     * @return No devuelve ningun valor
     * @param p_importe de tipo double, utilizado como valor de depósito
     * @exception No dispara ninguna excepcion
     */
    public void depositar(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
        System.out.println("Depósto realizado correctamente!");
    }

    /** Imprime por pantalla los datos de la caja de ahorro, tales como el nro de cuenta, su saldo, el titular y las extracciones posibles
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return No devuelve ningun valor
     */
    public void mostrar() {
        System.out.println("\t" + "-     Caja de Ahorro    -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " " + "-" + " " + "Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones Posibles: " + this.getExtraccionesPosibles());
    }
}
