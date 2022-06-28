package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class SubVentanaPaises extends JDialog
{
    //----------------------
    //Atributos
    //----------------------
    private JButton btPais;
    private JButton btdTecnico;
    private JButton btEquipo;
    private JButton btAtras;
  

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public SubVentanaPaises()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        //Creación y adición del elementos
        btPais= new JButton("PAIS");
        btPais.setFont(new Font("Arial", Font.BOLD, 20));
        btPais.setBounds(20,20,80,40);
        btPais.setActionCommand("infoPais");
        add(btPais);
        //Creación y adición del elementos
        btdTecnico= new JButton("TECNICO");
        btdTecnico.setFont(new Font("Arial", Font.BOLD, 20));
        btdTecnico.setBounds(110,20,160,40);
        btdTecnico.setActionCommand("infoTecnico");
        add(btdTecnico);
        //Creación y adición del elementos
        btEquipo= new JButton("EQUIPO");
        btEquipo.setFont(new Font("Arial", Font.BOLD, 20));
        btEquipo.setBounds(280,20,150,40);
        btEquipo.setActionCommand("infoEquipo");
        add(btEquipo);
         //Creación y adición del elementos
         btAtras= new JButton("ATRAS");
         btAtras.setFont(new Font("Arial", Font.BOLD, 20));
         btAtras.setBounds(440,20,150,40);
         btAtras.setActionCommand("atras");
         add(btAtras);


        //Caracteristicas de la ventana
        setSize(620,100);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btPais.addActionListener(pAL);
        btdTecnico.addActionListener(pAL);
        btEquipo.addActionListener(pAL);
        btAtras.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    } 
    
}
