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
public class Desarrolladores extends Empleados implements Sueldo {

    private int a_exp, hora_trabajo, cant_pro,cant_des,a_con;
    private String leng_fav;
    private double Sueldo = 0;

    public Desarrolladores(int a_exp, int hora_trabajo, int cant_pro, int cant_des, String leng_fav, double Sueldo,int a_con, String Nombre, String ID, String nacionalidad, String Username, String Password, int a_contrrato) {
        super(Nombre, ID, nacionalidad, Username, Password, a_contrrato);
        this.a_exp = a_exp;
        this.hora_trabajo = hora_trabajo;
        this.cant_pro = cant_pro;
        this.cant_des = cant_des;
        this.leng_fav = leng_fav;
        this.Sueldo = Sueldo;
        this.a_con = a_con;
    }

    

    public Desarrolladores() {
        super();
    }

    public int getA_exp() {
        return a_exp;
    }

    public void setA_exp(int a_exp) {
        this.a_exp = a_exp;
    }

    public int getHora_trabajo() {
        return hora_trabajo;
    }

    public void setHora_trabajo(int hora_trabajo) {
        this.hora_trabajo = hora_trabajo;
    }

    public String getLeng_fav() {
        return leng_fav;
    }

    public void setLeng_fav(String leng_fav) {
        this.leng_fav = leng_fav;
    }

    public int getCant_pro() {
        return cant_pro;
    }

    public void setCant_pro(int cant_pro) {
        this.cant_pro = cant_pro;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getCant_des() {
        return cant_des;
    }

    public void setCant_des(int cant_des) {
        this.cant_des = cant_des;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+
                "\nDesarroladores\n" 
                + "\nAño de Experiencia: " + a_exp 
                + "\nHoras de Trabajo: " + hora_trabajo 
                + "\nCantidad de Proyectos Asignado: " + cant_pro 
                + "\nCantidad de Proyectos Desarrollados: " + cant_des 
                + "\nLenguaje de Programacion Preferido: " + leng_fav 
                + "\nAño de Contratos: " + a_con 
                + "\nSueldo: " + Sueldo;
    }

    @Override
    public double Sueldo() {
         return this.Sueldo =(((this.cant_des*115000)*2)/this.cant_pro+this.a_con);
    }

    
    
    
   
    

}
