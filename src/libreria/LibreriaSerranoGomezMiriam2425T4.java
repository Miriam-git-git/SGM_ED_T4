
package libreria;
/**
 * Clase que contiene toda la información de la librería
 * @author Miriam
 */
public class LibreriaSerranoGomezMiriam2425T4 {
    private String nom;
    private int cantidad;
    private double precio;
    private double saldo;
    //Constructor sin argumentos
    /**
     * Constructor sin argumentos
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public LibreriaSerranoGomezMiriam2425T4(){}
    //constructor con parámetros para inicializar todas las propiedades de la clase
    /**
     * Constructor de la clase LibreriaSerranoGomezMiriam2425T4
     * @param nom String nombre del libro
     * @param cantidad int Cantidad de ejemplares que hay en stock
     * @param precio precio del libro
     * @param saldo saldo en la cuenta de la librería
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public LibreriaSerranoGomezMiriam2425T4(String nom, int cantidad, double precio, double saldo){
        this.nom = nom;                 //Nombre del libro
        this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
        this.precio = precio;           //Precio unitario del libro
        this.saldo = saldo;             //Saldo en la cuenta de la librería
    }
    //Método que devuelve el nombre del libro
    /**
     * Método que devuelve el nombre del libro
     * @return devuelve un String con el nombre
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public String obtenerNombre(){
        return getNom();
    }
    //Método que devuelve el precio del libro
    /**
     * Método que devuelve el precio del libro
     * @return devuelve un double con el precio
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public double obtenerPrecio(){
        return getPrecio();
    }
    //Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender
    /**
     * Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender
     * @return devuelve la cantidad de libros de ese ejemplar que quedan para vender
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public int obtenerStock(){
        return getCantidad();
    }
    //Método para obtener el saldo en la cuenta
    /**
     * Método para obtener el saldo en la cuenta
     * @return devuelve el saldo de la cuenta
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public double obtenerSaldo(){
        return getSaldo();
    }
    //Método para aumentar el saldo
    /**
     * Método para aumentar el saldo
     * @param saldomas double incremento de saldo
     * @throws Exception El método maneja excepciones de forma general
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public void aumentarSaldo(double saldomas) throws Exception{
        if (saldomas<=0)
            throw new Exception("No se puede ingresar 0 o una cantidad negativa");
        setSaldo(getSaldo() + saldomas);
    }
    //Método para comprar un ejemplar de un libro, actualiza el stock y el saldo
    /**
     * Método para comprar un ejemplar de un libro, actualiza el stock y el saldo
     * @param canti int cantidad a comprar
     * @throws Exception Este método maneja las excepciones de forma genérica
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public void comprarLibro(int canti) throws Exception{
        if (canti <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa de libros");
        if (getCantidad()>=canti){
            if (getSaldo() <= getPrecio())
                  throw new Exception ("No hay suficiente saldo para comprar");
            else{
                setCantidad(getCantidad() - canti);
                setSaldo(getSaldo() + (getPrecio() * canti));
            }
        }
        else 
            throw new Exception ("No se pueden comprar más libros de los que hay disponibles");
       
    }
    /**
     * Método getter que devuelve el nombre
     * @return the nom
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public String getNom() {
        return nom;
    }
    /**
     * Método setter que actualiza el nombre
     * @param nom String nombre del libro
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Método getter que devuelve la cantidad
     * @return the cantidad
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public int getCantidad() {
        return cantidad;
    }
    /**
     * Método setter que actualiza la cantidad de libros
     * @param cantidad the cantidad to set
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * Método getter que devuelve el precio
     * @return the precio
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Método setter que actualiza el precio
     * @param precio the precio to set
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Método getter que devuelve el saldo de la cuenta de la librería
     * @return the saldo
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Método setter que actualiza el saldo de la cuenta de la librería
     * @param saldo the saldo to set
     * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
