import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] pan = new String[10][10];
        for (int i = 0; i < 10; i++) {                //판그리기
            for (int j = 0; j < 10; j++) {
                pan[i][j] = "";
            }
        }
        pan[1][1] = "B_Rook";
        pan[1][2] = "B_Knight";
        pan[1][3] = "B_Bishop";
        pan[1][4] = "B_Queen";
        pan[1][5] = "B_King";
        pan[1][6] = "B_Bishop";
        pan[1][7] = "B_Knight";
        pan[1][8] = "B_Rook";
        for (int i = 1; i < 9; i++) {
            pan[2][i] = "B_Pawn";
            pan[i][0] = String.valueOf(i);
            pan[i][9] = String.valueOf(i);
        }
        pan[8][1] = "W_Rook";
        pan[8][2] = "W_Knight";
        pan[8][3] = "W_Bishop";
        pan[8][4] = "W_Queen";
        pan[8][5] = "W_King";
        pan[8][6] = "W_Bishop";
        pan[8][7] = "W_Knight";
        pan[8][8] = "W_Rook";
        for (int i = 1; i < 9; i++) {
            char ch = (char) (64 + i);
            pan[9][i] = String.valueOf(ch);
            pan[0][i] = String.valueOf(ch);
            pan[7][i] = "W_Pawn";
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("|%8s", pan[i][j]);
            }
            System.out.println("|");
            for (int k = 0; k < 10; k++) {
                System.out.print("|--------");
            }
            System.out.println("|");
        }
        for (int i = 0; ; i++) {                                     //전개
            if (i % 2 == 0) {
                System.out.println("백차례입니다");
                System.out.println("움직일 기물을 고르세요");
                String move = s.next();
                char a_ch = move.charAt(1);
                char b_ch = move.charAt(0);
                int a = a_ch - '0';                    //세로
                int b = b_ch - 64;                    //가로
                System.out.println(pan[a][b]);
                if (pan[a][b].contains("W_")) {
                    System.out.println("이동할 곳을 입력하세요");
                    String reach = s.next();
                    char c_ch = reach.charAt(1);
                    char d_ch = reach.charAt(0);
                    int c = c_ch - '0';               //세로
                    int d = d_ch - 64;                //가로
                    if (a != c || b != d) {
                        if (pan[a][b].contains("Pawn")) {
                            if (a == 7 && (b == d && a - 2 == c)) {
                                pan[a][b] = "";
                                pan[c][d] = "W_pawn";
                            } else if (b == d && a - 1 == c) {
                                pan[a][b] = "";
                                pan[c][d] = "W_pawn";
                            } else if (pan[c][d].contains("B_") && ((b + 1 == d || b - 1 == d) && a - 1 == c)) {
                                pan[a][b] = "";
                                pan[c][d] = "W_pawn";
                            } else {
                                System.out.println("잘못되 위치입니다. 다시 두세요");
                                i--;
                            }
                        } else if (pan[a][b].contains("Rook")) {
                            if (a == c || b == d) {
                                pan[a][b] = "";
                                pan[c][d] = "W_Rook";
                            } else {
                                System.out.println("잘못되 위치입니다. 다시 두세요");
                                i--;
                            }
                        } else if (pan[a][b].contains("Bishop")) {
                            if (c - a == d - b) {
                                pan[a][b] = "";
                                pan[c][d] = "W_Bishop";
                            } else {
                                System.out.println("잘못되 위치입니다. 다시 두세요");
                                i--;
                            }
                        } else if (pan[a][b].contains("Knight")) {
                            if (Math.abs(a - c) == 2) {
                                if (Math.abs(b - d) == 1) {
                                    pan[a][b] = "";
                                    pan[c][d] = "W_Knight";
                                } else {
                                    System.out.println("잘못되 위치입니다. 다시 두세요");
                                    i--;
                                }
                            } else if (Math.abs(a - c) == 1) {
                                if (Math.abs(b - d) == 2) {
                                    pan[a][b] = "";
                                    pan[c][d] = "W_Knight";
                                } else {
                                    System.out.println("잘못되 위치입니다. 다시 두세요");
                                    i--;
                                }
                            } else {
                                System.out.println("잘못되 위치입니다. 다시 두세요");
                                i--;
                            }
                        }else if (pan[a][b].contains("King")) {
                            if (Math.abs(c - a) < 2) {
                                pan[a][b] = "";
                                pan[c][d] = "W_King";
                            } else {
                                System.out.println("잘못되 위치입니다. 다시 두세요");
                                i--;
                            }
                        } else if (pan[a][b].contains("Queen")) {
                            if ((a == c || b == d) || (c - a == d - b)) {
                                pan[a][b] = "";
                                pan[c][d] = "W_Queen";
                            } else {
                                System.out.println("잘못되 위치입니다. 다시 두세요");
                                i--;
                            }
                        }
                    } else {
                        System.out.println("기물을 움직여야합니다.");
                        i--;
                    }
                } else {
                    System.out.println("백기물을 고르세요");
                    i--;
                }

            } else {
                System.out.println("흑차례입니다");
                System.out.println("움직일 기물을 고르세요");
                String move = s.next();
                char a_ch = move.charAt(1);
                char b_ch = move.charAt(0);
                int a = a_ch - '0';                    //세로
                int b = b_ch - 64;                    //가로
                System.out.println(pan[a][b]);
                if (pan[a][b].contains("B_")) {
                    System.out.println("이동할 곳을 입력하세요");
                    String reach = s.next();
                    char c_ch = reach.charAt(1);
                    char d_ch = reach.charAt(0);
                    int c = c_ch - '0';               //세로
                    int d = d_ch - 64;                //가로
                    if (a != c || b != d) {
                        if (pan[a][b].contains("Pawn")) {
                            if (a == 2 && (b == d && a + 2 == c)) {
                                pan[a][b] = "";
                                pan[c][d] = "B_pawn";
                            } else if (b == d && a + 1 == c) {
                                pan[a][b] = "";
                                pan[c][d] = "B_pawn";
                            } else if (pan[c][d].contains("B_") && ((a + 1 == c || a - 1 == c) && b + 1 == d)) {
                                pan[a][b] = "";
                                pan[c][d] = "B_pawn";
                            } else {
                                System.out.println("잘못되 위치입니다. 다시 두세요");
                                i--;
                            }
                        } else if (pan[a][b].contains("Rook")) {
                            if (a == c || b == d) {
                                pan[a][b] = "";
                                pan[c][d] = "B_Rook";
                            } else {
                                System.out.println("잘못되 위치입니다. 다시 두세요");
                                i--;
                            }
                        } else if (pan[a][b].contains("Bishop")) {
                            if (c - a == d - b) {
                                pan[a][b] = "";
                                pan[c][d] = "B_Bishop";
                            } else {
                                System.out.println("잘못되 위치입니다. 다시 두세요");
                                i--;
                            }
                        } else if (pan[a][b].contains("Knight")) {
                            if (Math.abs(a - c) == 2) {
                                if (Math.abs(b - d) == 1) {
                                    pan[a][b] = "";
                                    pan[c][d] = "B_Knight";
                                } else {
                                    System.out.println("잘못되 위치입니다. 다시 두세요");
                                    i--;
                                }
                            } else if (Math.abs(a - c) == 1) {
                                if (Math.abs(b - d) == 2) {
                                    pan[a][b] = "";
                                    pan[c][d] = "B_Knight";
                                } else {
                                    System.out.println("잘못되 위치입니다. 다시 두세요");
                                    i--;
                                }
                            }else{
                                    System.out.println("잘못되 위치입니다. 다시 두세요");
                                    i--;
                                }
                            }
                        else if (pan[a][b].contains("King")) {
                            if (Math.abs(c - a) < 2) {
                                pan[a][b] = "";
                                pan[c][d] = "B_King";
                            } else {
                                System.out.println("잘못되 위치입니다. 다시 두세요");
                                i--;
                            }
                        } else if (pan[a][b].contains("Queen")) {
                            if ((a == c || b == d) || (c - a == d - b)) {
                                pan[a][b] = "";
                                pan[c][d] = "B_Queen";
                            } else {
                                System.out.println("잘못되 위치입니다. 다시 두세요");
                                i--;
                            }
                        }
                    } else {
                        System.out.println("기물을 움직여야합니다.");
                        i--;
                    }
                } else {
                    System.out.println("흑기물을 고르세요");
                    i--;
                }

            }
            for (int k = 0; k < 10; k++) {
                for (int j = 0; j < 10; j++) {
                    System.out.printf("|%8s", pan[k][j]);
                }
                System.out.println("|");
                for (int l = 0; l < 10; l++) {
                    System.out.print("|--------");
                }
                System.out.println("|");
            }
            for(int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (!pan[i][j].contains("B_King")) {
                        System.out.println("백의 승리입니다.");
                        break;
                    } else if (!pan[i][j].contains("W_King")) {
                        System.out.println("흑의 승리입니다.");
                        break;
                    }
                }
            }
        }
    }
}
