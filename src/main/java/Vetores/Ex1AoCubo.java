package Vetores;
// esse exercicio pedia para gerar 8 vet
import java.util.Arrays;
public class Ex1AoCubo {
    public static void main(String[] args) {
        double[] cubo = new double[8];

        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = Math.pow (i, 3);

        }
        for (int i = 0; i < cubo.length; i++) {
            System.out.println((i + 1) + " - " + i + " elevado ao cubo = " + (int) cubo[i]);
        }
        System.out.println("\n" + Arrays.toString(cubo)); //essa forma imprime os valores dos elementos com casa decimal.
    //"\n" + insere uma quebra de linha
        //para imprimir uma array oriunda de double, com casa decimal, preciso converter a array para int,
        // encastoando (int) no for. Declaro uma nova array do tipo String, converto os valores de double pra int
        // declaro uma variavel int pra receber esses valores convertidos e a nova array recebe String.valueOf(variavel)
        String[] cubstring = new String[cubo.length];
        for (int i = 0; i < cubstring.length; i++) {
            int temp = (int) cubo[i];
            cubstring[i] = String.valueOf(temp);
        }
        System.out.println(Arrays.toString(cubstring));
    }
}
