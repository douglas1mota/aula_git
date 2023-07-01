package Vetores;

import java.util.Scanner;
//Escreva uma função que retorna o inverso de um número fornecido

public class Ex15FuncaoNumAoContrario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número:");
        int entrada = input.nextInt();

        String numero = (String.valueOf(entrada));
        String inverso = inverteNumero(numero);
        System.out.println("o número " + numero + " ao contrário fica " + inverso);
        input.close();
    }
    private static String inverteNumero(String numero){
        int tamanho = numero.length();
        StringBuilder sb = new StringBuilder(numero);

        for (int i = 0; i < (tamanho / 2); i++) {
            char temp = numero.charAt(i);
            char temp2 = numero.charAt(tamanho - 1 - i);
            sb.setCharAt(i, temp2); // algumas funções pedem mais de um parametro, separados por virgula
            sb.setCharAt((tamanho - 1 - i), temp); //primeiro contato com a funçao setCharAt
            numero = sb.toString();


        }
        return numero;
    }
}


// nesse exercício, a variável inverso foi declarada como string e a função também foi string
// nos meus testes, eu criei a variavel valor do tipo Int e usando Integer.parseInt(numero) e retornei valor;
// a inverso e a funcao precisaram ser declaradas como do tipo int


// pensei em algumas coisas: o número entra como int. Eu preciso percorrer esse número como se fosse uma array;
//
    /*private static int tornaInverso(int numero) {
        int[] rev = new int[4];
        int soma = 0;
        for (int i = 0; i < rev.length; i++) {
            soma = numero.charAt(i);
        }
        return soma;
}*/