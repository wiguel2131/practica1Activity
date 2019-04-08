package com.example.practica1activity;


import java.util.Arrays;

public class estudiantes {


    private static Object estudiantes;
    private String nombre;
    private int edad;
    private static int promedioEdad;
    private static int suma;
    private static int Edadmax, Edadmin =1000 ;


    public estudiantes(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;

    }

    public int getEdad() {
        return edad;
    }


    public static void main(String[] args) {

        estudiantes[] Estudiantes = {
                new estudiantes("Juan", 24),
                new estudiantes("Erica", 20),
                new estudiantes("Emilio", 23),
                new estudiantes("Karina", 21),
                new estudiantes("Eduardo", 24),
                new estudiantes("Tomas", 25),
        };


        for (int i = 0; i < Estudiantes.length; i++) {
            System.out.println("Estos son los/as estudiantes: " + Estudiantes[i].getNombre());
        }

        for (int i = 0; i < Estudiantes.length; i++) {
            suma = suma + Estudiantes[i].getEdad();
        }



        promedioEdad = suma / Estudiantes.length;

        for (int i = 0; i < Estudiantes.length; i++) {

            if (Estudiantes[i].getEdad() < Edadmin) {
                Edadmin = Estudiantes[i].getEdad();

            }

        }


        for (int i = 0; i < Estudiantes.length; i++) {

            if (Estudiantes[i].getEdad() > Edadmax) {
                Edadmax = Estudiantes[i].getEdad();
            }
        }



        System.out.println("\nLa edad maxima es:" + Edadmax);
        System.out.println("La edad minima es:" + Edadmin);
        System.out.println("El Promedio de Edad es:" + promedioEdad);
        System.out.println("\n El total de Estudiantes es:" + Estudiantes.length);


    }


}




