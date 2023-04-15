package baekjoon;

import java.util.Scanner;
public class baekjoon_2745 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.next();
        int N = s.nextInt();
        int tmp = 1;
        int ans = 0;

        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);

            if('A'<= c && c <= 'Z') {
                ans += (c-'A'+10)*tmp;
            }else {
                ans += (c-'0')*tmp;
            }
            tmp *= N;
        }

        System.out.println(ans);

    }
}

