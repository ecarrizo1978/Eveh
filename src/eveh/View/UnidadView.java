/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.View;

import eveh.Class.UnidadClass;
import eveh.controlador.*;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UnidadView extends javax.swing.JInternalFrame {

    int validador = 0;
     HashMap<String, Integer> mapUnidades;
     HashMap<String, Integer> mapVigencia;
     CoordinadorComboBox ccbx = new CoordinadorComboBox();
     CoordinadorUnidad cu = new CoordinadorUnidad();
     public int idUnidad;
     public boolean respElimina;

     
    public UnidadView() {
        initComponents();
        txtIdUnidad.setEnabled(false);
        txtUnidad.setEnabled(false);
        cbxUnidad.setEnabled(false);
        btnGuardar.setEnabled(false);
        cbxVigencia.setEnabled(false);
        lblTitulo.setText("Mantenedor de Unidad");
    }

    public void LlenarComboVigencia() throws SQLException{
        cbxVigencia.removeAllItems();
        this.mapVigencia = ccbx.ComboVigencia();
        cbxVigencia.addItem("Seleccione Vigencia");
        for(String s : mapVigencia.keySet()){
            cbxVigencia.addItem(s);
        }
    }       
    
    public void LlenarComboUnidades() throws SQLException{
        cbxUnidad.removeAllItems();
        this.mapUnidades = ccbx.ComboUnidad();
        cbxUnidad.addItem("Seleccione Unidad");
        for(String s : mapUnidades.keySet()){
            cbxUnidad.addItem(s);
        }
    }    
    
    public void DeshabilitarCampos()
    {
        txtIdUnidad.setEnabled(false);
        txtUnidad.setEnabled(false);
        cbxUnidad.setEnabled(false);
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
        txtIdUnidad = new javax.swing.JTextField();
        txtUnidad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxUnidad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxVigencia = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Mantenedor Unidad");

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

        jLabel1.setText("Id Unidad");

        jLabel2.setText("Unidad");

        jLabel3.setText("Selección Unidad");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addComponent(cbxVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(74, 74, 74)
                        .addComponent(lblTitulo)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                    .addComponent(lblTitulo))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtIdUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbxUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnBuscar))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(cbxVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        DeshabilitarCampos();
        lblTitulo.setText("Ingresar Unidad");
        txtUnidad.setEnabled(true);
        cbxVigencia.setEnabled(true);
        btnGuardar.setEnabled(true);
        txtUnidad.setText("");
        validador = 1;
        try {
            LlenarComboVigencia();
        } catch (SQLException ex) {
            Logger.getLogger(UnidadView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        DeshabilitarCampos();
        lblTitulo.setText("Modificar Unidad");
        txtUnidad.setText("");        
        cbxUnidad.setEnabled(true);
        btnBuscar.setEnabled(true);
        validador = 2;
        try {
            LlenarComboVigencia();
            LlenarComboUnidades();
        } catch (SQLException ex) {
            Logger.getLogger(UnidadView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        DeshabilitarCampos();
        lblTitulo.setText("Eliminar Unidad");
        cbxUnidad.setEnabled(true);
        txtIdUnidad.setEnabled(true);
        btnGuardar.setEnabled(true);
        validador = 3;
        try {
            LlenarComboUnidades();
        } catch (SQLException ex) {
            Logger.getLogger(UnidadView.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if(validador == 1)
        {
            if(cbxVigencia.getSelectedItem().toString() == "Seleccione Vigencia" || txtUnidad.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar Unidad y Vigencia","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try {
                    UnidadClass uc = new UnidadClass();
                    uc.setDetalle(txtUnidad.getText());
                    uc.setVigencia(Integer.parseInt(mapVigencia.get(cbxVigencia.getSelectedItem().toString()).toString()));
                    if(cu.IngresarUnidad(uc))
                    {
                        txtIdUnidad.setEnabled(false);
                        txtUnidad.setText("");
                        txtUnidad.setEnabled(false);
                        cbxUnidad.setEnabled(false);
                        btnGuardar.setEnabled(false);
                        LlenarComboVigencia();
                        cbxVigencia.setEnabled(false);
                        lblTitulo.setText("Mantenedor de Unidad");
                    }
                    
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error no esperado, comuniquese con el departamento de TI","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            
        } else if(validador == 2)
            
        {
        
            if(cbxUnidad.getSelectedItem().toString() == "Seleccione Vigencia" || txtUnidad.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar Unidad y Vigencia","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try {
                    UnidadClass uc = new UnidadClass();
                    
                    uc.setId_unidad(idUnidad);
                    uc.setDetalle(txtUnidad.getText());
                    uc.setVigencia(Integer.parseInt(mapVigencia.get(cbxVigencia.getSelectedItem().toString()).toString()));
  
                    if(cu.ModificarUnidad(uc))
                    {
                        txtIdUnidad.setEnabled(false);
                        txtUnidad.setText("");
                        txtUnidad.setEnabled(false);
                        cbxUnidad.setEnabled(false);
                        btnGuardar.setEnabled(false);
                        LlenarComboVigencia();
                        LlenarComboUnidades();
                        cbxVigencia.setEnabled(false);
                        lblTitulo.setText("Mantenedor de Unidad");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error no esperado, comuniquese con el departamento de TI","Error",JOptionPane.ERROR_MESSAGE);
                }
            }            
            
        }else if(validador == 3)
        {
            if(cbxUnidad.getSelectedItem().toString() == "Seleccione Unidad" && txtIdUnidad.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar Id Unidad o seleccionar Unidad","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try {
                    if(txtIdUnidad.getText().isEmpty())
                    {
                        respElimina = cu.EliminarUnidad(Integer.parseInt(mapUnidades.get(cbxUnidad.getSelectedItem().toString()).toString()));
                        
                    }
                    else
                    {
                        respElimina = cu.EliminarUnidad(Integer.parseInt(txtIdUnidad.getText()));
                    }
                    
                    if(respElimina)
                    {
                        txtIdUnidad.setEnabled(false);
                        txtUnidad.setText("");
                        txtUnidad.setEnabled(false);
                        btnGuardar.setEnabled(false);
                        LlenarComboVigencia();
                        LlenarComboUnidades();
                        cbxVigencia.setEnabled(false);
                        cbxUnidad.setEnabled(false);
                        lblTitulo.setText("Mantenedor de Unidad");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error no esperado, comuniquese con el departamento de TI","Error",JOptionPane.ERROR_MESSAGE);
                }
            }            
        }
        

        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if(cbxUnidad.getSelectedItem().toString() == "Seleccione Unidad" )
        {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Unidad","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            cbxVigencia.setEnabled(true);
            txtUnidad.setEnabled(true);
            btnGuardar.setEnabled(true);
            txtUnidad.setText(cbxUnidad.getSelectedItem().toString());
            idUnidad = (Integer.parseInt(mapUnidades.get(cbxUnidad.getSelectedItem().toString()).toString()));
            cbxUnidad.setEnabled(false);
            btnBuscar.setEnabled(false);
            
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxUnidad;
    private javax.swing.JComboBox<String> cbxVigencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIdUnidad;
    private javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
}
