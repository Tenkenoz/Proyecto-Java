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
public class VerClasificacionMontaña implements VerClasificacion{
    @Override
    public void mostrarResultados(ClasificacionesDAO dao, ClasificacionGeneralFrm vista) {
        vista.lblClasificaciones.setText("Clasificacion de la Montaña");
        ArrayList<Ciclista> clasificacionM=dao.mostrarClasificacionPuntos("PuntosMontaña");
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
        vista.jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"Pos","Corredor","Dorsal","Equipo","Pais","Puntos"}));
        vista.jtClasificaciones.setRowSelectionInterval(0, 0);
        vista.jtClasificaciones.setSelectionForeground(Color.WHITE);
        vista.jtClasificaciones.setSelectionBackground(Color.RED);
    }
}
