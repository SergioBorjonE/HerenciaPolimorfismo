package com.generation;
import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.uber.ConductorUberBlack;
import com.generation.uber.Uber;

public class Main {

    public static void main(String[] args) {

        Uber Juan=new Uber();
        ConductorUberBlack Juan2=new ConductorUberBlack();
        Juan2.setRatePerKm(2.5);
        Juan2.setMinimum(11);


        System.out.println(Juan.calculatePrice(6));
        System.out.println(Juan2.calculatePrice(6));




        /*Ave ave=new Ave();
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();
        System.out.println("=============================");

        Perro lomito=new Perro();
        lomito.jugar();

        System.out.println("=============================");

        Ave ave1=new Ave("Aguila", 1);
        ave1.comunicarse();
        System.out.println(ave.getNombre());*/
    }
}
