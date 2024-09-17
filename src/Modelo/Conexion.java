/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 *
 * @author pc
 */
public class Conexion {
        private static Conexion unicaConexion;
    DB baseDeDatos;
    DBCollection coleccionCiclistas;
    DBCollection coleccionEquipos;
    DBCollection coleccionEtapa;
    
    Conexion(){
    MongoClient mongo = new MongoClient();
    baseDeDatos= mongo.getDB("CarreraCiclismo");
    coleccionEquipos = baseDeDatos.getCollection("Equipos");
    coleccionEtapa = baseDeDatos.getCollection("Etapa");
    coleccionCiclistas = baseDeDatos.getCollection("Ciclistas");
    }
    
    public static Conexion conectar()
    {
        if(unicaConexion==null)
        {
            unicaConexion=new Conexion();
        }
        return unicaConexion;
    }  
    
}
