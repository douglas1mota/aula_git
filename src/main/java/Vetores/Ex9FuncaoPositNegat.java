package Vetores;

import java.util.Scanner;
// Faça um programa, com uma função que necessite de um argumento. A função retorna o
//valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou
//negativo
public class Ex9FuncaoPositNegat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor:");
        double numero = input.nextDouble();

        String resultado = checaSinal(numero);
        System.out.println(resultado);

        input.close();
    }

    private static String checaSinal(double numero) { // Ainda aprendendo a declarar a chamada da função (usei String)
        if ( numero <= 0) {
            return "N";
        }
        else {
            return "P";
    }
}
}
