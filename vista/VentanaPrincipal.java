package vista;
import javax.swing.JFrame;

import java.awt.Color;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public VentanaPaises miVentanaPaises;
    public SubVentanaPaises miSubVentanaPaises;
    public SubVentanaPaisesPais miSubVentanaPaisesPais;
    public SubVentanaPaisesTecnico miSubVentanaPaisesTecnico;
    public SubVentanaPaisesEquipo miSubVentanaPaisesEquipo;
    public SubSubVentanaAñadir miSubSubVentanaAñadir;

    public Color colorQatar2= new Color(52, 122, 253);

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(0,0,1100,400);
        add(miPanelEntradaDatos);
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(00,405,1100,400);
        add(miPanelOperaciones);
        
        miVentanaPaises = null;
        
        //Caracteristicas de la ventana
        setTitle("Mundial Qatar 2022");
        setSize(1080,720);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    //Crear ventana dialogo Mover
    public void crearVentanaPaises()
    {
        miVentanaPaises = new VentanaPaises();
    }
    public void crearSubVentanaPaises()
    {
        miSubVentanaPaises = new SubVentanaPaises();
    }
    public void crearSubVentanaPaisesEquipo()
    {
        miSubVentanaPaisesEquipo = new SubVentanaPaisesEquipo();
    }
    public void crearSubVentanaPaisesPais()
    {
        miSubVentanaPaisesPais = new SubVentanaPaisesPais();
    }
    public void crearSubVentanaPaisesTecnico()
    {
        miSubVentanaPaisesTecnico = new SubVentanaPaisesTecnico();
    }
    public void crearSubSubVentanaAñadir()
    {
        miSubSubVentanaAñadir = new SubSubVentanaAñadir();
    }
    public void cerrarDialogo()
    {
        this.dispose();
    } 

}