import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringsAndNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        Map<Character, Integer> charsCount = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sbUncrypt = new StringBuilder();
        BigInteger result = BigInteger.ZERO;

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            Integer val = charsCount.get(new Character(c));
            if(val != null){
                charsCount.put(c, new Integer(val + 1));
            }else{
                charsCount.put(c,1);
            }
        }

        for (int i = 0; i < 10; i++) {
            int maxValueInMap = (Collections.max(charsCount.values()));
            for (Map.Entry<Character, Integer> entry : charsCount.entrySet()) {
                if (entry.getValue() == maxValueInMap) {
                    sb.append(entry.getKey());
                    charsCount.replace(entry.getKey(), 0);
                }
            }
        }

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (input.charAt(i) == sb.charAt(j)){
                    sbUncrypt.append(9 - j);
                    break;
                }
                if (j == 9){
                    sbUncrypt.append(" ");
                }
            }
        }

        String[] uncryptedArray = sbUncrypt.toString().split("\\s+");

        for (int i = 0; i < uncryptedArray.length; i++) {
            String temp = uncryptedArray[i];
            if (temp.equals("")){
                continue;
            }

            BigInteger bI = new BigInteger(temp);
            result = result.add(bI);

        }
        System.out.println(result);
    }
}
