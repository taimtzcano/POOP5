/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop51;

/**
 *
 * @author tania
 */
public class Alumno {
    private String nombre, apellido, carrera, escuela;
    private int semestre; 
    private Fecha fNacimiento; 

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String carrera, String escuela, int semestre, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * Este metodo imprime el sonido de dormir
     */
    public void dormir(){
        System.out.println("zzz");
    }
    /**
     * Este metodo imprime el sonido de comer
     */
    public void comer(){
        System.out.println("ñamñam");
    }
    /**
     * Este metodo imprime lo que se esta haciendo
     */
    public void estudiar (){
        System.out.println("Ando estudiando");
    }
    /**
     * Este metodo imprime lo que la persona quiere al respecto de trabajar
     */
    public void trabajar(){
        System.out.println("Quiero vacaciones");
    }
    /**
     * Este metodo imprime el sonido que se emite de felicidad al jugar
     */
    public void jugar(){
        System.out.println("yeiii");
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + ", semestre=" + semestre + ", fNacimiento=" + fNacimiento + '}';
    }   
}
