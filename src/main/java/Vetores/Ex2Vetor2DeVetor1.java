package Vetores;
import java.util.Arrays;
public class Ex2Vetor2DeVetor1 {
    public static void main(String[] args) {
        int[] V = {1,2,6,8};
        int[] V2 = new int[V.length];

        for(int i = 0; i < V2.length; i++) {
         V2[i] = V[i] * 2;

        }
        System.out.println("os valores de V são: "+Arrays.toString(V));
        System.out.println("os valores de V2 são: "+Arrays.toString(V2));

        }
    }

