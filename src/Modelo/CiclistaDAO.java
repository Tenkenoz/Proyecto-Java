/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rouss
 */
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;
public class CiclistaDAO implements Observer {
    public void IngresarCiclista(Ciclista ciclista)//Recibe Obj Java para pasarlo a objBD
    {
        BasicDBObject ciclistaBD=new BasicDBObject();//Crear objeto BD
        ciclistaBD.put("Nombre", ciclista.getNombre());//Ingresar uno a uno los atributos al objetoBD
        ciclistaBD.put("Edad",ciclista.getEdad());
        ciclistaBD.put("Dorsal", ciclista.getDorsal());
        ciclistaBD.put("Equipo", ciclista.getEquipo());
        ciclistaBD.put("Pais",ciclista.getPais());
        ciclistaBD.put("TiempoGeneral", ciclista.getTiempo_g());
        ciclistaBD.put("TiempoEtapa", ciclista.getTiempo_e());
        ciclistaBD.put("PuntosMontaña", ciclista.getPuntos_m());
        ciclistaBD.put("PuntosSprint", ciclista.getPuntos_s());
        ciclistaBD.put("Continua",ciclista.isContinua());
        Conexion.conectar().coleccionCiclistas.insert(ciclistaBD);//Elegir una colección e insertar el objetoBD
        
    }
    public ArrayList MostrarCiclistasRegistrados(){
        Ciclista c1;
        ArrayList<Ciclista> listaCiclistas=new ArrayList<>();
        DBCursor cursor=Conexion.conectar().coleccionCiclistas.find();
        while(cursor.hasNext()){
            c1=new Ciclista((String)cursor.next().get("Nombre"),(int)cursor.curr().get("Edad"),(int)cursor.curr().get("Dorsal"),(String)cursor.curr().get("Pais"),(String)cursor.curr().get("Equipo"),(boolean)cursor.curr().get("Continua"),(int)cursor.curr().get("TiempoGeneral"),(int)cursor.curr().get("TiempoEtapa"),(int)cursor.curr().get("PuntosMontaña"),(int)cursor.curr().get("PuntosSprint"));
            listaCiclistas.add(c1);
        }
        return listaCiclistas;
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
    @Override
    public void actualizarCiclista(Ciclista c){
        BasicDBObject buscarDorsal=new BasicDBObject();
        buscarDorsal.put("Dorsal", c.getDorsal());
        BasicDBObject ciclistaBD=new BasicDBObject();//Crear objeto BD
        ciclistaBD.put("Nombre", c.getNombre());//Ingresar uno a uno los atributos al objetoBD
        ciclistaBD.put("Edad", c.getEdad());
        ciclistaBD.put("Dorsal", c.getDorsal());
        ciclistaBD.put("Equipo", c.getEquipo());
        ciclistaBD.put("Pais",c.getPais());
        ciclistaBD.put("Continua", c.isContinua());
        ciclistaBD.put("TiempoGeneral", c.getTiempo_g());
        ciclistaBD.put("TiempoEtapa", c.getTiempo_e());
        ciclistaBD.put("PuntosMontaña", c.getPuntos_m());
        ciclistaBD.put("PuntosSprint", c.getPuntos_s());
        Conexion.conectar().coleccionCiclistas.update(buscarDorsal,ciclistaBD);
    }
}
