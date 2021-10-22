package com.generation.animales;

public class Ave extends Animal {

    private int alas;
    private int patas;
    private boolean vuela;

    public Ave(){
        super();
        System.out.println("constructor hijo");
    }

    //Observe que si invocamos al constructor con parámetro
    //debemos dar un parámetro al nuevo constructor de la clase
    //hijo y al super por ejemplo aca:

    public Ave(String nombre){
        super(nombre);
    }

    //Lo mismo para otros constructores con más parámetros

    public Ave(String nombre, int edad){
        super(nombre,edad);
    }

    public void hacerNido(){
        System.out.println("Estoy haciendo mi nido");
    }

    public void ponerHuevo(){
        System.out.println("Estoy poniendo un huevo");
    }

    public void respirar(){
        System.out.println("Estoy respirando con mis pulmones");
    }
}
