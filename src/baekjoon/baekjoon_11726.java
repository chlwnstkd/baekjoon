package baekjoon;

import java.util.Scanner;

public class baekjoon_11726 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] result = new int[n+2];
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i <= n; i++) {
            result[i] = (result[i-1] + result[i-2])%10007;
        }
        System.out.println(result[n]%10007);
    }
}
