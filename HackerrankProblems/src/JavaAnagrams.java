import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;

import java.util.Scanner;

public class JavaAnagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstWord = scan.nextLine().toLowerCase();
        String secondWord = scan.nextLine().toLowerCase();

        Multiset<Character> chars = TreeMultiset.create();

        if (firstWord.length() == secondWord.length()) {
            for (int i = 0; i < firstWord.length(); i++) {
                chars.add(firstWord.charAt(i));
            }

            firstWord = chars.toString();
            chars.clear();

            for (int i = 0; i < secondWord.length(); i++) {
                chars.add(secondWord.charAt(i));
            }

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
