import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder(input);

        if (input.equals(sb.reverse().toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
