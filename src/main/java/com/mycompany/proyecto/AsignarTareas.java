/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

import static com.mycompany.proyecto.Proyecto.tareas;
import static com.mycompany.proyecto.Proyecto.proyectos;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class AsignarTareas extends javax.swing.JFrame {

    /**
     * Creates new form AsignarTareasGerente
     */
    public AsignarTareas() {
        initComponents();
        llenarComboBoxPr();
        llenarComboBoxTarea();
    }
    
    public void llenarComboBoxPr(){
        
        for(Proyectos p: proyectos){
            proyectoComboBox.addItem(p.getNombreProyecto());
        }
    }
    
    public void llenarComboBoxTarea(){
     
        for(Tarea t: tareas){
            tareaComboBox.addItem(t.getTituloTarea());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        proyectoComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tareaComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Asignación de Tareas");

        jLabel2.setText("Proyecto:");

        jLabel3.setText("Tarea:");

        jButton1.setText("Asignar");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tareaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(proyectoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(proyectoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tareaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean ingresado = false;
            
            for(Proyectos p : Proyecto.proyectos){
                if (p.getTareas().equals(tareaComboBox.getSelectedItem().toString())){
                    ingresado = true;
                    break;
                }
            }
            if(ingresado){
                JOptionPane.showMessageDialog(this, "Tarea ya se encuentra asignada a otro proyecto, por favor seleccione otro");
            }
            else{
                Proyectos proyectoSeleccionado = null;
                for(Proyectos p: Proyecto.proyectos){
                    if(p.getNombreProyecto().equals(proyectoComboBox.getSelectedItem().toString())){
                        proyectoSeleccionado = p;
                        break;
                    }
                }
                        
                Tarea tareaSeleccionada = null;
                for(Tarea t: Proyecto.tareas){
                    if(t.getTituloTarea().equals(tareaComboBox.getSelectedItem().toString())){
                        tareaSeleccionada = t;
                        break;
                    }
                }
                
                if(proyectoSeleccionado!=null && tareaSeleccionada!=null){
                    proyectoSeleccionado.asignarTarea(tareaSeleccionada);
                    JOptionPane.showMessageDialog(this, "Tarea asignada exitosamente");
                    tareaComboBox.removeItem(tareaSeleccionada);
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox<String> proyectoComboBox;
    private javax.swing.JComboBox<String> tareaComboBox;
    // End of variables declaration//GEN-END:variables
}
