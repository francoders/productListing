package cl.inacap.carroproductoapp.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.carroproductoapp.dto.Producto;

public class ProductosDAOLista implements ProductosDAO{

    private List<Producto> productos = new ArrayList<>();
    //2. Como atributo de la misma clase debe existir una instancia
    //estatica de si misma

    private static ProductosDAOLista instancia;
    //1. Constructor de la clase sebe ser privado
    private ProductosDAOLista(){
        Producto p = new Producto();
        p.setNombre("Coca-Cola Zero");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(1000);
        p.setFoto("https://img2.freepng.es/20180629/ekc/kisspng-fizzy-drinks-fanta-coca-cola-itubana-cola-zero-5b363842f378d9.2629241315302800029973.jpg");
        productos.add(p);
        p = new Producto();
        p.setNombre("Fanta Naranja");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(950);
        p.setFoto("https://e7.pngegg.com/pngimages/629/634/png-clipart-fanta-fizzy-drinks-coca-cola-juice-appletiser-guarana-antartica-food-orange.png");
        productos.add(p);
        p = new Producto();
        p.setNombre("Escudo Silver");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(750);
        p.setFoto("https://i2.wp.com/www.casagamovi.cl/wp-content/uploads/2020/08/escudo-silver-350-ml.png?fit=1000%2C1000&ssl=1");
        productos.add(p);
        p = new Producto();
        p.setNombre("Monster Energy");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(1100);
        p.setFoto("https://img2.freepng.es/20180613/ivv/kisspng-monster-energy-energy-drink-red-bull-fizzy-drinks-monster-energy-drink-5b20d0305cb584.2630228815288771043798.jpg");
        productos.add(p);
    }

    public static ProductosDAOLista getInstance(){
        if (instancia == null){
            instancia = new ProductosDAOLista();
        }
        return instancia;
    }
    //3. Metodo estatico que permita el acceso a la unica instancia
    @Override
    public List<Producto> getAll(){
        return productos;
    }

    @Override
    public Producto save(Producto p){
        productos.add(p);
        return p;
    }
}
