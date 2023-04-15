package ex;

class Calculator01 {
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

    public class Ex02 {
        public void main(String[] args) {

            Calculator01 cl = new Calculator01();
            cl.setOprands(10, 20);
            cl.sum();
            cl.avg();

            Calculator01 c2 = new Calculator01();
            c2.setOprands(20, 40);
            c2.sum();
            c2.avg();
        }
    }


