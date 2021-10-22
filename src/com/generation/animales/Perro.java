package com.generation.animales;

public class Perro extends Animal{
    private int patas;
    private boolean cola;
    private String raza;

    //Constructor vacío (por defecto este constructor
    //invoca al constructor vacío de la clase padre no
    //es necesario invocar al super aquí
    public Perro(){
    }

    //Constructor de 1 parámetro (heredado)
    public Perro(String nombre){
        super(nombre);
    }

    //Constructor de 2 parámetros (heredado)
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    public void jugar(){
        System.out.println("Estoy jugando");
    }

    public void ladrar(){
        System.out.println("Estoy ladrando");
    }

    @Override
    public void comer(){
        System.out.println("Estoy comiendo croquetas");
    }

    @Override
    public void respirar(){
        System.out.println("Estoy respirando con mis pulmones");
    }

}
