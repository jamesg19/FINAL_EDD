/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cursos;

import Usuarios.*;

/**
 * 
 * @author James Gramajo 
 */
public class ListaCursos {
    NodoCurso primero;
    NodoCurso ultimo;
//    String nombre;
//    String semestre;
//    String creditos;

    public ListaCursos() {
        primero=null;
        ultimo=null;
    }
    public void insertarNodo(int newId, String nombre, String semestre, String creditos){
        NodoCurso nuevo= new NodoCurso();
        nuevo.id=newId;
        nuevo.nombre=nombre;
        nuevo.semestre=semestre;
        nuevo.creditos=creditos;
        
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
    public void buscarNodo(int idBuscado){
        NodoCurso actual= new NodoCurso();
        actual=ultimo;
        do{
            if(actual.id==idBuscado){
                
            }
            actual=actual.anterior;
        }while(actual!=ultimo);
        
    }
    public void modificarNodo(int Id_modificar, int newId){
        NodoCurso actual= new NodoCurso();
        actual=primero;
        do{
            if(actual.id==Id_modificar){
                System.out.println("SE ENCONTRO EL CURSO "+Id_modificar);
                System.out.println("SE MODIFICO POR ID NUEVO: "+newId);
                actual.id=newId;
            }
            actual=actual.siguiente;
        }while(actual!=primero);
    }
    public void modificarNodoTODO(int Id_modificar, int newId,  String nombre, String semestre, String creditos){
        NodoCurso actual= new NodoCurso();
        actual=primero;
        do{
            if(actual.id==Id_modificar){
                System.out.println("SE ENCONTRO EL Usuario "+Id_modificar);
                
                actual.id=newId;
                actual.nombre=nombre;
                actual.semestre=semestre;
                actual.creditos=creditos;
            }
            actual=actual.siguiente;
        }while(actual!=primero);
    }
    public void eliminarNodo(int id_eliminar){
        NodoCurso actual= new NodoCurso();
        NodoCurso anterior= new NodoCurso();
        actual=primero;
        anterior= ultimo;
        do{
            if(actual.id==id_eliminar){
                System.out.println("SE ELIMINO EL Curso: ID: "+id_eliminar+" Nombre: "+actual.nombre+" del Semestre "+actual.semestre);
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
        NodoCurso actual= new NodoCurso();
        actual=primero;
        do{
            System.out.println("ID "+actual.id+" Nombre: "+actual.nombre+" Password "+actual.semestre+" Tipo "+actual.creditos);
            actual=actual.siguiente;
        }while(actual!= primero);
        
    }
    
    
    

}
