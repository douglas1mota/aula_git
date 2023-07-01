package Repeticao;

import java.util.Scanner;

public class RepeticaoModelo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("informe o número da Tabuada:");
        int numDaTabuada = input.nextInt();

        for (int contador = 16; contador >= 0; contador -=2 ) {
            int valorResultado = numDaTabuada * contador;
            System.out.println(numDaTabuada + " x " + contador + " = " + valorResultado);
        }

        input.close();
    }
}
