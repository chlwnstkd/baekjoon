package ex;
import java.util.Scanner;
public class Quiz_3 {
    public static void main(String[] args) {
        int n = 5;
        Scanner s = new Scanner(System.in);
        int min;
        int [] array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j =i; j < array.length; j++) {
                if (array[j] < min) {
                    int temp = array[j];
                    array[j] = min;
                    min = temp;

                }
            }
            array[i] = min;

        }
        System.out.printf("저장된 값은 %d",array[0]);
        for (int i = 1; i < array.length; i++) {
            if ( array[i] == array[i-1])
                continue;
            System.out.printf(",%d",array[i]);
        }
        System.out.print("입니다");
    }
}
