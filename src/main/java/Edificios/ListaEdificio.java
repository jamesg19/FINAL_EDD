/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Edificios;

import Salones.listaSalon;
import Usuarios.*;
import java.util.ArrayList;

/**
 * 
 * @author James Gramajo 
 */
public class ListaEdificio {
    
    nodoEdificio primero;
    nodoEdificio ultimo;
    String FORMATO="";
    ArrayList<String> listaEdificios=new ArrayList();
//    String nombre;
//    String password;
//    String tipo;

    public ListaEdificio() {
        primero=null;
        ultimo=null;
    }
    public void insertarNodo(String newId){
        nodoEdificio nuevo= new nodoEdificio();
        nuevo.id=newId;
        
        if(primero ==null){
            primero=nuevo;
            primero.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
            
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
            primero.anterior=ultimo;
        }
    }
    public void buscarNodoIngesaSalon(String idBuscado, String Salon, String Alumnos){
        nodoEdificio actual= new nodoEdificio();
        actual=ultimo;
        do{
            if(actual.id==idBuscado){
                actual.ListaAulas.insertarNodoi(idBuscado, Salon, Alumnos);

            }
            actual=actual.anterior;
        }while(actual!=ultimo);
        
    }
    public void modificarNodo(String Id_modificar, String newId){
        nodoEdificio actual= new nodoEdificio();
        actual=primero;
        do{
            if(actual.id==Id_modificar){
                System.out.println("SE ENCONTRO EL NODO "+Id_modificar);
                System.out.println("SE MODIFICO POR ID NUEVO: "+newId);
                actual.id=newId;
            }
            actual=actual.siguiente;
        }while(actual!=primero);
    }
    public void modificarNodoTODO(String Id_modificar, String newId, String nombre, String password, String tipo){
        nodoEdificio actual= new nodoEdificio();
        actual=primero;
        do{
            if(actual.id==Id_modificar){
                
                System.out.println("SE ENCONTRO EL Usuario "+Id_modificar);
                
                actual.id=newId;
            }
            actual=actual.siguiente;
        }while(actual!=primero);
    }
    public void eliminarNodo(String id_eliminar){
        nodoEdificio actual= new nodoEdificio();
        nodoEdificio anterior= new nodoEdificio();
        actual=primero;
        anterior= ultimo;
        do{
            if(actual.id==id_eliminar){
                System.out.println("SE ELIMINO EL Salon: ID: "+id_eliminar);
                if(actual==primero){
                    primero=primero.siguiente;
                    ultimo.siguiente=ultimo;
                    primero.anterior=ultimo;
                    
                }else if(actual==ultimo){
                    
                        ultimo=anterior;
                        primero.anterior=ultimo;
                        ultimo.siguiente=primero;
                        
                    
                } else{
                    anterior.siguiente=actual.siguiente;
                    actual.siguiente.anterior=anterior;
                    
                    
                }
                
            }
            anterior=actual;
            actual=actual.siguiente;
        } while(actual!=primero);
        
    }
    public void mostrarLista(){
        nodoEdificio actual= new nodoEdificio();
        actual=primero;
        do{
            System.out.println("ID "+actual.id+" Nombre: "+actual.id);
            actual=actual.siguiente;
        }while(actual!= primero);
        
    }
    public void formato_grafica(){

        nodoEdificio actual= new nodoEdificio();
        actual=primero;
        do{
            listaEdificios.add(actual.id);
            System.out.println(actual.id);
            FORMATO+="\n";
            FORMATO+="\"Edificio: "+actual.id+"\"->\"Edificio: "+actual.siguiente.id+"\";\n";
            FORMATO+="\"Edificio: "+actual.siguiente.id+"\"->\"Edificio: "+actual.id+"\";\n";
            actual.ListaAulas.verListaImagen();
            FORMATO+=actual.ListaAulas.getFORMATO();
            actual=actual.siguiente;
        }while(actual!= primero);
        
    
    }

    public String getFORMATO() {
        return FORMATO;
    }

    public void setFORMATO(String FORMATO) {
        this.FORMATO = FORMATO;
    }

}
