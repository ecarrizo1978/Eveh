/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.View;

import eveh.Class.*;
import eveh.controlador.*;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TipoAeronaveView extends javax.swing.JInternalFrame {

    int validador = 0;
    HashMap<String, Integer> mapTipoAeronave;
    HashMap<String, Integer> mapVigencia;
    CoordinadorComboBox ccbx = new CoordinadorComboBox();
    CoordinadorTipoAeronave cta = new CoordinadorTipoAeronave();
    public int idTAeronave;
    public boolean respElimina;

    public TipoAeronaveView() {
        initComponents();
        txtIdTipoAeronave.setEnabled(false);
        txtTipoAeronave.setEnabled(false);
        cbxTipoAeronave.setEnabled(false);
        btnGuardar.setEnabled(false);
        cbxVigencia.setEnabled(false);
        lblTitulo.setText("Mantenedor Tipo de Aeronave");
    }

    public void LlenarComboVigencia() throws SQLException {
        cbxVigencia.removeAllItems();
        this.mapVigencia = ccbx.ComboVigencia();
        cbxVigencia.addItem("Seleccione Vigencia");
        for (String s : mapVigencia.keySet()) {
            cbxVigencia.addItem(s);
        }
    }

    public void LlenarTipoAeronave() throws SQLException {
        cbxTipoAeronave.removeAllItems();
        this.mapTipoAeronave = ccbx.ComboTipoAeronave();
        cbxTipoAeronave.addItem("Seleccione Tipo Aeronave");
        for (String s : mapTipoAeronave.keySet()) {
            cbxTipoAeronave.addItem(s);
        }
    }

    public void DeshabilitarCampos() {
        txtIdTipoAeronave.setEnabled(false);
        txtTipoAeronave.setEnabled(false);
        cbxTipoAeronave.setEnabled(false);
        btnGuardar.setEnabled(false);
        cbxVigencia.setEnabled(false);
        btnBuscar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtIdTipoAeronave = new javax.swing.JTextField();
        txtTipoAeronave = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxTipoAeronave = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxVigencia = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Mantenedor Tipo Aeronave");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eveh/images/icon-createfile.png"))); // NOI18N
        jButton1.setToolTipText("Ingresar Unidad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eveh/images/icon-editalt.png"))); // NOI18N
        jButton2.setToolTipText("Modificar Unidad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eveh/images/icon-deletefile.png"))); // NOI18N
        jButton3.setToolTipText("Eliminar Unidad");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eveh/images/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setText("Id Tipo Aeronave");

        jLabel2.setText("Tipo Aeronave");

        jLabel3.setText("Selección Tipo Aeronave");

        jLabel4.setText("Vigencia");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eveh/images/icon-search.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(74, 74, 74)
                        .addComponent(lblTitulo)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdTipoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxTipoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))
                        .addGap(39, 39, 39))))
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton3)
                                .addComponent(jButton1)
                                .addComponent(jButton2))
                            .addComponent(lblTitulo))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(txtIdTipoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTipoAeronave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxTipoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(43, 43, 43)
                        .addComponent(cbxVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DeshabilitarCampos();
        lblTitulo.setText("Ingresar Tipo Aeronave");
        txtTipoAeronave.setEnabled(true);
        cbxVigencia.setEnabled(true);
        btnGuardar.setEnabled(true);
        txtTipoAeronave.setText("");
        validador = 1;
        try {
            LlenarComboVigencia();
        } catch (SQLException ex) {
            Logger.getLogger(UnidadView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DeshabilitarCampos();
        lblTitulo.setText("Modificar Tipo Aeronave");
        txtTipoAeronave.setText("");
        cbxTipoAeronave.setEnabled(true);
        btnBuscar.setEnabled(true);
        validador = 2;
        try {
            LlenarComboVigencia();
            LlenarTipoAeronave();
        } catch (SQLException ex) {
            Logger.getLogger(UnidadView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DeshabilitarCampos();
        lblTitulo.setText("Eliminar Tipo Aeronave");
        cbxTipoAeronave.setEnabled(true);
        txtIdTipoAeronave.setEnabled(true);
        btnGuardar.setEnabled(true);
        validador = 3;
        try {
            LlenarTipoAeronave();
        } catch (SQLException ex) {
            Logger.getLogger(UnidadView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (validador == 1) {
            if (cbxVigencia.getSelectedItem().toString() == "Seleccione Vigencia" || txtTipoAeronave.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar Tipo Aeronave y Vigencia", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    String tAeronave = txtTipoAeronave.getText();
                    int vig = Integer.parseInt(mapVigencia.get(cbxVigencia.getSelectedItem().toString()).toString());
                    if (cta.IngresarTipoAeronave(tAeronave, vig)){
                        txtIdTipoAeronave.setEnabled(false);
                        txtTipoAeronave.setText("");
                        txtTipoAeronave.setEnabled(false);
                        cbxTipoAeronave.setEnabled(false);
                        btnGuardar.setEnabled(false);
                        LlenarComboVigencia();
                        cbxVigencia.setEnabled(false);
                        lblTitulo.setText("Mantenedor Tipo de Aeronave");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error no esperado, comuniquese con el departamento de TI", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else if (validador == 2) {

            if (cbxTipoAeronave.getSelectedItem().toString() == "Seleccione Vigencia" || txtTipoAeronave.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar Tipo Aeronave y Vigencia", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    String tAeronave = txtTipoAeronave.getText();
                    int vig = Integer.parseInt(mapVigencia.get(cbxVigencia.getSelectedItem().toString()).toString());
                    if (cta.ModificarTipoAeronave(idTAeronave, tAeronave, vig)) {
                        txtIdTipoAeronave.setEnabled(false);
                        txtTipoAeronave.setText("");
                        txtTipoAeronave.setEnabled(false);
                        cbxTipoAeronave.setEnabled(false);
                        btnGuardar.setEnabled(false);
                        LlenarComboVigencia();
                        LlenarTipoAeronave();
                        cbxVigencia.setEnabled(false);
                        lblTitulo.setText("Mantenedor Tipo de Aeronave");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error no esperado, comuniquese con el departamento de TI", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else if (validador == 3) {
            if (cbxTipoAeronave.getSelectedItem().toString() == "Seleccione Tipo Aeronave" && txtIdTipoAeronave.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar Id Tipo Aeronave o seleccionar Tipo Aeronave", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    if (txtIdTipoAeronave.getText().isEmpty()) {
                        respElimina = cta.EliminarTipoAeronave(Integer.parseInt(mapTipoAeronave.get(cbxTipoAeronave.getSelectedItem().toString()).toString())) ;

                    } else {
                        respElimina = cta.EliminarTipoAeronave(Integer.parseInt(txtIdTipoAeronave.getText()));
                    }

                    if (respElimina) {
                        txtIdTipoAeronave.setEnabled(false);
                        txtTipoAeronave.setText("");
                        txtTipoAeronave.setEnabled(false);
                        btnGuardar.setEnabled(false);
                        LlenarComboVigencia();
                        LlenarTipoAeronave();
                        cbxVigencia.setEnabled(false);
                        cbxTipoAeronave.setEnabled(false);
                        lblTitulo.setText("Mantenedor Tipo de Aeronave");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error no esperado, comuniquese con el departamento de TI", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (cbxTipoAeronave.getSelectedItem().toString() == "Seleccione Unidad") {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Unidad", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cbxVigencia.setEnabled(true);
            txtTipoAeronave.setEnabled(true);
            btnGuardar.setEnabled(true);
            txtTipoAeronave.setText(cbxTipoAeronave.getSelectedItem().toString());
            idTAeronave = (Integer.parseInt(mapTipoAeronave.get(cbxTipoAeronave.getSelectedItem().toString()).toString()));
            cbxTipoAeronave.setEnabled(false);
            btnBuscar.setEnabled(false);

        }


    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxTipoAeronave;
    private javax.swing.JComboBox<String> cbxVigencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIdTipoAeronave;
    private javax.swing.JTextField txtTipoAeronave;
    // End of variables declaration//GEN-END:variables
}
