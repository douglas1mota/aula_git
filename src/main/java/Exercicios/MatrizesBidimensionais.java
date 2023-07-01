package Exercicios;

public class MatrizesBidimensionais {
    public static void main(String[] args) {
        double[][] x = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int i = 0;
        int j = 0;
        for(i = 0; i < x.length; i++) {
            for(j = 0; j < x.length; j++) {
                System.out.println(i + "/" + j + " = " + x[i][j] + "\t");
            }
        System.out.println("\n");
        }
        }
    }

