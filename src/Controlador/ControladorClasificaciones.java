/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author rouss
 */

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.ClasificacionGeneralFrm;
import Modelo.ClasificacionesDAO;
import java.util.ArrayList;
import Modelo.Ciclista;
import Modelo.ClasificacionEtapa;
import Modelo.ResultadosDAO;
import java.awt.Color;
import java.io.File;
public class ControladorClasificaciones implements ActionListener{
    ClasificacionGeneralFrm VistaClasif;
    ClasificacionesDAO ClasifDAO;
        ResultadosDAO objDao=new  ResultadosDAO ();
    public ControladorClasificaciones(ClasificacionesDAO dao,ClasificacionGeneralFrm vista)
    {
        ClasifDAO=dao;
        VistaClasif=vista;
        VistaClasif.cmbClasificaciones.addActionListener(this);
        VistaClasif.cmbEtapas.addActionListener(this);
        llenarComboClasificaciones();
        llenarComboEtapas();
        
        VerClasificacionGeneral g=new VerClasificacionGeneral();
        g.mostrarResultados(ClasifDAO, VistaClasif);
    }
        public void llenarComboClasificaciones()
    {
        //Itera dentro del arreglo y devuelve el objeto referenciado
            VistaClasif.cmbClasificaciones.addItem("General");
            VistaClasif.cmbClasificaciones.addItem("Sprints");
            VistaClasif.cmbClasificaciones.addItem("Montaña");
            VistaClasif.cmbClasificaciones.addItem("Jovenes");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==VistaClasif.cmbClasificaciones)
       {
           elegirClasificacionAMostrar();
       }if(e.getSource()==VistaClasif.cmbEtapas ){
        mostarClasificacionEtapa();
        destacarLider("General");
    }
       
    }

    public void mostarClasificacionEtapa(){
        ClasificacionEtapa Ciclistas = new ClasificacionEtapa();
        if(VistaClasif.cmbClasificaciones.getSelectedItem().toString().equals("General"))
        {
            VistaClasif.lblClasificaciones.setText("CLASIFICACION "+VistaClasif.cmbEtapas.getSelectedItem().toString());
                Ciclistas.agregarlistaCiclista(objDao.mostrarDatos(VistaClasif.cmbEtapas.getSelectedItem().toString()));
                ArrayList<Ciclista> clasificacionE=Ciclistas.Ordenar();               
        Ciclista lider=clasificacionE.get(0);
        String matriz[][]=new String [clasificacionE.size()][6];
        matriz[0][0]=String.valueOf(1);
        matriz[0][1]=lider.getNombre();
        matriz[0][2]=String.valueOf(lider.getDorsal());
        matriz[0][3]=lider.getEquipo();
        matriz[0][4]=lider.getPais();
        matriz[0][5]=lider.tiempoEtapa();
        for(int i=1;i<clasificacionE.size();i++)
        {
            if(clasificacionE.get(i).isContinua())
            {
            matriz[i][0]=String.valueOf(i+1);
            matriz[i][1]=clasificacionE.get(i).getNombre();
            matriz[i][2]=String.valueOf(clasificacionE.get(i).getDorsal());
            matriz[i][3]=clasificacionE.get(i).getEquipo();
            matriz[i][4]=clasificacionE.get(i).getPais();
            matriz[i][5]=clasificacionE.get(i).diferenciaEtapa(lider);
        }}
        VistaClasif.jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"Pos","Corredor","Dorsal","Equipo","Pais","Tiempo"}));
    
        }
    }
    public void mostrarResultadosGeneral()
    {
        ArrayList<Ciclista> clasificacionG=ClasifDAO.mostrarClasificacionGeneral();
        Ciclista lider=clasificacionG.get(0);
        String matriz[][]=new String [clasificacionG.size()][6];
        matriz[0][0]=String.valueOf(1);
        matriz[0][1]=lider.getNombre();
        matriz[0][2]=String.valueOf(lider.getDorsal());
        matriz[0][3]=lider.getEquipo();
        matriz[0][4]=lider.getPais();
        matriz[0][5]=lider.tiempoGeneral();
        for(int i=1;i<clasificacionG.size();i++)
        {
            matriz[i][0]=String.valueOf(i+1);
            matriz[i][1]=clasificacionG.get(i).getNombre();
            matriz[i][2]=String.valueOf(clasificacionG.get(i).getDorsal());
            matriz[i][3]=clasificacionG.get(i).getEquipo();
            matriz[i][4]=clasificacionG.get(i).getPais();
            matriz[i][5]=clasificacionG.get(i).diferenciaGeneral(lider);
        }
        VistaClasif.jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"Pos","Corredor","Dorsal","Equipo","Pais","Tiempo"}));
    }
        public void mostrarResultadosJovenes()
    {
        ArrayList<Ciclista> clasificacionJ=ClasifDAO.mostrarClasificacionJovenes();
        Ciclista lider=clasificacionJ.get(0);
        String matriz[][]=new String [clasificacionJ.size()][6];
        matriz[0][0]=String.valueOf(1);
        matriz[0][1]=lider.getNombre();
        matriz[0][2]=String.valueOf(lider.getDorsal());
        matriz[0][3]=lider.getEquipo();
        matriz[0][4]=lider.getPais();
        matriz[0][5]=lider.tiempoGeneral();
        for(int i=1;i<clasificacionJ.size();i++)
        {
            matriz[i][0]=String.valueOf(i+1);
            matriz[i][1]=clasificacionJ.get(i).getNombre();
            matriz[i][2]=String.valueOf(clasificacionJ.get(i).getDorsal());
            matriz[i][3]=clasificacionJ.get(i).getEquipo();
            matriz[i][4]=clasificacionJ.get(i).getPais();
            matriz[i][5]=clasificacionJ.get(i).diferenciaGeneral(lider);
        }
        VistaClasif.jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"Pos","Corredor","Dorsal","Equipo","Pais","Tiempo"}));
    }
    public void mostrarResultadosMontaña()
    {
        ArrayList<Ciclista> clasificacionM=ClasifDAO.mostrarClasificacionPuntos("PuntosMontaña");
        String matriz[][]=new String [clasificacionM.size()][6];
        for(int i=0;i<clasificacionM.size();i++)
        {
            matriz[i][0]=String.valueOf(i+1);
            matriz[i][1]=clasificacionM.get(i).getNombre();
            matriz[i][2]=String.valueOf(clasificacionM.get(i).getDorsal());
            matriz[i][3]=clasificacionM.get(i).getEquipo();
            matriz[i][4]=clasificacionM.get(i).getPais();
            matriz[i][5]=String.valueOf(clasificacionM.get(i).getPuntos_m());
        }
        VistaClasif.jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"Pos","Corredor","Dorsal","Equipo","Pais","Puntos"}));
    }
    public void mostrarResultadosSprints()
    {
        ArrayList<Ciclista> clasificacionS=ClasifDAO.mostrarClasificacionPuntos("PuntosSprint");
        String matriz[][]=new String [clasificacionS.size()][6];
        for(int i=0;i<clasificacionS.size();i++)
        {
            matriz[i][0]=String.valueOf(i+1);
            matriz[i][1]=clasificacionS.get(i).getNombre();
            matriz[i][2]=String.valueOf(clasificacionS.get(i).getDorsal());
            matriz[i][3]=clasificacionS.get(i).getEquipo();
            matriz[i][4]=clasificacionS.get(i).getPais();
            matriz[i][5]=String.valueOf(clasificacionS.get(i).getPuntos_s());
        }
        VistaClasif.jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"Pos","Corredor","Dorsal","Equipo","Pais","Puntos"}));
    }
    public void elegirClasificacionAMostrar(){
        VerClasificacion clasif=new VerClasificacionGeneral();
        if(VistaClasif.cmbClasificaciones.getSelectedItem().toString().equals("General"))
        {
            clasif=new VerClasificacionGeneral();
        }
        else if(VistaClasif.cmbClasificaciones.getSelectedItem().toString().equals("Montaña"))
        {
            clasif=new VerClasificacionMontaña();
        }
        else if(VistaClasif.cmbClasificaciones.getSelectedItem().toString().equals("Sprints"))
        {
            clasif=new VerClasificacionSprints();
        }
        else if(VistaClasif.cmbClasificaciones.getSelectedItem().toString().equals("Jovenes"))
        {
            clasif=new VerClasificacionJovenes();
        }
        clasif.mostrarResultados(ClasifDAO, VistaClasif);
    }
    public void destacarLider(String clasificacion){
        VistaClasif.jtClasificaciones.setRowSelectionInterval(0, 0);
        if(clasificacion.equals("General"))
        {
            VistaClasif.jtClasificaciones.setSelectionForeground(Color.BLACK);
            VistaClasif.jtClasificaciones.setSelectionBackground(Color.YELLOW);
        }
        else if(clasificacion.equals("Montaña"))
        {
            VistaClasif.jtClasificaciones.setSelectionForeground(Color.WHITE);
            VistaClasif.jtClasificaciones.setSelectionBackground(Color.RED);
        }
        else if(clasificacion.equals("Sprints"))
        {
            VistaClasif.jtClasificaciones.setSelectionForeground(Color.BLACK);
            VistaClasif.jtClasificaciones.setSelectionBackground(Color.GREEN);
        }
        else if(clasificacion.equals("Jovenes"))
        {
            VistaClasif.jtClasificaciones.setSelectionForeground(Color.WHITE);
            VistaClasif.jtClasificaciones.setSelectionBackground(Color.BLACK);
        }
    }
    public void destacarLiderMontaña(){
        VistaClasif.jtClasificaciones.setRowSelectionInterval(0, 0);
        VistaClasif.jtClasificaciones.setSelectionForeground(Color.WHITE);
        VistaClasif.jtClasificaciones.setSelectionBackground(Color.RED);
    }
    public void destacarLiderSprints(){
        VistaClasif.jtClasificaciones.setRowSelectionInterval(0, 0);
        VistaClasif.jtClasificaciones.setSelectionForeground(Color.BLACK);
        VistaClasif.jtClasificaciones.setSelectionBackground(Color.GREEN);
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
           VistaClasif.cmbEtapas.addItem("Etapa"+etapa);
       }
       VistaClasif.cmbEtapas.setSelectedIndex(0);
    }
      
    
    
}
