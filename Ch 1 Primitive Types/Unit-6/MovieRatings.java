import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);

    System.out.print("Raring rounded: ");
    double myDouble = input.nextDouble();

    int rounded1 = (int) (myDouble + 0.5);
    System.out.println(rounded1);

    input.close();
       
    }
}