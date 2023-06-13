package Exercicios;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //(Média) Efetuar a leitura de três valores numéricos (representados pelas variáveis A, B
        //e C) e processar o cálculo da equação completa de segundo grau, utilizando a fórmula de
        //Bhaskara (considerar para a solução do problema todas as possíveis condições para
        //delta: delta < 0 - não há solução real, delta> 0 - há duas soluções reais e diferentes e
        //delta= 0 - há apenas uma solução real). Lembre-se de que é completa a equação de
        //segundo grau que possui todos os coeficientes A, B e C diferentes de zero. O programa
        //deve apresentar respostas para todas as condições estabelecidas para delta.
        //Resultado esperado:
        //Se delta < 0: “Não há solução nos números reais”
        //Se delta = 0: “O valor de X é: {X}“
        //Se delta > 0: “O valor de X1 = {X1} e o valor de X2 = {X2}“
        System.out.println("Informe a variável A: ");
        double A = input.nextDouble();
        System.out.println("Informe a variável B: ");
        double B = input.nextDouble();
        System.out.println("Informe a variável C: ");
        double C = input.nextDouble();
        double delta = (B * B) - (4 * A * C);
        double x1 = ((-B) + java.lang.Math.sqrt(delta))/ (2 * A);
        double x2 = ((-B) - java.lang.Math.sqrt(delta))/ (2 * A);

        if (delta < 0) {
            System.out.println("Não há solução nos números reais");
        }

        else if (delta == 0) {
            System.out.println("O valor de X é " + x1);
        }

        else {
            System.out.println("O valor do Delta da equação é " + delta + ", a primeira raiz é " + x1 + " e a segunda raiz é " + x2);
        }




        input.close();
    }
}
