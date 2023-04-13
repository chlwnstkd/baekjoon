import java.util.Scanner;
public class Quiz_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        int min, max;
        int hap = 0;

        for (int i = 0; i < arr.length; i++) {                //배열에 숫자를 입력받는다
            arr[i] = s.nextInt();
        }
        max = arr[0];                                         //0번째 값을 초깃값으로 둔다
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {                               //max보다 크면 그 값을 max로
                max = arr[i];
            }
            if (min > arr[i]) {                               //min보다 작으면 그 값을 min으로 한다
                min = arr[i];
            }
            hap += arr[i];                                    //배열에 있는 수를 차례로 더해준다
        }
        System.out.printf("최댓값 : %d \n", max);
        System.out.printf("최솟값 : %d \n", min);
        System.out.printf("평균값 : %f \n", hap / 5.0);        //나눠떨어지지 않을수 있으므로 소수로 나눠준다
    }
}
