package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SubVentanaPaisesPais extends JDialog
{
    //----------------------
    //Atributos
    //----------------------


    private JLabel lbTitulo;
    private JButton btListo; 
    public JLabel lblNumeroPaises;
    private JLabel lbnombreContinente ;
    private JLabel lbnumParticipaciones;
    private JLabel lbnumVictoriasCopa;
    public JTextField txtNombreContinente;
    public JTextField txtNumParticipaciones;
    public JTextField txtVictoriasCopa;




    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public SubVentanaPaisesPais()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
      
        //label
        lblNumeroPaises = new JLabel("");
        lblNumeroPaises.setFont(new Font("Arial", Font.BOLD, 45));
        lblNumeroPaises.setBounds(245,20,300,60);
        add(lblNumeroPaises);

        //label
        lbnombreContinente = new JLabel("Continente: ");
        lbnombreContinente.setFont(new Font("Arial", Font.BOLD, 25));
        lbnombreContinente.setBounds(45,160,300,60);
        add(lbnombreContinente);
        //label
        lbnumParticipaciones = new JLabel("Mundiales jugados: ");
        lbnumParticipaciones.setFont(new Font("Arial", Font.BOLD, 25));
        lbnumParticipaciones.setBounds(45,220,300,60);
        add(lbnumParticipaciones);
        //label
        lbnumVictoriasCopa = new JLabel("Mundiales Ganados: ");
        lbnumVictoriasCopa.setFont(new Font("Arial", Font.BOLD, 25));
        lbnumVictoriasCopa.setBounds(45,280,300,60);
        add(lbnumVictoriasCopa);

        //Crear y agregar Caja de texto X
        txtNombreContinente= new JTextField();
        txtNombreContinente.setBounds(300, 180, 120, 30);
        this.add(txtNombreContinente);

        //Crear y agregar Caja de texto X
        txtNumParticipaciones= new JTextField();
        txtNumParticipaciones.setBounds(300, 240, 120, 30);
        this.add(txtNumParticipaciones);

        //Crear y agregar Caja de texto X
        txtVictoriasCopa= new JTextField();
        txtVictoriasCopa.setBounds(300, 300, 20, 30);
        this.add(txtVictoriasCopa);

        //Creación y adición del elementos
        btListo= new JButton("LISTO");
        btListo.setFont(new Font("Arial", Font.BOLD, 25));
        btListo.setBounds(240,440,200,65);
        btListo.setActionCommand("listo4");
        add(btListo);
        
        //Caracteristicas de la ventana
        setSize(720,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public String getNombreContinente()
        {
            return txtNombreContinente.getText();
        }
    
    public String getNumParticipaciones()
    {
        return txtNumParticipaciones.getText();
    }
    public String getVictoriasCopa()
    {
        return txtVictoriasCopa.getText();
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btListo.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }   
}
