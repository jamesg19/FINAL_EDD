/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

import java.util.ArrayList;

/**
 * 
 * @author James Gramajo 
 */
public class Colaborador  {
    ArrayList<Usuario> lstUsuario = new ArrayList();
	ArrayList<Catedratico> lstCatedratico = new ArrayList();
	ArrayList<Curso> lstCurso = new ArrayList();
	ArrayList<Edificio> lstEdificio = new ArrayList();
	ArrayList<Estudiante> lstEstudiante = new ArrayList();
	ArrayList<Horario> lstHorario = new ArrayList();
	ArrayList<Salon> lstSalon = new ArrayList();

    public ArrayList<Usuario> getLstUsuario() {
        return lstUsuario;
    }

    public ArrayList<Catedratico> getLstCatedratico() {
        return lstCatedratico;
    }
    public ArrayList<Curso> getLstCurso() {
        return lstCurso;
    }

    public ArrayList<Edificio> getLstEdificio() {
        return lstEdificio;
    }

    public void setLstEdificio(ArrayList<Edificio> lstEdificio) {
        this.lstEdificio = lstEdificio;
    }

    public ArrayList<Estudiante> getLstEstudiante() {
        return lstEstudiante;
    }


    public ArrayList<Horario> getLstHorario() {
        return lstHorario;
    }


    public ArrayList<Salon> getLstSalon() {
        return lstSalon;
    }
        
}
