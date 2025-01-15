import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {
        Mage mag1 = Mage.builder()
                .name("Crystal Mayden")
                .health(85)
                .damage(25)
                .build();
        mag1.showInfo();

        Mechanic mechanic = new Mechanic();
        System.out.println(mechanic.askHero());
    }
}
