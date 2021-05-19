/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Archivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 
 * @author James Gramajo 
 */
public class GestorArchivo {
    String PathFijo="C:\\Users\\james\\Desktop\\";
    private String ContenidoArchivo;
    private boolean ExisteArchivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    public boolean GuardarArchivoDOT( String documento,String nombre) {
        String mensaje = null;
        boolean bandera=false;
        try {
            
            File fil= new File(PathFijo+nombre);
            salida = new FileOutputStream(fil);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            salida.close();
            bandera=true;
            salida.close();
            
        } catch (Exception e) {

        }
        return bandera;
    }

    //ar.generar("listaImagen.txt", "listaImagen.png");
    public void generar(String codigo, String img) {
        try {

            String dotPath = "C:\\Program Files\\Graphviz\\bin\\dot.exe";
            String fileInputPath = PathFijo+"\\"+codigo;
            String fileOutputPath = PathFijo+"\\"+img;
            String tParam = "-Tpng"
                    + "";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }

}
