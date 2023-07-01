package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;
// Elaborar um programa que leia valores positivos inteiros até que um valor
//negativo seja informado. Ao final devem ser apresentados o maior e o menor valores
//informados pelo usuário.
//Resultado esperado:
//Maior valor informado: {maiorValor}
//Menor valor informado: {menorValor}
// eu dividi o exercício em tres partes. a primeira foi criar um loop while pra aceitar infinitas entradas do usuario
// até o break
// a segunda parte foi descobrir uma forma de adicionar cada entrada numa array
// a terceira parte foi criar uma forma de ler a array formada e encontrar o maior e o menor valor.
// o chatgpt mostrou algumas ferramentas e eu pretendo estudar novamente a diferença entre array e arrayList
// pq os atributos mudam, por exemplo, o .size e o .get eu não conhecia. Nessa ultima parte eu tbm nao imaginei que
// usaria uma função For para passear pelos itens da array e comparar valores. Ainda não fez sentido pra mim.
public class PositivosAteUmNegativo {
    public static void main(String[] args) {
        ArrayList<Integer> Memoria = new ArrayList<>(); //declara uma lista com o nome de memória, vazia, do tipo integ
        Scanner entrada = new Scanner(System.in); //declara um objeto scanner de nome entrada
        Integer numero; //declara a variável numero, do tipo integer

        System.out.println("Digite um número positivo. Para encerrar, digite um negativo:"); //pede a primeira entrada
        numero = entrada.nextInt(); //lê o primeiro valor e atribui esse valor à variável numero
        Memoria.add(numero); // e guarda na posição 0

        while (numero >= 0) { // le se o valor de número obedece a condição. se for maiorigual zero, envia as novas inst
            System.out.println("Digite um número positivo. Para encerrar, digite um negativo:"); //atendida a condição
            // pede novos números positivos

            numero = entrada.nextInt(); // lê os valores e em cada loop adiciona o valor à variável numero
            Memoria.add(numero); // guarda esses novos numeros em sequência na lista Memoria
        }
        System.out.println(Memoria); // imprime toda a array, incluindo o valor que quebra e encerra a condição

        //vamos supor que o usuário entrou com [23, 34, 45, 56, 67, -2] ou seja, tem 6 elementos

        int menor = Memoria.get(0); // declara a variável, atribuindo o primeiro valor da lista Memoria, no caso 23
        int maior = Memoria.get(0); // mesma coisa

        for (int i = 1; i < Memoria.size(); i++) { //esse for vai analisar os próximos 5 elementos da lista Memoria,
            // comparando com o valor do elemento já atribuido às variáveis menor e maior, no caso o 23
            if (Memoria.get(i) < menor) { // compara se 34(i) é menor que 23(menor). Nesse caso, não
                // mas se fosse o contrário, a próxima instrução
                menor = Memoria.get(i); // atribuiria o valor de 23 à variável menor, ou menor receberia 23.
            }

            if (Memoria.get(i) > maior) { //esse compara se 34(i) é maior que 23(maior). Nesse caso, sim
                maior = Memoria.get(i); // então a variável maior recebe o valor desse segundo i, que é 34.
            } // esse for, portanto, repete o loop por 5 vezes, comparando os valores
        } // no caso da resolução do chatgpt, o while fica true até o if na instrução ser falso, levando à quebra do loop

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
        System.out.println("Fim da Execução");
    }
}
