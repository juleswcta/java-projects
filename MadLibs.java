import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();
        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        System.out.print("Here is your Mad Lib:");
        System.out.print(name + " went to " + place + " and saw a " + adjective + " " + number + ".");
    }

}
