import java.util.Scanner;

public class HourglassArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i <arr[0].length - 2; i++) {
            for (int j = 0; j < arr[1].length - 2; j++) {

                int bestSum = 0;

                bestSum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2])+
                        (arr[i + 1][j + 1])+
                        (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);

                if (bestSum > sum){
                    sum = bestSum;
                }
            }
        }
        System.out.println(sum);

    }
}
