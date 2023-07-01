package Vetores;
//Faça uma função que informe a quantidade de dígitos de um determinado número Doubleeiro informado.
import java.util.Scanner;
public class Ex10ContaDigitos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor:");
        double numero = input.nextDouble();

        int digitos = contaDigitos(numero);
        System.out.println("o número de dígitos é: " + digitos);

        input.close();
    }

    private static int contaDigitos(double numero) { //errei no início ao informar q seria String
        String texto = Double.toString(numero);
        if (texto.startsWith("-")) {
            texto = texto.substring(1); // esse index 1 significa que a var texto não vai receber o
            // que estiver no campo 0 zero (imaginando que a string eh como se fosse uma array)
        }
        if (texto.endsWith(".0")) {
            texto = texto.substring(0, texto.length() - 1); //no exer de testes, treinei a utilidade da substring
        }
        texto = texto.replace(".", "");
        return texto.length();
    }

}
