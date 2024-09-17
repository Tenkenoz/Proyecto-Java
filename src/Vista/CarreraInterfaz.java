/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorCarrera;
import Controlador.ControladorCiclista;
import Controlador.ControladorEtapas;
import Controlador.ControladorResultados;
import Controlador.ControladorClasificaciones;
import Modelo.CarreraDAO;
import Modelo.CiclistaDAO;
import Modelo.EtapasDAO;
import Modelo.ResultadosDAO;
import Modelo.ClasificacionesDAO;
import java.awt.BorderLayout;



/**
 *
 * @author alexa
 */
public class CarreraInterfaz extends javax.swing.JFrame {
    /**
     * Creates new form CarreraInterfaz
     */
    public CarreraInterfaz() {
        initComponents();
      HomeFrm c1=new    HomeFrm ();
       c1.setSize(580,500);
       c1.setLocation(0,0);
       content.removeAll();
       content.add(c1,BorderLayout.CENTER);
       content.revalidate();
       content.repaint();
        
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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnClasificacion = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnRegisC = new javax.swing.JButton();
        btnRegisE = new javax.swing.JButton();
        btnRegisEt = new javax.swing.JButton();
        btnIngresoR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnMetasIntermedias = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnIMetasIntermedias = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(588, 306));

        jPanel2.setBackground(new java.awt.Color(50, 70, 78));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/casa.png"))); // NOI18N
        jLabel1.setText("Home");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/carrera-de-bicicletas.png"))); // NOI18N
        jLabel2.setText("Registro de Ciclistas");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bicicleta-de-carrera.png"))); // NOI18N
        jLabel3.setText("Registro de Equipos");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/etapas.png"))); // NOI18N
        jLabel4.setText("Registro de Etapas");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/clasificacion (1).png"))); // NOI18N
        jLabel5.setText("Clasificacion");

        btnClasificacion.setBackground(new java.awt.Color(50, 70, 78));
        btnClasificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/item_choose_icon_216044.png"))); // NOI18N
        btnClasificacion.setText("jButton1");
        btnClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasificacionActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(50, 70, 78));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/item_choose_icon_216044.png"))); // NOI18N
        btnHome.setText("jButton1");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnRegisC.setBackground(new java.awt.Color(50, 70, 78));
        btnRegisC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/item_choose_icon_216044.png"))); // NOI18N
        btnRegisC.setText("jButton1");
        btnRegisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisCActionPerformed(evt);
            }
        });

        btnRegisE.setBackground(new java.awt.Color(50, 70, 78));
        btnRegisE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/item_choose_icon_216044.png"))); // NOI18N
        btnRegisE.setText("jButton1");
        btnRegisE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisEActionPerformed(evt);
            }
        });

        btnRegisEt.setBackground(new java.awt.Color(50, 70, 78));
        btnRegisEt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/item_choose_icon_216044.png"))); // NOI18N
        btnRegisEt.setText("jButton1");
        btnRegisEt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisEtActionPerformed(evt);
            }
        });

        btnIngresoR.setBackground(new java.awt.Color(50, 70, 78));
        btnIngresoR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/item_choose_icon_216044.png"))); // NOI18N
        btnIngresoR.setText("jButton1");
        btnIngresoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoRActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lista.png"))); // NOI18N
        jLabel6.setText("Ingreso Resultados");

        btnMetasIntermedias.setBackground(new java.awt.Color(50, 70, 78));
        btnMetasIntermedias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/item_choose_icon_216044.png"))); // NOI18N
        btnMetasIntermedias.setText("jButton1");
        btnMetasIntermedias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetasIntermediasActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MetasIntermedias.png"))); // NOI18N
        jLabel7.setText("Ingresar Resultados Metas");

        btnIMetasIntermedias.setBackground(new java.awt.Color(50, 70, 78));
        btnIMetasIntermedias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/item_choose_icon_216044.png"))); // NOI18N
        btnIMetasIntermedias.setText("jButton1");
        btnIMetasIntermedias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMetasIntermediasActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MetasIntermedias.png"))); // NOI18N
        jLabel8.setText("Registrar Metas Intermedias");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegisE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegisC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnIngresoR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnMetasIntermedias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRegisEt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnIMetasIntermedias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnRegisC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnRegisE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegisEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(btnClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresoR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMetasIntermedias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnIMetasIntermedias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoRActionPerformed
        CiclistaDAO c_dao=new CiclistaDAO();
        ResultadosDAO pDAO=new  ResultadosDAO ();
        RegistroRFrm r1= new  RegistroRFrm ();
        r1.setSize(480,540);
        ControladorResultados cpnt=new ControladorResultados(pDAO,r1,c_dao);
        r1.setLocation(0,0);
        content.removeAll();
        content.add(r1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();     // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresoRActionPerformed

    private void btnRegisEtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisEtActionPerformed
        EtapasDAO a = new EtapasDAO();
        FrmRegistoEtapas c1 = new FrmRegistoEtapas();
        c1.setSize(580,500);
        c1.setLocation(0,0);
        content.removeAll();
        content.add(c1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

        ControladorEtapas e = new ControladorEtapas(a,c1);

    }//GEN-LAST:event_btnRegisEtActionPerformed

    private void btnRegisEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisEActionPerformed
        CarreraDAO pDAO=new CarreraDAO ();
        RegistroEquiposFrm r1=new RegistroEquiposFrm();
        r1.setSize(480,540);
        ControladorCarrera cpnt=new ControladorCarrera(pDAO,r1);
        r1.setLocation(0,0);
        content.removeAll();
        content.add(r1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnRegisEActionPerformed

    private void btnRegisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisCActionPerformed
        RegistroCiclista r1=new  RegistroCiclista();
        CiclistaDAO c_dao=new CiclistaDAO();
        r1.setSize(790,780);
        r1.setLocation(0,0);
        ControladorCiclista c=new ControladorCiclista(c_dao,r1);
        content.removeAll();
        content.add(r1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnRegisCActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        HomeFrm c1=new    HomeFrm ();
        c1.setSize(580,500);
        c1.setLocation(0,0);
        content.removeAll();
        content.add(c1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasificacionActionPerformed
        ClasificacionGeneralFrm r1=new  ClasificacionGeneralFrm();
        ClasificacionesDAO dao=new ClasificacionesDAO();
        content.removeAll();
        r1.setSize(580,580);
        r1.setLocation(0,0);
        content.add(r1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        ControladorClasificaciones cn=new ControladorClasificaciones(dao,r1);
    }//GEN-LAST:event_btnClasificacionActionPerformed

    private void btnMetasIntermediasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetasIntermediasActionPerformed
        RegistrarMetasIntermedias rm1 = new RegistrarMetasIntermedias();
        rm1.setSize(790, 790);
        rm1.setLocation(0, 0);
        content.removeAll();
        content.add(rm1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnMetasIntermediasActionPerformed

    private void btnIMetasIntermediasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMetasIntermediasActionPerformed
        IngresarMetasIntermedias im = new IngresarMetasIntermedias();
        im.setSize(790, 790);
        im.setLocation(0, 0);
        content.removeAll();
        content.add(im, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnIMetasIntermediasActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       CarreraInterfaz v= new CarreraInterfaz();
       v.setVisible(true);
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CarreraInterfaz().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClasificacion;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIMetasIntermedias;
    private javax.swing.JButton btnIngresoR;
    private javax.swing.JButton btnMetasIntermedias;
    private javax.swing.JButton btnRegisC;
    private javax.swing.JButton btnRegisE;
    private javax.swing.JButton btnRegisEt;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
