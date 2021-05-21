/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

/**
 * 
 * @author James Gramajo 
 */
public class Horario   {
    
    private int id;
    private String horario;
    private String dia;
    private String curso;
    private int salon;
    private String edificio;
    private int catedratico;

    public Horario(int id, String horario, String dia, String curso, int salon, String edificio, int catedratico) {
        this.id = id;
        this.horario = horario;
        this.dia = dia;
        this.curso = curso;
        this.salon = salon;
        this.edificio = edificio;
        this.catedratico = catedratico;
    }

    

    public int getId() {
        return id;
    }

    //int key, String horario, String dia, String curso, String salon, String edificio, String catedratico
    public void setId(int id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public int getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(int catedratico) {
        this.catedratico = catedratico;
    }
    

}
