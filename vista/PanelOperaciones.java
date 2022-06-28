package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bConsultar;
    public JButton bSalir;
    private Color colorQatar1= new Color(250, 240, 171);
    private Color colorQatar2= new Color(241, 221, 97 );
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(colorQatar1);
        
        //Creación y adicion de los botones
 
        bConsultar = new JButton("CONSULTAR");
        bConsultar.setFont(new Font("Arial", BOLD, 40));
        bConsultar.setBounds(150,70,310,80);
        bConsultar.setBackground(colorQatar2);
        add(bConsultar);
        bConsultar.setActionCommand("consultar");

        bSalir = new JButton("SALIR");
        bSalir.setFont(new Font("Arial", BOLD, 40));
        bSalir.setBounds(590,70,310,80);
        bSalir.setBackground(colorQatar2);
        add(bSalir);
        bSalir.setActionCommand("salir");
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        bConsultar.addActionListener(pAL);
        bSalir.addActionListener(pAL);
    }
}
