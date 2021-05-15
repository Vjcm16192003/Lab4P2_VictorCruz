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
public class Proyectos {
    private String Nombre_pro,nombre_empresa,estado,descrip;
    private int cant_dura;
    ArrayList<Desarrolladores> des = new ArrayList();
    ArrayList<Directores> dir = new ArrayList();
    ArrayList<Consultores> cons = new ArrayList();

    public Proyectos(String Nombre_pro, String nombre_empresa, int cant_dura, String estado,String descrip,ArrayList des,ArrayList dir,ArrayList cons) {
        this.Nombre_pro = Nombre_pro;
        this.nombre_empresa = nombre_empresa;
        this.cant_dura = cant_dura;
        this.estado = estado;
        this.descrip = descrip;
        this.des = des;
        this.dir = dir;
        this.cons = cons;
    
        
    }

    public Proyectos() {
    }
    
    
    

    public String getNombre_pro() {
        return Nombre_pro;
    }

    public void setNombre_pro(String Nombre_pro) {
        this.Nombre_pro = Nombre_pro;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public int getCant_dura() {
        return cant_dura;
    }

    public void setCant_dura(int cant_dura) {
        this.cant_dura = cant_dura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Desarrolladores> getDes() {
        return des;
    }

    public void setDes(ArrayList<Desarrolladores> des) throws Except {
        if(des.size() == 4){
        this.des = des;
    }else 
        throw new Except("Tiene que haber 5 Desarrolladores");
    }

    public ArrayList<Directores> getDir() {
        return dir;
    }

    public void setDir(ArrayList<Directores> dir) throws Except {
        if(dir.size() == 1){
          this.dir = dir;   
        }else{
            throw new Except("Tiene que haber 2 Directores");
        }
        
    }

    public ArrayList<Consultores> getCons() {
        return cons;
    }

    public void setCons(ArrayList<Consultores> cons) throws Except {
        if(cons.size() == 2){
          this.cons = cons;  
        }else{
            throw new Except("Tiene que haber 3 Consultores");
        }
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    

    @Override
    public String toString() {
        return "Proyectos\n" 
                + "\nNombre del Proyecto: " + Nombre_pro 
                + "\nNombre de la Empresa: " + nombre_empresa 
                + "\nDuracion del Proyecto: " + cant_dura 
                + "\nEstado Actual: " + estado
                + "\nDescripcion: " + descrip
                + "\nDesarrolladores en el Proyecto: " + des 
                + "\nDirectores en el Proyecto: " + dir 
                + "\nConsultores en el Proyecto: " + cons;
    }
    
    
    
}
