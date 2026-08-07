package utng.gtid323.adla;

import java.util.List;

public interface ProductoDAO {
    void insertar(Producto producto);
    Producto obtenerPorId(int id);
    List<Producto> listarTodos();
    void actualizar(Producto producto);
    void eliminar(int id);
}