package Exercicios;

import java.util.Scanner;

//Elaborar um programa que efetue a leitura de dez nomes de pessoas em uma
//matriz A do tipo vetor e apresente-os em seguida.
public class MatrizDeNomes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // o enunciado pede a leitura, logo o usuario precisa informar manualmente
        String[] agenda = new String[10]; // cada nome precisa ser salvo numa lista, aqui declaro uma array do tipo string
                                        // de nome agenda e capacidade para 10 elementos


        int i = 0; // declaro e inicializo a variável i do tipo integer fora do loop pra poder usa-la depois fora .
        for (i = 0; i < agenda.length; i++) // quando o loop começa no zero, o i deve ser menor que a capacidade da agenda.
                                            // se o loop começasse com i = 1, eu poderia condicionar < ou =
            {
                if (agenda[i] == null) // se o valor do próximo slot for vazio, então segue para as instruções//
                    {
                System.out.println("Digite o " + ( i + 1 ) + "° nome:"); //pede ao usuario a entrada de cada nome//
                String nome = input.nextLine(); // atribui o valor digitado à variável nome, do tipo string//
                agenda[i] = nome; //adiciona a slot vazio o valor que estava na variavel nome//
                }
            }
        System.out.println("Os nomes digitados foram:");
        for (i = 0; i < agenda.length; i++)
            {
            System.out.println((i+1)+"° - " + agenda[i]);
            }

        input.close();
    }
}

