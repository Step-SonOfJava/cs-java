import java.util.Scanner;

public class CastingToDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First Int:");
        int nextInt1 = input.nextInt(); 
        
        System.out.println("Second Int:");
        int nextInt2 = input.nextInt(); 
        
        double nextDouble1 = (double) nextInt1; 
        double nextDouble2 = (double) nextInt2; 
        
        double intRes = nextDouble1 / nextDouble2;
        
        System.out.println(intRes);
        
        input.close();
    }
}