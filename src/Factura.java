
import java.util.ArrayList;

/*
 * @author Cristhian Alvarez 
 */

public class Factura 
{
    private int numero;
    private String fecha;
    private final Cliente cliente;
    private final ArrayList<Producto> productos = new ArrayList();
    
    Factura(int numero, String fecha, Cliente cliente)
    {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
    }
    
    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) throws Exception
    {
        if(numero <= 0)
        {
            throw new Exception("El numero no puede ser negativo.");
        }
    }
    
            
    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) throws Exception
    {
        if(fecha.isEmpty())
        {
            throw new Exception("La fecha no puede estar vacia");
        }
    }
    
            
    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
    }
    
    public ArrayList<Producto> getProductos() 
    {
        return productos;
    }
}
