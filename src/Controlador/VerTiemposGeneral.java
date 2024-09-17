/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Ciclista;

/**
 *
 * @author rouss
 */
import Modelo.Ciclista;
public class VerTiemposGeneral implements VerTiempos{

    @Override
    public String verTiempoCompleto(Ciclista c) {
        int hr,min,seg=0;
        int tiempo_g=c.getTiempo_g();
        hr=(tiempo_g/3600);
        min=(tiempo_g%3600)/60;
        seg=(tiempo_g%3600)%60;
        return hr+":"+min+":"+seg;
    }

    @Override
    public String verDiferencia(Ciclista c, Ciclista lider) {
        int tiempo_lider=lider.getTiempo_g();
        int hr,min,seg=0;
        int tiempo_g=c.getTiempo_g();
        int diferencia=tiempo_g-tiempo_lider;
        hr=(diferencia/3600);
        min=(diferencia%3600)/60;
        seg=(diferencia%3600)%60;
        if(hr==0&&diferencia!=0)
        {
            return "   +"+min+":"+seg;
        }
        else if(diferencia<60&&diferencia!=0)
        {
            return "      +"+seg;
        }
        else if(diferencia==0)
        {
            return "m.t";
        }
        else{
            return "+"+hr+":"+min+":"+seg;
        }}
    
}
