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
public class Empleados implements Sueldo {
    private String Nombre,ID,nacionalidad,Username,Password;
    private int a_contrrato;
    private double sueldo = 0;

    public Empleados(String Nombre, String ID, String nacionalidad, String Username, String Password, int a_contrrato) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.nacionalidad = nacionalidad;
        this.Username = Username;
        this.Password = Password;
        this.a_contrrato = a_contrrato;
    }

    public Empleados() {
    }
    
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getA_contrrato() {
        return a_contrrato;
    }

    public void setA_contrrato(int a_contrrato) {
        this.a_contrrato = a_contrrato;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleados\n" 
                + "Nombre: " + Nombre 
                + "\nID: " + ID 
                + "\nNacionalidad: " + nacionalidad 
                + "\nUsername: " + Username 
                + "\nPassword: " + Password 
                + "\nAño de contrato: " + a_contrrato 
                + "\nSueldo: " + sueldo;
    }

    @Override
    public double Sueldo() {
        return this.sueldo=((12000*8)/2)*this.a_contrrato;
    }
    
    
}
