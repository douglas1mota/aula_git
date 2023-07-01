package Exercicios;

import java.util.Scanner;
public class ArrozNoXadrez {
    public static void main(String[] args) {
        double[] tabuleiro = new double[64]; //primeira vez que eu tive contato com a variável long.
        // eu tinha declarado do tipo int, que deu pau na linha 32, por ter alcançado a limitação natural.

        tabuleiro[0] = 1;
        tabuleiro[1] = 2;
        for (int i = 2; i < tabuleiro.length; i++) {
            tabuleiro[i] = tabuleiro[i-1] * 2;
        }
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.println((i+1) + " " + tabuleiro[i]);
        }

        double soma = 0;
        for (int i = 0; i < tabuleiro.length; i++) {
            soma += tabuleiro[i];
        }
        System.out.println("o total de grãos é: " + soma);
    }

}
