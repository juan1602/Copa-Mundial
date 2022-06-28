package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Equipo;
///import modelo.Jugador;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
//----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Equipo model;
    int n=0;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Equipo pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        
        if(comando.equals("consultar"))
        {   
            venPrin.crearVentanaPaises();
            this.venPrin.miVentanaPaises.agregarOyentesBotones(this); 
        }
        
        if(comando.equals("salir"))
        {
            System.exit(0);
        }

        if(comando.equals("listo"))
        {
            venPrin.miVentanaPaises.cerrarDialogo();
            venPrin.setVisible(true); 
        }
        if(comando.equals("listo2"))
        {
            venPrin.miSubVentanaPaisesTecnico.cerrarDialogo();
        }
        if(comando.equals("listo3"))
        {
            venPrin.miSubVentanaPaisesEquipo.cerrarDialogo();
        }
        if(comando.equals("listo4"))
        {
            venPrin.miSubVentanaPaisesPais.cerrarDialogo();
        }
        if(comando.equals("listo5"))
        {
            venPrin.miSubSubVentanaAñadir.cerrarDialogo();
        }
        if(comando.equals("info"))
        {
           venPrin.miVentanaPaises.getlSeleccionPaises();
           venPrin.crearSubVentanaPaises();
           this.venPrin.miSubVentanaPaises.agregarOyentesBotones(this);  
        }
        if(comando.equals("infoEquipo"))
        {
            venPrin.crearSubVentanaPaisesEquipo();
            this.venPrin.miSubVentanaPaisesEquipo.agregarOyentesBotones(this);
        }
        if(comando.equals("atras"))
        {
            venPrin.miSubVentanaPaises.cerrarDialogo();
        }
        if(comando.equals("infoPais"))
        {
            venPrin.crearSubVentanaPaisesPais();
            venPrin.miSubVentanaPaisesPais.txtNombreContinente.setText("");
            venPrin.miSubVentanaPaisesPais.txtNumParticipaciones.setText("");
            venPrin.miSubVentanaPaisesPais.txtVictoriasCopa.setText("");
            this.venPrin.miSubVentanaPaisesPais.agregarOyentesBotones(this);
            for(int i=0; i<33;i++)
            {
                if(venPrin.miVentanaPaises.getlSeleccionPaises().equals(venPrin.miVentanaPaises.listaPaises[i]))
                {
                    venPrin.miSubVentanaPaisesPais.lblNumeroPaises.setText(venPrin.miVentanaPaises.listaPaises[i]);
                }
            }
        }
        if(comando.equals("infoTecnico"))
        {
            venPrin.crearSubVentanaPaisesTecnico();
            venPrin.miSubVentanaPaisesTecnico.txtNombreContinente.setText("");
            venPrin.miSubVentanaPaisesTecnico.txtNumParticipaciones.setText("");
            venPrin.miSubVentanaPaisesTecnico.txtVictoriasCopa.setText("");
            this.venPrin.miSubVentanaPaisesTecnico.agregarOyentesBotones(this);
        }
        if(comando.equals("añadir"))
        {
            venPrin.crearSubSubVentanaAñadir();
            venPrin.miSubSubVentanaAñadir.txtNombre.setText("");
            venPrin.miSubSubVentanaAñadir.txtPosicion.setText("");
            venPrin.miSubSubVentanaAñadir.txtEdad.setText("");
            venPrin.miSubSubVentanaAñadir.txtNumGoles.setText("");
            this.venPrin.miSubSubVentanaAñadir.agregarOyentesBotones(this);
        }
        if(comando.equals("añadirPrincipal"))
        {

            //venPrin.miSubDialogoPaisesEquipo.listaPrincipales[n].concat(venPrin.miSubSubDialogoAñadir.getNombre());
            venPrin.miSubVentanaPaisesEquipo.seleccionTitulares.removeItemAt(n);
            venPrin.miSubVentanaPaisesEquipo.seleccionTitulares.insertItemAt(venPrin.miSubSubVentanaAñadir.getNombre(), n);
            venPrin.miSubVentanaPaisesEquipo.seleccionTitulares.setSelectedIndex(n);
            //venPrin.miSubDialogoPaisesEquipo.add(venPrin.miSubDialogoPaisesEquipo.seleccionPrincipales);
    
            n++;
        }
        if(comando.equals("añadirSuplente"))
        {
            venPrin.miSubVentanaPaisesEquipo.seleccionSuplentes.removeItemAt(n);
            venPrin.miSubVentanaPaisesEquipo.seleccionSuplentes.insertItemAt(venPrin.miSubSubVentanaAñadir.getNombre(), n);
            venPrin.miSubVentanaPaisesEquipo.seleccionSuplentes.setSelectedIndex(n);
        } 

}
}
