/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Ciclista;
import Modelo.CiclistaDAO;
import Vista.RegistroRFrm;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class IngresoResultados implements Subject{
           
    
    @Override
    public void notificarCiclista(RegistroRFrm  objvista){

        validacionDatos(objvista);
        CiclistaDAO c_dao=new CiclistaDAO();
        ArrayList<Ciclista> ciclistas=c_dao.MostrarCiclistasRegistrados();
        int hr=Integer.parseInt(objvista.txtHoras.getText());
        int min=Integer.parseInt(objvista.txtMinutos.getText());
        int seg=Integer.parseInt(objvista.txtSegundos.getText());
        int tiempo=(3600*hr)+(60*min)+seg;
        int dorsal=Integer.parseInt(objvista.txtDorsal.getText());
        for(Ciclista c:ciclistas){
            if(c.getDorsal()==dorsal)
            {
                sumarTiempoGeneral(c,tiempo);
                c_dao.actualizarCiclista(c);
            }
        }
        objvista.txtHoras.setText("");
        objvista.txtDorsal.setText("");
        objvista.txtMinutos.setText("");
        objvista.txtSegundos.setText("");
       }

       private void validacionDatos(RegistroRFrm  objvista){
                   if(objvista.txtHoras.getText().equals(""))
        {
           objvista.txtHoras.setText("0");
        }
        if(objvista.txtMinutos.getText().equals(""))
        {
           objvista.txtMinutos.setText("0");
        }
        if(objvista.txtSegundos.getText().equals(""))
        {
           objvista.txtSegundos.setText("0");
        }
       }
       
               public void sumarTiempoGeneral(Ciclista c,int tiempo)
    {
        int tiempo_g=c.getTiempo_g();
        tiempo_g+=tiempo;
        c.setTiempo_g(tiempo_g);    
    }
}
