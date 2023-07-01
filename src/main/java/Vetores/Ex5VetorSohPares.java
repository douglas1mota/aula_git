package Vetores;

import java.util.Scanner;
import java.util.Arrays;

public class Ex5VetorSohPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] q = new int[3];

        for (int i = 0; i < q.length; i++) {
            do {
                System.out.println("Informe o " + (i+1) + "° valor (apenas valores pares):");
                q[i] = input.nextInt();

                if (!((q[i]) % 2 == 0)) {
                    System.out.println("VALOR INVÁLIDO!");
                }
            }
            while (!((q[i]) % 2 == 0)) ;
            // do imprime o comando e admite a entrada para q[i]. Dps, if testa se o resto da divisão do elemento por 2 é diferente(!) de zero
            // se sim, imprime Invalido. Segue para o teste do while, que é o mesmo teste do if
            // se pegarmos o número 5, resto 1. o if vai dar verdadeiro e imprime invalido. no while, o verdadeiro libera para repetir o loop Do na
            // mesma iteração. Já um número par, dá falso para o if e falso para o Do, quebrando o loop e entrando na proxima iteração.
        }
        System.out.println(Arrays.toString(q));

        //----------------------- processar e exibir o maior valor da array e qual posição esse valor ocupa na array----------
        int menor = q[0];
        int posicaoMenor = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] < menor) {
                menor = q[i];
                posicaoMenor = (i + 1);
            }
        }
        System.out.println("O menor valor da lista é " + menor + " e ocupa a posição " + posicaoMenor + " da lista!");



        input.close();

    }
}
