import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an adjective(description): ");
        String adjective1 = scanner.nextLine();

        System.out.println("Enter a noun(animal or person): ");
        String noun1 = scanner.nextLine();
        
        System.out.println("Enter another adjective(description): ");
        String adjective2 = scanner.nextLine();
        
        System.out.println("Enter a verb(action word): ");
        String verb1 = scanner.nextLine();
        
        System.out.println("Enter one last adjective(description): ");
        String adjective3 = scanner.nextLine();

        System.out.print("\nToday I went to a "+ adjective1 +" zoo.");
        System.out.print(" In an exhibit, I saw a "+noun1+".");
        System.out.print(" The " + noun1 +" was "+adjective2+" and "+verb1+".");
        System.out.print(" I was "+adjective3+" to see a "+noun1+" at the zoo!");


        scanner.close();


    }
}
