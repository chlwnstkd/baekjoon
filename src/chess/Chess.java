package chess;

public class Chess {
    public static void main(String[] args) {
        Rule r = new Rule();
        play pl = new play();
        String W = "W_";
        String B = "B_";
        String w = "백";
        String b = "흑";
        int b_count = 0;
        int w_count = 0;
        String[][] pan = new String[10][10];
        r.startpan(pan);
        r.printpan(pan);
        for (int i = 0; ; i++) {                                     //전개
            if (i % 2 == 0) {
                pl.moving(w, W,pan,i);
            } else {
                pl.moving(b, B, pan, i);
            }
            r.printpan(pan);
            for(int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (pan[j][k].equals("B_King")) {
                        b_count+=1;
                    } else if (pan[j][k].equals("W_King")) {
                        w_count+=1;
                    }
                }
            }
            if (b_count == 0) {
                System.out.println("백의 승리입니다.");
                break;
            }
            if (w_count == 0) {
                System.out.println("흑의 승리입니다.");
                break;
            }
            b_count = 0;
            w_count = 0;
        }
    }
}
