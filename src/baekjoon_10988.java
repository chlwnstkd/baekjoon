import java.util.Scanner;
public class baekjoon_10988 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse))
            System.out.println(1);
       else
            System.out.print(0);
    }
}
