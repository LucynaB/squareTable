import java.lang.Math;
import java.util.Arrays;

public class SquareTable {
    public static void main(String[] args) {
        int[][] table = new int[11][11];
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (int) Math.pow(i + j, 2);
            }
            System.out.println(Arrays.toString(table[i]));
        }

        for (int i = 0; i < table.length; i++) {
            suma1 += table[i][i];
        }

        System.out.println("Suma przekątna1: " + suma1);


        int i = 0;
        while (i < table.length) {
            for (int j = table[i].length - 1; j >= 0; j--) {
                suma2 += table[i][j];
                i++;
            }


        }

        System.out.println("Suma przekątna2: " + suma2);

    }


}

