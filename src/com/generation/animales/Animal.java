package com.generation.animales;

public abstract class Animal {
    private String nombre;
    private int edad;


    //Los constructores son innecesarios una vez que se hace abstracta la clase pues no puede instanciar

    //constructor vacío
    public Animal(){
        System.out.println("Constructor padre");
    }

    //constructor de un parámetro
    public Animal(String nombre){
        setNombre(nombre);
    }

    //constructor de dos parámetros
    public Animal(String nombre, int edad){
       setNombre(nombre);
       setEdad(edad);
    }


    //métodos get y set
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //métodos de funcionalidad
    public void comunicarse(){
        System.out.println("Hola");
    }

    public void  comer(){
        System.out.println("Estoy comiendo");
    }

    /*Clase abstracta caracteristicas:
    1) debe contener un método abstracto (se crea, pero no se define) vea ejemplo abajo
    2) Una vez que existe el método abstracto debemos cambiar toda la clase haciendola también abstracta
    3) Las clases hijas deberán (obligatoriamente) hacer un override de cada método abstracto
       para definir su funcionalidad*/


    //Ejemplo
    public abstract void respirar();

}
