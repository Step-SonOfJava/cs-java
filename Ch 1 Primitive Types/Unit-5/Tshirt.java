import java.util.Scanner;
//Refer to your code from the previous Personalized T-shirts exercise. 
// Modify it using the Scanner class to take user input instead of hard coding 
//       the cost of the shirt. 

public class Tshirt
{
    public static void main(String[] args)
    {
        int cost;
    try(Scanner shirt = new Scanner(System.in)) {
        System.out.println("Please enter the cost of the t-shirt: ");
            cost = shirt.nextInt();
    }
    System.out.print("The t-shirt costs $");
    System.out.println(cost);
    cost++;
    
    System.out.print("A personalized t-shirt costs $");
    System.out.println(cost);
    cost--;
    
    System.out.print("Without personalization, the t-shirt costs $");
    System.out.println(cost);
    }
}