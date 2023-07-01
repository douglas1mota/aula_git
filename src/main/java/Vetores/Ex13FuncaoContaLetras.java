package Vetores;

import java.util.Scanner;
// Escreva uma função que recebendo uma frase e uma letra retorna quantas vezes a
//letra esteve presente na frase.
//Exemplo:
//ContarLetra(“frase de exemplo”, “e”) Retorna: 4

public class Ex13FuncaoContaLetras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva uma frase:");
        String frase = input.nextLine();
        System.out.println("Informe a letra desejada:");
        String letra = input.nextLine();

        int resultado = buscaLetra(frase, letra); //aqui aprendi que devo declarar as variáveis envolvidas, sem tipo

        System.out.println("A frase '" + frase + "' contem " + resultado + " letras '" + letra + "'.");
        //lembrar de que, pra definir o tipo da função (int, double, string) é melhor pensar no tipo de resultado
        // (impressão) que você quer. No caso, a variável resultado era do tipo int, então a função tbm deve ser
        // do tipo int



        input.close();
    }

    private static int buscaLetra(String frase, String letra) { //aqui declarar variáveis envolvidas com tipo
        int soma = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (letra.equals((String.valueOf(frase.charAt(i))))) { // n esquecer de referenciar qual objeto no .charAt
                // neste caso ficou frase.charAt
                soma++;
            }
        }
        return soma;
    }
}