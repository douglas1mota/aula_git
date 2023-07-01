package Exercicios;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Celsius; //declaro a variável, aceitando valores fracionados

        System.out.println("informe a temperatura em Celsius:"); // pede ao usuário que informe a temp
        Celsius = input.nextDouble(); //salva o valor na memória

        double Fahrenheit = ((Celsius * 9) + 160) / 5; //declara a variável, já atribuindo o valor Celsius salvo na memoria
        System.out.println("A temperatura " + Celsius + " Celsius, quando convertida para Fahrenheit, equivale a " + Fahrenheit);

        input.close();
    }
}
