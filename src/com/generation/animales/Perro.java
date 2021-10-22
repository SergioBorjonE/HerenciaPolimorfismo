package com.generation.animales;

public class Perro extends Animal implements Mascota, Mamiferos{
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

    //Aca ya teneiamos jugar y el que se implemento de la interfaz
    //esta sufriendo @override implicito
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

    //Estos métodos vienen de la interfaz Mascota donde es absolutamente necesario que
    //se definan todos
    @Override
    public void dormir() {
        System.out.println("ZzZzZzZzZz");
    }

    @Override
    public void hablar() {
        System.out.println("Guaffff");
    }

    //Métodos de la interfaz Mamiferos
    @Override
    public void gestar() {
        System.out.println("Tiempo de 2 meses");
    }

    @Override
    public void ingestaLeche() {
        System.out.println("Estoy consumiendo leche");
    }

    @Override
    public void movilidad() {
        System.out.println("Me desplaso por tierra");
    }
}
