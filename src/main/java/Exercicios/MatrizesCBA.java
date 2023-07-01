package Exercicios;

import java.util.Scanner;

public class MatrizesCBA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] matrizA = new int[3];
        int[] matrizB = new int[3];
        int[] matrizC = new int[matrizA.length + matrizB.length];
        // --------------------------------matriz A -----------------------------------------------//
        int i = 0;
        for (i = 0; i < matrizA.length; i++) {
            System.out.println("Digite o " + (i+1) + "° valor da matriz A:");
            int numero = input.nextInt();
            matrizA[i] = numero;

        }

        input.nextLine(); // de alguma forma que eu ainda nao entendi, o loop anterior não consome uma linha pendente
        // e esse comando consome essa linha, pra que no próximo loop não seja consumida a linha da primeira iteração
        // essa linha eu deixei aí como aprendizado, pq a segunda matriz era String, mas o exercicio pedia 3 matrizes int

        // --------------------------------matriz B -----------------------------------------------//
        int cont = 0;
        for (cont = 0; cont < matrizB.length; cont++) {
            System.out.println("Digite o " + (cont + 1) + "° valor da matrizB:");
            int nome = input.nextInt();
            matrizB[cont] = nome;
        }

        for (cont = 0; cont < matrizB.length; cont++) {
            System.out.println(matrizB[cont]);
        }
        // --------------------------------matriz C -----------------------------------------------//
        System.out.println("Valores de A e Valores de B:");
        for (int trag = 0; trag < matrizA.length; trag++) {
            matrizC[trag] = matrizA[trag];
        }
        for (int trag = 0; trag < matrizB.length; trag++) {
            matrizC[trag + matrizA.length]  = matrizB[trag];
 //nessa eu tive dificuldade em como fazer as ultimas posicoes de C receber toda a array B.
            //como na primeira parte, a variável é menor que a length, ao somar com a inicial, não conflita as posicoes.
        }
        for (int trag = 0; trag < matrizC.length; trag++) {
            System.out.println((trag + 1) + "° elemento = " + matrizC[trag]);
        }

        input.close();
    }
}
