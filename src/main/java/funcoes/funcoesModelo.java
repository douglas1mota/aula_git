package funcoes;

import java.util.Scanner;

public class funcoesModelo {
    public static final double PI = 3.1416; //declarei uma constante em maiuscula
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("informe o valor do Raio:");
        int raio = input.nextInt();

        double areaDoCirculo = calculaAreaDoCirculo(raio);

        double novaArea = calculaAreaDoCirculo(1);

        System.out.println("a área do círculo de raio " + raio + " é: " + areaDoCirculo);

        System.out.println("nova área: " + novaArea);
        input.close();
    }

    private static double calculaAreaDoCirculo(int raio) {
        if (raio <=1) {
            return 0;
        }
        return PI * (raio * raio);
    }
}
