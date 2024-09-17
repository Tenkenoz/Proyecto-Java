/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

/**
 *
 * @author rouss
 */
import Modelo.Ciclista;
public interface VerTiempos {
    public String verTiempoCompleto(Ciclista c);
    public String verDiferencia(Ciclista c,Ciclista lider);
}
