
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
            System.out.println("===================Productos=====================");

            ArrayList<Producto> productos = factura.getProductos();
            System.out.println("Producto|Cantidad|Precio|");
            for(Producto producto:productos)
            {
                total = total + (producto.getPrecio() * producto.getCantidad());
                System.out.println(producto.getProducto() + "|" + producto.getCantidad() + "|" + producto.getPrecio() + "|");
            }
            System.out.println("=================Factura========================= ");
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
        Cliente cliente = new Cliente("Nestor Humberto Espinal", "0510-1998-01478", "Choloma", "2263-1456");
            System.out.println("===================Cliente=====================");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("RTN: " + cliente.getRtn());
            System.out.println("Direccion: " + cliente.getDireccion());
            System.out.println("Numero de telefono: " + cliente.getTelefono());
        
        //Generacion de Factura
        Factura factura = new Factura(1, "20-07-24", cliente);
        factura.agregarProducto(cloro);
        factura.agregarProducto(microonda);
        factura.agregarProducto(escoba);
        
        System.out.println("El total a pagar de la factura es: " + pagarFactura(factura));
    }   
}
