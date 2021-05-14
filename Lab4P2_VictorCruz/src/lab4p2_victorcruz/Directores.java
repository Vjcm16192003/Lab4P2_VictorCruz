/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_victorcruz;

import java.util.ArrayList;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Directores extends Empleados implements Sueldo{
     private int a_puesto,cant_proyectos,cant_desa,a_con;
    ArrayList<Desarrolladores> desa = new ArrayList();
    ArrayList<Consultores> cons =new ArrayList();
    private double sueldos=0;

    public Directores(int a_puesto, int cant_proyectos,ArrayList desa,ArrayList cons, int cant_desa,int a_con, String Nombre, String ID, String nacionalidad, String Username, String Password, int a_contrrato) {
        super(Nombre, ID, nacionalidad, Username, Password, a_contrrato);
        this.a_puesto = a_puesto;
        this.cant_proyectos = cant_proyectos;
        this.desa = desa;
        this.cons = cons;
        this.cant_desa = cant_desa; 
        this.a_con = a_con;
    }

    public Directores() {
    super();
    }

    public int getA_puesto() {
        return a_puesto;
    }

    public void setA_puesto(int a_puesto) {
        this.a_puesto = a_puesto;
    }

    public int getCant_proyectos() {
        return cant_proyectos;
    }

    public void setCant_proyectos(int cant_proyectos) {
        this.cant_proyectos = cant_proyectos;
    }

    public ArrayList<Desarrolladores> getDesa() {
        return desa;
    }

    public void setDesa(ArrayList<Desarrolladores> desa) {
        this.desa = desa;
    }

    public double getSueldos() {
        return sueldos;
    }

    public void setSueldos(double sueldos) {
        this.sueldos = sueldos;
    }

    public int getCant_desa() {
        return cant_desa;
    }

    public void setCant_desa(int cant_desa) {
        this.cant_desa = cant_desa;
    }

    public ArrayList<Consultores> getCons() {
        return cons;
    }

    public void setCons(ArrayList<Consultores> cons) {
        this.cons = cons;
    }

    public int getA_con() {
        return a_con;
    }

    public void setA_con(int a_con) {
        this.a_con = a_con;
    }
    
    
    
    
    
    @Override
    public String toString() {
        return super.toString()+
                "\nDirectores\n" 
                + "\nAños en el Puesto: " + a_puesto 
                + "\nCantidad de Proyectos Asignados: " + cant_proyectos
                + "\nCantidad de Proyectos Desarrollados: " + cant_desa
                + "\nLista de Desarrolladores: " + desa 
                + "\nLista de Desarrolladores: " + cons 
                + "\nAño de Contrato: " + a_con 
                + "\nSueldo: " + sueldos;
    }

    @Override
    public double Sueldo() {
        return this.sueldos=((((this.cant_desa*this.cant_proyectos)*this.cons.size())*this.desa.size())*5.23)/((this.cant_proyectos*this.a_con)*2.28);
    }
    
    
    
    
}
