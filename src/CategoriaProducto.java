/**
 * @author Cristhian Alvarez
 */

public class CategoriaProducto 
{
    private String nombre;
    private int pasillo;
    
    CategoriaProducto(String nombre, int pasillo)
    {
        this.nombre = nombre;
        this.pasillo = pasillo;
    }
    
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception
    {
        if(nombre.isEmpty())
        {
            throw new Exception("El nombre de la categoria del producto no puede estar vacio.");
        }
    }

    public int getPasillo() 
    {
        return pasillo;
    }

    public void setPasillo(int pasillo) throws Exception
    {
        if(pasillo <= 0)
        {
            throw new Exception("El numero de pasillo no puede ser negativo.");
        }
    }
    
}
