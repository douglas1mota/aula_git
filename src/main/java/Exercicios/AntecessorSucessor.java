package Exercicios;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principal;
        System.out.println("informe número principal:");
        principal = input.nextInt();
        int antecessor = principal - 1;
        int sucessor = principal + 1;
        System.out.println("O número antecessor de " + principal + " é " + antecessor + " e o sucessor é " + sucessor + ".");


        input.close();
    }
}
