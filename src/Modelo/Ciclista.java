/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rouss
 */
public class Ciclista {
    private String nombre;
    private String pais;
    private String equipo;
    private int hora;
    private int minuto;
    private int segundos;
    private int dorsal;
    private int puntos_m;
    private int puntos_s;
    private int tiempo_e;
    private int tiempo_g;
    private int edad;
    private boolean continua;
    public Ciclista(String nombre,int edad, int dorsal, String pais, String equipo,int tiempo_g, int tiempo_e, int puntos_m, int puntos_s) {
        this.nombre = nombre;
        this.pais = pais;
        this.equipo = equipo;
        this.dorsal = dorsal;
        this.puntos_m = puntos_m;
        this.puntos_s = puntos_s;
        this.tiempo_e = tiempo_e;
        this.tiempo_g = tiempo_g;
        this.edad=edad;
        this.continua=continua;
    }



    public Ciclista(String nombre, String pais, String equipo, int hora, int minuto, int segundos, int dorsal) {
        this.nombre = nombre;
        this.pais = pais;
        this.equipo = equipo;
        this.hora = hora;
        this.minuto = minuto;
        this.segundos = segundos;
        this.dorsal = dorsal;
        this.continua=continua;
    }
        public Ciclista(String nombre, String pais, String equipo, int hora, int minuto, int segundos, int dorsal, boolean continua) {
        this.nombre = nombre;
        this.pais = pais;
        this.equipo = equipo;
        this.hora = hora;
        this.minuto = minuto;
        this.segundos = segundos;
        this.dorsal = dorsal;
        this.continua=continua;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
        public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //El 2do Constructor es para los metodos de base de datos, porque al devolver un ciclista se usa el constructor Ciclista
    //El 1er constructor reiniciaría los tiempos y puntos a 0. 
    public Ciclista(String nombre, int dorsal, String pais, String equipo,int tiempo_g, int tiempo_e, int puntos_m, int puntos_s) {
        this.nombre = nombre;
        this.pais = pais;
        this.equipo = equipo;
        this.dorsal = dorsal;
        this.puntos_m = puntos_m;
        this.puntos_s = puntos_s;
        this.tiempo_e = tiempo_e;
        this.tiempo_g = tiempo_g;
        this.continua=continua;
    }
    public Ciclista(int dorsal, int edad,String nombre, String pais, String equipo) {
        this.dorsal=dorsal;
        this.nombre = nombre;
        this.pais = pais;
        this.equipo = equipo;
        this.edad=edad;
        tiempo_e=0;
        tiempo_g=0;
        puntos_m=0;
        puntos_s=0;
        this.continua=true;
    }
    public Ciclista() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getPuntos_m() {
        return puntos_m;
    }

    public void setPuntos_m(int puntos_m) {
        this.puntos_m = puntos_m;
    }

    public int getPuntos_s() {
        return puntos_s;
    }

    public void setPuntos_s(int puntos_s) {
        this.puntos_s = puntos_s;
    }
    public void sumarPuntosMontaña(int puntos)
    {
        puntos_m+=puntos;
    }
    public void sumarPuntosSprint(int puntos)
    {
        puntos_s+=puntos;
    }

    public int getTiempo_e() {
        return tiempo_e;
    }

    public void setTiempo_e(int tiempo_e) {
        this.tiempo_e = tiempo_e;
    }

    public int getTiempo_g() {
        return tiempo_g;
    }

    public void setTiempo_g(int tiempo_g) {
        this.tiempo_g = tiempo_g;
    }
    public void sumarTiempoGeneral(int tiempo)
    {
        tiempo_g+=tiempo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    @Override
    public String toString() {
        return nombre+"     "+equipo+"  "+pais;
    }
    public String tiempoEtapa()//Muestra solo el tiempo en la etapa que ha hecho el corredor
    {
        int hr,min,seg=0;
        hr=(tiempo_e/3600);
        min=(tiempo_e%3600)/60;
        seg=(tiempo_e%3600)%60;
        return hr+":"+min+":"+seg;
    }
    public String tiempoGeneral()//Muestra solo el tiempo en la general del corredor
    {
        int hr,min,seg=0;
        hr=(tiempo_g/3600);
        min=(tiempo_g%3600)/60;
        seg=(tiempo_g%3600)%60;
        return hr+":"+min+":"+seg;
    }
    public String diferenciaEtapa(Ciclista ganador){
        //Permite ver solo la diferencia que tiene un ciclista respecto al ganador de la etapa
        int tiempo_ganador=ganador.getTiempo_e();
        int hr,min,seg=0;
        int diferencia=tiempo_e-tiempo_ganador;
        hr=(diferencia/3600);
        min=(diferencia%3600)/60;
        seg=(diferencia%3600)%60;
        if(hr==0&&diferencia!=0)
        {
            return "   +"+min+":"+seg;
        }
        else if(diferencia<60&&diferencia!=0)
        {
            return "      +"+seg;
        }
        else if(diferencia==0)
        {
            return "m.t";
        }
        else{
            return "+"+hr+":"+min+":"+seg;
        }
    }
    public String diferenciaGeneral(Ciclista lider)
    //Permite ver solo la diferencia que tiene un ciclista respecto al lider de la clasificacion general
    {
        int tiempo_lider=lider.getTiempo_g();
        int hr,min,seg=0;
        int diferencia=tiempo_g-tiempo_lider;
        hr=(diferencia/3600);
        min=(diferencia%3600)/60;
        seg=(diferencia%3600)%60;
        if(hr==0&&diferencia!=0)
        {
            return "   +"+min+":"+seg;
        }
        else if(diferencia<60&&diferencia!=0)
        {
            return "      +"+seg;
        }
        else if(diferencia==0)
        {
            return "m.t";
        }
        else{
            return "+"+hr+":"+min+":"+seg;
        }
    }
    
        public void MostrarPuntosMontana()
    {
        System.out.println(this.toString()+"   "+puntos_m);
    }
    public void MostrarPuntosSprint()
    {
        System.out.println(this.toString()+"   "+puntos_s);
    }
    public void MostrarGanadorEtapa()//Muestra datos del ciclista y el tiempo
    {
        int hr,min,seg=0;
        hr=(tiempo_e/3600);
        min=(tiempo_e%3600)/60;
        seg=(tiempo_e%3600)%60;
        System.out.println(this.toString()+"   "+hr+":"+min+":"+seg);
    }
    public String tiempoGanadorEtapa()//Muestra solo el tiempo
    {
        int hr,min,seg=0;
        hr=(tiempo_e/3600);
        min=(tiempo_e%3600)/60;
        seg=(tiempo_e%3600)%60;
        return hr+":"+min+":"+seg;
    }
    public void MostrarLiderGeneral()//Muestra datos del ciclista y el tiempo
    {
        int hr,min,seg=0;
        hr=(tiempo_g/3600);
        min=(tiempo_g%3600)/60;
        seg=(tiempo_g%3600)%60;
        System.out.println(this.toString()+"   "+hr+":"+min+":"+seg);
    }
    public String tiempoGanadorGeneral()//Muestra solo el tiempo, porque los otros datos ya están en la tabla
    {
        int hr,min,seg=0;
        hr=(tiempo_g/3600);
        min=(tiempo_g%3600)/60;
        seg=(tiempo_g%3600)%60;
        return hr+":"+min+":"+seg;
    }
    public void DiferenciaconGanadorEtapa(int t_ganador)
    {
        int hr,min,seg=0;
        int dif_lider;
        dif_lider=tiempo_e-t_ganador;
        hr=(dif_lider/3600);
        min=(dif_lider%3600)/60;
        seg=(dif_lider%3600)%60;
        if(hr==0)
        {
            System.out.println(this.toString()+"   "+"   "+min+":"+seg);
        }
        else if((hr==0)&&(min==0))
        {
            System.out.println(this.toString()+"   "+"      "+seg);
        }
        else{
            System.out.println(this.toString()+"   "+hr+":"+min+":"+seg);
        }
    }
    public void DiferenciaLiderGeneral(int t_lider)
    {
        int hr,min,seg=0;
        int dif_lider;
        dif_lider=tiempo_g-t_lider;
        hr=(dif_lider/3600);
        min=(dif_lider%3600)/60;
        seg=(dif_lider%3600)%60;
        if(hr==0)
        {
            System.out.println(this.toString()+"   "+"   "+min+":"+seg);
        }
        else if((hr==0)&&(min==0))
        {
            System.out.println(this.toString()+"   "+"      "+seg);
        }
        else{
            System.out.println(this.toString()+"   "+hr+":"+min+":"+seg);
        }
        
    }
    
    public boolean isContinua() {
        return continua;
    }

    public void setContinua(boolean continua) {
        this.continua = continua;
    }

    //El 2do Constructor es para los metodos de base de datos, porque al devolver un ciclista se usa el constructor Ciclista
    //El 1er constructor reiniciaría los tiempos y puntos a 0. 
    public Ciclista(String nombre,int edad, int dorsal, String pais, String equipo, boolean continua,int tiempo_g, int tiempo_e, int puntos_m, int puntos_s) {
        this.nombre = nombre;
        this.pais = pais;
        this.equipo = equipo;
        this.dorsal = dorsal;
        this.puntos_m = puntos_m;
        this.puntos_s = puntos_s;
        this.tiempo_e = tiempo_e;
        this.tiempo_g = tiempo_g;
        this.edad=edad;
        this.continua=continua;
    }  
}
