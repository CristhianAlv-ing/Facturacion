/**
 * @author Cristhian Alvarez
 */

public class Producto 
{
    private String producto;
    private double precio;
    private final CategoriaProducto categoria;
    private int cantidad;
    
    Producto(String producto, double precio, CategoriaProducto categoria, int cantidad)
    {
        this.producto = producto;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }
    
    public String getProducto() 
    {
        return producto;
    }
    
    public void setProducto(String producto) throws Exception
    {
        if(producto.isEmpty())
        {
            throw new Exception("El nombre del producto no puede estar vacio");
        }
    }


    public double getPrecio() 
    {
        return precio;
    }
    
    public void setPrecio(double precio) throws Exception
    {
        if(precio <= 0)
        {
            throw new Exception("El valor del precio no puede ser negativo.");
        }
    }

    public CategoriaProducto getCategoria() 
    {
        return categoria;
    }

    public int getCantidad() 
    {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) throws Exception
    {
        if(cantidad <= 0)
        {
            throw new Exception("La cantidad de productos ingresada no puede ser negativa.");
        }
    }
}
