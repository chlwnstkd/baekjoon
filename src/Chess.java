import java.util.Scanner;
public class Chess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] pan = new String[8][8];
        pan[0][0] = "B_Rook";
        pan[0][1] = "B_Knight";
        pan[0][2] = "B_Bishop";
        pan[0][3] = "B_Queen";
        pan[0][4] = "B_King";
        pan[0][5] = "B_Bishop";
        pan[0][6] = "B_Knight";
        pan[0][7] = "B_Rook";
        for (int i = 0; i < 8; i++) {
            pan[1][i] = "B_Pawn";
        }
        pan[7][0] = "W_Rook";
        pan[7][1] = "W_Knight";
        pan[7][2] = "W_Bishop";
        pan[7][3] = "W_Queen";
        pan[7][4] = "W_King";
        pan[7][5] = "W_Bishop";
        pan[7][6] = "W_Knight";
        pan[7][7] = "W_Rook";
        for (int i = 0; i < 8; i++) {
            pan[6][i] = "W_Pawn";
        }
    }
}
