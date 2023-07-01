package Exercicios;

import java.util.Scanner;
//(Média) Elaborar um programa que apresente todos os valores numéricos inteiros
//ímpares situados na faixa de 0 a 20. Sugestão: para verificar se o valor numérico é ímpar,
// dentro do laço de repetição, fazer a verificação lógica dessa condição com a instrução
// se/fim_se dentro do próprio laço, perguntando se o valor numérico do contador é ímpar
// (se o resto do número dividido por 2 é diferente de zero); sendo, mostre-o; não sendo,
// passe para o próximo valor numérico.
public class ImparesDaList {
    public static void main(String[] args) {
        System.out.println("Números ímpares de 0 a 20:");

        // nesse exerc, a estrutura de repetição FOR é usada para rodar início, condição de saída e incremento
        // o início é o zero, a condição final é igual ou menor que 20 e o incremento é de 1 em 1
        // a filtragem dos números ímpares se dá através do IF, que diz "se o número da vez for dividido por 2
        // e o resto diferente de zero, então ele entra como condição verdadeira True e é impresso na saída
        // por exemplo o número 1. Dividido por 2 é 0 com resto 1. Já o 3 é dividido por 2 com resto 1. o 5
        // é dividido por 2 com resto 1
        for (int i = 0; i <= 20; i += 1) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }
}