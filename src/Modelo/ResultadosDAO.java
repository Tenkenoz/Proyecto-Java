/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class ResultadosDAO {
      public void insertar(Ciclista e, String a,String hora,String minutos,String segundos,boolean continua){
      String z="NoContinua";
          if(continua){
           z="Continua";
      }
      File archivo = new File("Etapas/"+a+".txt");
      FileWriter escribir;
      PrintWriter imprimir;
      try{
          escribir=new FileWriter(archivo,true);
          imprimir = new PrintWriter(escribir);
          imprimir.printf("%3s %3s %3s %3s %3s %3s %3s %3s %n",e.getNombre(),e.getPais(),e.getEquipo(),z, e.getDorsal(),hora,minutos,segundos);
          escribir.close();
          imprimir.close();
      }catch(IOException ex){
          
      }
  }
      public ArrayList<Ciclista> mostrarDatos(String a){
          Ciclista ciclista;
          ArrayList<Ciclista> listaCiclista= new ArrayList();
        File archivo = new File("Etapas/"+a+".txt");
      FileReader leer;
      Scanner sc;
      try{
          leer=new FileReader(archivo);
          sc = new Scanner(leer);
          sc.useLocale(Locale.ITALY);
          sc.nextLine();
          sc.nextLine();
          while(sc.hasNext()){
              String nombre = sc.next();
              nombre = nombre+" "+sc.next();
              String pais = sc.next();
              String equipo = sc.next();
              equipo = equipo+" "+sc.next();
              String validacion= sc.next();
              boolean z=true;
          if(validacion.equals("NoContinua")){
           z=false;
      }
              while(sc.hasNextInt()){
                  int dorsal = sc.nextInt();
                   int hora = sc.nextInt();
                    int minutos = sc.nextInt();
                     int segundos = sc.nextInt();
                      int tiempo=(3600*hora)+(60*minutos)+segundos;
                      ciclista = new Ciclista(nombre,pais,equipo, hora, minutos, segundos, dorsal,z);
                      ciclista.setTiempo_e(tiempo);
                      listaCiclista.add(ciclista);
              }  
          }
          
      }catch(IOException ex){
          
      }
      return listaCiclista;
      }
}
