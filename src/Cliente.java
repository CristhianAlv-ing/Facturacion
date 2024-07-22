/**
 * @author Cristhian Alvarez
 */
public class Cliente 
{
    private String nombre;
    private String rtn;
    private String direccion;
    private String telefono;
    
    Cliente(String nombre, String rtn, String direccion, String telefono)
    {
        this.nombre = nombre;
        this.rtn = rtn;
        this.direccion = direccion;
        this.telefono = telefono;
    }
        
    
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception
    {
        if(nombre.isEmpty())
        {
            throw new Exception("El nombre no puede estar vacio");
        }
    }

    public String getRtn() 
    {
        return rtn;
    }

    public void setRtn(String rtn) throws Exception
    {
        if(rtn.isEmpty())
        {
            throw new Exception("El RTN no puede estar vacio");
        }
    }
    
    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion) throws Exception
    {
        if(direccion.isEmpty())
        {
            throw new Exception("La dirección no puede estar vacio");
        }
    }
    
    public String getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(String telefono) throws Exception
    {
        if(telefono.isEmpty())
        {
            throw new Exception("El telefono no puede estar vacio");
        }
    }
}
