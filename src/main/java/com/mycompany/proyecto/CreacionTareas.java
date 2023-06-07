/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class CreacionTareas extends javax.swing.JFrame {
    int id = Proyecto.tareas.size()+1;

    /**
     * Creates new form CreacionTareas
     */
    public CreacionTareas() {
        initComponents();
        llenarid();
    }

    public void llenarid(){
        idTextField.setText(String.valueOf(id));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tituloTextField = new javax.swing.JTextField();
        finicioTextField = new javax.swing.JTextField();
        ffinalizacionTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        descripcionTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        estadoComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Creación de Tareas");

        jLabel2.setText("ID:");

        jLabel4.setText("Fecha Inicio:");

        jLabel5.setText("Fecha Finalización:");

        jLabel3.setText("Titulo de la Tareja:");

        jLabel6.setText("Descripción de la Tarea:");

        jLabel7.setText("Estado:");

        estadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solicitada", "En proceso", "Finalizada" }));
        estadoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoComboBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idTextField)
                            .addComponent(tituloTextField)
                            .addComponent(finicioTextField)
                            .addComponent(ffinalizacionTextField)
                            .addComponent(descripcionTextField)
                            .addComponent(estadoComboBox, 0, 105, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(descripcionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(finicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ffinalizacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void estadoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        boolean ingresado = false;
        
        for (Tarea t: Proyecto.tareas){
            if (t.getTituloTarea().equals(tituloTextField.getText())){
                ingresado = true;
                break;   
            }
        }
        if(ingresado){
            JOptionPane.showMessageDialog(this, "El nombre de proyecto ya se encuentra creado, por favor utilice otro");
        }
        else{
        
            String titulo = tituloTextField.getText();
            String descripcion = descripcionTextField.getText();
            String fechain = finicioTextField.getText();
            String fechafin = ffinalizacionTextField.getText();
            String estado = estadoComboBox.getSelectedItem().toString();

            Tarea tareaNueva = new Tarea();
            tareaNueva.setIdTarea(id);
            tareaNueva.setTituloTarea(titulo);
            tareaNueva.setDescripcionTarea(descripcion);
            tareaNueva.setFechaInicio(fechain);
            tareaNueva.setFechaFinalizacion(fechafin);
            tareaNueva.setEstado(estado);
            
            Proyecto.tareas.add(tareaNueva);

            idTextField.setText("");
            tituloTextField.setText("");
            descripcionTextField.setText("");
            finicioTextField.setText("");
            ffinalizacionTextField.setText("");

            JOptionPane.showMessageDialog(this, "Tarea creada con exito");
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descripcionTextField;
    private javax.swing.JComboBox<String> estadoComboBox;
    private javax.swing.JTextField ffinalizacionTextField;
    private javax.swing.JTextField finicioTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField tituloTextField;
    // End of variables declaration//GEN-END:variables
}