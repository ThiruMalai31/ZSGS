import java.util.Scanner;

public class AverageWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalWeight = 0;
        int numberOfPersons = input.nextInt();

        for (int i = 0; i < numberOfPersons; i++) {
            totalWeight += input.nextInt();
        }

        System.out.println("Average Weight of " + numberOfPersons + " peoples  : " + totalWeight / numberOfPersons + " kg.");
    }
}
