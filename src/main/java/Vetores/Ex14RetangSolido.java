package Vetores;

import java.util.Scanner;
// Escreva uma função que mostre um retângulo sólido composto do mesmo caractere. A
//função deve receber como parâmetro a quantidade de linhas e colunas e exibir o retângulo
//com os seguintes parâmetros.
//Exemplo:
//geraRetangulo(4, 6) geraria o seguinte resultado:
//VVVVVV
//VVVVVV
//VVVVVV
//VVVVVV

public class Ex14RetangSolido {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o número de linhas:");
        int linhas = input.nextInt();
        System.out.println("Insira o número de colunas:");
        int colunas = input.nextInt();
        System.out.println("Insira o valor do caractere:");
        char valor = input.next().charAt(0); //não conhecia essa instrução, primeira vez usando o char
        //charAt() já conhecia - detalhe para o parâmetro Zero na função.
        //    String palavra = String.valueOf(valor * 2);
        //eu quero criar uma sequencia de caracteres que sera armazenada em linhaxcar do tipo string.
        //para criar essa sequencia, eu preciso repetir o caractere recebido na variável valor do tipo string
        // pelo tanto de vezes definido na variavel colunas do tipo int.
        //acabei de pensar em imprimir na mesma linha (sem o ln do println) um for dentro de outro for
        char[] rev = new char[colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) { //estudar Arrays.fill()
                rev[j] = valor;
            }
            System.out.println(rev);
        }

        input.close();
    }
}

