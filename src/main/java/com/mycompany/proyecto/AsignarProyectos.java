/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

import static com.mycompany.proyecto.Proyecto.equipos;
import static com.mycompany.proyecto.Proyecto.proyectos;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class AsignarProyectos extends javax.swing.JFrame {

    /**
     * Creates new form AsignarProyectos
     */
    public AsignarProyectos() {
        initComponents();
        llenarComboBoxEq();
        llenarComboBoxPro();
        
    }
    
    public void llenarComboBoxEq(){
        
        for(Equipo e: equipos){
            equipoComboBox.addItem(e.getNombreEquipo());
        }
    }
    
    public void llenarComboBoxPro(){
     
        for(Proyectos p: proyectos){
            proyectoComboBox.addItem(p.getNombreProyecto());
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
        jLabel3 = new javax.swing.JLabel();
        equipoComboBox = new javax.swing.JComboBox<>();
        proyectoComboBox = new javax.swing.JComboBox<>();
        asignarButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Asingar Proyectos a Equipos");

        jLabel2.setText("Proyecto:");

        jLabel3.setText("Equipo:");

        asignarButton.setText("Asignar");
        asignarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarButtonActionPerformed(evt);
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
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(proyectoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(equipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(125, 125, 125))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(asignarButton)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(equipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(proyectoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(asignarButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void asignarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarButtonActionPerformed
        // TODO add your handling code here:
        boolean ingresado = false;
            
            for(Equipo e : Proyecto.equipos){
                if (e.getProyectos().equals(proyectoComboBox.getSelectedItem().toString())){
                    ingresado = true;
                    break;
                }
            }
            if(ingresado){
                JOptionPane.showMessageDialog(this, "Proyecto ya se encuentra asignado a un equipo, por favor seleccione otro");
            }
            else{
                Equipo equipoSeleccionado = null;
                for(Equipo e: Proyecto.equipos){
                    if(e.getNombreEquipo().equals(equipoComboBox.getSelectedItem().toString())){
                        equipoSeleccionado = e;
                        break;
                    }
                }
                        
                Proyectos proyectoSeleccionado = null;
                for(Proyectos p: Proyecto.proyectos){
                    if(p.getNombreProyecto().equals(proyectoComboBox.getSelectedItem().toString())){
                        proyectoSeleccionado = p;
                        break;
                    }
                }
                
                if(equipoSeleccionado!=null && proyectoSeleccionado!=null){
                    equipoSeleccionado.asignarProyecto(proyectoSeleccionado);
                    JOptionPane.showMessageDialog(this, "Proyecto agregado exitosamente");
                    proyectoComboBox.removeItem(proyectoSeleccionado);
                }
            }
    }//GEN-LAST:event_asignarButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignarButton;
    private javax.swing.JComboBox<String> equipoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox<String> proyectoComboBox;
    // End of variables declaration//GEN-END:variables
}
