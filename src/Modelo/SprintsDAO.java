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
public class SprintsDAO {
          public void insertar(String a,MetasIntermedias una,MetasIntermedias dos,MetasIntermedias tres){
      File archivo =new File("Sprints/"+a+"Sprint.txt");
      FileWriter escribir;
      PrintWriter imprimir;
      try{
          escribir=new FileWriter(archivo);
          imprimir = new PrintWriter(escribir);
          imprimir.printf("%3s %3d %n",una.getNombre(),una.getPuntos());
          imprimir.printf("%3s %3d %n",dos.getNombre(),dos.getPuntos());
          imprimir.printf("%3s %3d %n",tres.getNombre(),tres.getPuntos());
          escribir.close();
          imprimir.close();
      }catch(IOException ex){
          
      }
  }
}
