/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Analizadores.LexerCup;
import Analizadores.parser;
import Objetos.Catedratico;
import Objetos.Curso;
import Objetos.Edificio;
import Objetos.Estudiante;
import Objetos.Horario;
import Objetos.Salon;
import Objetos.Usuario;
import com.mycompany.finaledd.Logica;
import com.mycompany.finaledd.Main;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author James Gramajo
 */
public class Form extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();

    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    NumeroLinea numeroLinea;
    String fichero = null;
    ArrayList<Usuario> lstUsuario = new ArrayList();
	ArrayList<Catedratico> lstCatedratico = new ArrayList();
	ArrayList<Curso> lstCurso = new ArrayList();
	ArrayList<Edificio> lstEdificio = new ArrayList();
	ArrayList<Estudiante> lstEstudiante = new ArrayList();
	ArrayList<Horario> lstHorario = new ArrayList();
	ArrayList<Salon> lstSalon = new ArrayList();

    public Form() {
        initComponents();
        numeroLinea = new NumeroLinea(jTextArea);
        jScrollPane1.setRowHeaderView(numeroLinea);

    }

    public String AbrirArchivo(File fichero) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int a;
            while ((a = entrada.read()) != -1) {
                char caracter = (char) a;
                documento += caracter;
            }
            entrada.close();
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        //jTextArea.setText(documento);
        return documento;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        Guardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        respuestaArea = new javax.swing.JTextArea();
        Menu = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jTextArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextAreaMouseMoved(evt);
            }
        });
        jTextArea.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                jTextAreaAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        jTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea);

        Guardar.setBackground(new java.awt.Color(204, 204, 204));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        respuestaArea.setColumns(20);
        respuestaArea.setRows(5);
        jScrollPane2.setViewportView(respuestaArea);

        Menu.setText("ir al Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(521, 521, 521)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAreaAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jTextAreaAncestorMoved
        // TODO add your handling code here:
        //jScrollPane1.setRowHeaderView(numeroLinea);
    }//GEN-LAST:event_jTextAreaAncestorMoved

    private void jTextAreaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaMouseMoved
        // TODO add your handling code here:
        jScrollPane1.setRowHeaderView(numeroLinea);
    }//GEN-LAST:event_jTextAreaMouseMoved

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                String documento = AbrirArchivo(archivo);
                fichero = seleccionar.getSelectedFile() + "";
                jTextArea.setText("");
                jTextArea.setText(documento);
            }
        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaKeyTyped
        // TODO add your handling code here:
        jScrollPane1.setRowHeaderView(numeroLinea);
    }//GEN-LAST:event_jTextAreaKeyTyped

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        try {
            String entrada="";
            StringReader entradaa = new StringReader(entrada);
            //System.out.println(entrada);

            LexerCup lexer = new LexerCup(entradaa);
            parser parse = new parser(lexer);
            parse.getLstCatedratico();
            parse.parse();
            
            /*
            
                ArrayList<Usuario> lstUsuario = new ArrayList();
	ArrayList<Catedratico> lstCatedratico = new ArrayList();
	ArrayList<Curso> lstCurso = new ArrayList();
	ArrayList<Edificio> lstEdificio = new ArrayList();
	ArrayList<Estudiante> lstEstudiante = new ArrayList();
	ArrayList<Horario> lstHorario = new ArrayList();
	ArrayList<Salon> lstSalon = new ArrayList();
            
            */
            lstUsuario=parse.getLstUsuario();
            lstCatedratico=parse.getLstCatedratico();
            lstCurso=parse.getLstCurso();
            lstEdificio=parse.getLstEdificio();
            lstEstudiante=parse.getLstEstudiante();
            lstSalon=parse.getLstSalon();
            lstHorario=parse.getLstHorario();
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        FRAME menu= new FRAME();
        menu.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Guardar;
    private javax.swing.JButton Menu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextArea respuestaArea;
    // End of variables declaration//GEN-END:variables
}
