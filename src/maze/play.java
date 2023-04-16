package maze;

public class play {
    public void start_1 (String[][] maze) {
        System.out.println("START");
    }
    public void start_2 (String[][] maze) {
        maze[0][2] = " ";
    }
    public void end_1 (String[][] maze, int tn) {
        maze[tn-2][2 * tn-2] = " ";

    }
    public void end_2 (String[][] maze, int tn) {
        for (int i = 0; i < 2*tn-3; i++)
            System.out.print(" ");
        System.out.print("END");
    }
}
