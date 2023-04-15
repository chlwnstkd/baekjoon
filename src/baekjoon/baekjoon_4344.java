package baekjoon;

import java.util.Scanner;
public class baekjoon_4344 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int[] arr;

        for (int i = 0; i < c; i++) {
            int n = s.nextInt();
            arr =  new int[n];
            double total = 0;
            for (int j = 0; j < n; j++) {
                int score = s.nextInt();
                arr[j] = score;
                total = total + score;
            }
            double adverage = total / n;
            double count = 0;
            for(int j = 0 ; j < n ; j++) {
                if(arr[j] > adverage) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/n)*100);


        }
        s.close();
        }
}

