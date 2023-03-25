import java.util.Scanner;
public class baekjoon_2941 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String st = s.nextLine();

        for (int i = 0; i < str.length;i++) {
            if(st.contains(str[i]))
                st = st.replace(str[i], "!");
        }
        System.out.println(st.length());
    }
}
