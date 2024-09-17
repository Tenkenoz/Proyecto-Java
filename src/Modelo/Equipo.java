/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexa
 */
public class Equipo {
    public String nombre;
    public String numero_r;

    public Equipo(String nombre, String numero_r) {
        this.nombre = nombre;
        this.numero_r = numero_r;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_r() {
        return numero_r;
    }

    public void setNumero_r(String numero_r) {
        this.numero_r = numero_r;
    }
    
    
}
