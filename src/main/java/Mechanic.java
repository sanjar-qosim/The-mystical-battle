import java.util.Scanner;

public class Mechanic {

    Scanner scanner = new Scanner(System.in);

    public String askHero(){
        System.out.println("Which type hero do you want to create?\n-Mage;\nShaman;\nPalladin?");
        while (true) {
            String askedHero = scanner.nextLine();
            if (askedHero.equals("Mage") || askedHero.equals("Shaman") || askedHero.equals("Palaldin")) {
                return askedHero;
            } else if (askedHero.equals("exit")) {
                return null;
            } else {
                System.out.println("There is not a type what you entered!");
                return null;
            }

        }
    }
}
