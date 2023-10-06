import java.util.Scanner;
public class LabRunner {
    public static void main(String[] args) {

        int pointTotal = 0;
        int wordTotal = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scan.nextLine();
        System.out.println("Enter next word: ");
        String word2 = scan.nextLine();

        if ((word1.compareTo(word2)) > 0) {
            pointTotal += 2;
            System.out.println("+2 points: current word alphabetically after; SCORE: " + pointTotal);
        } else {
            pointTotal -= 5;
            System.out.println("-5 points: current word alphabetically before; SCORE: " + pointTotal);
        }

        if ((word1.equals(word2))) {
            pointTotal -= 10;
            System.out.println("-10 points: current word is the same as before; SCORE: " + pointTotal);
        } else {
            System.out.print("");
        }

        String word1First2Letters = word1.substring(0,3);
        String word2Last2Letters = word2length
        if ()
    }
}