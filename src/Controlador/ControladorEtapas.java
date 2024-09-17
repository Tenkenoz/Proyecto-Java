/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ClasificacionEtapa;
import Modelo.EtapasDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.FrmRegistoEtapas;

/**
 *
 * @author pc
 */
public class ControladorEtapas implements ActionListener  {
    EtapasDAO objetoDAO= new EtapasDAO();
    int a = 0,b=0;
FrmRegistoEtapas objetoVista= new FrmRegistoEtapas();

public ControladorEtapas(EtapasDAO a,FrmRegistoEtapas e){
    objetoDAO = a;
    objetoVista= e;
    objetoVista.btnRegistrar.addActionListener(this);
    objetoVista.btnOk.addActionListener(this);
}
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.btnOk){
            a=Integer.parseInt(objetoVista.txtNumEtapas.getText());
        objetoVista.btnOk.setVisible(false);
        objetoVista.txtNumEtapas.setVisible(false);
        objetoVista.lblEtapas.setText("Ingrese las "+a+" atapas");
        }if(e.getSource()==objetoVista.btnRegistrar && a>b){
            b=b+1;
         ClasificacionEtapa etapa=new ClasificacionEtapa(objetoVista.txtCiudad.getText(),Integer.parseInt(objetoVista.txtKilometraje.getText()));  
        objetoDAO.insertar(etapa, b);
        objetoVista.txtCiudad.setText("");
        objetoVista.txtKilometraje.setText("");
        }else if(e.getSource()==objetoVista.btnRegistrar && a<=b){
            objetoVista.lblEtapas.setText("Ya no puede ingresar mas etapas");
        }
        }
    
    
    
}
