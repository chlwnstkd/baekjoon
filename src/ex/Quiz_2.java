package ex;
import java.util.Scanner;
public class Quiz_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr. length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.printf("저장된 값은 %d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1])
            System.out.printf(",%d",arr[i]);
        }
        System.out.print("입니다");
    }
}