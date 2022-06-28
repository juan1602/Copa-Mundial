package modelo;

public class Jugador 
{
    //Atributos
    private String nombre;
    private String posicion;
    private int edad;
    private int goles;

    //Métodos
    public Jugador()
    {
        nombre = "";
        edad= 0;
        goles = 0;
        posicion= "";
    }

    public Jugador(String n, int g, int e,String c)
    {
        nombre = n;
        goles = g;
        edad = e;
        posicion= c;
    }
    
    public void setGoles(int g)
    {
        goles = g;
    }

    public int getGoles()
    {
        return goles;
    }
    public void setEdad(int e)
    {
        edad = e;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setPosicion(String c)
    {
        posicion = c;
    }

    public String getPosicion()
    {
        return posicion;
    }

    public void setNombre(String n)
    {
        nombre = n;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String toString()
    {
        return "si";
    }
    
}
