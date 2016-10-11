import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaStringTokens {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String regex = "[a-zA-Z]+";
        int counter = 0;
        Queue<String> tokens = new LinkedList<>();

        Pattern patt = Pattern.compile(regex);
        Matcher match = patt.matcher(input);

        while (match.find()){
            tokens.add(match.group());
            counter++;
        }

        System.out.println(counter);

        for (int i = 0; i < counter; i++) {
            System.out.println(tokens.poll());
        }



    }
}
