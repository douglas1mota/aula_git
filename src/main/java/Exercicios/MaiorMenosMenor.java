package Exercicios;

import java.util.Scanner;

public class MaiorMenosMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("informe um valor:");
        double an = input.nextDouble();
        System.out.println("informe o segundo valor:");
        double bn = input.nextDouble();
        // aqui eu declarei a variavel resultado e tentei atribuir o valor na hora, usando a função if, mas nao
        // funcionou. precisei usar a if separado e na instrução dela coloquei a atribuição de valor pra resutlado
        double resultado;
        if (an > bn) {
            resultado = an - bn;
        }
        else {
            resultado = bn - an;
        }
        System.out.println("a diferença do maior para o menor é: " + resultado);


        input.close();
    }
}
