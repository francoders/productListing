package cl.inacap.carroproductoapp.dao;

import java.util.List;

import cl.inacap.carroproductoapp.dto.Producto;

public interface ProductosDAO {

    List<Producto> getAll ();
    Producto save(Producto p);
}
