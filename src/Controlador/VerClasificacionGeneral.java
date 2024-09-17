/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Ciclista;
import Modelo.ClasificacionesDAO;
import Vista.ClasificacionGeneralFrm;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author rouss
 */
public class VerClasificacionGeneral implements VerClasificacion{
    private VerTiemposGeneral vt=new VerTiemposGeneral();
    @Override
    public void mostrarResultados(ClasificacionesDAO dao, ClasificacionGeneralFrm vista) {
        vista.lblClasificaciones.setText("Clasificacion General");
        ArrayList<Ciclista> clasificacionG=dao.mostrarClasificacionGeneral();
        Ciclista lider=clasificacionG.get(0);
        String matriz[][]=new String [clasificacionG.size()][6];
        matriz[0][0]=String.valueOf(1);
        matriz[0][1]=lider.getNombre();
        matriz[0][2]=String.valueOf(lider.getDorsal());
        matriz[0][3]=lider.getEquipo();
        matriz[0][4]=lider.getPais();
        matriz[0][5]=vt.verTiempoCompleto(lider);
        for(int i=1;i<clasificacionG.size();i++)
        {
            if(clasificacionG.get(i).isContinua())
            {
            matriz[i][0]=String.valueOf(i+1);
            matriz[i][1]=clasificacionG.get(i).getNombre();
            matriz[i][2]=String.valueOf(clasificacionG.get(i).getDorsal());
            matriz[i][3]=clasificacionG.get(i).getEquipo();
            matriz[i][4]=clasificacionG.get(i).getPais();
            matriz[i][5]=vt.verDiferencia(clasificacionG.get(i),lider);
            }
        }
        vista.jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"Pos","Corredor","Dorsal","Equipo","Pais","Tiempo"}));
        vista.jtClasificaciones.setRowSelectionInterval(0, 0);
        vista.jtClasificaciones.setSelectionForeground(Color.BLACK);
        vista.jtClasificaciones.setSelectionBackground(Color.YELLOW);
    }
}       
