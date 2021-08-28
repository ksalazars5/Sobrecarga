package Tarea_1;

public class CargarMetodo {
    private String nombre;
    private int edad;

    public CargarMetodo(String nombre) {
        this.nombre = nombre;
    }

    public CargarMetodo(int edad) {
        this.edad = edad;
    }

    public void imprimir(){

        System.out.println("Su nombre es: "+nombre);

    }

    public void imprimir(int dias){

        System.out.println("Su edad es: "+edad+" con " +dias);

    }
}

