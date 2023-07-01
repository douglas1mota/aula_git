package Exercicios;

import java.util.Scanner;

public class negativoempositivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double n = input.nextDouble();
        double resultado;
        if (n < 0) {
            resultado = n * (-1);
        }
            else {
            resultado = n * 1;
        }

        System.out.println("O número transformado em positivo é " + resultado + "!");


        input.close();
    }
}

