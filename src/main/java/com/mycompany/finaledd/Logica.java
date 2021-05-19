/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.finaledd;

import Archivo.GestorArchivo;
import Catedratico_AVL.ArbolAVLu;
import Edificios.ListaEdificio;
import Salones.listaSalon;

/**
 * 
 * @author James Gramajo 
 */
public class Logica {
    
    public Logica(){
        
    }
    public void generarEdificioSalon(){
        
//////        ListaEdificio l1= new ListaEdificio();
//////        l1.insertarNodo("G");
//////        l1.insertarNodo("E");
//////        l1.insertarNodo("D");
//////
//////        
//////        l1.buscarNodoIngesaSalon("G", "210", "90");
//////        l1.buscarNodoIngesaSalon("G", "215", "90");
//////        l1.buscarNodoIngesaSalon("G", "220", "90");
//////        l1.buscarNodoIngesaSalon("G", "230", "90");
//////        l1.buscarNodoIngesaSalon("E", "110", "81");
//////        l1.buscarNodoIngesaSalon("D", "230", "71");
//////        l1.buscarNodoIngesaSalon("E", "240", "21");
//////        l1.buscarNodoIngesaSalon("D", "340", "41");
//////        l1.formato_grafica();
////////
//////        GraficarEdificioSalon(l1);

        ArbolAVLu avl= new ArbolAVLu();
        avl.insertar(1020, "Oliver", "Guatemala");
        avl.insertar(1903, "James", "USA");
        avl.insertar(2023, "Mauricio", "Costa Rica");
        avl.insertar(2022, "Franccesca", "Colombia");
        avl.insertar(2027, "Deiffy", "Panama");
        avl.insertar(2030, "Angela", "Panama");
        avl.insertar(2031, "Vanessa", "Colombia");
        
        
        GraficarCatedraticosPRE(avl);
        
    }
    
    
    public void GraficarEdificioSalon(ListaEdificio l1){
        String formato="digraph G { \n node [shape= record fontsize=12 ] ";
        
        /*formato+="" +
                "  rankdir=\"LR\";";*/
        GestorArchivo gst= new GestorArchivo();
        formato+=l1.getFORMATO();

        formato+="\n}";
        gst.GuardarArchivoDOT(formato, "General.txt");
        gst.generar("General.txt", "General.png");
    }
    
    public void GraficarCatedraticosPRE(ArbolAVLu l1){
        String formato="digraph G { \n node [shape= record fontsize=12 ] ";
        /*formato+="" +
                "  rankdir=\"LR\";";*/
        GestorArchivo gst= new GestorArchivo();
        l1.setFORMATO_PREORDEN("");
        l1.preOrden(l1.obtenerRaiz());
        formato+=l1.getFORMATO_PREORDEN();
        formato+="\n}";
        gst.GuardarArchivoDOT(formato, "AVL_CATEDRATICO.txt");
        gst.generar("AVL_CATEDRATICO.txt", "AVL_CATEDRATICO.png");
    }
    public void GraficarCatedraticosIN(ArbolAVLu l1){
        String formato="digraph G { \n node [shape= record fontsize=12 ] ";
        /*formato+="" +
                "  rankdir=\"LR\";";*/
        GestorArchivo gst= new GestorArchivo();
        l1.setFORMATO_INORDEN("");
        l1.inOrden(l1.obtenerRaiz());
        formato+=l1.getFORMATO_INORDEN();
        formato+="\n}";
        gst.GuardarArchivoDOT(formato, "AVL_CATEDRATICO.txt");
        gst.generar("AVL_CATEDRATICO.txt", "AVL_CATEDRATICO.png");
    }
    public void GraficarCatedraticosPOST(ArbolAVLu l1){
        String formato="digraph G { \n node [shape= record fontsize=12 ] ";
        /*formato+="" +
                "  rankdir=\"LR\";";*/
        GestorArchivo gst= new GestorArchivo();
        l1.setFORMATO_POSTORDEN("");
        l1.postOrden(l1.obtenerRaiz());
        formato+=l1.getFORMATO_POSTORDEN();
        formato+="\n}";
        gst.GuardarArchivoDOT(formato, "AVL_CATEDRATICO.txt");
        gst.generar("AVL_CATEDRATICO.txt", "AVL_CATEDRATICO.png");
    }
    

}
