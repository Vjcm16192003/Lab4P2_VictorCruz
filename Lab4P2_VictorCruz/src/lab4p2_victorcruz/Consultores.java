/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_victorcruz;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Consultores extends Empleados implements Sueldo{
     private int cant_proyectos,cant_desar,dura_consult,ano_c;
    private String campo_Experiencia;
    private double sueldo=0;

    public Consultores(int cant_proyectos, int dura_consult, String campo_Experiencia,int cant_desar, String Nombre, String ID, String nacionalidad, String Username, String Password, int a_contrrato) {
        super(Nombre, ID, nacionalidad, Username, Password, a_contrrato);
        this.cant_proyectos = cant_proyectos;
        this.dura_consult = dura_consult;
        this.campo_Experiencia = campo_Experiencia;
        this.cant_desar = cant_desar;
        this.ano_c = a_contrrato;
    }

    public Consultores() {
    super();
    }

    public int getCant_proyectos() {
        return cant_proyectos;
    }

    public void setCant_proyectos(int cant_proyectos) {
        this.cant_proyectos = cant_proyectos;
    }

    public int getDura_consult() {
        return dura_consult;
    }

    public void setDura_consult(int dura_consult) {
        this.dura_consult = dura_consult;
    }

    public String getCampo_Experiencia() {
        return campo_Experiencia;
    }

    public void setCampo_Experiencia(String campo_Experiencia) {
        this.campo_Experiencia = campo_Experiencia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCant_desar() {
        return cant_desar;
    }

    public void setCant_desar(int cant_desar) {
        this.cant_desar = cant_desar;
    }
    

    @Override
    public String toString() {
        return super.toString()+
                "\nConsultores\n" 
                + "Cantidad de Proyectos Asignados: " + cant_proyectos
                + "\nCantidad de Proyectos desarrollados: " + cant_desar
                + "\nDuracion de Consultoria: " + dura_consult 
                + "\nCampo de Experiencia: " + campo_Experiencia 
                + "\nSueldo: " + sueldo;
    }

    @Override
    public double Sueldo() {
        return this.sueldo=((cant_desar*13280)*4.13)/(this.cant_proyectos+ano_c);
    }
    
    
    
}
