import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaStringCompare {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        int substr = scan.nextInt();

        SortedSet<String> sets = new TreeSet<>();

        for (int i = 0; i < inputStr.length() - (substr - 1); i++) {
            sets.add(inputStr.substring(i, i + substr));
        }

        System.out.println(sets.first());
        System.out.println(sets.last());
    }
}
