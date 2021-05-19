/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salones;

import java.util.ArrayList;

/**
 *
 * @author James Gramajo
 */
public class listaSalon {

    private String edificio;
    private String salon;
    private String estudiantes;
    String FORMATO = "";
    nodo2 primero;
    nodo2 ultimo;

    public listaSalon() {
        primero = null;
        ultimo = null;

    }

    public void insertarNodoi(String edificio, String salon, String estudiantes) {
        nodo2 nuevoNodo = new nodo2();
        //sera el dato del nuevo noto
        nuevoNodo.edificio = edificio;
        nuevoNodo.salon = salon;
        nuevoNodo.estudiantes = estudiantes;

        if (primero == null) {
            primero = nuevoNodo;
            primero.siguiente = null;
            ultimo = primero;
        } else {
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = null;
            ultimo = nuevoNodo;
        }

    }
//    public void modificarNodo(int id,int newId){
//        nodo2 actual = new nodo2();
//        actual= primero;
//        while(actual!=null){
//            if(actual.dato==id){
//                
//                actual.dato=newId;
//                //return true;
//            }
//            actual=actual.siguiente;
//            
//        }
//        //return false;
//    }

    public void eliminarNodo(String salon) {
        nodo2 actual = new nodo2();
        nodo2 anterior = new nodo2();

        actual = primero;
        anterior = null;

        while (actual != null) {
            if (actual.salon == salon) {
                if (actual == primero) {
                    primero = primero.siguiente;

                } else {
                    anterior.siguiente = actual.siguiente;

                }

            }
            anterior = actual;
            actual = actual.siguiente;
        }

    }

    public void buscarNodo(String salon) {
        nodo2 actual = new nodo2();
        actual = primero;
        while (actual != null) {
            if (actual.salon == salon) {
                System.out.println("SE ENCONTRO EL SALON : " + salon);
            }
            actual = actual.siguiente;
        }
    }

    public void verListaImagen() {
        nodo2 actual = new nodo2();
        actual = primero;
        String edif = actual.edificio;

        FORMATO += "\n\"Edificio: " + actual.edificio + "\"->\"Salon: " + actual.salon + "\nAlumnos: " + actual.estudiantes + "\";\n";
        while (actual != null) {
            if (actual.siguiente != null) {
                System.out.println("Salon " + actual.salon);
                FORMATO += "\"Salon: " + actual.salon + "\nAlumnos: " + actual.estudiantes + "\"->\"Salon: " + actual.siguiente.salon + "\nAlumnos: " + actual.siguiente.estudiantes + "\";\n";
                actual = actual.siguiente;
            } else {
                //FORMATO+="\"Salon: "+actual.salon+"\nAlumnos: "+actual.estudiantes+"\"->";
                actual = actual.siguiente;
            }
        }
    }

    public void verListaImagen2(ArrayList<String> listaEdificios) {
        for (int i=0;i<listaEdificios.size();i++ ) {
            
            nodo2 actual = new nodo2();
            actual = primero;
            String edif = actual.edificio;

                
                FORMATO += "\n\"Edificio: " + actual.edificio + "\"->\"Salon: " + actual.salon + "\nAlumnos: " + actual.estudiantes + "\";\n";
                while (actual != null && actual.edificio.equalsIgnoreCase(listaEdificios.get(i)) ) {
                    if (actual.siguiente != null) {
                        System.out.println("Salon " + actual.salon);
                        FORMATO += "\"Salon: " + actual.salon + "\nAlumnos: " + actual.estudiantes + "\"->\"Salon: " + actual.siguiente.salon + "\nAlumnos: " + actual.siguiente.estudiantes + "\";\n";
                        actual = actual.siguiente;
                    } else {
                        //FORMATO+="\"Salon: "+actual.salon+"\nAlumnos: "+actual.estudiantes+"\"->";
                        actual = actual.siguiente;
                    }

                }
                
                
            
        }
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

}
