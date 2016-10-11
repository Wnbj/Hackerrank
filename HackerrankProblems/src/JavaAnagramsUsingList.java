import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaAnagramsUsingList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstWord = scan.nextLine().toLowerCase();
        String secondWord = scan.nextLine().toLowerCase();

        List<Character> chars = new ArrayList<>();

        if (firstWord.length() == secondWord.length()) {
            for (int i = 0; i < firstWord.length(); i++) {
                chars.add(firstWord.charAt(i));
            }
            Collections.sort(chars);
            firstWord = chars.toString();
            chars.clear();

            for (int i = 0; i < secondWord.length(); i++) {
                chars.add(secondWord.charAt(i));
            }
            Collections.sort(chars);
            secondWord = chars.toString();

            if (firstWord.equals(secondWord)){
                System.out.println("Anagrams");
            }
            else {
                System.out.println("Not Anagrams");
            }

        }
        else{
            System.out.println("Not Anagrams");
        }

    }
}
