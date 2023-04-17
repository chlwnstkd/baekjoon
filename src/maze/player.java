package maze;
import java.util.Scanner;
public class player {
    play p = new play();
    rule r = new rule();
    Scanner s = new Scanner(System.in);
    public void play(String[][] maze, int tn) {
        maze[0][1] = "*";
        maze[0][2] = "*";
        maze[0][3] = "*";
        int exit = 0;
        int a = 0, b = 3;

        while (exit == 0) {

            System.out.println(a + "" + b);
            System.out.println();
            p.start_1(maze);
            for (int i = 0; i < tn-1; i++) {
                for (int j=0; j <2*tn+1; j++) {
                    System.out.print(maze[i][j]);
                }
                System.out.println();
            }
            p.end_2(maze,tn);
            System.out.println();
            System.out.println("wasd로 움직입니다");
            String control = s.nextLine();
            switch (control) {
                case "w":
                    if(r.error(maze, a-1, b-1, tn) == 1) {
                        break;
                    }
                    maze[a][b - 2] = " ";
                    maze[a][b - 1] = " ";
                    maze[a][b] = " ";
                    maze[a - 1][b - 2] = "*";
                    maze[a - 1][b - 1] = "*";
                    maze[a - 1][b] = "*";
                    a += -1;
                    break;
                case "a":
                    if(r.error(maze, a, b-3, tn) == 1) {
                        break;
                    }
                    maze[a][b - 2] = " ";
                    maze[a][b - 1] = " ";
                    maze[a][b] = " ";
                    maze[a][b - 4] = "*";
                    maze[a][b - 3] = "*";
                    maze[a][b - 2] = "*";
                    b += -2;
                    break;
                case "s":
                    if(r.error(maze, a+1, b-1, tn) == 1) {
                        break;
                    }
                    maze[a][b - 2] = " ";
                    maze[a][b - 1] = " ";
                    maze[a][b] = " ";
                    maze[a + 1][b - 2] = "*";
                    maze[a + 1][b - 1] = "*";
                    maze[a + 1][b] = "*";
                    a += 1;
                    break;
                case "d":
                    if(r.error(maze, a, b+1, tn) == 1) {
                        break;
                    }
                    maze[a][b - 2] = " ";
                    maze[a][b - 1] = " ";
                    maze[a][b] = " ";
                    maze[a][b] = "*";
                    maze[a][b + 1] = "*";
                    maze[a][b + 2] = "*";
                    b += 2;
                    break;
                default:
                    System.out.println("다시 입력해주세요");
            }
            if (maze[tn - 2][2 * tn - 2].equals("*")) {
                System.out.println("성공하셨습니다");
                exit++;
            }
        }
    }
}
