/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {
    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion, edad, asignaturas;
        double costoAsignatura;
        String nombres, apellidos, identificacion;
        System.out.println("Ingrese la opcion en la que desea ingresar\n"
                + "(1) Estudiante Distancia\n"
                + "(2) Estudiante Presencial");
        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                    System.out.println("Ingrese nombres");
                    nombres = entrada.nextLine();
                    System.out.println("Ingrese apellidos");
                    apellidos = entrada.nextLine();
                    System.out.println("Ingrese identificación");
                    identificacion = entrada.nextLine();
                    System.out.println("Ingrese edad");
                    edad = entrada.nextInt();
                    System.out.println("Ingrese número de asignaturas");
                    asignaturas = entrada.nextInt();
                    System.out.println("Ingrese costo asignatura");
                    costoAsignatura = entrada.nextDouble();
                    EstudianteDistancia estudiante = new EstudianteDistancia();

                    estudiante.establecerNombresEstudiante(nombres);
                    estudiante.establecerApellidoEstudiante(apellidos);
                    estudiante.establecerEdadEstudiante(edad);
                    estudiante.establecerIdentificacionEstudiante(identificacion);
                    estudiante.establecerNumeroAsginaturas(asignaturas);
                    estudiante.establecerCostoAsignatura(costoAsignatura);
                    estudiante.calcularMatriculaDistancia();
                break;
            case 2:
                    System.out.println("Ingrese nombres");
                    nombres = entrada.nextLine();
                    System.out.println("Ingrese apellidos");
                    apellidos = entrada.nextLine();
                    System.out.println("Ingrese identificación");
                    identificacion = entrada.nextLine();
                    System.out.println("Ingrese edad");
                    edad = entrada.nextInt();
                    System.out.println("Ingrese número de asignaturas");
                    asignaturas = entrada.nextInt();
                    System.out.println("Ingrese costo asignatura");
                    costoAsignatura = entrada.nextDouble();
                    EstudiantePresencial estudiante = new EstudiantePresencial();
        
                    estudiante.establecerNombresEstudiante(nombres);
                    estudiante.establecerApellidoEstudiante(apellidos);
                    estudiante.establecerEdadEstudiante(edad);
                    estudiante.establecerIdentificacionEstudiante(identificacion);
                    estudiante.establecerNumeroAsginaturas(asignaturas);
                    estudiante.establecerCostoAsignatura(costoAsignatura);
                    estudiante.calcularMatriculaDistancia();
                break;
            default:
                throw new AssertionError();
        }
        
        
//        System.out.printf("%s\n", estudiante);
        
    }
}
