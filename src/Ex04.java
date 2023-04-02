class Calculator04{

    public static void sum(int left, int right) {
        System.out.println(left + right);
    }

    public static void avg(int left, int right) {
        System.out.println((left+right)/2);
    }
}

public class Ex04 {

    public static void main(String[] args) {
        Calculator04.sum(10,20);
        Calculator04.avg(10,20);

        Calculator04.sum(20,40);
        Calculator04.avg(20,40);

    }
}
