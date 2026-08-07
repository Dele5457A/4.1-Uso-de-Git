package utng.gtid323.adla;

import java.util.List;

/**
 * Interfaz DAO (Data Access Object) que define las operaciones de acceso a datos y CRUD
 * para la entidad Producto en la base de datos.
 * 
 * @version 1.0
 */
public interface ProductoDAO {

    /**
     * Inserta un nuevo producto en la base de datos.
     * 
     * @param producto Objeto Producto con los datos a registrar.
     */
    void insertar(Producto producto);

    /**
     * Busca y obtiene un producto por su identificador único.
     * 
     * @param id Identificador único del producto.
     * @return Objeto Producto encontrado o null si no existe.
     */
    Producto obtenerPorId(int id);

    /**
     * Obtiene la lista completa de productos registrados en la base de datos.
     * 
     * @return Lista de objetos Producto.
     */
    List<Producto> listarTodos();

    /**
     * Actualiza la información de un producto existente en la base de datos.
     * 
     * @param producto Objeto Producto con los datos actualizados.
     */
    void actualizar(Producto producto);

    /**
     * Elimina un producto de la base de datos según su ID.
     * 
     * @param id Identificador único del producto a eliminar.
     */
    void eliminar(int id);
}