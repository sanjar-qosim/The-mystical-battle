import java.util.Scanner;

public class Mechanic {

    Scanner scanner = new Scanner(System.in);

    String askedHero;

    public String askHero(){
        System.out.println("Which type hero do you want to create?\nMage;\nShaman;\nPaladin?");
        while (true) {
            String askHero = scanner.nextLine();
            if(askHero.equals("Mage") || askHero.equals("Shaman") || askHero.equals("Paladin")) {
                askedHero = askHero;
                return askedHero;
            } else if (askHero.equals("exit")) {
                break;
            } else {
                System.out.println("You enter wrong type! Please, enter right type or exit program!");
            }
        }
        return null;
    }

    public GeneralAttributes createHero(String askedHero){
        if (askedHero.equals("Mage")) {
            System.out.println("Enter a name of your hero:");
            String name = scanner.nextLine();
            System.out.println("Enter a health of your hero:");
            double health = scanner.nextDouble();
            System.out.println("Enter a damage of your hero:");
            double damage = scanner.nextDouble();
            return Mage.builder()
                    .name(name)
                    .health(health)
                    .damage(damage)
                    .build();
        }

        if (askedHero.equals("Shaman")) {
            System.out.println("Enter a name of your hero:");
            String name = scanner.nextLine();
            System.out.println("Enter a health of your hero:");
            double health = scanner.nextDouble();
            return Shaman.builder()
                    .name(name)
                    .health(health)
                    .build();
        }

        if (askedHero.equals("Paladin")) {
            System.out.println("Enter a name of your hero:");
            String name = scanner.nextLine();
            System.out.println("Enter a health of your hero:");
            double health = scanner.nextDouble();
            System.out.println("Enter a damage of your hero:");
            double damage = scanner.nextDouble();
            return Paladin.builder()
                    .name(name)
                    .health(health)
                    .damage(damage)
                    .build();
        }

        return null;
    }

    public void showInfo(GeneralAttributes hero){
        if (hero.getClass() == Mage.class) {
            ((Mage) hero).showInfo();
        }

        if (hero.getClass() == Shaman.class) {
            ((Shaman) hero).showInfo();
        }

        if (hero.getClass() == Paladin.class) {
            ((Paladin) hero).showInfo();
        }
    }

    public double hittingAnOpponent(GeneralAttributes victim, double damage){
        if (damage < 0) {
            return 0;
        }
        if (victim.health < damage) {
            System.out.println("The " + victim.name + " is killed");
            victim = null;
            return 0;
        }
        victim.health -= damage;
        return  victim.health;
    }

    public double healAnAlly(GeneralAttributes victim, double damage){
        victim.health += damage;
        return victim.health;
    }
}
