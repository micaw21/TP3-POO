
/** Permite crear y manipular objetos de tipo CuentaCorriente
 * @author Wolkowyski, Micaela
 * @version 03/09/2023
 */
public class CuentaCorriente {
    //Atributos
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo CuentaCorriente
     * @return No retorna ningun valor
     * @param p_nroCuenta de tipo int, utilizado para asignar el valor de nroCuenta
     * @param p_titular de tipo Persona, utilizado para asignar el valor de titular
     * @exception No dispara ninguna excepcion
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0.0);
        this.setLimiteDescubierto(500);
        this.setTitular(p_titular);
    }

    /** Permite instanciar objetos de tipo CuentaCorriente
     * @return No devuelve ningun valor
     * @param p_nroCuenta de tipo int, utilizado para asignar el nuevo valor de nroCuenta
     * @param p_titular de tipo Persona, utilizado para asignar el nuevo valor del titular
     * @param p_saldo de tipo double, utilizado para asignar el nuevo importe del saldo
     * @exception No dispara ninguna excepcion
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
        this.setTitular(p_titular);
    }

    //Setters y Getters
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    private void setLimiteDescubierto(double p_limite) {
        this.limiteDescubierto = p_limite;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    /** Retorna el número de cuenta
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

    /** Retorna el valor del limite descubierto
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return Retorna un double
     */
    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }

    /** Retorna el titular
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return Retorna un objeto de tipo Persona
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
        if(p_importe <= (this.getSaldo() + this.getLimiteDescubierto())) {
            return true;
        } else {
            return false;
        }
    }
    
    /** Realiza la extracción al saldo dado un importe como parámetro
     * @return No devuelve ningun valor
     * @param p_importe de tipo double, utilizado como importe de extracción
     * @exception No dispara ninguna excepcion
     */
    private void extraccion(double p_importe) {
        this.setSaldo(this.getSaldo() - p_importe);
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
        } else {
            System.out.println("El importe de extracción sobrepasa el límite de descubierto!");
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

    /** Imprime por pantalla los datos de la cuenta corriente, tales como el nro de cuenta, su saldo, el titular y el descubierto
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return No devuelve ningun valor
     */
    public void mostrar() {
        System.out.println("-     Cuenta Corriente     -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " " + "-" + " " + "Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }






}
