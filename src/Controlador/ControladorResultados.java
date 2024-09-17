/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.CarreraDAO;
import Modelo.Ciclista;
import Modelo.CiclistaDAO;
import Modelo.Equipo;
import Modelo.ResultadosDAO;
import Vista.RegistroEquiposFrm;
import Vista.RegistroRFrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import Modelo.Ciclista;
/**
 *
 * @author alexa
 */
public class ControladorResultados implements ActionListener {
    ResultadosDAO objDao=new  ResultadosDAO ();
     RegistroRFrm objvista=new  RegistroRFrm ();
     CiclistaDAO c_dao=new CiclistaDAO();
     IngresoResultados cr= new IngresoResultados();
    public ControladorResultados(ResultadosDAO dao,RegistroRFrm  r1, CiclistaDAO r2){
        this.objDao=dao;
        this.objvista=r1;   
        this.c_dao = r2;
        objvista.btnIngresar.addActionListener(this);
        objvista.btnMostrar.addActionListener(this);
        objvista.rbAbandona.addActionListener(this);
    }
    
    
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objvista.btnIngresar && !objvista.rbAbandona.isSelected() ){
        
        String numEtapa= objvista.jComboBox1.getSelectedItem().toString();
        Ciclista ciclista= new Ciclista();
        ArrayList<Ciclista> ciclistas=c_dao.MostrarCiclistasRegistrados();
        Iterator it = ciclistas.iterator();
        while(it.hasNext()){
          ciclista = (Ciclista) it.next();
          if(ciclista.getDorsal()==Integer.parseInt(objvista.txtDorsal.getText())){
              objDao.insertar(ciclista, numEtapa,objvista.txtHoras.getText(),objvista.txtMinutos.getText(),objvista.txtSegundos.getText(),true);
          }
        }
        llenarTabla();
        cr.notificarCiclista(objvista);
        
        
        }if(e.getSource()==objvista.btnMostrar){
            llenarTabla();
        }if(e.getSource()==objvista.rbAbandona )
      {
          confirmarAbandono();
      }
        if(e.getSource()==objvista.btnIngresar && objvista.rbAbandona.isSelected()){
            abandonar();
        }
      
    }
    

    
    
    
       public void llenarTabla() {
    ArrayList<Ciclista> listaCiclista = objDao.mostrarDatos(objvista.jComboBox1.getSelectedItem().toString());
    String[][] matriz = new String[listaCiclista.size()][4];
    for (int i = 0; i < listaCiclista.size(); i++) {
        Ciclista ciclista = listaCiclista.get(i);
        matriz[i][0] = ciclista.getNombre();
        matriz[i][1] = ciclista.getPais();
        matriz[i][2] = ciclista.getEquipo();
        matriz[i][3] = String.valueOf(ciclista.getDorsal());
  
    }
    // Configurar el modelo de la tabla una sola vez fuera del bucle
    objvista.tableCiclista.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String[]{"Nombre", "Pais","Equipo","Dorsal"}
    ));
}

               public void confirmarAbandono()
       {

           if(objvista.rbAbandona.isSelected())
           {
               objvista.txtHoras.setVisible(false);
               objvista.txtMinutos.setVisible(false);
               objvista.txtSegundos.setVisible(false);     
          }
         
               
           
           else
           {
               objvista.txtHoras.setVisible(true);
               objvista.txtMinutos.setVisible(true);
               objvista.txtSegundos.setVisible(true);
           }
       }
               
       public void abandonar(){
                      CiclistaDAO c_dao=new CiclistaDAO();
           Ciclista ciclistas = new Ciclista();
        ArrayList<Ciclista> ciclista=c_dao.MostrarCiclistasRegistrados();
        Iterator it = ciclista.iterator();

           while(it.hasNext()){
          
          ciclistas=(Ciclista) it.next();
          if(ciclistas.getDorsal()==Integer.parseInt(objvista.txtDorsal.getText())){
              objDao.insertar(ciclistas, objvista.jComboBox1.getSelectedItem().toString(),"999","0","0",false);
              ciclistas.setContinua(false);
              c_dao.actualizarCiclista(ciclistas);
              

          }
        }
       }
       }

