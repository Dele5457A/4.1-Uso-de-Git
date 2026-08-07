package utng.gtid323.adla;

import java.util.List;

public class ProductoService {
    private final ProductoDAO productoDAO;

    public ProductoService() {
        this.productoDAO = new ProductoDAOImpl();
    }

    public void registrarProducto(Producto producto) {
        if (producto.getPrecio() < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        productoDAO.insertar(producto);
    }

    public Producto buscarPorId(int id) {
        return productoDAO.obtenerPorId(id);
    }

    public List<Producto> obtenerTodos() {
        return productoDAO.listarTodos();
    }

    public void actualizarProducto(Producto producto) {
        productoDAO.actualizar(producto);
    }

    public void eliminarProducto(int id) {
        productoDAO.eliminar(id);
    }
}