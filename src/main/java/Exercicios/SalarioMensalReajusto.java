package Exercicios;

import java.util.Scanner;

public class SalarioMensalReajusto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sm;
        System.out.println("informe salário atual:");
        sm = input.nextDouble();

        double pr;
        System.out.println("informe percentual de reajuste:");
        pr = input.nextDouble();

        double ns = (sm * (pr / 100)) + sm;
        System.out.println("o novo salário é: " + ns);

        input.close();
    }
}
