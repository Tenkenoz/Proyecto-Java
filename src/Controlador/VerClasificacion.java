/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

/**
 *
 * @author rouss
 */
import Modelo.ClasificacionesDAO;
import Vista.ClasificacionGeneralFrm;
public interface VerClasificacion {
    public void mostrarResultados(ClasificacionesDAO dao,ClasificacionGeneralFrm vista);
}
