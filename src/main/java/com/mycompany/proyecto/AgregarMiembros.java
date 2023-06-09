/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

import static com.mycompany.proyecto.Proyecto.equipos;
import static com.mycompany.proyecto.Proyecto.usuarios;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class AgregarMiembros extends javax.swing.JFrame {

    private Equipo agregar;
    /**
     * Creates new form AgregarMiembros
     */
    public AgregarMiembros() {
        initComponents();
        llenarComboBoxEq();
        llenarComboBoxMi();
    }
    
    public void llenarComboBoxEq(){
        
        for(Equipo e: equipos){
            equipoComboBox.addItem(e.getNombreEquipo());
        }
    }
    
    public void llenarComboBoxMi(){
     
        for(Usuario i: usuarios){
            if("Miembro".equals(i.getRol())){
                miembroComboBox.addItem(i.getNombre());
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

        jLabel1 = new javax.swing.JLabel();
        equipoComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        miembroComboBox = new javax.swing.JComboBox<>();
        agregarButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione un Equipo:");

        jLabel2.setText("Miembros Disponibles:");

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Asignar Miembros");

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
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(equipoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(miembroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(agregarButton)))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(equipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(miembroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(agregarButton)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        // TODO add your handling code here:
        
        boolean ingresado = false;
            for(Equipo e: Proyecto.equipos){
                if (Objects.equals(e.getMiembros(),miembroComboBox.getSelectedItem())){
                    ingresado = true;
                    break;
                }
            }
            if(ingresado){
                JOptionPane.showMessageDialog(this, "Miembro ya se encuentra asignado a un equipo, por favor seleccione otro");
            }
            else{
                Equipo equipoSeleccionado = null;
                for(Equipo e: Proyecto.equipos){
                    if(e.getNombreEquipo().equals(equipoComboBox.getSelectedItem().toString())){
                        equipoSeleccionado = e;
                        break;
                    }
                }
                        
                Usuario miembroSeleccionado = null;
                for(Usuario u: Proyecto.usuarios){
                    if(u.getNombre().equals(miembroComboBox.getSelectedItem().toString())){
                        miembroSeleccionado = u;
                        break;
                    }
                }
                
                if(equipoSeleccionado!=null && miembroSeleccionado!=null){
                    equipoSeleccionado.asignarMiembro(miembroSeleccionado);
                    JOptionPane.showMessageDialog(this, "Miembro agregado exitosamente");
                    miembroComboBox.removeItem(miembroSeleccionado);
                }
            } 
    }//GEN-LAST:event_agregarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JComboBox<String> equipoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox<String> miembroComboBox;
    // End of variables declaration//GEN-END:variables
}
