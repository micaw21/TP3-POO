/** Permite crear y manipular objetos de tipo Circulo
 * @author Wolkowyski, Micaela
 * @version 31/08/2023
 */

public class Circulo {
    //Atributos
    private double radio = 0;
    private Punto centro;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo Circulo
     * @param p_radio de tipo double, utilizado para asignar el valor de radio
     * @param p_centro de tipo Punto, utilizadp para asignar el valor de centro
     * @return No devuelve ningun valor
     * @exception No dispara ninguna excepcion
     */
    public Circulo(double p_radio, Punto p_centro) {
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }

    /** Permite instanciar objetos de tipo Circulo
     * @return No devuelve ningun valor
     * @exception No dispara ninguna excepcion
     */
    public Circulo() {
        this.setRadio(0);
        this.setCentro(new Punto());
    }

    //Setters y Getters
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }

    private void setCentro(Punto p_centro) {
        this.centro = p_centro;
    }

    /** Devuelve el valor de radio
     * @param No utiliza parametros
     * @return Devuelve un double
     * @exception No dispara ninguna excepcion
     */
    public double getRadio() {
        return this.radio;
    }

    /** Devuelve el valor de centro
     * @param No utiliza parametros
     * @return Devuelve un Punto
     * @exception No dispara ninguna excepcion
     */
    public Punto getCentro() {
        return this.centro;
    }

    //Metodos
    /** Traslada el centro del circulo a otra posicion pasada por parametro
     * @exception No dispara ninguna excepcion
     * @param p_dx de tipo double, utilizado para asignar el valor x de la posicion a desplazar
     * @param p_dy de tipo double, utilizado para asignar el valor y de la posicion a desplazar
     * @return No devuelve ningun valor
     */
    public void desplazar(double p_dx, double p_dy) {
        this.getCentro().desplazar(p_dx, p_dy);
    }

    /** Imprime por pantalla los datos del circulo, tales como centro, radio, superficie y perimetro
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return No devuelve ningun valor
     */
    public void caracteristicas() {
        System.out.println("\t" + "****** Circulo ******");
        System.out.println("Centro: " + this.getCentro().coordenadas() + " " + "-" + " " + "Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + " " + "-" + " " + "Perimetro: " + this.perimetro());
    }

    /** Devuelve el perimetro del circulo
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return Devuelve un double
     */
    public double perimetro() {
        return (2 * this.getRadio() * Math.PI);
    }

    /** Devuelve la superficie del circulo
     * @exception No dispara ninguna excepcion
     * @return Devuelve un double
     * @param No utiliza parametros
     */
    public double superficie() {
        return (Math.PI * Math.pow(this.getRadio(),2));
    }

    /** Calcula la distancia entre dos circulos
     * @param otroCirculo de tipo Circulo, utilizado para calcular la distancia hacia él
     * @exception No dispara ninguna excepcion
     * @return Devuelve un double
     */
    public double distanciaA(Circulo otroCirculo){
        return(this.getCentro().distanciaA(otroCirculo.getCentro()));
    }

    /** Devuelve el circulo de mayor superficie
     * @exception No dispara ninguna excepcion
     * @param otroCirculo de tipo Circulo, utilizado para comparar superficies
     * @return Devuelve un Circulo
     */
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() >= otroCirculo.superficie()) {
            return this;
        } else {
            return otroCirculo;
        }
    }

}
