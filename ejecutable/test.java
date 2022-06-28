package ejecutable;

import modelo.Equipo;
import modelo.Jugador;
import vista.VentanaPrincipal;
import controlador.Controlador;

public class test 
{  
    public static void main(String[] args)
    {
        Equipo Equipo1 = new Equipo("Juan Pablo",1);
        Jugador Jugador1 = new Jugador("Roberto Carlos", 25,30, "defensa");
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentana, Equipo1);
    }
}
