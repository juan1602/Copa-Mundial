package modelo;

public class Equipo 
{ 
 
 //Atributos
 private String nombreEquipo;
 private int numJugadores;
 private Jugador[] jugadores;
 private String nGoleador;
 private int golesGoleador;
 private int edadesProm;

 //Metodos
 public Equipo(String nom, int n)
 {
     nombreEquipo = nom;
     numJugadores = n;
     jugadores = new Jugador[n];
 }

 public void cargar()
 {
     for(int i=0; i< numJugadores;i++)
     {
         jugadores[i] = crearJugador("",0,0,"");
     }
 }

 public Jugador crearJugador(String n, int g, int e, String p)
 {
     String nom = n;
     int goles = g;
     int edad = e;
     String posicion= p;
     return new Jugador(nom, goles, edad, posicion);
 }

 public int calcularTotalGoles()
 {
     int totalGolesEquipo = 0;
     for(int i=0; i<numJugadores; i++)
     {
         totalGolesEquipo += jugadores[i].getGoles();
         if(jugadores[i].getGoles() > golesGoleador)
         {
             golesGoleador = jugadores[i].getGoles();
             nGoleador = jugadores[i].getNombre();
         }
     }
     return totalGolesEquipo;
 }
 public int calcularMayorGoles()
 {
     for(int i=0; i<numJugadores; i++)
     {
         if(jugadores[i].getGoles() > golesGoleador)
         {
             golesGoleador = jugadores[i].getGoles();

         }
         
     }
     

     return golesGoleador;
 }
 public String calcularGoleador()
 {
     for(int i=0; i<numJugadores; i++)
     {
         if(jugadores[i].getGoles() > golesGoleador)
         {
             golesGoleador = jugadores[i].getGoles();
             nGoleador = jugadores[i].getNombre();
         }
     }
     return nGoleador;
 }
 public int calcularPromedioEdades()
 {
     for(int i=0; i<numJugadores; i++)
     {     
         edadesProm += jugadores[i].getEdad();
     }
     edadesProm= edadesProm/numJugadores;
     return edadesProm;
 }
 /*public int imprimirJugadores()
 {
     String nom;
     int goles;
     int edad;
     int codigo;
     String impresionJugador;
     String impresionEquipoJugadores;

     for(int i=0; i<numJugadores; i++)
     {     
         


     }
     
     return edadesProm;
 }*/

 public String toString()
 {
     return nombreEquipo + "\nCantidad de jugadores " + numJugadores + " \nEdad promedio del equipo " + edadesProm;
 }
}