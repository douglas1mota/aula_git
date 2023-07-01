package Vetores;

import Classes.Pessoa;

import java.util.Scanner;
public class Ex8testes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa("cris");

        p1.fazAniversario();
        p1.fazAniversario();
        System.out.println(p1.getIdade());
        p1.setNome("Carla");
        System.out.println(p1.getNome());
        input.close();
        Pessoa p2 = new Pessoa("rafael");
        p2.setNome("cris");
        System.out.println(p2.getNome());
        }

    }