import java.util.Scanner;

public class Inheritance {
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int... testScore) {
        super(firstName, lastName, identification);
        this.testScores = testScore;
    }
    public char calculate(){
        int score = 0;

        for (int i = 0; i < testScores.length; i++) {
            score += testScores[i];
        }
        double finalScore = score / testScores.length;

        if (finalScore <= 100 && finalScore >= 90){
            return 'O';
        }
        else if (finalScore < 90 && finalScore >= 80){
            return 'E';
        }
        else if (finalScore < 80 && finalScore >= 70 ) {
            return 'A';
        }
        else if (finalScore < 70 && finalScore >= 55){
            return 'P';
        }
        else if (finalScore < 55 && finalScore >= 40){
            return 'D';
        }
        return 'T';
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}