package baekjoon;

import java.util.Scanner;
public class baekjoon_2566 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = new int[9][9];
        int max;
        int a = 1;
        int b = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        max = arr[0][0];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    a = i + 1;
                    b = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d",a, b);
    }
}
