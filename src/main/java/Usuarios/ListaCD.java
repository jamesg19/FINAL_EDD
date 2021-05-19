/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Usuarios;

/**
 * 
 * @author James Gramajo 
 */
public class ListaCD {
    nodoCD primero;
    nodoCD ultimo;
    String FORMATO="";
//    String nombre;
//    String password;
//    String tipo;

    public ListaCD() {
        primero=null;
        ultimo=null;
    }
    public void insertarNodo(int newId, String nombre, String password, String tipo){
        nodoCD nuevo= new nodoCD();
        nuevo.id=newId;
        nuevo.nombre=nombre;
        nuevo.password=password;
        nuevo.tipo=tipo;
        
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
        nodoCD actual= new nodoCD();
        actual=ultimo;
        do{
            if(actual.id==idBuscado){
                
            }
            actual=actual.anterior;
        }while(actual!=ultimo);
        
    }
    public void modificarNodo(int Id_modificar, int newId){
        nodoCD actual= new nodoCD();
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
    public void modificarNodoTODO(int Id_modificar, int newId, String nombre, String password, String tipo){
        nodoCD actual= new nodoCD();
        actual=primero;
        do{
            if(actual.id==Id_modificar){
                System.out.println("SE ENCONTRO EL Usuario "+Id_modificar);
                
                actual.id=newId;
                actual.nombre=nombre;
                actual.password=password;
                actual.tipo=tipo;
            }
            actual=actual.siguiente;
        }while(actual!=primero);
    }
    public void eliminarNodo(int id_eliminar){
        nodoCD actual= new nodoCD();
        nodoCD anterior= new nodoCD();
        actual=primero;
        anterior= ultimo;
        do{
            if(actual.id==id_eliminar){
                System.out.println("SE ELIMINO EL Usuario: ID: "+id_eliminar+" Nombre: "+actual.nombre);
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
        nodoCD actual= new nodoCD();
        actual=primero;
        do{
            System.out.println("ID "+actual.id+" Nombre: "+actual.nombre+" Password "+actual.password+" Tipo "+actual.tipo);
            actual=actual.siguiente;
        }while(actual!= primero);
        
    }
    public void formato_grafica(){

        nodoCD actual= new nodoCD();
        actual=primero;
        do{
            System.out.println(actual.id);
            FORMATO+="\n";
            FORMATO+="\""+actual.id+"\n"+actual.tipo+"\n"+actual.nombre+"\n"+actual.password+"\"->\n\""+actual.siguiente.id+"\n"+actual.siguiente.tipo+"\n"+actual.siguiente.nombre+"\n"+actual.siguiente.password+"\";\n";
            FORMATO+="\n";
            FORMATO+="\""+actual.siguiente.id+"\n"+actual.siguiente.tipo+"\n"+actual.siguiente.nombre+"\n"+actual.siguiente.password+"\"->\n\""+actual.id+"\n"+actual.tipo+"\n"+actual.nombre+"\n"+actual.password+"\";\n";
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
