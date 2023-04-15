package ex;

public class Ex01 {
    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }

    public static void sum(int left, int right) {
        System.out.println(left +right);
    }

    public static void main(String[] args) {
        int left = 10;
        int right = 20;

        sum(left, right);
        avg(left, right);

        left = 20;
        right = 40;

        sum(left, right);
        avg(left, right);
    }
}