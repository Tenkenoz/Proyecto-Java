/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.CarreraDAO;
import Modelo.Conexion;
import Modelo.Equipo;
import Vista.RegistroEquiposFrm;

import com.mongodb.BasicDBObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexa
 */
public class ControladorCarrera implements ActionListener {

    CarreraDAO objDao=new CarreraDAO();
    RegistroEquiposFrm objEquipo=new RegistroEquiposFrm();
     RegistroEquiposFrm r1=new RegistroEquiposFrm();
         private int max_ingresos;
    private int ingresados;
    public ControladorCarrera(CarreraDAO dao,RegistroEquiposFrm equipo){
        this.objDao=dao;
        this.objEquipo=equipo;
        objEquipo.btnRegistarE.addActionListener(this);
        objEquipo.btnMostrarE.addActionListener(this);
        objEquipo.btnNumEquipos.addActionListener(this);
        objEquipo.lblNRegEq.setVisible(false);
        objEquipo.lblNombreEq.setVisible(false);
        objEquipo.txtNombreE.setVisible(false);
        objEquipo.txtNumeror.setVisible(false);
        objEquipo.btnRegistarE.setVisible(false);
        objEquipo.btnMostrarE.setVisible(false);
        ingresados=objDao.obtenerEquipos().size();
        if(ingresados!=0)
        {
            evaluarIngreso();
        }
    }
    
    
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objEquipo.btnRegistarE){
        
            RegistroEquipo();
        }
         if(e.getSource()==objEquipo.btnMostrarE){
        
            llenarTabla();
        }if(e.getSource()==objEquipo.btnNumEquipos)
         {
             definirMaximoIngreso();
         }
    }
        public void evaluarIngreso()
    {
        if(max_ingresos<=objDao.obtenerEquipos().size())
        {
        objEquipo.lblNRegEq.setVisible(false);
        objEquipo.lblNombreEq.setVisible(true);
        objEquipo.lblNombreEq.setText("Límite de ingresos alcanzado");
        objEquipo.txtNombreE.setVisible(false);
        objEquipo.txtNumeror.setVisible(false);
        objEquipo.btnRegistarE.setVisible(false);
        objEquipo.btnRegistarE.setVisible(false);
        objEquipo.btnMostrarE.setVisible(false);
        objEquipo.btnNumEquipos.setVisible(false);
        objEquipo.txtNumEquipos.setVisible(false);
        objEquipo.lblNequipos.setVisible(false);
        
        llenarTabla();
        }
    }
            public void definirMaximoIngreso()
    {
        max_ingresos=Integer.parseInt(objEquipo.txtNumEquipos.getText());
        objEquipo.txtNumEquipos.setVisible(false);
        
        objEquipo.lblNombreEq.setVisible(true);
        objEquipo.txtNombreE.setVisible(true);
        objEquipo.lblNRegEq.setVisible(true);
        objEquipo.btnRegistarE.setVisible(true);
        objEquipo.btnMostrarE.setVisible(true);
        objEquipo.btnNumEquipos.setVisible(false);
        objEquipo.txtNombreE.setVisible(true);
        objEquipo.txtNumeror.setVisible(true);
        objEquipo.lblNequipos.setText("Ingrese los "+max_ingresos+" equipos");
        objEquipo.lblNequipos.setVisible(true);
    }
    public void RegistroEquipo(){
    String nombre_E=objEquipo.txtNombreE.getText();
     String num_r=objEquipo.txtNumeror.getText();
        objEquipo.txtNombreE.setText("");
        objEquipo.txtNumeror.setText("");
          // Validar el nombre del equipo
    boolean nombreValido = validarNombre(nombre_E);
    boolean numeroValido = validarNumeroRegistro(num_r);

    if (nombreValido && numeroValido) {
        // Si el nombre es válido, crear un objeto Equipo y realizar el registro
        Equipo equipo = new Equipo(nombre_E, num_r);
        objDao.insertarEquipo(equipo);
    } else {
        // Mostrar un mensaje de error si el nombre no es válido
        String mensajeError = "Error en los datos ingresados:";
        if (!nombreValido) {
            mensajeError += "\n- El nombre del equipo debe contener exactamente dos palabras y no puede contener números.";
        }
        if (!numeroValido) {
            mensajeError += "\n- El número de registro debe contener solo numeros.";
        }
        JOptionPane.showMessageDialog(objEquipo, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private boolean validarNombre(String nombre) {
    // Dividir el nombre en palabras utilizando el espacio como delimitadores decir si la palabra es oso polar encerrara la palabra oso en la posicion 1 y la palabra polar en la posicion2 
    String[] palabras = nombre.split("\\s+");

    // Verificar que las dos palabras no contenga digito con esta expresion "\\d" 
    return (palabras.length == 2 && !palabras[0].matches("\\d+") && !palabras[1].matches("\\d+"));
}
private boolean validarNumeroRegistro(String numero) {
    // Verificar que el número de registro contenga solo digitos con esta expresión  "\\d+"
    return numero.matches("\\d+");
}
    
       public void llenarTabla() {
    // Obtener la lista de automóviles desde el DAO
    ArrayList<Equipo> listaP = objDao.obtenerEquipos();
    String[][] matriz = new String[listaP.size()][3];

    // Llenar la matriz con los datos de la lista de automóviles
    for (int i = 0; i < listaP.size(); i++) {
        Equipo equipo = listaP.get(i);
        matriz[i][0] = equipo.getNombre();
        matriz[i][1] = equipo.getNumero_r();
  
    }

    // Configurar el modelo de la tabla una sola vez fuera del bucle
    objEquipo.jTableEquipos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String[]{"Nombre", "Numero_R"}
    ));
}
}
