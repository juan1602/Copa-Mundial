package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;



public class SubVentanaPaisesEquipo extends JDialog
{
    //----------------------
    //Atributos
    //----------------------


    private JLabel lbTitulo;
    private JButton btListo;
    private JButton btAñadir;
    private JLabel suplentes;
    private JLabel principales;
    public String [] listaTitulares={"","","","","","","","","","",""};
    public String [] listaSuplentes={"","","","","","","","","","",""};
    public JComboBox seleccionTitulares;
    public JComboBox seleccionSuplentes;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public SubVentanaPaisesEquipo()
    {
        seleccionTitulares= new JComboBox(listaTitulares);
        seleccionSuplentes= new JComboBox(listaSuplentes);
        //Definición del contenedor de la ventana
        setLayout(null);
        
        //Creación y adición del elementos
        lbTitulo = new JLabel("LISTA JUGADORES",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(145,10,400,20);
        add(lbTitulo);

        //Creación y adición del elementos
        principales = new JLabel("Jugadores Titulares",JLabel.CENTER);
        principales.setFont(new Font("Arial", Font.BOLD, 25));
        principales.setBounds(45,100,400,40);
        add(principales);

        //Creación y adición del elementos
        suplentes = new JLabel("Jugadores suplentes",JLabel.CENTER);
        suplentes.setFont(new Font("Arial", Font.BOLD, 25));
        suplentes.setBounds(45,250,400,40);
        add(suplentes);

        seleccionTitulares.setBounds(75,170, 300, 50);
        add(seleccionTitulares);
        
        

        seleccionSuplentes.setBounds(75,320, 300, 50);
        add(seleccionSuplentes);


        //Creación y adición del elementos
        btListo= new JButton("LISTO");
        btListo.setFont(new Font("Arial", Font.BOLD, 25));
        btListo.setBounds(140,540,200,25);
        btListo.setActionCommand("listo3");
        add(btListo);
        
        //Creación y adición del elementos
        btAñadir= new JButton("AÑADIR");
        btAñadir.setFont(new Font("Arial", Font.BOLD, 25));
        btAñadir.setBounds(140,500,200,25);
        btAñadir.setActionCommand("añadir");
        add(btAñadir);

        //Caracteristicas de la ventana
        setSize(720,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btListo.addActionListener(pAL);
        btAñadir.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }  
    
}
