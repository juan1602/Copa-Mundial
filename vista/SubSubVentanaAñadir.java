package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SubSubVentanaAñadir extends JDialog
{
    //----------------------
    //Atributos
    //----------------------
    private JLabel lbTitulo;
    private JButton btListo;
    private JButton btPrincipal;
    private JButton btSuplente;
    private JLabel lbnombre ;
    private JLabel lbPosicion;
    private JLabel lbedad;
    private JLabel lbnumGoles;
    public JTextField txtNombre;
    public JTextField txtPosicion;
    public JTextField txtEdad;
    public JTextField txtNumGoles;



    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public SubSubVentanaAñadir()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        //Creación y adición del elementos
        lbTitulo = new JLabel("Jugador",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(245,20,300,60);
        add(lbTitulo);

        //label
        lbnombre = new JLabel("Nombre y apellidos: ");
        lbnombre.setFont(new Font("Arial", Font.BOLD, 25));
        lbnombre.setBounds(45,160,300,60);
        add(lbnombre);
        //label
        lbPosicion = new JLabel("Posicion: ");
        lbPosicion.setFont(new Font("Arial", Font.BOLD, 25));
        lbPosicion.setBounds(45,220,300,60);
        add(lbPosicion);
        //label
        lbedad= new JLabel("Fecha de nacimiento: ");
        lbedad.setFont(new Font("Arial", Font.BOLD, 25));
        lbedad.setBounds(45,280,300,60);
        add(lbedad);

        //label
        lbnumGoles = new JLabel("Goles en mundial: ");
        lbnumGoles.setFont(new Font("Arial", Font.BOLD, 25));
        lbnumGoles.setBounds(45,340,300,60);
        add(lbnumGoles);

        
        //Crear y agregar Caja de texto nombre
        txtNombre= new JTextField();
        txtNombre.setBounds(300, 180, 120, 30);
        this.add(txtNombre);

        //Crear y agregar Caja de texto posisioc
        txtPosicion= new JTextField();
        txtPosicion.setBounds(300, 240, 120, 30);
        this.add(txtPosicion);

        //Crear y agregar Caja de texto edad
        txtEdad= new JTextField();
        txtEdad.setBounds(300, 295, 40, 30);
        this.add(txtEdad);

        //Crear y agregar Caja de texto goles
        txtNumGoles= new JTextField();
        txtNumGoles.setBounds(300, 360, 40, 30);
        this.add(txtNumGoles);

        //Creación y adición del elementos
        btListo= new JButton("LISTO");
        btListo.setFont(new Font("Arial", Font.BOLD, 20));
        btListo.setBounds(400,440,150,65);
        btListo.setActionCommand("listo5");
        add(btListo);

        //Creación y adición del elementos
        btPrincipal= new JButton("Titular");
        btPrincipal.setFont(new Font("Arial", Font.BOLD, 20));
        btPrincipal.setBounds(100,440,150,65);
        btPrincipal.setActionCommand("añadirPrincipal");
        add(btPrincipal);

        //Creación y adición del elementos
        btSuplente= new JButton("Suplente");
        btSuplente.setFont(new Font("Arial", Font.BOLD, 20));
        btSuplente.setBounds(250,440,150,65);
        btSuplente.setActionCommand("añadirSuplente");
        add(btSuplente);

        //Caracteristicas de la ventana
        setSize(720,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public String getNombre()
        {
            return txtNombre.getText();
        }
    
    public String getNumGoles()
    {
        return txtNumGoles.getText();
    }
    public String getPosicion()
    {
        return txtPosicion.getText();
    }
    public String getEdad()
    {
        return txtEdad.getText();
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btListo.addActionListener(pAL);
        btPrincipal.addActionListener(pAL);
        btSuplente.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }
}
