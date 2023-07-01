package Vetores;

import java.util.Scanner;
// a lógica da minha função original foi a que está nesse código. A título de aprendizado, pedi ao chatGpt pra analisar
// e ele retornou uma outra lógica, mais enxuta. Basicamente, um n é primo qdo é divisível por ele e por 1.
// então, eu só preciso encontrar, entre 1 e o n, outra divisão cujo resto seja 0. Se aparecer uma ou mais, n não é
// primo. Exemplo: numero 6. Vai ser dividido por 2, por 3, por 4 e por 5. Se uma dessas divisões der resto 0, não é
// primo. 6por2 dá zero, 6por3 dá zero. Logo não é primo. Já o 7 não vai aparecer nenhum (lembre q 1 e o próprio 7 não
// fazem parte dos divisores sugeridos na configuraçao do for (int i = 2; i < numero; i++). Aparecendo uma ocorrência
// no contador n++, retorna "não é primo". Else retorna "é primo".


public class Ex12FuncaoNumPrimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<6; i++) {
            System.out.println("informe um número");
            int candidato = input.nextInt();
            String resultado = checaPrimo(candidato);
            System.out.println("o número " + candidato + " " + resultado);
        }



        input.close();

    }

    private static String checaPrimo(int candidato) {
        int[] divisoes = new int[candidato + 1];
        for (int j = 1; j < divisoes.length; j++) {
            divisoes[j] = candidato % j;

        }
        int zeros = 0;
        for (int n = 1; n < divisoes.length; n++) {
            if(divisoes[n] == 0) {
                zeros++;
            }
        }
        if (zeros == 2) {
            return "é primo";
        } else {
            return "não é primo";
        }
    }
}
