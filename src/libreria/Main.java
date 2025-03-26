
package libreria;
/**
 * Clase Main del programa
 * @author Miriam
 */
public class Main {
  /**
   * Método main, método principal del programa
  */
    public static void main(String[] args) {       
        LibreriaSerranoGomezMiriam2425T4 miLibreriaSerranoGomezMiriam2425T4;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        miLibreriaSerranoGomezMiriam2425T4 = new LibreriaSerranoGomezMiriam2425T4("Don Quijote de la Mancha", 10, 45, 120);

        compraQuijoteSerranoGomezMiriam2425T4(miLibreriaSerranoGomezMiriam2425T4); 
        
        try
        {
            ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
            añadeIngresoSerranoGomezMiriam2425T4(miLibreriaSerranoGomezMiriam2425T4, 
                    ingreso, "Libro vendido");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
/**
 * método privado para añadir un ingreso 
 * @param miLibreriaSerranoGomezMiriam2425T4
 * @param ingreso double importe a incrementar
 * @param concepto string concepto del ingreso
 * @throws Exception El método maneja excepciones de forma general
 * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0
 */
    private static void añadeIngresoSerranoGomezMiriam2425T4(
            LibreriaSerranoGomezMiriam2425T4 miLibreriaSerranoGomezMiriam2425T4, 
            double ingreso, String concepto) throws Exception {
        double saldoActual;
        miLibreriaSerranoGomezMiriam2425T4.aumentarSaldo(ingreso);
        saldoActual = miLibreriaSerranoGomezMiriam2425T4.obtenerSaldo();
        System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
    }
/**
 * Método privado para comprar el libro de Don Quijote
 * @param miLibreriaSerranoGomezMiriam2425T4 LibreriaSerranoGomezMiriam2425T4 objeto 
 * que contiene la información de la librería
 * @since LibreriaOnlineSerranoGomezMiriam2425T4 1.0
 */
    private static void compraQuijoteSerranoGomezMiriam2425T4(LibreriaSerranoGomezMiriam2425T4 miLibreriaSerranoGomezMiriam2425T4) {
        String x;
        int num;
        double dinero;
        double saldoActual;
        int stock;
        try
        {
            x = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaSerranoGomezMiriam2425T4.obtenerPrecio();
            saldoActual = miLibreriaSerranoGomezMiriam2425T4.obtenerSaldo();
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
            miLibreriaSerranoGomezMiriam2425T4.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
        saldoActual = miLibreriaSerranoGomezMiriam2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaSerranoGomezMiriam2425T4.obtenerNombre();
        stock = miLibreriaSerranoGomezMiriam2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
    }
}
