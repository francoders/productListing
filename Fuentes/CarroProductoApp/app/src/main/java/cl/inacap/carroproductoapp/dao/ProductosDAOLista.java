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
        p.setNombre("Leche condensada Nestle");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(1000);
        p.setFoto("https://tienda-autorizada.com/cdn-cgi/image/f=auto,fit=scale-down,width=550,height=550,quality=75/https://tienda-autorizada.com/image/catalog/A-Prooductos%203.0/Procura/MSCM0168-2.png");
        productos.add(p);

        p = new Producto();
        p.setNombre("Escudo Silver");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(750);
        p.setFoto("https://i2.wp.com/www.casagamovi.cl/wp-content/uploads/2020/08/escudo-silver-350-ml.png?fit=1000%2C1000&ssl=1");
        productos.add(p);

        p = new Producto();
        p.setNombre("Coco Rallado Gourmet");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(1100);
        p.setFoto("https://jumbo.vteximg.com.br/arquivos/ids/412139/Coco-rallado-blanco-sobre-100-g.jpg?v=637469589556870000");
        productos.add(p);

        p = new Producto();
        p.setNombre("Mayonesa Hellmann's");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(1100);
        p.setFoto("https://dojiw2m9tvv09.cloudfront.net/24510/product/mayonesahellmanns1864573.png");
        productos.add(p);

        p = new Producto();
        p.setNombre("Galleta Toddy");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(950);
        p.setFoto("https://jumbo.vteximg.com.br/arquivos/ids/409887/Galletas-chispas-1425-g.jpg?v=637469368232630000");
        productos.add(p);

        p = new Producto();
        p.setNombre("Pringles");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(950);
        p.setFoto("https://supermaxsa.com.ar/wp-content/uploads/2020/05/11162_optimized.png");
        productos.add(p);

        p = new Producto();
        p.setNombre("Fanta Naranja");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(950);
        p.setFoto("https://pngimg.com/uploads/fanta/fanta_PNG39.png");
        productos.add(p);

        p = new Producto();
        p.setNombre("Nutella");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        p.setPrecio(1100);
        p.setFoto("http://assets.stickpng.com/thumbs/589eef9264b351149f22a88e.png");
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
