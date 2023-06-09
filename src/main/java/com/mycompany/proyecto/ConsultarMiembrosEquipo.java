/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

import static com.mycompany.proyecto.Proyecto.equipos;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author carlos
 */
public class ConsultarMiembrosEquipo extends javax.swing.JFrame {
    
    private Equipo consultar;


    /**
     * Creates new form ConsultarMiembrosEquipo
     */
    public ConsultarMiembrosEquipo() {
        initComponents();
        llenarJTable();
        llenarComboBox();
    }
    
    public void llenarComboBox(){
     
        for(Equipo e: equipos){
        equipoComboBox.addItem(e.getNombreEquipo());
        }
    }
    
    private void llenarJTable(){
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        equipoComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        consultarButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        equipoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecciona el Equipo:");

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
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
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(consultarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(equipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(consultarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void equipoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipoComboBoxActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        // TODO add your handling code here:
        
        Equipo equipoSeleccionado = null;
        for(Equipo e : Proyecto.equipos){
            if(e.getNombreEquipo().equals(equipoComboBox.getSelectedItem())){
                equipoSeleccionado = e;
                break;
            }
        }
        
        if(equipoSeleccionado!= null){
            DefaultTableModel t = new DefaultTableModel(new String[]{"Nombre","Apellido","Correo","Rol","Usuario"}, equipoSeleccionado.getMiembros().size());
            jTable1.setModel(t);
            
            int i = 0;
            for(Usuario u : equipoSeleccionado.getMiembros()){
                jTable1.setValueAt(u.getNombre(), i, 0);
                jTable1.setValueAt(u.getApellido(), i, 1);
                jTable1.setValueAt(u.getCorreo(), i, 2);
                jTable1.setValueAt(u.getRol(), i, 3);
                jTable1.setValueAt(u.getUsuario(), i, 4);
                i++;
            }
        }
        /*
        DefaultTableModel t = new DefaultTableModel(new String[]{"Nombre","Apellido","Correo","Rol"}, 0);
        jTable1.setModel(t);
        
        TableModel modelo = jTable1.getModel();
        
        String equipoSeleccionado = equipoComboBox.getSelectedItem().toString();
        
        consultar = null;
        for (Equipo e: Proyecto.equipos){
            if(e.getNombreEquipo().equals(equipoSeleccionado)){
                consultar = e;
                break;
            }
        }
        if(consultar != null){
            for(Usuario u: Proyecto.usuarios){
                if(consultar.getMiembros().contains(u.getNombre()) || consultar.getGerente().equals(u.getNombre())){
                       Object []fila = {u.getNombre(),u.getApellido(),u.getCorreo(),u.getRol()};
                        ((DefaultTableModel)modelo).addRow(fila);
                     
                }
            }
        }*/
    }//GEN-LAST:event_consultarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultarButton;
    private javax.swing.JComboBox<String> equipoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
