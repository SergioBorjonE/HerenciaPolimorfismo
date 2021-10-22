package com.generation;
import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;


public class Main {

    public static void main(String[] args) {

        Ave ave=new Ave();
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();
        System.out.println("=============================");

        Perro lomito=new Perro();
        lomito.jugar();

        System.out.println("=============================");

        Ave ave1=new Ave("Aguila", 1);
        ave1.comunicarse();
        System.out.println(ave.getNombre());
    }
}
