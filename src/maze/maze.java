package maze;

import java.util.Scanner;

public class maze {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        wall w = new wall();
        play p = new play();
        player pl = new player();
        int n = s.nextInt();
        int tn = 2*(n+2);
        String[][] maze = new String[tn-1][2*tn+1];
        p.start_1(maze);
        w.shape(maze, tn);
        w.center(maze, tn);
        w.random(maze,tn);
        p.start_2(maze);
        p.end_1(maze,tn);
        for (int i = 0; i < tn-1; i++) {
            for (int j=0; j <2*tn+1; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
        p.end_2(maze,tn);
        pl.play(maze, tn);
    }
}
