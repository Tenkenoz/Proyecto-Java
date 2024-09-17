/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author rouss
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Vista.RegistroCiclista;
import Modelo.Ciclista;
import Modelo.CiclistaDAO;
import Modelo.Conexion;
import Modelo.Equipo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ControladorCiclista implements ActionListener{
    RegistroCiclista RegCiclistaVisual=new RegistroCiclista();
//    Ciclista c=new Ciclista();
    CiclistaDAO c_dao=new CiclistaDAO();
    public ControladorCiclista(CiclistaDAO dao,RegistroCiclista vistaRegistro) {
        c_dao=dao;
        RegCiclistaVisual=vistaRegistro;
        RegCiclistaVisual.btnAgregar.addActionListener(this);
        RegCiclistaVisual.btnMostrar.addActionListener(this);
        RegCiclistaVisual.cmbEquipos.addActionListener(this);
        llenarComboEquipos();
        llenarComboNumeros();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==RegCiclistaVisual.btnAgregar)
        {
            this.InsertarCiclista();
        }
        if(e.getSource()==RegCiclistaVisual.btnMostrar)
        {
            this.mostrarListaCiclistas();
        }
        if(e.getSource()==RegCiclistaVisual.cmbEquipos)
        {
            if(!RegCiclistaVisual.cmbEquipos.getSelectedItem().toString().equals(""))
            {
                //Cada vez que se elige otro equipo, se reinicia la búsqueda. No se husca si no hay equipo seleccionado.
                llenarComboNumeros();//Para que no queden borrados los numeros permanentemente.
                numeroRepetido();//Quita los numeros repetidos de las opciones
            }
        }
    }
    public void llenarComboEquipos(){
        RegCiclistaVisual.cmbEquipos.addItem("");
        ArrayList<Equipo> equipos=c_dao.obtenerEquipos();
        for(Equipo e:equipos){
            RegCiclistaVisual.cmbEquipos.addItem(e.getNombre());
        }
    }
    public void llenarComboNumeros()//Crea un combobox de numeros
    {
        RegCiclistaVisual.cmbNumero.removeAllItems();
        //Se limpia para que al usar numeroRepetido() no se quiten los numeros, en todos los equipos y 
        //al volver a llenar el combobox, no se repita el llenado de numeros ej 12345,12345
        int[] numeros=new int[]{1,2,3,4,5,6,7,8,9};
        for(int i=0;i<numeros.length;i++){
            RegCiclistaVisual.cmbNumero.addItem(String.valueOf(numeros[i]));
        }
    }
        
    public void numeroRepetido()//Esta función impide repetir el numero del corredor dentro de un equipo
    {//Por ejemplo no puede haber 2 ciclistas con el dorsal 11 11, o 24 24.
        //Revisa el numero elegido
        ArrayList<Ciclista> ciclistas=c_dao.MostrarCiclistasRegistrados();//Saca listas de ciclistas y equipos para comparar
        ArrayList<Equipo> equipos=c_dao.obtenerEquipos();
        int n_equipo=99;
        for(int i=1;i<=9;i++)
        {
            for(Equipo e:equipos)
        {
            if(e.getNombre().equals(RegCiclistaVisual.cmbEquipos.getSelectedItem().toString()))
            {
                n_equipo=Integer.parseInt(e.getNumero_r())-1;//Saca el numero del equipo escogido para el corredor.
            }
        }
        for(Ciclista c:ciclistas)
        {
            if((n_equipo==(c.getDorsal()/10))&&(i==(c.getDorsal()%10)))//Compara el numero del equipo y el del ciclista. Es decir el dorsal completo.
            {
                int nrep=c.getDorsal()%10;//Si se repite, coge el numero del corredor dentro del equipo.
                RegCiclistaVisual.cmbNumero.removeItem(String.valueOf(nrep));//Y lo elimina.
            }
        }
        }
        
    }

    public void InsertarCiclista()
    {
        ArrayList<Equipo> equipos=c_dao.obtenerEquipos();
        String nombre=RegCiclistaVisual.txtnombre.getText();
        String equipo=RegCiclistaVisual.cmbEquipos.getSelectedItem().toString();
        String pais=RegCiclistaVisual.txtPais.getText();
        int edad=Integer.parseInt(RegCiclistaVisual.txtedad.getText());
        int num_equipo=99;
         boolean ValidoNombre= validarNombreC(nombre);
         boolean ValidoPais= validarPais(pais);
        if(ValidoNombre && !ValidoPais)
            {
         for(Equipo e:equipos)
        {
            if(e.getNombre().equals(equipo))
            {
                num_equipo=Integer.parseInt(e.getNumero_r())-1;
            }
        }
        int dorsal=Integer.parseInt(RegCiclistaVisual.cmbNumero.getSelectedItem().toString())+(num_equipo*10);
        Ciclista ciclista=new Ciclista(dorsal,edad,nombre,pais,equipo);
        c_dao.IngresarCiclista(ciclista);
        RegCiclistaVisual.txtnombre.setText("");
        RegCiclistaVisual.txtPais.setText("");
        RegCiclistaVisual.cmbEquipos.setSelectedIndex(0);
            }else
                    {
          String mensajeError = "Error en los datos ingresados:";
        if (!ValidoNombre) {
            mensajeError += "\n- El nombre del ciclista debe contener solo letras y tener una longitud de dos.";
        }
        if (ValidoPais) {
            mensajeError += "\n- El país del ciclista no puede contener dígitos.";
        }
        JOptionPane.showMessageDialog(RegCiclistaVisual, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
    }
     private boolean validarNombreC(String nombre) {
    // Dividir el nombre en palabras utilizando el espacio como delimitadores decir si la palabra es oso polar encerrara la palabra oso en la posicion 1 y la palabra polar en la posicion2 
    String[] palabras = nombre.split("\\s+");

    // Verificar que las dos palabras no contenga digito con esta expresion ".*\\d.*" 
    return (palabras.length == 2 && !palabras[0].matches(".*\\d.*") && !palabras[1].matches(".*\\d.*"));
}
private boolean validarPais(String numero) {
    // Verificar que el número de registro no contenga caracteres con esta expresión  "\\d+"
    return numero.matches("\\d+");
}
    public void mostrarListaCiclistas(){
        ArrayList<Ciclista> ciclistas=c_dao.MostrarCiclistasRegistrados();
        String[][] matriz=new String[ciclistas.size()][5];
        for(int i=0;i<ciclistas.size();i++)
        {
            matriz[i][0]=ciclistas.get(i).getNombre();
            matriz[i][1]=String.valueOf(ciclistas.get(i).getEdad());
            matriz[i][2]=String.valueOf(ciclistas.get(i).getDorsal());
            matriz[i][3]=ciclistas.get(i).getEquipo();
            matriz[i][4]=ciclistas.get(i).getPais();
        }
        RegCiclistaVisual.jtCiclistasReg.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Nombre","Edad","Dorsal","Equipo","Pais"}));
    }

}
