import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Lakes {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int litters = 0;
        List<String> lakes = Arrays.asList(splitLakes(input).split("\\s+"));

        for (int i = 0; i < lakes.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(lakes.get(i));

            while (sb.toString().contains("d")) {
                if (sb.charAt(0) == 'h'){
                    sb.deleteCharAt(0);
                    continue;
                }
                if (sb.charAt(sb.length() - 1) == 'h'){
                    sb.deleteCharAt(sb.length() - 1);
                    continue;
                }

                litters += (sb.length() * 1000) - 1000;
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length() - 1);

            }
        }

        System.out.println(litters);

    }

    private static String splitLakes(String lake) {

        int depht = 0;
        int temp = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = temp; i < lake.length(); i++) {
            if (lake.charAt(i) == 'd') {
                depht++;
            } else if (lake.charAt(i) == 'u') {
                depht--;
            }
            if (depht >= 0 ) {
                sb.append(lake.charAt(i));
                if (i != 0 && sb.charAt(i - 1) == ' '){
                    sb.deleteCharAt(i);
                }
            } else {
                temp = i;
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
