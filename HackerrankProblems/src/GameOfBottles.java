import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameOfBottles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int bottles = scan.nextInt();
        scan.nextLine();
        List<String> coordinates = new ArrayList<>();
        int shortest = 0;
        int tempSteps = 0;
        int shortestWay = 0;

        for (int i = 0; i < bottles; i++) {
            coordinates.add(scan.nextLine());
        }

        Collections.sort(coordinates);

        for (int i = 0; i < coordinates.size() - 1; i++) {
            int[] xY = splitAndParse(coordinates.get(i));
            int x = xY[0];
            int y = xY[1];
            shortest = Integer.MAX_VALUE;

            for (int j = i + 1; j < coordinates.size(); j++) {

                int[] xY1 = splitAndParse(coordinates.get(j));
                int x1 = xY1[0];
                int y1 = xY1[1];

                tempSteps = Math.abs(x - x1) + Math.abs(y - y1);

                if (tempSteps < shortest) {
                    shortest = tempSteps;
                }

                if (j == coordinates.size() - 1) {
                    shortestWay += shortest;
                }
            }
        }
        System.out.println(shortestWay);
    }
    private static int[] splitAndParse(String coordinates){

        String[] xStr = coordinates.split("\\s+");
        int[] xY = new int[2];
        xY[0] = Integer.valueOf(xStr[0]);
        xY[1] = Integer.valueOf(xStr[1]);

        return xY;
    }
}
