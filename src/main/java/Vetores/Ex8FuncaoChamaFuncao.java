package Vetores;

import java.util.Scanner;

public class Ex8FuncaoChamaFuncao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] entradas = new double[4];
    //    double[] xhum = {2, 4, 4.3, 9};
        System.out.println("insira 4 valores");
        for(int i = 0; i < entradas.length; i++) {
            entradas[i] = input.nextDouble();
        }

        double assoma = somaTotalArgumentos(entradas);

        System.out.println("A soma de todos os valores é: " + assoma);

        double media = mediaValores(entradas);

        System.out.println("A média é: " + media);
        input.close();
    }

    private static double mediaValores(double[] entradas) {
        double contagem = 0;
        for (double temp : entradas) {
            contagem++;
        }
        return (somaTotalArgumentos(entradas) / contagem);
    }

    // ----------------FUNCAO 1------------------------------------------
    public static double somaTotalArgumentos(double... entradas) {
        double soma = 0;
        for (double numero : entradas) {
            soma += numero;
        }
        return soma;
    }
    // ---------------------------FUNCAO 2 --------------------------

}
// -----------------------------------------COMENTÁRIOS---------------------------

//nesse exercício, eu primeiro declarei 3 variáveis para receber as entradas do usuário. Depois, declarei uma
//variável para receber o resultado da função somaTotalArgumentos
//depois, configurei a funçao sTA, informando como parametros o tipo e o nome das variáveis
//como retorno, coloquei o cálculo A + B + C
// mas eu não estava satisfeito, queria uma forma de que a função fosse flexível
// coloquei as entradas para ficarem numa array, com os valores entrando por um loop for limitado ao size da array
// declarei uma variável "assoma" para receber o valor do retorno da função e tbm para ser impressa
// a função recebeu como parâmetros o VarArgs (argumentos variáveis), que entra o tipo da variável, reticencias e
// a array.
// a manipulação dessa array na função se deu através do loop for each, que eu li a respeito, mas não tinha usado
// pelo que eu vi, foreach eh só um for simplificado, sem a indexação [i], permitindo somente a leitura e a contagem.
// a função média foi mais simples de criar e depois usar.
