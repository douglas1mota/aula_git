package Vetores;
 import java.util.Scanner;
public class Ex6VetorTemperaturas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] temperatura = new int[7];

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("informe a temperatura do dia " + (i+1) + ":");
            temperatura[i] = input.nextInt();
        }

        int maior = temperatura[0];
        int menor = temperatura[0];
        int soma = 0;
        int media = 0;
        int abaixo = 0;
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > maior) {
                maior = temperatura[i];
            }
            if (temperatura[i] < menor) {
                menor = temperatura[i];
            }
            soma += temperatura[i];
        }
        media = (soma / temperatura.length);

        for (int i = 0; i < temperatura.length; i++) {

            if (temperatura[i] < media) {
                abaixo++;
            }

        }



System.out.println("Menor: " + menor + " - Maior: " + maior + " - Média: " + media + " - N° de dias abaixo da média: " + abaixo);
        input.close();
    }
}
