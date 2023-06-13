package Arrays;

import java.util.Scanner;

public class ArrayModelo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];
        //carrega valores para a matriz "a"
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o valor do " + (i + 1) + "º elemento");
            a[i] = input.nextInt();
        }
        //carrega valores para a matriz "b"
        for(int i = 0; i < 4; i++) {
            b[i] = a[i] / 2;
        }
        //exibe os valores obtidos para "a" e para "b"
        for (int i = 0; i <4; i++){
            System.out.println(a[i] +" "+ b[i]);

        }
        input.close();
    }
}
