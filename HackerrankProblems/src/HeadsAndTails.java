import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HeadsAndTails {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int bestH = 0;
        int bestT = 0;
        int curentH = 0;
        int curentT = 0;

        Pattern patt = Pattern.compile("\\w");
        Matcher match = patt.matcher(input);

        while (match.find()){
            if (match.group().equals("H")){
                curentT = 0;
                curentH++;
                if (curentH > bestH){
                    bestH = curentH;
                }
            }
            else{
                curentH = 0;
                curentT++;
                if (curentT > bestT){
                    bestT =curentT;
                }
            }
        }

        if (bestH > bestT){
            System.out.println("H wins!");
        }
        else if (bestH < bestT){
            System.out.println("T wins!");
        }
        else {
            System.out.println("Draw!");
        }
    }
}
