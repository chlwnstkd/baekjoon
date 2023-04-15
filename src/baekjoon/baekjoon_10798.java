package baekjoon;

import java.util.Scanner;
public class baekjoon_10798 {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        char result[][] = new char[5][15];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String arr = s.next();
            max = Math.max(max,arr.length());
            for (int j = 0; j < arr.length(); j++) {
                result[i][j] = arr.charAt(j);
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (result[i][j] == '\0')
                    continue;
                System.out.print(result[j][i]);
            }
        }
        s.close();
    }
}
