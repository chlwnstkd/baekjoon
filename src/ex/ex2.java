package ex;

public class ex2 {
    public static void main(String[] args) {
        char character = 'c';
        boolean expression_1 = (character == 'c') && (3 < 10);
        System.out.println(expression_1);
        boolean expression_2 = (character == 'c') && (3 < -1);
        System.out.println(expression_2);
    }
}
