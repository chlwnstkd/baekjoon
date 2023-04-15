package baekjoon;

import java.util.Scanner;
public class baekjoon_2738 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int aa[][] = new int[a][b];
        int bb[][] = new int[a][b];
        int result[][] = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                aa[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                bb[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d ", aa[i][j] + bb[i][j]);
            }
            System.out.println();
        }

    }
}