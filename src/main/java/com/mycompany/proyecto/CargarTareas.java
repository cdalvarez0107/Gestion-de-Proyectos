/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

import static com.mycompany.proyecto.Proyecto.proyectos;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author carlos
 */
public class CargarTareas extends javax.swing.JFrame {

    public static void mostrarInformacionTarea(JSONObject jsonObject) {
        
        
        
        
    }

    /**
     * Creates new form CargarTareas
     */
    public CargarTareas() {
        initComponents();
        llenarComboBoxPr();
    }
    
    public void llenarComboBoxPr(){
        
        Equipo equipoSeleccionado = null;
        for(Equipo e : Proyecto.equipos){
            if(e.getGerente().equals(PaginaGerente.usuario.getNombre())){
                equipoSeleccionado = e;
                for(Proyectos p: equipoSeleccionado.getProyectos()){
                    proyectoComboBox.addItem(p.getNombreProyecto());
                }
                break;
            }
        }
    }
    
    private void leerJSON(File archivo){
        JSONParser jsonParser = new JSONParser();
        
        try(FileReader reader = new FileReader(archivo)){
            Object obj = jsonParser.parse(reader);
            
            JSONArray tareasList = (JSONArray) obj;
            
            for(Object tareaa: tareasList){
                JSONObject tarea = (JSONObject) tareaa;
                    String id = (String) tarea.get("id");
                    String titulo = (String) tarea.get("titulo");
                    String descripcion = (String) tarea.get("descripcion");
                    String finicio = (String) tarea.get("fechaInicio");
                    String ffinalizacion = (String) tarea.get("fechaFin");
                    String estado = (String) tarea.get("estado");
                    String usuario = (String) tarea.get("usuarioAsignado");
                    String nombreProyecto = proyectoComboBox.getSelectedItem().toString();
                    
                    
                    Tarea tareaNueva = new Tarea();
                    tareaNueva.setIdTarea(Integer.parseInt(id));
                    tareaNueva.setTituloTarea(titulo);
                    tareaNueva.setDescripcionTarea(descripcion);
                    tareaNueva.setFechaInicio(finicio);
                    tareaNueva.setFechaFinalizacion(ffinalizacion);
                    tareaNueva.setEstado(estado);
                    tareaNueva.setUsuario(usuario);
                    tareaNueva.setNombreProyecto(nombreProyecto);
                    Proyecto.tareas.add(tareaNueva);
                    
                    
                        Proyectos proyectoSeleccionado = null;
                        for(Proyectos p: Proyecto.proyectos){
                            if(p.getNombreProyecto().equals(nombreProyecto)){
                                proyectoSeleccionado = p;
                                break;
                            }
                        }
                    
                        Tarea tareaSeleccionada = null;
                        for(Tarea t: Proyecto.tareas){
                            if(t.getTituloTarea().equals(titulo)){
                                tareaSeleccionada = t;
                                break;
                            }
                        }
                        String usuariose = usuario;

                        if(usuariose!=null && tareaSeleccionada!=null && proyectoSeleccionado!=null){
                            tareaSeleccionada.setUsuario(usuariose);
                            proyectoSeleccionado.asignarTarea(tareaNueva);
                            JOptionPane.showMessageDialog(this, "Tarea asignada exitosamente");
                        }
            }
            llenarTabla();
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }
    
    private void llenarTabla() {
        
        DefaultTableModel t = new DefaultTableModel(new String []{"ID","Titulo","Descripcion","Fecha de Inicio","Fecha de Finalizacion","Proyecto","Usuario a Cargo","Estado"},Proyecto.tareas.size());
        
        jTable1.setModel(t);
        
        TableModel modelo = jTable1.getModel();
        
        for (int i=0; i<Proyecto.tareas.size(); i++){
            Tarea ta = Proyecto.tareas.get(i);
            modelo.setValueAt(ta.getIdTarea(), i, 0);
            modelo.setValueAt(ta.getTituloTarea(),i,1);
            modelo.setValueAt(ta.getDescripcionTarea(), i,2);
            modelo.setValueAt(ta.getFechaInicio(), i,3);
            modelo.setValueAt(ta.getFechaFinalizacion(), i, 4);
            modelo.setValueAt(ta.getNombreProyecto(), i,5);
            modelo.setValueAt(ta.getUsuario(), i, 6);
            modelo.setValueAt(ta.getEstado(),i,7);
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
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Carga masiva de Tareas");

        jLabel2.setText("Seleccione el Proyecto:");

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(jTable1);

        jMenu1.setText("Regresar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(proyectoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(253, 253, 253))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(proyectoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos JSON", "json");
        
        fileChooser.setFileFilter(filtro);
        
        int seleccion = fileChooser.showOpenDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File archivo = fileChooser.getSelectedFile();
            leerJSON(archivo);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JComboBox<String> proyectoComboBox;
    // End of variables declaration//GEN-END:variables
}
