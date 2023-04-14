package chess;

public class Rule {
    public void startpan(String[][] arr) {
        for (int i = 0; i < 10; i++) {                //판그리기
            for (int j = 0; j < 10; j++) {
                arr[i][j] = "";
            }
        }
        arr[1][1] = "B_Rook";
        arr[1][2] = "B_Knight";
        arr[1][3] = "B_Bishop";
        arr[1][4] = "B_Queen";
        arr[1][5] = "B_King";
        arr[1][6] = "B_Bishop";
        arr[1][7] = "B_Knight";
        arr[1][8] = "B_Rook";
        for (int i = 1; i < 9; i++) {
            arr[2][i] = "B_Pawn";
            arr[i][0] = String.valueOf(i);
            arr[i][9] = String.valueOf(i);
        }
        arr[8][1] = "W_Rook";
        arr[8][2] = "W_Knight";
        arr[8][3] = "W_Bishop";
        arr[8][4] = "W_Queen";
        arr[8][5] = "W_King";
        arr[8][6] = "W_Bishop";
        arr[8][7] = "W_Knight";
        arr[8][8] = "W_Rook";
        for (int i = 1; i < 9; i++) {
            char ch = (char) (64 + i);
            arr[9][i] = String.valueOf(ch);
            arr[0][i] = String.valueOf(ch);
            arr[7][i] = "W_Pawn";
        }
    }
    public void printpan(String[][] arr) {
        for (int k = 0; k < 10; k++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("|%8s", arr[k][j]);
            }
            System.out.println("|");
            for (int l = 0; l < 10; l++) {
                System.out.print("|--------");
            }
            System.out.println("|");
        }
    }
    public int diagonal(String[][] str, int a, int b, int c, int d) {
        int c_big, c_small,w_big, w_small;
        int count = 0;
        if (a<c) {
            c_big = c;
            c_small = a;
        } else {
            c_big = a;
            c_small = c;
        }
        if (b<d) {
            w_big = d;
            w_small = b;
        } else {
            w_big = b;
            w_small = d;
        }
        for (int i = c_small ,j = w_small; i < c_big && j < w_big; i++, j++) {
            if(str[i][j].equals(""))
                count++;
        }
        return count;
    }
    public int straight(String[][] str, int a, int b, int c, int d) {
        int big, small;
        int count = 0;
        if (a == c) {
            if (b > d) {
                big = b;
                small = d;
            }else {
                big = d;
                small = b;
            }
            for (int i = small; i < big ; i++) {
                if(str[a][i].equals(""))
                    count++;
            }
        } else {
            if (a > c) {
                big = a;
                small = c;
            }else {
                big = c;
                small = a;
            }
            for (int i = small; i < big ; i++) {
                if(str[i][b].equals(""))
                    count++;
            }
        }
        return count;
    }
}
