package Vetores;
//crie uma função que recebe uma string e verifica se o texto é um palíndromo ou não,
//retornando “É uma palíndromo” caso seja, ou “Não é um palíndromo caso contrário.
import java.util.Scanner;

public class Ex11Palindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Escreva uma palavra:");
            String texto = input.nextLine();
            String resultado = checaPalind(texto);
            System.out.println(resultado);
        }

        input.close();
    }

    private static String checaPalind(String texto) {
        int tamanho = texto.length();
        String decisao = null;
        for (int i = 0; i < (tamanho / 2); i++) {  //divide o tamanho da palavra em 2
            if (texto.charAt(i) == texto.charAt(tamanho - 1 - i)) { //.charAt foi meu primeiro contato.
                // quando i = 0, tamanho - 1 - i vai dar 3 então osso = (0 - o, 1 - s, 2 - s, 3 - o)
                decisao = "É palíndromo";
            } else {
                decisao = "Não é palíndromo";
            }
        }
    return decisao;}
}



