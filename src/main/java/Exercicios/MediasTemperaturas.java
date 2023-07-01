package Exercicios;

import java.util.Arrays; //primeira vez que importei essa biblioteca
import java.util.Scanner;
public class MediasTemperaturas {
    public static void main(String[] args) {
        int[] listaTemperatura = new int[5]; // o exercício 12 pedia 20 mas assim eh mais rapido
        Scanner input = new Scanner(System.in);

        //---------------------------------Obtenção dos 20 registros de temperatura ------------------------------//

        for (int i = 0; i < listaTemperatura.length; i++) {
            System.out.println("Informe a temperatura número " + (i + 1));
            int temp = input.nextInt();
            listaTemperatura[i] = temp; //essa é a estrutura pra adicionar o valor de cada entrada pra cada posição da array
            // descobri depois que não precisava ter declarado a variável temp.. poderia atribuir o nextInt direto no array[i]
        }
        // String resultado = Arrays.toString(listaTemperatura); essa linha e a biblioteca eu escrevi pra checar
        //System.out.println(resultado);

      /*  do {
            System.out.println("Informe a temperatura número "  + (ListaTemperatura.size() + 1));
            temp = input.nextInt();
            ListaTemperatura.add(temp);
        } while  (temp < ListaTemperatura.size()); */

//------------------------- classificacao dos elementos-------------

        int menor = listaTemperatura[0]; //acertei sem saber, na tentativa de usar um valor pertencente à array
        int maior = listaTemperatura[0];

        for (int i = 0; i < listaTemperatura.length; i++) {
            if (listaTemperatura[i] < menor) {
                menor = listaTemperatura[i];
            }

            if (listaTemperatura[i] > maior) {
                maior = listaTemperatura[i];
            }
        }
        int soma = 0; // declarando a variável que vai receber a soma dos 20 registros
        for (int i = 0; i < listaTemperatura.length; i++) {
            soma += listaTemperatura[i];
        }
        int media = (soma / listaTemperatura.length); // declarando a variável e já atribuindo o valor através da fórmula soma dividido
        // pelo número de elementos da array, caso eu queira variar.

        //------------exibição das solicitacoes-----------------------------

        System.out.println("Menor temperatura em °C: " + menor);
        System.out.println("Maior temperatura em °C: " + maior);
        System.out.println("Temperaturas somadas: " + soma);
        System.out.println("Quantidade de registros: " + listaTemperatura.length);
        System.out.println("Média das temperaturas em °C: " + media);









        input.close();



    }
}
