/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion;

/**
 *
 * @author rouss
 */
import java.util.Comparator;
public class OrdenarTiemposGeneral implements Comparator<Ciclista>{
    @Override
    public int compare(Ciclista c1, Ciclista c2){
        return c1.getTiempo_g()-c2.getTiempo_g();
    }
}