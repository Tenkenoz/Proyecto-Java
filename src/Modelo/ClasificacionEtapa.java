/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rouss
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
public class ClasificacionEtapa extends Clasificacion{
    protected String ciudad;
    protected int kilometraje;



    public ClasificacionEtapa(String ciudad, int kilometraje)
    {
        this.ciudad = ciudad;
        this.kilometraje = kilometraje;
    }
    
        public ClasificacionEtapa()
    {
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
        
    public ArrayList<Ciclista> Ordenar(){
        Collections.sort(ciclistas, new OrdenarTiemposEtapa());
        return ciclistas;
    }
    public void escogerGanador(Ciclista winner)
    {
        this.setLider(winner);
    }

//    @Override
//    public Ciclista getLider() {
//        return lider;
//    }
//
//    @Override
//    public void setLider(Ciclista lider) {
//        this.lider = lider;
//    }
//
//    public List<Ciclista> getCiclistas() {
//        return ciclistas;
//    }
//
//    public void setCiclistas(List<Ciclista> ciclistas) {
//        this.ciclistas = ciclistas;
//    }
//    
//    

//    public void Ordenar(){
//        Collections.sort(ciclistas, new OrdenarTiemposEtapa());
//    }
//    public void escogerGanador(Ciclista winner)
//    {
//        this.setLider(winner);
//    }
//    public void mostrarClasificacion()
//    {
//        this.Ordenar();
//        int i;
//        Ciclista aux=new Ciclista();
//        Ciclista ganador=this.definirLider();
////        ganador.MostrarGanadorEtapa();
//        int tiempo_l=ganador.getTiempo_e();
//        for(i=1;i<ciclistas.size();i++)
//        {
//            aux=(Ciclista)ciclistas.get(i);
////            aux.DiferenciaconGanadorEtapa(tiempo_l);
//        }
//    }
}
