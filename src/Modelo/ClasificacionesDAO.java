/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rouss
 */
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import java.util.ArrayList;
import com.mongodb.DBCursor;
import Modelo.Conexion;
public class ClasificacionesDAO {
public ArrayList mostrarClasificacionGeneral(){
        BasicDBObject ordenar=new BasicDBObject();
        Ciclista c;
        ordenar.put("TiempoGeneral", 1);
        ArrayList<Ciclista> clasificacionGeneral=new ArrayList<>();
        DBCursor cursor=Conexion.conectar().coleccionCiclistas.find(busqueda()).sort(ordenar);
        while(cursor.hasNext())
        {
            c=new Ciclista((String)cursor.next().get("Nombre"),(int)cursor.curr().get("Edad"),(int)cursor.curr().get("Dorsal"),(String)cursor.curr().get("Pais"),(String)cursor.curr().get("Equipo"),(boolean)cursor.curr().get("Continua"),(int)cursor.curr().get("TiempoGeneral"),(int)cursor.curr().get("TiempoEtapa"),(int)cursor.curr().get("PuntosMontaña"),(int)cursor.curr().get("PuntosSprint"));
            clasificacionGeneral.add(c);
        }
        return clasificacionGeneral;
    }
    public ArrayList mostrarClasificacionPuntos(String atributo){
        BasicDBObject ordenar=new BasicDBObject();
        Ciclista c;
        ordenar.put(atributo, -1);
        ArrayList<Ciclista> clasificacionSprint=new ArrayList<>();
        DBCursor cursor=Conexion.conectar().coleccionCiclistas.find(busqueda()).sort(ordenar);
        while(cursor.hasNext())
        {
            c=new Ciclista((String)cursor.next().get("Nombre"),(int)cursor.curr().get("Edad"),(int)cursor.curr().get("Dorsal"),(String)cursor.curr().get("Pais"),(String)cursor.curr().get("Equipo"),(boolean)cursor.curr().get("Continua"),(int)cursor.curr().get("TiempoGeneral"),(int)cursor.curr().get("TiempoEtapa"),(int)cursor.curr().get("PuntosMontaña"),(int)cursor.curr().get("PuntosSprint"));
            clasificacionSprint.add(c);
        }
        return clasificacionSprint;}
    public ArrayList mostrarClasificacionJovenes()
    {
        ArrayList<Ciclista> clasificacionGeneral=mostrarClasificacionGeneral();
        ArrayList<Ciclista> clasificacionJovenes=new ArrayList<>();
        for(Ciclista c:clasificacionGeneral)
        {
            if(c.getEdad()<=25)
            {
                clasificacionJovenes.add(c);
            }
        }
        return clasificacionJovenes;
    }


    public ArrayList mostrarClasificacionMontaña(){
        BasicDBObject ordenar=new BasicDBObject();
        Conexion con=new Conexion();
        Ciclista c;
        ordenar.put("PuntosMontaña", -1);
        ArrayList<Ciclista> clasificacionMontaña=new ArrayList<>();
        DBCursor cursor=con.coleccionCiclistas.find().sort(ordenar);
        while(cursor.hasNext())
        {
            c=new Ciclista((String)cursor.next().get("Nombre"),(int)cursor.curr().get("Dorsal"),(String)cursor.curr().get("Pais"),(String)cursor.curr().get("Equipo"),(int)cursor.curr().get("TiempoGeneral"),(int)cursor.curr().get("TiempoEtapa"),(int)cursor.curr().get("PuntosMontaña"),(int)cursor.curr().get("PuntosSprint"));
            clasificacionMontaña.add(c);
        }
        return clasificacionMontaña;
    }
    public ArrayList mostrarClasificacionSprint(){
        BasicDBObject ordenar=new BasicDBObject();
        Conexion con=new Conexion();
        Ciclista c;
        ordenar.put("PuntosSprint", -1);
        ArrayList<Ciclista> clasificacionSprint=new ArrayList<>();
        DBCursor cursor=con.coleccionCiclistas.find().sort(ordenar);
        while(cursor.hasNext())
        {
            c=new Ciclista((String)cursor.next().get("Nombre"),(int)cursor.curr().get("Dorsal"),(String)cursor.curr().get("Pais"),(String)cursor.curr().get("Equipo"),(int)cursor.curr().get("TiempoGeneral"),(int)cursor.curr().get("TiempoEtapa"),(int)cursor.curr().get("PuntosMontaña"),(int)cursor.curr().get("PuntosSprint"));
            clasificacionSprint.add(c);
        }
        return clasificacionSprint;
    }
    public BasicDBObject busqueda()
    {
        BasicDBObject busqueda=new BasicDBObject();
        busqueda.put("Continua", true);
        return busqueda;
    }
}
