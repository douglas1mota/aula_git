package Decisao;

import java.util.Scanner;

public class DecisaoModelo {

    public static void main(String[] args) {

        double n1, n2, n3, n4;
        double md;

        Scanner input = new Scanner(System.in);

        System.out.println("informe a primeira nota:");
        n1 = input.nextDouble();

        System.out.println("informe a segunda nota:");
        n2 = input.nextDouble();

        System.out.println("informe a terceira nota:");
        n3 = input.nextDouble();

        System.out.println("informe a quarta nota:");
        n4 = input.nextDouble();

        md = (n1 + n2 + n3 + n4) / 4;

        if (md >= 5) {
            System.out.println("aprovado");
        }
        else {
            System.out.println("reprovado");
        }
        System.out.println("média:" +md);
        input.close();

    }
}
