package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7VetorOrdemCresc{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] lista = new int[6];

            //---------------------obtenção dos valores e atribuição à lista -------------------
            System.out.println("Digite " + lista.length + " valores inteiros:");

            for (int i = 0; i < lista.length; i++) {
                lista[i] = input.nextInt();
            }

            for (int i = 0; i < lista.length; i++) {
                for (int j = 0; j < lista.length; j++) {

                    if (lista[i] < lista[j]) { //se i for menor ou igual, dá false e já volta pra nova iteração
                        int temp = lista[i]; // temp recebe o valor do i do momento
                        lista[i] = lista[j]; // i do momento recebe o valor do j do momento
                        lista[j] = temp; // j do momento recebe o valor armazenado em temp
                    }
                }
            }

            System.out.println("Array ordenada em ordem crescente: " + Arrays.toString(lista));

            input.close();
        }
}
