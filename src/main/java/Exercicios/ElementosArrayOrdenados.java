package Exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class ElementosArrayOrdenados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] caderno = new int[6];

        //---------------------obtenção dos valores e atribuição à lista -------------------
        System.out.println("Digite " + caderno.length + " valores inteiros:");

        for (int i = 0; i < caderno.length; i++) {
            caderno[i] = input.nextInt();
        }
        //------------------- comparação e ordenação decrescente dos elementos da lista-----------
            // aqui eu aprendi que o número de comparações quando houver um bloco for dentro do outro
            // será, geralmente, o número de iterações descrito no primeiro for multiplicado pelo número de iterações
            // do segundo for. Se a length do primeiro for 3 e do segundo 3, serão 9 comparações.
            // ou seja: i e j... serão 0 e 0, 0 e 1, 0 e 2, 1 e 0, 1 e 1, 1 e 2, 2 e 0, 2 e 1, 2 e 2;
        for (int i = 0; i < caderno.length; i++) {
            for (int j = 0; j < caderno.length; j++) {

                    if (caderno[i] > caderno[j]) { //se i for menor ou igual, dá false e já volta pra nova iteração
                    int temp = caderno[i]; // temp recebe o valor do i do momento
                    caderno[i] = caderno[j]; // i do momento recebe o valor do j do momento
                    caderno[j] = temp; // j do momento recebe o valor armazenado em temp
                }
            }
        }

        System.out.println("Array ordenada em ordem decrescente: " + Arrays.toString(caderno));

        input.close();
    }
}