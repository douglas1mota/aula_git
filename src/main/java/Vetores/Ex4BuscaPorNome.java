package Vetores;
import java.util.Arrays;
import java.util.Scanner;
public class Ex4BuscaPorNome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] agenda = new String[3];

        for (int i = 0; i < agenda.length; i++){
            System.out.println("Informe o "+(i+1)+"° nome: ");
            agenda[i] = input.nextLine();
            }
        System.out.println(Arrays.toString(agenda)); //opcional

        String busca = null;
        System.out.println("Digite o nome a ser procurado: ");
        busca = input.nextLine();
        String resultado = null;

        for (int i = 0; i < agenda.length; i++) {
            if (busca.equals (agenda[i])) { //esse foi o primeiro contato com o termo equals, que é o = para String
                resultado = ("Achei, na "  + (i+1)+ "° posição.");
                break;
            } else {
                resultado = "Não achei";
            }
        }
        System.out.println(resultado);
    }
}
