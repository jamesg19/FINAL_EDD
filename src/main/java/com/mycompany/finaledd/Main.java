/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finaledd;

import Analizadores.LexerCup;
import Analizadores.parser;
import Archivo.GestorArchivo;
import Edificios.ListaEdificio;
import Salones.*;
import Salones.listaSalon;
import Usuarios.ListaCD;
import Ventanas.FRAME;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James Gramajo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Logica log= new Logica();
//        log.generarEdificioSalon();
            FRAME fr= new FRAME();
            fr.setVisible(true);
//        try {
//            String entrada = "Estudiante(200145785, \"Fernando Marroquín\", \"Mixco\");\n"
//                    + "Estudiante(200745781, \"Alfonso Antonio\", \"Guatemala\");\n"
//                    + "Estudiante(200478542, \"Mario Morales\", \"Villa Nueva\");\n"
//                    + "Usuario(1, Secretaria, \"lasecre\",\"contra123\", colaborador);\n"
//                    + "Usuario(2, Control, \"control123\",\"contra1234\", colaborador);\n"
//                    + "Usuario(200145785, FMarroquín, \"fffmmm\", estudiante);\n"
//                    + "Usuario(200745781, Ulises, \"uliuli\", estudiante);\n"
//                    + "\n"
//                    + "Catedratico(12345,\"Prof1\",\"Ciudad\");\n"
//                    + "Catedratico(47854, \"Prof2\", \"Ciudad\");\n"
//                    + "Catedratico(12445, \"Prof3\", \"Ciudad\");\n"
//                    + "Catedratico(47354, \"Prof4\", \"Ciudad\");\n"
//                    + "Catedratico(12365, \"Prof5\", \"Ciudad\");\n"
//                    + "Edificio(\"T1\");\n"
//                    + "Edificio(\"T5\");\n"
//                    + "Edificio(\"T3\");\n"
//                    + "Salon(\"T3\", 110, 75);\n"
//                    + "Salon (\"T5\", 305, 25);\n"
//                    + "Salon (\"T3\", 310, 125);\n"
//                    + "Curso (777,\"compiladores1\", 5,4);\n"
//                    + "Curso (771,\"programacion2\", 4, 4);\n"
//                    + "Curso (779,\"Arquitectura de computadoras y ensambladores 2\", 7, 4);\n"
//                    + "Curso (732,\"Estadistica 1\", 4, 4);\n"
//                    + "Curso (795,\"Leguajes formales\", 4, 4);\n"
//                    + "Horario(1,\"7:10am-8:00am\",\"lunes\",777,105,t3,12345);\n"
//                    + "Horario(2,\"8:00am-8:50am\",\"lunes\",777,105,t3,12345);\n"
//                    + "Horario(3,\"7:10am-8:00am\",\"viernes\",777,105,t3,47854);\n"
//                    + "Horario(4,\"8:00am-8:50am\",\"viernes\",777,105,t3,47854);\n"
//                    + "Horario(5,\"7:10am-8:00am\",\"martes\",771,109,t3,12345);\n"
//                    + "Horario(6,\"8:00am-8:50am\",\"martes\",771,109,t3,12345);\n"
//                    + "Horario(7,\"7:10am-8:00am\",\"jueves\",771,109,t3,47854);\n"
//                    + "Horario(8,\"8:00am-8:50am\",\"jueves\",771,109,t3,47854);\n"
//                    + "Horario(9,\"9:10am-10:00am\",\"martes\",779,110,t3,12445);\n"
//                    + "Horario(10,\"10:00am-10:50am\",\"martes\",779,110,t3,12445);\n"
//                    + "Horario(11,\"9:10am-10:00am\",\"jueves\",779,110,t3,12365);\n"
//                    + "Horario(12,\"10:00am-10:50am\",\"jueves\",779,110,t3,12365);\n"
//                    + "Asignar (200145785, 1, 30, 25);\n"
//                    + "Asignar (200745781, 2, 60, 10);\n"
//                    + "Asignar (200478542, 3, 70, 20);"
//                    + "";
//            StringReader entradaa = new StringReader(entrada);
//            //System.out.println(entrada);
//
//            LexerCup lexer = new LexerCup(entradaa);
//            parser parse = new parser(lexer);
//            parse.parse();
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }

}
