import java.util.Scanner;

public class NightOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much does dinner usually cost? ");
        double yourDinnerCost = scanner.nextDouble();
        
        System.out.println("How much is laser tag for one person? ");
        double laserTagCostPerPerson = scanner.nextDouble();
        
        System.out.println("How much does a triple scoop cost? ");
        double yourIceCreamCost = scanner.nextDouble();

        double friendsDinnerCost = 2 * yourDinnerCost;
        double friendsIceCreamCost = yourIceCreamCost / 3;
        double totalDinnerCost = yourDinnerCost + friendsDinnerCost;
        double totalLaserTagCost = 2 * laserTagCostPerPerson;
        double totalIceCreamCost = yourIceCreamCost + friendsIceCreamCost;
        double grandTotal = totalDinnerCost + totalLaserTagCost + totalIceCreamCost;

        System.out.println("Dinner: " + totalDinnerCost);
        System.out.println("Laser Tag: " + totalLaserTagCost);
        System.out.println("Ice cream: " + totalIceCreamCost);
        System.out.println("Grand Total: " + grandTotal);
        
        scanner.close();
    }
}