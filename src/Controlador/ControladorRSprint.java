/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author rouss
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.RSprintFrm;
import Modelo.Ciclista;
import Modelo.CiclistaDAO;
import java.io.File;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
public class ControladorRSprint implements ActionListener{
    RSprintFrm objVista;
    CiclistaDAO objDAO;

    public ControladorRSprint(RSprintFrm vista, CiclistaDAO dao) {
        objVista = vista;
        objDAO = dao;
        objVista.btnIngresar.addActionListener(this);
        objVista.cmbEtapa.addActionListener(this);
        llenarComboEtapas();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objVista.btnIngresar)
        {
            asignarPuntos();
        }
        if(e.getSource()==objVista.cmbEtapa)
        {
            llenarComboMetas();
        }
                    
    }
    public void asignarPuntos()
    {
        ArrayList<Ciclista> ciclistas=objDAO.MostrarCiclistasRegistrados();
        int dorsal1=Integer.parseInt(objVista.txtPrimero.getText());
        int dorsal2=Integer.parseInt(objVista.txtSegundo.getText());
        int dorsal3=Integer.parseInt(objVista.txtTercero.getText());
        for(Ciclista c:ciclistas)
        {
            if(c.getDorsal()==dorsal1)
            {
                sumarPuntosSprint(c,48);
                objDAO.actualizarCiclista(c);
            }
            else if(c.getDorsal()==dorsal2)
            {
                sumarPuntosSprint(c,36);
                objDAO.actualizarCiclista(c);
            }
            else if(c.getDorsal()==dorsal3)
            {
                sumarPuntosSprint(c,24);
                objDAO.actualizarCiclista(c);
            }
        }
        objVista.txtPrimero.setText("");
        objVista.txtSegundo.setText("");
        objVista.txtTercero.setText("");
    }
    public void llenarComboEtapas(){
      File carpeta = new File("Etapas"); 
      File[] lista = carpeta.listFiles();
       String etapas[]=new String[lista.length];
       for(int i=0;i<lista.length;i++)
       {
       etapas[i]=String.valueOf(i+1);
       }
       for(String etapa:etapas)
       {
           objVista.cmbEtapa.addItem("Etapa"+etapa);
       }
       objVista.cmbEtapa.setSelectedIndex(0);
   }
   public void llenarComboMetas(){
       objVista.cmbMeta.removeAllItems();
       String etapa=objVista.cmbEtapa.getSelectedItem().toString();
       File sprint = new File("Sprints/"+etapa+"Sprint.txt");
       FileReader fr;
       Scanner sc;
       try{
           fr=new FileReader(sprint);
           sc=new Scanner(fr);
           while(sc.hasNextLine())
           {
               objVista.cmbMeta.addItem(sc.next());
               sc.nextLine();
           }
           sc.close();
       }
       catch(IOException e){
           
       }
   }
      public void sumarPuntosSprint(Ciclista c,int puntos)
    {
        int puntos_s=c.getPuntos_s();
        puntos_s+=puntos;
        c.setPuntos_s(puntos_s);
    }
}
