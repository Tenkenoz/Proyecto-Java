/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.MetasIntermedias;
import Modelo.MontañaDAO;
import Vista.MetasMontaña;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pc
 */
public class ControladorMontaña implements ActionListener {
            MontañaDAO objDao=new  MontañaDAO ();
     MetasMontaña objvista=new  MetasMontaña ();
    public ControladorMontaña(MontañaDAO dao,MetasMontaña  r1){
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
