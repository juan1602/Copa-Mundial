package modelo;

public class Paises 
{
    //Atributos
    private String nombrePais;
    private String nombreContinente ;
    private int numParticipaciones;
    private int numVictoriasCopa;

    //Métodos
    public Paises()
    {
        nombrePais = "";
        nombreContinente= "";
        numParticipaciones = 0;
        numVictoriasCopa= 0;
    }

    public Paises(String np, String nc, int numpa,int numvi)
    {
        nombrePais = np;
        nombreContinente = nc;
        numParticipaciones = numpa;
        numVictoriasCopa= numvi;
    }

    public void setNombrePais(String nombrePais) 
    {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais()
     {
        return nombrePais;
    }

    public void setNombreContinente(String nombreContinente) 
    {
        this.nombreContinente = nombreContinente;
    }
    public String getNombreContinente() 
    {
        return nombreContinente;
    }
    public int getNumParticipaciones() 
    {
        return numParticipaciones;
    }

    public void setNumParticipaciones(int numParticipaciones) 
    {
        this.numParticipaciones = numParticipaciones;
    }

    public int getNumVictoriasCopa() 
    {
        return numVictoriasCopa;
    }

    public void setNumVictoriasCopa(int numVictoriasCopa) 
    {
        this.numVictoriasCopa = numVictoriasCopa;
    }
    


    public String toString()
    {
        return "so";
    }

    
}
