package Exercicios;

import java.util.Scanner;
import java.util.Arrays;
public class MatrizesCBACondicionadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] matrizA = new int[2];
        int[] matrizB = new int[2];
        int[] matrizC = new int[matrizA.length + matrizB.length];


        // ---------------------------matriz A (apenas valores divisíveis por 2 ou por 3)-------------------//

        for (int i = 0; i < matrizA.length; i++) {
            do {
                System.out.println("Informe o " + (i+1) + "° valor da matriz A (apenas valores divisíveis por 2 e 3):");
                matrizA[i] = input.nextInt();

                if (!((matrizA[i]) % 6 == 0)) {
                    System.out.println("VALOR INVÁLIDO!");
                }
            }
                while (!((matrizA[i]) % 6 == 0)) ;
        }
        System.out.println(Arrays.toString(matrizA));

        // --------------------------------matriz B -----------------------------------------------//

        for (int i = 0; i < matrizB.length; i++) {
            do {
                System.out.println("Informe o " + (i+1) + "° valor da matriz B (apenas valores múltiplos de 5):");
                matrizB[i] = input.nextInt();

                if (!(matrizB[i] % 5 == 0)) {
                    System.out.println("VALOR INVÁLIDO!");
                }
            }
            while (!(matrizB[i] % 5 == 0));
            //analisando o valor 15. Se dividirmos por 5, o resto é 0; se 0 = 0, verdadeiro, mantém o loop
        }

        System.out.println(Arrays.toString(matrizB));

        // --------------------------------matriz C -----------------------------------------------//
        System.out.println("Valores de A e Valores de B:");
        for (int trag = 0; trag < matrizA.length; trag++) {
            matrizC[trag] = matrizA[trag];
        }
        for (int trag = 0; trag < matrizB.length; trag++) {
            matrizC[trag + matrizA.length]  = matrizB[trag];
        }
        for (int trag = 0; trag < matrizC.length; trag++) {
            System.out.println((trag + 1) + "° elemento = " + matrizC[trag]);
        }

        input.close();
    }
}