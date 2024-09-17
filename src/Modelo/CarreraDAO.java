/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class CarreraDAO {
       public void insertarEquipo(Equipo equipo)
    {
        BasicDBObject documento=new BasicDBObject();
        documento.put("nombre", equipo.getNombre());
        documento.put("numero_registro",equipo.getNumero_r());
      Conexion.conectar().coleccionEquipos.insert(documento);
    
    }
     public ArrayList obtenerEquipos()
    {
        ArrayList<Equipo> listaEquipo=new ArrayList();
        Equipo a1;
        
        DBCursor cursor=Conexion.conectar().coleccionEquipos.find();
        while (cursor.hasNext())
        {
            a1=new Equipo((String) cursor.next().get("nombre"),(String) cursor.curr().get("numero_registro"));
            listaEquipo.add(a1);
        }  
        return listaEquipo; 
    }
}
