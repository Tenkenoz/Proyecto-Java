/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author pc
 */
public class EtapasDAO {
  public void insertar(ClasificacionEtapa e, int a){
      File archivo = new File("Etapas/Etapa"+a+".txt");
      new File("Montaña/"+a+"Montaña.txt");
      new File("Sprints/"+a+"Sprints.txt");
      FileWriter escribir;
      PrintWriter imprimir;
      try{
          escribir=new FileWriter(archivo);
          imprimir = new PrintWriter(escribir);
          imprimir.println(e.getCiudad());
          imprimir.println(e.getKilometraje());
          escribir.close();
          imprimir.close();
      }catch(IOException ex){
          
      }
  }

  
}
