package Exercicios;

import java.util.ArrayList;

public class Celsius10x10Fahrenheit {
    public static void main(String[] args) {
        ArrayList <Integer> Celsius = new ArrayList<>();

        for (int i = 10; i <=100; i += 10) {
            Celsius.add(i);
        }

        for (int valor : Celsius) {
            int resultado = (((valor * 9) + 160) / 5);
            System.out.println("Temperatura em Celsius: " + valor + " Temperatura em Fahrenheit: " + resultado);
        }



    }
}
//exercício bem puxado, dada a não familiaridade com as bibliotecas Java. Eu conhecia as arrays, mas não
//as arrayLists. Tbm não sabia que para imprimir um objeto fora do loop For, preciso declarar fora e inicializar
//Também não conhecia a extensão .add
// também desconhecia o enhanced for loop (for-each loop) do arrayList