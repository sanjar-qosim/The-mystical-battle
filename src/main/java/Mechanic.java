import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mechanic {

    public List<GeneralAttributes> allHeroes = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    String askedHero;

    public void askAction(){
        System.out.println("Select an action:\n1. Create hero;\n2. Choose hero\n3. Show all heroes;\n4. Exit.");
        while (true) {
            int askAction = scanner.nextInt();
            if (askAction == 4) {
                break;
            }
            if (askAction == 1) {
                askHero();
                break;
            }
            System.out.println("You entered wrong action!");
        }
    }

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
                System.out.println("You entered wrong type! Please, enter right type or exit program!");
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
            Mage hero = new Mage().builder()
                    .name(name)
                    .health(health)
                    .damage(damage)
                    .build();
            allHeroes.add(hero);
            return hero;
        }

        if (askedHero.equals("Shaman")) {
            System.out.println("Enter a name of your hero:");
            String name = scanner.nextLine();
            System.out.println("Enter a health of your hero:");
            double health = scanner.nextDouble();
            Shaman hero = new Shaman().builder()
                    .name(name)
                    .health(health)
                    .build();
            allHeroes.add(hero);
            return hero;
        }

        if (askedHero.equals("Paladin")) {
            System.out.println("Enter a name of your hero:");
            String name = scanner.nextLine();
            System.out.println("Enter a health of your hero:");
            double health = scanner.nextDouble();
            System.out.println("Enter a damage of your hero:");
            double damage = scanner.nextDouble();
            Paladin hero = new Paladin().builder()
                    .name(name)
                    .health(health)
                    .damage(damage)
                    .build();
            allHeroes.add(hero);
            return hero;
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

    public void showAllHeroes(){
        if (allHeroes.isEmpty()) {
            System.out.println("There aren't created heroes!");
        }

        int amount = 0;
        for (GeneralAttributes tmp : allHeroes) {
            amount++;
            System.out.println("{Name: " + tmp.name + "; Health: " + tmp.health + "; Damage: " + tmp.damage + "}");
        }
        System.out.println("Total: " + amount);
    }

    public double attack(GeneralAttributes target, double damage){
        if (damage < 0) {
            return 0;
        }
        if (target.health < damage) {
            System.out.println("The " + target.name + " is killed");
            target = null;
            return 0;
        }
        target.health -= damage;
        return  target.health;
    }

    public double heal(GeneralAttributes target, double damage){
        target.health += damage;
        return target.health;
    }
}
