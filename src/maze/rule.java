package maze;

public class rule {
    public int error(String[][] maze, int a, int b, int tn) {
        int x = 1;
        int y = 0;
        if (maze[a][b].contains("#")) {
            System.out.println("막혀있습니다");
            return x;
        }
        if (maze[a][b-1].contains("#")) {
            System.out.println("막혀있습니다");
            return x;
        }
        if (maze[a][b+1].contains("#")) {
            System.out.println("막혀있습니다");
            return x;
        }
        if (a == 0 || a == tn-1){
            System.out.println("갈 수 없습니다");
            return x;
        }
        else {
            return y;
        }
    }
}
