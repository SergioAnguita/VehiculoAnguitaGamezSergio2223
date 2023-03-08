package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class VehiculoAnguitaGamezSergio2223 {
//
    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /* Constructor sin argumentos */
    public VehiculoAnguitaGamezSergio2223() {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase

    public VehiculoAnguitaGamezSergio2223(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }
    // Método para asignar el nombre del vehiculo

    public void asignarNombre(String nom) {
        nombre = nom;
    }

    // Método que me devuelve el nombre del vehiculo
    public String obtenerNombre() {
        return nombre;
    }

    // Método que me devuelve el stock de vehiculos disponible en cada momento
    public int obtenerStock() {
        return stock;
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        }
        stock = stock + cantidad;
    }

    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de vehiculos");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No se hay suficientes vehiculos para vender");
        }
        stock = stock - cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioIVA() {
        return precioIVA;
    }

    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
