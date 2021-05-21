/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finaledd;

import Archivo.GestorArchivo;
import Catedratico_AVL.ArbolAVLu;
import Cursos.*;
import Edificios.*;
import Salones.listaSalon;
import javax.swing.JOptionPane;

/**
 *
 * @author James Gramajo
 */
public class Logica {

    ArbolAVLu avl = new ArbolAVLu();
    ListaEdificio edif = new ListaEdificio();
    listaSalon salones = new listaSalon();
    ListaCursos cur= new ListaCursos();

    public Logica() {

    }

//    public void generarEdificioSalon() {
//
////////        ListaEdificio l1= new ListaEdificio();
////////        l1.insertarNodo("G");
////////        l1.insertarNodo("E");
////////        l1.insertarNodo("D");
////////
////////        
////////        l1.buscarNodoIngesaSalon("G", "210", "90");
////////        l1.buscarNodoIngesaSalon("G", "215", "90");
////////        l1.buscarNodoIngesaSalon("G", "220", "90");
////////        l1.buscarNodoIngesaSalon("G", "230", "90");
////////        l1.buscarNodoIngesaSalon("E", "110", "81");
////////        l1.buscarNodoIngesaSalon("D", "230", "71");
////////        l1.buscarNodoIngesaSalon("E", "240", "21");
////////        l1.buscarNodoIngesaSalon("D", "340", "41");
////////        l1.formato_grafica();
//////////
////////        GraficarEdificioSalon(l1);
//        avl.insertar(1020, "Oliver", "Guatemala");
//        avl.insertar(1903, "James", "USA");
//        avl.insertar(2023, "Mauricio", "Costa Rica");
//        avl.insertar(2022, "Franccesca", "Colombia");
//        avl.insertar(2027, "Deiffy", "Panama");
//        avl.insertar(2030, "Angela", "Panama");
//        avl.insertar(2031, "Vanessa", "Colombia");
//
//        //GraficarCatedraticosPRE(avl);
//
//        
//    }
    public void AgregarCatedratico(){
        int a= pedirID();
        String b = JOptionPane.showInputDialog("Ingresa el NOMBRE del Catedratico:\n");
        String c = JOptionPane.showInputDialog("Ingresa la DIRECCION del Catedratico:\n");
        avl.insertar(a, b, c);
    }
    public void EliminarCatedratico(){
        int a= pedirID();
        
    }
    public int pedirID(){
        int id=0;
        try{
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID del Catedratico:\n"));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"EL CARACTER ES INCORRECTO DEBE SER NUMERICO");
            pedirID();
        }
        return id;
    }

    public void GraficarEdificioSalon() {
        String formato = "digraph G { \n node [shape= record fontsize=12 ] ";

        /*formato+="" +
                "  rankdir=\"LR\";";*/
        GestorArchivo gst = new GestorArchivo();
        edif.formato_grafica();
        formato += edif.getFORMATO();

        formato += "\n}";
        gst.GuardarArchivoDOT(formato, "EdificioSalon.txt");
        gst.generar("EdificioSalon.txt", "EdificioSalon.png");
    }

    public void AgregarEdificio() {
        String a = JOptionPane.showInputDialog("Ingresa el nombre del edificio:\n");
        
        edif.insertarNodo(a);
    }

    public void EliminarEdificio() {
        try {
            String a = JOptionPane.showInputDialog("Ingresa el nombre del edificio para eliminar:\n");
            edif.eliminarNodo(a);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ModificarEdificio() {
        try {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void AgregarSalon() {
        try {

            String a = JOptionPane.showInputDialog("Ingresa el Edifico donde se va agregar el salon:\n");
            String b = JOptionPane.showInputDialog("Ingresa el numero del salon:\n");
            String c = JOptionPane.showInputDialog("Ingresa la cantidad de estudiantes:\n");
            edif.buscarNodoIngesaSalon(a, b, c);
            //salones.insertarNodoi(a, b, c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void EliminarSalon() {
        String a = JOptionPane.showInputDialog("Ingresa el edificio donde se encuentra el salon:\n");
        String b = JOptionPane.showInputDialog("Ingresa el numero de Salon a eliminar:\n");
        edif.buscarNodoEliminaSalon(a, b);
        
    }

    public void GraficarCatedraticosPRE() {
        String formato = "digraph G { \n node [shape= record fontsize=12 ] ";
        /*formato+="" +
                "  rankdir=\"LR\";";*/
        GestorArchivo gst = new GestorArchivo();
        avl.setFORMATO_PREORDEN("");
        avl.preOrden(avl.obtenerRaiz());
        formato += avl.getFORMATO_PREORDEN();
        formato += "\n}";
        gst.GuardarArchivoDOT(formato, "AVL_CATEDRATICO.txt");
        gst.generar("AVL_CATEDRATICO.txt", "AVL_CATEDRATICO.png");
    }

    public void GraficarCatedraticosIN() {
        String formato = "digraph G { \n node [shape= record fontsize=12 ] ";
        /*formato+="" +
                "  rankdir=\"LR\";";*/
        GestorArchivo gst = new GestorArchivo();
        avl.setFORMATO_INORDEN("");
        avl.inOrden(avl.obtenerRaiz());
        formato += avl.getFORMATO_INORDEN();
        formato += "\n}";
        gst.GuardarArchivoDOT(formato, "AVL_CATEDRATICO.txt");
        gst.generar("AVL_CATEDRATICO.txt", "AVL_CATEDRATICO.png");
    }

    public void GraficarCatedraticosPOST() {
        String formato = "digraph G { \n node [shape= record fontsize=12 ] ";
        /*formato+="" +
                "  rankdir=\"LR\";";*/
        GestorArchivo gst = new GestorArchivo();
        avl.setFORMATO_POSTORDEN("");
        avl.postOrden(avl.obtenerRaiz());
        formato += avl.getFORMATO_POSTORDEN();
        formato += "\n}";
        gst.GuardarArchivoDOT(formato, "AVL_CATEDRATICO.txt");
        gst.generar("AVL_CATEDRATICO.txt", "AVL_CATEDRATICO.png");
    }
    public void AgregarCurso(){
        try{
        int a = pedirIDCURSO();
        String b = JOptionPane.showInputDialog("Ingresa el NOMBRE del curso:\n");
        String c = JOptionPane.showInputDialog("Ingresa el SEMESTRE del curso:\n");
        String d = JOptionPane.showInputDialog("Ingresa los CREDITOS del curso:\n");

        cur.insertarNodo(a, b, c, d);
        
        } catch(Exception e){
            
        }
        
    }
    public int pedirIDCURSO(){
        int id=0;
        try{
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID del CURSO:\n"));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"EL CARACTER ES INCORRECTO DEBE SER NUMERICO");
            pedirIDCURSO();
        }
        return id;
    }
    public void GraficarCurso() {
        String formato = "digraph G { \n node [shape= record fontsize=12 ] ";

        /*formato+="" +
                "  rankdir=\"LR\";";*/
        GestorArchivo gst = new GestorArchivo();
        cur.formato_grafica();
        formato += cur.getFORMATO();

        formato += "\n}";
        gst.GuardarArchivoDOT(formato, "CURSOS.txt");
        gst.generar("CURSOS.txt", "CURSOS.png");
    }



}
