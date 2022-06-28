package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class VentanaPaises extends JDialog
{
    //----------------------
    //Atributos
    //----------------------


    public String[] listaPaises= {"Qatar","Alemania","Dinamarca","Brasil","Francia","Bélgica","Croacia","España","Serbia","Inglaterra","Suiza","Países bajos","Argentina",
    "Irán","Corea del Sur","Japón","Arabia Saudí","Ecuador","Uruguay","Canadá","Estados Unidos","México","Ghana","Senegal","Polonia","Portugal","Túnez","Marruecos",
    "Camerún","Gales","Australia"}; 
    private JLabel lbTitulo;
    private JButton btListo;
    private JButton btInformacion;
    private JComboBox lSeleccionPaises= new JComboBox<>(listaPaises);
    private JLabel lblNumeroPaises;
    public int numeroPaises;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPaises()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        //Creación y adición del elementos
        lbTitulo = new JLabel("LISTA PAISES",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(45,10,200,20);
        add(lbTitulo);
        //Creación y adición del elementos
        btListo= new JButton("LISTO");
        btListo.setFont(new Font("Arial", Font.BOLD, 25));
        btListo.setBounds(40,240,200,25);
        btListo.setActionCommand("listo");
        add(btListo);

        //Creación y adición del elementos
        btInformacion= new JButton("INFORMACION");
        btInformacion.setFont(new Font("Arial", Font.BOLD, 20));
        btInformacion.setBounds(40,200,200,25);
        btInformacion.setActionCommand("info");
        add(btInformacion);
               
        //Creación y adicion de lista desplegable
        lSeleccionPaises.setBounds(40,70, 200, 50);
        lSeleccionPaises.setSelectedItem("");
        add(lSeleccionPaises);



        //Caracteristicas de la ventana
        setSize(300,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);



    }

    //-------------------
    //----METODOS--------
    //-------------------

    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btListo.addActionListener(pAL);
        btInformacion.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }   

    public String getlSeleccionPaises()
    {
        return (String) lSeleccionPaises.getSelectedItem();
    }
    
}
