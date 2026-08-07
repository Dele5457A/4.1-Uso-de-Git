package utng.gtid323.adla;

/**
 * Clase modelo que representa un Producto dentro del sistema de inventario de la Tienda UTNG.
 * Contiene los atributos principales del producto, constructores y métodos de acceso.
 * 
 * @version 1.0
 */
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    /**
     * Constructor por defecto.
     */
    public Producto() {}

    /**
     * Constructor con todos los atributos.
     * 
     * @param id Identificador único del producto.
     * @param nombre Nombre comercial del producto.
     * @param precio Precio unitario del producto.
     * @param stock Cantidad disponible en inventario.
     */
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Constructor sin ID, utilizado para inserción de nuevos registros en la base de datos.
     * 
     * @param nombre Nombre comercial del producto.
     * @param precio Precio unitario del producto.
     * @param stock Cantidad disponible en inventario.
     */
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}