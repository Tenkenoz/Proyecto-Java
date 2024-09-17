/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Ciclista;
import Modelo.CiclistaDAO;
import Modelo.MetasIntermedias;
import Modelo.ResultadosDAO;
import Modelo.SprintsDAO;
import Vista.MetasSprint;
import Vista.RegistroRFrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pc
 */
public class ControladorSprints implements ActionListener {
        SprintsDAO objDao=new  SprintsDAO ();
     MetasSprint objvista=new  MetasSprint ();
     CiclistaDAO c_dao=new CiclistaDAO(); 
    public ControladorSprints(SprintsDAO dao,MetasSprint  r1){
        this.objDao=dao;
        this.objvista=r1;   
       objvista.btnIngresar.addActionListener(this);

    }
    
    
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objvista.btnIngresar){
        
        String numEtapa= objvista.jComboBox1.getSelectedItem().toString();
        MetasIntermedias meta1= new MetasIntermedias(objvista.txtNombre1.getText(),Integer.parseInt(objvista.lblPuntos1.getText()));
        MetasIntermedias meta2= new MetasIntermedias(objvista.txtNombre2.getText(),Integer.parseInt(objvista.lblPuntos2.getText()));
        MetasIntermedias meta3= new MetasIntermedias(objvista.txtNombre3.getText(),Integer.parseInt(objvista.lblPuntos3.getText()));

              objDao.insertar(numEtapa,meta1,meta2,meta3);
        objvista.txtNombre1.setText("");
        objvista.txtNombre2.setText("");
        objvista.txtNombre3.setText(""); 
        }}
}
