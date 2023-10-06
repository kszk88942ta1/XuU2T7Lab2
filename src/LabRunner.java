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

        if ((word1.compareTo(word2))>0) {
            pointTotal += 2;
            System.out.println("+2 points: current word alphabetically after; SCORE: " + pointTotal);
            }else {
            System.out.print("");
            }
        if ((word1))
        }
    }
