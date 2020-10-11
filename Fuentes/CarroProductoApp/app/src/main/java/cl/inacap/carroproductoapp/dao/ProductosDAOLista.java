package cl.inacap.carroproductoapp.dao;

import java.util.List;

import cl.inacap.carroproductoapp.dto.Producto;

public class ProductosDAOLista implements ProductosDAO{

    //Implementar un patron singleton
    //2. Como atributo de la misma clase debe existir una instancia
    //estatica de si misma
    private static ProductosDAOLista instancia;
    //1. Constructor de la clase sebe ser privado
    private ProductosDAOLista(){

    }

    public static ProductosDAOLista getInstance(){
        if (instancia == null){
            instancia = new ProductosDAOLista();
        }
        return instancia;
    }
    //3. Metodo estatico que permita el acceso a la unica instancia
    @Override
    public List<Producto> getAll() {
        return null;
    }

    @Override
    public Producto save(Producto p) {
        return null;
    }
}
