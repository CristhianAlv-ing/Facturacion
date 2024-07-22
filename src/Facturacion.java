
import java.util.ArrayList;


/*
 * @author Cristhian ALvarez
 */


public class Facturacion 
{
    
        //Funcion pagar factura
        public static double pagarFactura(Factura factura)
        {
            double total = 0;

            ArrayList<Producto> productos = factura.getProductos();
            
            for(Producto producto:productos)
            {
                total = total + (producto.getPrecio() * producto.getCantidad());
                System.out.println(producto.getProducto());
                
            }
            return total;
        }

    public static void main(String[] args) 
    {
        
        //Creacion de categorias
        CategoriaProducto limpieza = new CategoriaProducto("Limpieza", 1);
        CategoriaProducto hogar = new CategoriaProducto("Hogar", 2);
        CategoriaProducto electronica = new CategoriaProducto("Electronica", 3);
        
        //Creacion de Productos
        Producto cloro = new Producto("Cloro", 45.20, limpieza, 2);
        Producto microonda = new Producto("Microonda", 2500.50, electronica, 1);
        Producto escoba = new Producto("Escoba", 120.0, hogar, 1);
        
        //Definicion de cliente
        Cliente cliente = new Cliente("Humberto", "0510-1998-01478", "Choloma", "2263-1456");
        
        //Generacion de Factura
        Factura factura = new Factura(1, "20-07-24", cliente);
        factura.agregarProducto(cloro);
        factura.agregarProducto(microonda);
        factura.agregarProducto(escoba);
        
        System.out.println("=================Productos========================= ");
        System.out.println("El total a pagar de la factura es: " + pagarFactura(factura));
    }   
}
