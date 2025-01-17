/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Ciclista;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author alexa
 */
public class ClasificacionGeneralFrm extends javax.swing.JPanel {

    /**
     * Creates new form ClasificacionGeneralFrm
     */
    ArrayList<Ciclista> ciclistas=new ArrayList<>();
    public ClasificacionGeneralFrm() {
        initComponents();
        //Inicializar el combo box con las opciones
//        mostrarResultadosGeneral();//Dejar un formato definido para la tabla al principio
    }
//    public void llenarComboClasificaciones()
//    {
//        String [] clasificaciones={"General","Sprints","Montaña"};
//        for(String clasificacion:clasificaciones)//Itera dentro del arreglo y devuelve el objeto referenciado
//        {
//            cmbClasificaciones.addItem(clasificacion);
//        }
//    }
//    public void agregaraMisCiclistas(Ciclista nuevo)//Esro es AUXILIAR
//    {
//        ciclistas.add(nuevo);//Puedo agregar ciclistas aquí para ver como salen en la interfaz
//    }
////    public void mostrarResultadosGeneral()//Creo un formato para que muestre el nombre, equipo y tiempo en la general de los ciclistas.
////    {
////        //Como es una sola lista de ciclistas, la ordeno. En este caso ordeno por tiempos de la general.
////        Collections.sort(ciclistas, new OrdenarTiemposGeneral());
////        String matriz[][]=new String[ciclistas.size()][4];//Creo la matriz que va a ser el modelo de la tabla.
////        for(int i=0;i<ciclistas.size();i++)
////        {
////            matriz[i][0]=String.valueOf(i+1);//Pongo la posición en una columna
////            matriz[i][1]=ciclistas.get(i).getNombre();//Pongo el nombre en otra
////            matriz[i][2]=ciclistas.get(i).getEquipo();//En otra el equipo
////            matriz[i][3]=ciclistas.get(i).tiempoGanadorGeneral();//y en otra el tiempo. Esto, aún no esta completo.
////            //Falta que solo el primero de el tiempo completo, y los demas la diferencia.
////            
////        }
////        jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Posición","Corredor","Equipo","Tiempo"}));
////        //Defino el formato de las columnas de la tabla. Puedo cambiarlo más adelante.
////    }
//    public void mostrarResultadosSprint()//Creo un formato para que muestre el nombre, equipo y puntos de sprint de los ciclistas.
//    {
//        //Como es una sola lista de ciclistas, la ordeno. En este caso ordeno por puntos al sprint.
//        Collections.sort(ciclistas, new OrdenarPuntosSprint());
//        String matriz[][]=new String[ciclistas.size()][4];
//        for(int i=0;i<ciclistas.size();i++)
//        {
//            matriz[i][0]=String.valueOf(i+1);
//            matriz[i][1]=ciclistas.get(i).getNombre();
//            matriz[i][1]=ciclistas.get(i).getEquipo();
//            matriz[i][2]=String.valueOf(ciclistas.get(i).getPuntos_s());//Convierto int a String y muestro puntos sprint
//            
//        }
//        //El formato de esta clasificación
//       jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Posicion","Corredor","Equipo","Puntos(Sprint)"}));
//    }
//    public void mostrarResultadosMontana()//Creo un formato para que muestre el nombre, equipo y puntos de sprint de los ciclistas.
//    {
//        //Como es una sola lista de ciclistas, la ordeno. En este caso ordeno por puntos de montaña.
//        Collections.sort(ciclistas, new OrdenarPuntosMontaña());
//        String matriz[][]=new String[ciclistas.size()][4];
//        for(int i=0;i<ciclistas.size();i++)
//        {
//            matriz[i][0]=String.valueOf(i+1);
//            matriz[i][1]=ciclistas.get(i).getNombre();
//            matriz[i][2]=ciclistas.get(i).getEquipo();
//            matriz[i][3]=String.valueOf(ciclistas.get(i).getPuntos_m());//Muestro  puntos montaña
//            
//        }
//        //El formato de esta clasificación
//        jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Posicion","Corredor","Equipo","Puntos(Montaña)"}));
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblClasificaciones = new javax.swing.JLabel();
        cmbClasificaciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClasificaciones = new javax.swing.JTable();
        cmbEtapas = new javax.swing.JComboBox<>();

        lblClasificaciones.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblClasificaciones.setText("CLASIFICACION GENERAL");

        jtClasificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtClasificaciones);

        cmbEtapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEtapasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lblClasificaciones))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbClasificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblClasificaciones)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbClasificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEtapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEtapasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEtapasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cmbClasificaciones;
    public javax.swing.JComboBox<String> cmbEtapas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtClasificaciones;
    public javax.swing.JLabel lblClasificaciones;
    // End of variables declaration//GEN-END:variables
}
