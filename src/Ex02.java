public class Ex02 {
    class Calculator {
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

    public class CalculatorDemo4 {
        public void main(String[] args) {

            Calculator cl = new Calculator();
            cl.setOprands(10, 20);
            cl.sum();
            cl.avg();

            Calculator c2 = new Calculator();
            c2.setOprands(20, 40);
            c2.sum();
            c2.avg();
        }
    }
}

