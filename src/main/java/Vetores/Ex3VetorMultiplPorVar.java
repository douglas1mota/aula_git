package Vetores;
import java.util.Scanner;
import java.util.Arrays;

public class Ex3VetorMultiplPorVar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] MatrizA = new int[10];
        System.out.println("Informe dez valores para a MatrizA: ");
        for(int i = 0; i < MatrizA.length; i++) {
            MatrizA[i] = input.nextInt();
        }
        int X = 0;
        System.out.println("Informe um valor para a variável X: ");
        X = input.nextInt();

        int[] M = new int[MatrizA.length];
        for(int i = 0; i < M.length; i++) {
            M[i] = MatrizA[i] * X;
        }
        System.out.println("Os valores da matriz M são: "+Arrays.toString(M));
        input.close();
    }
}
