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
public class VerClasificacionSprints implements VerClasificacion{
    @Override
    public void mostrarResultados(ClasificacionesDAO dao, ClasificacionGeneralFrm vista) {
        vista.lblClasificaciones.setText("Clasificacion Sprints");
        ArrayList<Ciclista> clasificacionS=dao.mostrarClasificacionPuntos("PuntosSprint");
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
        vista.jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"Pos","Corredor","Dorsal","Equipo","Pais","Puntos"}));
        vista.jtClasificaciones.setRowSelectionInterval(0, 0);
        vista.jtClasificaciones.setSelectionForeground(Color.WHITE);
        vista.jtClasificaciones.setSelectionBackground(Color.GREEN);
    }
}