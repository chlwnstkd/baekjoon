package chess;

public class select {
    public int a_select(String str) {

        char a_ch = str.charAt(1);
        int a = a_ch - '0';                    //세로
        return a;
    }

    public int b_select(String str) {
        char b_ch = str.charAt(0);
        int b = b_ch - 64;                    //가로
        return b;
    }
}
