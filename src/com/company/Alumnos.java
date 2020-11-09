package com.company;

public class Alumnos extends Thread {

    public Alumnos (String alumno){
        super(alumno);
    }

public void run(){
    for (int i=0;i>=15;i++){
        System.out.println(i+" "+getName());
    }
    }

    public static void main (String [] args){

        Desinfectar desinfectar = new Desinfectar();

        new Alumnos ("Alumno 1").start();
        new Alumnos ("Alumno 2").start();
        new Alumnos ("Alumno 3").start();
        new Alumnos ("Alumno 4").start();
        new Alumnos ("Alumno 5").start();

        System.out.println("Alumno 1 en clase");
        System.out.println("Alumno 2 en clase");
        System.out.println("Alumno 3 en clase");
        System.out.println("Alumno 4 en clase");
        System.out.println("Alumno 5 en clase");
        desinfectar.start();

    }
}

