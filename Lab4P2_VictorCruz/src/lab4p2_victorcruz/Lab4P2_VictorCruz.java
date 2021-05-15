/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_victorcruz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Lab4P2_VictorCruz {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            ArrayList<Empleados> emp = new ArrayList();
            ArrayList<Proyectos> pro = new ArrayList();
            int opcion = 0;
            while (opcion != 2) {
                System.out.println("----MENU----\n"
                        + "1. Ingresar a la Base de Datos de la Empresa\n"
                        + "2. Salir\n"
                        + "Ingrese su opcion:");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    int opcion2 = 0;
                    while (opcion2 != 2) {
                        System.out.println("----MENU INTERNO----\n"
                                + "1.Ingresar al sistema Principal de la Empresa\n"
                                + "2.Salir\n"
                                + "Ingrese su opcion: ");
                        opcion2 = sc.nextInt();
                        if (opcion2 == 1) {
                            System.out.println("Ingrese su username: ");
                            String username = sc.next();
                            System.out.println("Ingrese su contraseña: ");
                            String password = sc.next();
                            if (username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("1234")) {
                                int opc2 = 0;
                                while (opc2 != 6) {
                                    System.out.println("---Menu---\n"
                                            + "1. Agregar\n"
                                            + "2. Modificar\n"
                                            + "3. Listar\n"
                                            + "4. Eliminar"
                                            + "5. Simulacion\n"
                                            + "6. Salir"
                                            + "Ingrese su opcion: ");
                                    opc2 = sc.nextInt();
                                    switch (opc2) {
                                        case 1: {//AGREGAR
                                            int op1 = 0;
                                            while (op1 != 3) {
                                                System.out.println("---Menu---\n"
                                                        + "1. Crear Empleado\n"
                                                        + "2. Crear Proyectos\n"
                                                        + "3. Salir\n"
                                                        + "Ingrese su opcion: ");
                                                op1 = sc.nextInt();
                                                switch (op1) {
                                                    case 1: {
                                                        boolean validar = true;
                                                        while (validar = true) {
                                                            try {
                                                                String Nombre, ID, nacionalidad, Username, Password;
                                                                int a_contrrato;
                                                                System.out.println("Ingrese el Nombre del Empleado: ");
                                                                Nombre = sc.next();
                                                                System.out.println("Ingrese el ID del Empleado: ");
                                                                ID = sc.next();
                                                                System.out.println("Ingrese la Nacionalidad: ");
                                                                nacionalidad = sc.next();
                                                                System.out.println("Años de Contrato: ");
                                                                a_contrrato = sc.nextInt();
                                                                System.out.println("Ingrese su Usuario: ");
                                                                Username = sc.next();
                                                                System.out.println("Ingrese su Password: ");
                                                                Password = sc.next();
                                                                while (Username.equalsIgnoreCase("Admin") && Password.equalsIgnoreCase("1234")) {
                                                                    System.out.println("No puede Ser Admin :( ");
                                                                    System.out.println("Ingrese su Usuario: ");
                                                                    Username = sc.next();
                                                                    System.out.println("Ingrese su Password: ");
                                                                    Password = sc.next();
                                                                }//fin del while que Valida
                                                                System.out.println("Que Tipo de Empleado es?[Desarrolladores/Directores/Consultores/Normal]: ");
                                                                String type = sc.next();
                                                                while (!type.equalsIgnoreCase("Desarrollador") && !type.equalsIgnoreCase("Director") && !type.equalsIgnoreCase("Consultor")) {
                                                                    System.out.println("Por favor ingrese una de las cuatro Articulos:(Tirador/Pateador): ");
                                                                    type = sc.next();
                                                                }//fin del while que valida ingresar corectamente el tipo de marca
                                                                if (type.equalsIgnoreCase("Desarrollador")) {
                                                                    int a_exp, hora_trabajo, cant_pro, cant_des, a_con;
                                                                    String leng_fav;
                                                                    System.out.println("Ingrese sus Años de Experiencia: ");
                                                                    a_exp = sc.nextInt();
                                                                    System.out.println("Ingrese sus Horas de Trabajo: ");
                                                                    hora_trabajo = sc.nextInt();
                                                                    System.out.println("Ingrese la Cantidad de proyectos Asignados: ");
                                                                    cant_pro = sc.nextInt();
                                                                    System.out.println("Ingrese la Cantidad de Proyectos Desarrollados: ");
                                                                    cant_des = sc.nextInt();
                                                                    System.out.println("Ingrese su Lenguaje de Programacion Favoritos: ");
                                                                    leng_fav = sc.next();

                                                                    emp.add(new Desarrolladores(a_exp, hora_trabajo, cant_pro, cant_des, leng_fav, a_exp, Nombre, ID, nacionalidad, Username, Password, a_contrrato));
                                                                    for (int i = 0; i < emp.size(); i++) {
                                                                        if (((Desarrolladores) emp.get(i)).getSueldo() == 0) {
                                                                            double s = ((Desarrolladores) emp.get(i)).Sueldo();
                                                                            ((Desarrolladores) emp.get(i)).setSueldo(s);
                                                                            emp.get(i).setSueldo(s);
                                                                        }//fin del if
                                                                    }//fin del for

                                                                } else if (type.equalsIgnoreCase("Director")) {
                                                                    ArrayList<Desarrolladores> d = new ArrayList();
                                                                    ArrayList<Consultores> c = new ArrayList();
                                                                    int a_puesto, cant_proyectos, cant_desa;
                                                                    System.out.println("Ingrese los Años en el puesto: ");
                                                                    a_puesto = sc.nextInt();
                                                                    System.out.println("Ingrese la Cantidad de proyectos Asignados: ");
                                                                    cant_proyectos = sc.nextInt();
                                                                    System.out.println("Ingrese la Cantidad de Proyectos Desarrollados: ");
                                                                    cant_desa = sc.nextInt();

                                                                    int auxiliar = 0;
                                                                    int cant_proyectos1, cant_desar1, dura_consult1;
                                                                    String campo_Experiencia;
                                                                    for (int i = 0; i < emp.size(); i++) {
                                                                             if(emp.get(i) instanceof Consultores){
                                                                                 System.out.println(i+")"+emp.get(i));
                                                                             }//fin del if
                                                                        }//fin del for
                                                                    System.out.println("Ingrese el indice de los consultores que estan listados con este Director: ");
                                                                    int posi=sc.nextInt();
                                                                    cant_proyectos1 = ((Consultores) emp.get(posi)).getCant_proyectos();
                                                                            cant_desar1 = ((Consultores) emp.get(posi)).getCant_desar();
                                                                            dura_consult1 = ((Consultores) emp.get(posi)).getDura_consult();
                                                                            campo_Experiencia = ((Consultores) emp.get(posi)).getCampo_Experiencia();

                                                                            c.add(new Consultores(cant_proyectos1, dura_consult1, campo_Experiencia, cant_desar1, Nombre, ID, nacionalidad, Username, Password, a_contrrato));
                                                                            auxiliar++;
                                                                    auxiliar = 0;
                                                                    int a_exp1, hora_trabajo1, cant_pro1, cant_des1;
                                                                    String leng_fav1;
                                                                    for (int i = 0; i < emp.size(); i++) {
                                                                             if(emp.get(i) instanceof Desarrolladores){
                                                                                 System.out.println(i+")"+emp.get(i));
                                                                             }//fin del if
                                                                        }//fin del for
                                                                    
                                                                    System.out.println("Ingrese el indice de los Desarrolladores que estan listados con este Director: ");
                                                                    int posi1=sc.nextInt();
                                                                    cant_pro1 = ((Desarrolladores) emp.get(posi1)).getCant_pro();
                                                                            cant_des1 = ((Desarrolladores) emp.get(posi1)).getCant_des();
                                                                            a_exp1 = ((Desarrolladores) emp.get(posi1)).getA_exp();
                                                                            hora_trabajo1 = ((Desarrolladores) emp.get(posi1)).getHora_trabajo();
                                                                            leng_fav1 = ((Desarrolladores) emp.get(posi1)).getLeng_fav();
                                                                            d.add(new Desarrolladores(a_exp1, hora_trabajo1, cant_pro1, cant_des1, leng_fav1, a_exp1, Nombre, ID, nacionalidad, Username, Password, a_contrrato));
                                                                            auxiliar++;
                                                                    emp.add(new Directores(a_puesto, cant_proyectos, d, c, cant_desa, Nombre, ID, nacionalidad, Username, Password, a_contrrato));
                                                                    for (int i = 0; i < emp.size(); i++) {
                                                                        if (((Directores) emp.get(i)).getSueldo() == 0) {
                                                                            double s = ((Directores) emp.get(i)).Sueldo();
                                                                            ((Directores) emp.get(i)).setSueldo(s);
                                                                            emp.get(i).setSueldo(s);
                                                                        }//fin del if
                                                                    }//fin del for

                                                                } else if (type.equalsIgnoreCase("Consultor")) {
                                                                    int cant_proyectos, cant_desar, dura_consult;
                                                                    String campo_Experiencia;
                                                                    System.out.println("Ingrese la Cantidad de Proyectos Asignados: ");
                                                                    cant_proyectos = sc.nextInt();
                                                                    System.out.println("Ingrese la Cantidad de Proyectos Desarrollados: ");
                                                                    cant_desar = sc.nextInt();
                                                                    System.out.println("Ingrese la Duracion de la Consulta: ");
                                                                    dura_consult = sc.nextInt();
                                                                    System.out.println("Ingrese su Campo de Experiencia: ");
                                                                    campo_Experiencia = sc.next();

                                                                    emp.add(new Consultores(cant_proyectos, dura_consult, campo_Experiencia, cant_desar, Nombre, ID, nacionalidad, Username, Password, a_contrrato));
                                                                    for (int i = 0; i < emp.size(); i++) {
                                                                        if (((Consultores) emp.get(i)).getSueldo() == 0) {
                                                                            double s = ((Consultores) emp.get(i)).Sueldo();
                                                                            ((Consultores) emp.get(i)).setSueldo(s);
                                                                            emp.get(i).setSueldo(s);
                                                                        }//fin del if
                                                                    }//fin del for

                                                                } else if (type.equalsIgnoreCase("Normal")) {
                                                                    emp.add(new Empleados(Nombre, ID, nacionalidad, Username, Password, a_contrrato));
                                                                    for (int i = 0; i < emp.size(); i++) {
                                                                        if (emp.get(i).getSueldo() == 0) {
                                                                            double s = emp.get(i).Sueldo();
                                                                            emp.get(i).setSueldo(s);
                                                                        }
                                                                    }
                                                                }//fin de las Condiciones

                                                                validar = false;

                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Error!!!");
                                                            }//fin del catch
                                                        }//fin del while
                                                        break;
                                                    }//fin del case
                                                    case 2: {
                                                        boolean validar = true;
                                                        while (validar = true) {
                                                            try {
                                                                String Nombre_pro, nombre_empresa, estado,descrip;
                                                                int cant_dura;
                                                                System.out.println("Ingrese el Nombre del Proyecto: ");
                                                                Nombre_pro = sc.next();
                                                                System.out.println("Ingrese el nombre de la Empresa: ");
                                                                nombre_empresa = sc.next();
                                                                System.out.println("Ingrese la Duracion del Proyecto: ");
                                                                cant_dura = sc.nextInt();
                                                                System.out.println("Ingrese el estado del Proyecto(Iniciado/Desarrollado/Terminado)");
                                                                estado = sc.next();
                                                                while (!estado.equalsIgnoreCase("Iniciado") && !estado.equalsIgnoreCase("Desarrollado") && !estado.equalsIgnoreCase("Terminado")) {
                                                                    System.out.println("Ingrese el estado del Proyecto(Iniciado/Desarrollado/Terminado)");;
                                                                    estado = sc.next();
                                                                }//fin del while que valida ingresar corectamente el tipo de marca
                                                                System.out.println("Ingrese la Descripcion: ");
                                                                descrip = sc.next();
                                                                int n=0;
                                                    String Nombre, ID, nacionalidad, Username, Password;
                                                    int a_contrrato1;
                                                    ArrayList<Directores>directores=new ArrayList();
                                                    
                                                    ArrayList<Consultores>consultores= new ArrayList();
                                                    
                                                    ArrayList<Desarrolladores>desarrolladores=new ArrayList();
                                                    int a_puesto,cant_proyectos,cant_desa;
                                                    while(n<2){
                                                        for (int i = 0; i < emp.size(); i++) {
                                                            if(emp.get(i) instanceof Directores){
                                                                System.out.println(i+")"+emp.get(i));
                                                            }
                                                        }
                                                        System.out.println("Ingrese el indice del director  que esta en el proyecto: ");
                                                        int m=sc.nextInt();
                                                         Nombre = emp.get(m).getNombre();
                                                        ID = emp.get(m).getID();
                                                        Username = emp.get(m).getUsername();
                                                        Password = emp.get(m).getPassword();
                                                        nacionalidad = emp.get(m).getNacionalidad();
                                                        a_contrrato1 = emp.get(m).getA_contrrato();
                                                        a_puesto = ((Directores) emp.get(m)).getA_puesto();
                                                        cant_desa = ((Directores) emp.get(m)).getCant_desa();
                                                        cant_proyectos = ((Directores) emp.get(m)).getCant_proyectos();
                                                        desarrolladores = ((Directores) emp.get(m)).getDesa();
                                                        consultores = ((Directores) emp.get(m)).getCons();
                                                        directores.add(new Directores(a_puesto, cant_proyectos, desarrolladores, consultores, cant_desa, Nombre, ID, nacionalidad, Username, Password, a_contrrato1));
                                                        n++;
                                                    }
                                                    
                                                    pro.add(new Proyectos(Nombre_pro, nombre_empresa, cant_dura, estado, descrip, desarrolladores, directores, consultores));

                                                                validar = false;

                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Error!!!");
                                                            }//fin del catch
                                                        }//fin del while
                                                        break;
                                                    }//fin del case
                                                    default:
                                                }//fin del switch Agregar
                                            }//fin del while Agregar

                                            break;
                                        }//fin del case 1
                                        case 2: {//MODIFICAR
                                            int op1 = 0;
                                            while (op1 != 3) {
                                                System.out.println("---MENU---\n"
                                                        + "1. Modificar Empleado\n"
                                                        + "2. Modificar Proyecto\n"
                                                        + "3. Salir\n"
                                                        + "Ingrese su opcion: ");
                                                op1 = sc.nextInt();
                                                switch (op1) {
                                                    case 1: {//Modficar Equipos
                                                        boolean validar = true;
                                                        while (validar = true) {
                                                            try {
                                                                if (emp.isEmpty()) {
                                                                    System.out.println("No hay Empleados para modificar");
                                                                } else {
                                                                    System.out.println("Ingrese posicion para modificar un Empleado");
                                                                    for (int i = 0; i < emp.size(); i++) { //Imprime solo el numero de Serie
                                                                        System.out.println("En la posicion " + i + ") " + ", está: " + emp.get(i).getNombre());
                                                                    }//fin del for
                                                                    System.out.print("Ingrese poscion: ");
                                                                    int pos = sc.nextInt();
                                                                    int opc1 = 0;
                                                                    String Nombre, ID, nacionalidad, Username, Password;
                                                                    int a_contrrato;
                                                                    while (opc1 != 8) {
                                                                        System.out.println("1-Nombre\n"
                                                                                + "2-ID \n"
                                                                                + "3-Nacionalidad\n"
                                                                                + "4-Años Contratado\n"
                                                                                + "5-Modficar Consultor\n"
                                                                                + "6-Modifcar Director\n"
                                                                                + "7-Modificar Desarrollador\n"
                                                                                + "8-Salir");
                                                                        opc1 = sc.nextInt();
                                                                        switch (opc1) {
                                                                            case 1: {
                                                                                System.out.println("Ingrese el Nombre del Empleado: ");
                                                                                Nombre = sc.next();
                                                                                emp.get(pos).setNombre(Nombre);
                                                                                break;
                                                                            }//fin del case

                                                                            case 2: {
                                                                                System.out.println("Ingrese el ID del Empleado: ");
                                                                                ID = sc.next();
                                                                                emp.get(pos).setID(ID);
                                                                                break;
                                                                            }//fin del case
                                                                            case 3: {
                                                                                System.out.println("Ingrese la Nacionalidad: ");
                                                                                nacionalidad = sc.next();
                                                                                emp.get(pos).setNacionalidad(nacionalidad);
                                                                                break;
                                                                            }//fin del case
                                                                            case 4: {
                                                                                System.out.println("Años de Contrato: ");
                                                                                a_contrrato = sc.nextInt();
                                                                                emp.get(pos).setA_contrrato(a_contrrato);

                                                                                break;
                                                                            }//fin del case
                                                                            case 5: {
                                                                                int cant_proyectos, cant_desar, dura_consult;
                                                                                String campo_Experiencia;
                                                                                System.out.println("Ingrese la Cantidad de Proyectos Asignados: ");
                                                                                cant_proyectos = sc.nextInt();
                                                                                ((Consultores) emp.get(pos)).setCant_proyectos(cant_proyectos);
                                                                                System.out.println("Ingrese la Cantidad de Proyectos Desarrollados: ");
                                                                                cant_desar = sc.nextInt();
                                                                                ((Consultores) emp.get(pos)).setCant_desar(cant_desar);
                                                                                System.out.println("Ingrese la Duracion de la Consulta: ");
                                                                                dura_consult = sc.nextInt();
                                                                                ((Consultores) emp.get(pos)).setDura_consult(dura_consult);
                                                                                System.out.println("Ingrese su Campo de Experiencia: ");
                                                                                campo_Experiencia = sc.next();
                                                                                ((Consultores) emp.get(pos)).setCampo_Experiencia(campo_Experiencia);

                                                                                break;
                                                                            }//fin del case
                                                                            case 6: {
                                                                                int a_puesto, cant_proyectos, cant_desa;
                                                                                System.out.println("Ingrese los Años en el puesto: ");
                                                                                a_puesto = sc.nextInt();
                                                                                ((Directores) emp.get(pos)).setA_puesto(a_puesto);
                                                                                System.out.println("Ingrese la Cantidad de proyectos Asignados: ");
                                                                                cant_proyectos = sc.nextInt();
                                                                                ((Directores) emp.get(pos)).setCant_proyectos(cant_proyectos);
                                                                                System.out.println("Ingrese la Cantidad de Proyectos Desarrollados: ");
                                                                                cant_desa = sc.nextInt();
                                                                                ((Directores) emp.get(pos)).setCant_desa(cant_desa);
                                                                                break;
                                                                            }//fin del case
                                                                            case 7: {
                                                                                int a_exp, hora_trabajo, cant_pro, cant_des;
                                                                                String leng_fav;
                                                                                System.out.println("Ingrese sus Años de Experiencia: ");
                                                                                a_exp = sc.nextInt();
                                                                                ((Desarrolladores) emp.get(pos)).setA_exp(a_exp);
                                                                                System.out.println("Ingrese sus Horas de Trabajo: ");
                                                                                hora_trabajo = sc.nextInt();
                                                                                ((Desarrolladores) emp.get(pos)).setHora_trabajo(hora_trabajo);
                                                                                System.out.println("Ingrese la Cantidad de proyectos Asignados: ");
                                                                                cant_pro = sc.nextInt();
                                                                                ((Desarrolladores) emp.get(pos)).setCant_pro(cant_pro);
                                                                                System.out.println("Ingrese la Cantidad de Proyectos Desarrollados: ");
                                                                                cant_des = sc.nextInt();
                                                                                ((Desarrolladores) emp.get(pos)).setCant_des(cant_des);
                                                                                System.out.println("Ingrese su Lenguaje de Programacion Favoritos: ");
                                                                                leng_fav = sc.next();
                                                                                ((Desarrolladores) emp.get(pos)).setLeng_fav(leng_fav);
                                                                                break;
                                                                            }//fin del case

                                                                            default:

                                                                        }//fin del Switch
                                                                    }//fin del while
                                                                }//fin de la condicion
                                                                validar = false;

                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Error!!!");
                                                            }//fin del catch
                                                        }//fin del while
                                                        break;
                                                    }//fin del case
                                                    case 2: {//Modificar Jugadores
                                                        boolean validar = true;
                                                        while (validar = true) {
                                                            try {
                                                                if (pro.isEmpty()) {
                                                                    System.out.println("No hay Proyectos para modificar");
                                                                } else {
                                                                    System.out.println("Ingrese posicion para modificar un Proyecto");
                                                                    for (int i = 0; i < pro.size(); i++) { //Imprime solo el numero de Serie
                                                                        System.out.println("En la posicion " + i + ") " + ", está: " + pro.get(i).getNombre_pro());
                                                                    }//fin del for
                                                                    System.out.print("Ingrese poscion: ");
                                                                    int pos2 = sc.nextInt();
                                                                    int opc1 = 0;
                                                                    String Nombre_pro, nombre_empresa,estado;
                                                                    int cant_dura;
                                                                    while (opc1 != 7) {
                                                                        System.out.println("1-Nombre del Proyecto\n"
                                                                                + "2-Nombre de la Empresa \n"
                                                                                + "3-Duracion del Proyecto\n"
                                                                                + "4-Estado\n"
                                                                                + "5. Descripcion\n"
                                                                                + "6. Salir");
                                                                        opc1 = sc.nextInt();
                                                                        switch (opc1) {
                                                                            case 1: {

                                                                                System.out.println("Ingrese el Nombre del Proyecto: ");
                                                                                Nombre_pro = sc.next();
                                                                                pro.get(pos2).setNombre_pro(Nombre_pro);
                                                                                break;
                                                                            }//fin del case

                                                                            case 2: {
                                                                                System.out.println("Ingrese el nombre de la Empresa: ");
                                                                                nombre_empresa = sc.next();
                                                                                pro.get(pos2).setNombre_empresa(nombre_empresa);
                                                                                break;
                                                                            }//fin del case

                                                                            case 3: {
                                                                                System.out.println("Ingrese la Duracion del Proyecto: ");
                                                                                cant_dura = sc.nextInt();
                                                                                pro.get(pos2).setCant_dura(cant_dura);
                                                                                break;
                                                                            }//fin del case

                                                                            case 4: {
                                                                                System.out.println("Ingrese el estado del Proyecto(Iniciado/Desarrollado/Terminado)");
                                                                                estado = sc.next();
                                                                                pro.get(pos2).setEstado(estado);
                                                                                while (!estado.equalsIgnoreCase("Iniciado") && !estado.equalsIgnoreCase("Desarrollado") && !estado.equalsIgnoreCase("Terminado")) {
                                                                                    System.out.println("Ingrese el estado del Proyecto(Iniciado/Desarrollado/Terminado)");;
                                                                                    estado = sc.next();
                                                                                    pro.get(pos2).setEstado(estado);
                                                                                }//fin del while que valida ingresar corectamente el tipo de marca
                                                                                break;
                                                                            }//fin del case

                                                                        }//fin del switch
                                                                    }//fin del while
                                                                }//fin de la condicion 

                                                                validar = false;

                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Error!!!");
                                                            }//fin del catch
                                                        }//fin del while
                                                        break;
                                                    }//fin del case
                                                    default:
                                                }//fin del switch Modificar
                                            }//fin del while Modificar

                                            break;
                                        }//fin del case 2
                                        case 3: {//LISTAR
                                            int op1 = 0;
                                            while (op1 != 3) {
                                                System.out.println("---MENU---\n"
                                                        + "1. Listar Empleados\n"
                                                        + "2. Listar Proyectos\n"
                                                        + "3. Salir\n"
                                                        + "Ingrese su opcion: ");
                                                op1 = sc.nextInt();
                                                switch (op1) {
                                                    case 1: {//Listar Empleados
                                                        if (emp.isEmpty()) {
                                                            System.out.println("No hay Empleados agregados");
                                                        } else {
                                                            System.out.println("\nEMPLEADOS");
                                                            for (Object c : emp) {
                                                                System.out.println(emp.indexOf(c) + ")" + c + "\n");
                                                            }//fin del for especial
                                                        }//fin de la condicion

                                                        break;
                                                    }//fin del case

                                                    case 2: {//Listar Proyectos
                                                        if (pro.isEmpty()) {
                                                            System.out.println("No hay Proyectos agregados");
                                                        } else {
                                                            System.out.println("\nPROYECTOS");
                                                            for (Object c : pro) {
                                                                System.out.println(pro.indexOf(c) + ")" + c + "\n");
                                                            }//fin del for especial
                                                        }//fin de la condicion

                                                        break;
                                                    }//fin del case
                                                    default:
                                                }//fin del switch de Listar
                                            }//fin del while de Listar

                                            break;
                                        }//fin del break 3
                                        case 4: {//ELIMINAR
                                            int op1 = 0;
                                            while (op1 != 3) {
                                                System.out.println("---MENU---\n"
                                                        + "1. Eliminar Empleado\n"
                                                        + "2. Eliminar Proyecto\n"
                                                        + "3. Salir\n"
                                                        + "Ingrese su opcion: ");
                                                op1 = sc.nextInt();
                                                switch (op1) {
                                                    case 1: {
                                                        if (emp.isEmpty()) {
                                                            System.out.println("No hay Empleados agregados");
                                                        } else {
                                                            System.out.println("Ingrese la posicion del Empleado a eliminar ");
                                                            for (int i = 0; i < emp.size(); i++) {
                                                                System.out.println("En la posicion " + i + ") " + ", está: " + emp.get(i).getNombre());
                                                            }//fin del for que recorre la lista
                                                            System.out.print("Ingrese posicion: ");
                                                            int pos = sc.nextInt();
                                                            emp.remove(pos);
                                                            System.out.println("Se ha eliminado el Empleado satisfactoriamente!!!");
                                                        }//fin de la condicon

                                                        break;
                                                    }//fin del case
                                                    case 2: {
                                                        if (pro.isEmpty()) {
                                                            System.out.println("No hay Proyectos agregados");
                                                        } else {
                                                            System.out.println("Ingrese la posicion del Proyecto a eliminar ");
                                                            for (int i = 0; i < pro.size(); i++) {
                                                                System.out.println("En la posicion " + i + ") " + ", está: " + pro.get(i).getNombre_pro());
                                                            }//fin del for que recorre la lista
                                                            System.out.print("Ingrese posicion: ");
                                                            int pos = sc.nextInt();
                                                            pro.remove(pos);
                                                            System.out.println("Se ha eliminado el Proyecto satisfactoriamente!!!");
                                                        }//fin de la condicon

                                                        break;
                                                    }//fin del case
                                                    default:

                                                }//fin del switch
                                            }//fin del while

                                            break;
                                        }//fin del case 4

                                        default:

                                    }//fin del switch principal
                                }//fin del while principal
                            } else {
                               int opc23=0;
                        int aux =0;
                        for (int i = 0; i < emp.size(); i++) {
                            if(emp.get(i).getUsername().equalsIgnoreCase(username)&&emp.get(i).getPassword().equalsIgnoreCase(password)){
                                if(emp.get(i) instanceof Desarrolladores){
                                    opc23=1;
                                }else if(emp.get(i) instanceof Directores){
                                    opc23=2;
                                }else if(emp.get(i) instanceof Consultores){
                                    opc23=3;
                                }
                                aux =i;
                            }
                            switch(opc23){
                                case 1:
                                    
                                    
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                            }
                        }
                        
                    

                                
                                
                            }//fin del else
                        } else if (opcion2 == 2) {
                            System.out.println("Saliendo del sistema Interno");
                        } else {
                            System.out.println("Error La opcion que Ingreseo no Existe!!!");
                        }
                    }
                } else if (opcion == 2) {
                    System.out.println("Saliendo de la Base De Datos de la Empresa");
                } else {
                    System.out.println("Error la opcion que Ingreso no Existe!!!");
                }//fin del else
            }//fin del while  
        } catch (Exception e) {
            System.out.println("ERROR FATAL!!!!");
        }
    }//fin del main
}//fin de la clase
