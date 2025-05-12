package aprendendo.java;

public class Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char = '\u0000' ''
        // boolean = false
        // string = null
        float [] idade = new float[3];
        System.out.println(idade [0]);
        System.out.println(idade [1]);
        System.out.println(idade [2]);


        // Adiconando nomes no Arrays

        String [] nomes = new String[4];
        nomes[0] = "cachorro";
        nomes[1] = "jacaré";
        nomes[2] = "gato";
        nomes[3] = "papagaio";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
        int[] numero = new int[3];
        int[] numeros2 = {1,2,3,4,5,6};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        // Arrays multidimensionais

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);

            }
        }
        int[][]  dias = new int[][];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;
        dias[0][3] = 4;
        dias[0][4] = 5;

        dias[1][0] = 1;
        dias[1][1] = 2;
        dias[1][2] = 3;
        dias[1][3] = 4;
        dias[1][4] = 5;

        dias[2][0] = 1;
        dias[2][1] = 2;
        dias[2][2] = 3;
        dias[2][3] = 4;
        dias[2][4] = 5;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                for (int k = 0; k < dias[0].length; k++) {

                }
                System.out.println(dias[i][j]);

            }

        }
    }
}
