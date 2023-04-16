package maze;

public class wall {
    public void shape(String[][] maze, int tn) {
        for (int i = 0; i < tn - 1; i++) {
            for (int j = 0; j < 2 * tn + 1; j++) {
                maze[i][j] = " ";
            }
        }
        for (int i = 0; i < tn - 1; i++) {
            maze[i][0] = "#";
            maze[i][2 * tn] = "#";
        }
        for (int i = 0; i < 2 * tn + 1; i++) {
            if (i % 2 == 1) {
                maze[0][i] = " ";
                maze[tn - 2][i] = " ";
            } else {
                maze[0][i] = "#";
                maze[tn - 2][i] = "#";
            }
        }
    }

    public void center(String[][] maze, int tn) {
        for (int i = 2; i < tn - 2; i += 2) {
            for (int j = 1; j < 2 * tn; j++) {
                if (j % 4 == 0) {
                    maze[i][j] = "*";
                }
            }
        }
    }

    public void random(String[][] maze, int tn) {
        for (int i = 1; i < tn - 2; i++) {
            for (int j = 1; j < 2 * tn; j++) {
                if (maze[i][j].contains("*")) {
                    int a = (int) (Math.random() * 4);
                    switch (a) {
                        case 0:

                            if (maze[i - 1][j].equals("#")) {
                                j--;
                                continue;
                            } else {
                                maze[i - 1][j] = "#";
                            }
                            maze[i][j] = "#";
                            continue;
                        case 1:
                            if (maze[i + 1][j].equals("#")) {
                                j--;
                                continue;
                            } else {
                                maze[i + 1][j] = "#";
                            }
                            maze[i][j] = "#";
                            continue;
                        case 2:
                            if (maze[i][j - 2].equals("#")) {
                                j--;
                                continue;
                            } else {
                                maze[i][j - 2] = "#";
                            }
                            maze[i][j] = "#";
                            continue;
                        default:
                            if (maze[i][j + 2].equals("#")) {
                                j--;
                                continue;
                            } else {
                                maze[i][j + 2] = "#";
                            }
                            maze[i][j] = "#";
                    }
                }
            }
        }
    }
}
