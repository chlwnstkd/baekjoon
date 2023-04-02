class Calculator02 {
        static double PI = 3.14;
        int left, right;

    public void setOprands(int left, int right) {
            this.left = left;
            this.right = right;
        }

    public void sum() {
            System.out.println(this.left + this.right);
    }
    public void avg() {
            System.out.println((this.left + this.right) / 2);
    }
    }

public class Ex03 {
    public static void main(String[] args) {

        Calculator02 c1 = new Calculator02();
        System.out.println(c1.PI);

        Calculator02 c2 = new Calculator02();
        System.out.println(c2.PI);

        System.out.println(Calculator02.PI);
    }
}
