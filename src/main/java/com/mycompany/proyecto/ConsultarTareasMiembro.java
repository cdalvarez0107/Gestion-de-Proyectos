/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author carlos
 */
public class ConsultarTareasMiembro extends javax.swing.JFrame {
    private Tarea modificar;

    /**
     * Creates new form ConsultarTareasMiembro
     */
    public ConsultarTareasMiembro() {
        initComponents();
        llenarJTable();
    }
    
    private void llenarJTable(){
        
        Proyectos proyectoSeleccionado = null;
        for (Proyectos p : Proyecto.proyectos) {
            if (p.getNombreEquipo().equals(PaginaMiembro.usuario.getNombreEquipo())) {
                proyectoSeleccionado = p;
                break;
            }
        }
        if (proyectoSeleccionado != null) {
            List<Tarea> tareasAsignadas = new ArrayList<>();
            String nombreUsuario = PaginaMiembro.usuario.getUsuario();

            for (Tarea ta : proyectoSeleccionado.getTareas()) {
                if (ta.getUsuario().equals(nombreUsuario)) {
                    tareasAsignadas.add(ta);
                }
            }
            
            Collections.sort(tareasAsignadas, new Comparator<Tarea>() {
                @Override
                public int compare(Tarea tarea1, Tarea tarea2) {
                    return tarea1.getFechaInicio().compareTo(tarea2.getFechaInicio());
                }
            });

            DefaultTableModel t = new DefaultTableModel(new String[]{"ID", "Titulo", "Descripcion", "Fecha de Inicio", "Fecha de Finalizacion", "Proyecto", "Estado"},tareasAsignadas.size());
            jTable1.setModel(t);

            TableModel modelo = jTable1.getModel();

            int i = 0;
            for (Tarea ta : tareasAsignadas) {
                modelo.setValueAt(ta.getIdTarea(), i, 0);
                modelo.setValueAt(ta.getTituloTarea(), i, 1);
                modelo.setValueAt(ta.getDescripcionTarea(), i, 2);
                modelo.setValueAt(ta.getFechaInicio(), i, 3);
                modelo.setValueAt(ta.getFechaFinalizacion(), i, 4);
                modelo.setValueAt(ta.getNombreProyecto(), i, 5);
                modelo.setValueAt(ta.getEstado(), i, 6);
                i++;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        modificarButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tituloTextField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        estadoLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        estadoComboBox = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        modificarButton.setText("Actualizar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setText("Tareas Asignadas");

        jLabel1.setText("Titulo de la Tarea:");

        buscarButton.setText("Traer Información");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado Actual:");

        estadoLabel.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N

        jLabel3.setText("Actualizar estado:");

        estadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solicitada", "En proceso", "Finalizada" }));

        jMenu2.setText("Regresar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(estadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estadoComboBox, 0, 161, Short.MAX_VALUE))))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarButton)
                            .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estadoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(estadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarButton))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        // TODO add your handling code here:
        if(modificar != null){
            modificar.setEstado(estadoComboBox.getSelectedItem().toString());
            JOptionPane.showMessageDialog(this,"Tarea Actualizada");

            tituloTextField.setText("");
            estadoLabel.setText("");
            llenarJTable();
        }
        else{
            JOptionPane.showMessageDialog(this, " ");
        }
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // TODO add your handling code here:
        modificar = null;
        for (Tarea t: Proyecto.tareas){

            if(t.getTituloTarea().equals(tituloTextField.getText())){
                modificar = t;
                break;
            }
        }
        if(modificar != null){
            estadoLabel.setText(modificar.getEstado());

        }
        else{
            JOptionPane.showMessageDialog(this, "Proyecto no encontrado");
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JComboBox<String> estadoComboBox;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField tituloTextField;
    // End of variables declaration//GEN-END:variables
}
