package chess;
import java.util.Scanner;
public class play {
    public void moving(String color, String col, String[][] arr, int i) {
        Scanner s = new Scanner(System.in);
        select sel = new select();
        peace p = new peace();
        int exit_1 = 0;
        while (true) {
            while (exit_1 == 0) {
                System.out.println(color + "차례입니다");
                System.out.println("움직일 기물을 고르세요");
                String move = s.nextLine();
                int a = sel.a_select(move);
                int b = sel.b_select(move);
                System.out.println(arr[a][b]);
                if (arr[a][b].contains(col)) {
                    System.out.println("이동할 곳을 입력하세요");
                    String reach = s.nextLine();
                    int c = sel.a_select(reach);
                    int d = sel.b_select(reach);
                    if ((arr[c][d].contains(col))) {
                        System.out.println("잘못되 위치입니다. 다시 두세요");
                        continue;
                    }
                    if (a != c || b != d) {
                            if (p.pawn(arr, col, i, a, b, c, d) == 1){
                                continue;
                            }
                            if(p.rook(arr, col, a, b, c, d) == 1) {
                                continue;
                            }
                            if(p.bishop(arr, col, a, b, c, d) == 1) {
                                continue;
                        }
                            if(p.knight(arr, col, a, b, c, d) == 1){
                                continue;
                        }
                            if(p.king(arr, col, a, b, c, d) == 1){
                                continue;
                        }
                            if(p.queen(arr, col, a, b, c, d) == 1) {
                                continue;
                        }

                    }
                } else {
                    System.out.println(color + "기물을 고르세요");
                    continue;
                }
                exit_1 = 1;
            }
            break;
        }
    }
}