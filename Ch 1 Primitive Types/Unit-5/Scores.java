import java.util.Scanner;

public class Scores
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String test1, test2, test3;
        double score1, score2, score3;

        System.out.print("Please enter the first test name: ");
        test1 = scanner.nextLine();
        System.out.print("Please enter the first test score: ");
        score1 = scanner.nextDouble();
        
        scanner.nextLine(); 
        
        System.out.print("Please enter the second test name: ");
        test2 = scanner.nextLine();
        System.out.print("Please enter the second test score: ");
        score2 = scanner.nextDouble();
        
        scanner.nextLine(); 
        
        System.out.print("Please enter the third test name: ");
        test3 = scanner.nextLine();
        System.out.print("Please enter the third test score: ");
        score3 = scanner.nextDouble();

        double average = (score1 + score2 + score3) / 3;

        System.out.println("Your average score is: " + average);

        scanner.close();
       
    }
}