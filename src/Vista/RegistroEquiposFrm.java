/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Equipo;
import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class RegistroEquiposFrm extends javax.swing.JPanel {

    /**
     * Creates new form RegistroEquiposFrm
     */
    public RegistroEquiposFrm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        txtNumeror = new javax.swing.JTextField();
        btnRegistarE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEquipos = new javax.swing.JTable();
        btnMostrarE = new javax.swing.JButton();
        lblNequipos = new javax.swing.JLabel();
        txtNumEquipos = new javax.swing.JTextField();
        btnNumEquipos = new javax.swing.JToggleButton();
        lblNombreEq = new javax.swing.JLabel();
        lblNRegEq = new javax.swing.JLabel();

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRO EQUIPOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 6, -1, -1));
        jPanel1.add(txtNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 169, 31));
        jPanel1.add(txtNumeror, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 168, 35));

        btnRegistarE.setText("Registar");
        btnRegistarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarEActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 130, -1));

        jTableEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableEquipos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 440, 178));

        btnMostrarE.setText("Mostrar");
        jPanel1.add(btnMostrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 107, -1));

        lblNequipos.setText("Número de equipos a registrar:");
        jPanel1.add(lblNequipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel1.add(txtNumEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, -1));

        btnNumEquipos.setText("Definir");
        jPanel1.add(btnNumEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 80, -1));

        lblNombreEq.setText("Nombre");
        jPanel1.add(lblNombreEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lblNRegEq.setText("Numero Registro");
        jPanel1.add(lblNRegEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistarEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnMostrarE;
    public javax.swing.JToggleButton btnNumEquipos;
    public javax.swing.JButton btnRegistarE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableEquipos;
    public javax.swing.JLabel lblNRegEq;
    public javax.swing.JLabel lblNequipos;
    public javax.swing.JLabel lblNombreEq;
    public javax.swing.JTextField txtNombreE;
    public javax.swing.JTextField txtNumEquipos;
    public javax.swing.JTextField txtNumeror;
    // End of variables declaration//GEN-END:variables

//    private void llenarTabla() {
//        
//    }
//           ArrayList<Equipo> listaP = objDao.obtenerEquipos();
//    String[][] matriz = new String[listaP.size()][3];
//
//    // Llenar la matriz con los datos de la lista de automóviles
//    for (int i = 0; i < listaP.size(); i++) {
//        Equipo equipo = listaP.get(i);
//        matriz[i][0] = equipo.getNombre();
//        matriz[i][1] = equipo.getNumero_r();
//    }
}
