public class Test {

    public static void main(String[] args) {
        Mage mag1 = Mage.builder()
                .name("Crystal Mayden")
                .health(85.5)
                .damage(25)
                .build();
        mag1.showInfo();

        Shaman shaman1 = Shaman.builder()
                .name("Shaman")
                .health(60)
                .build();
        shaman1.showInfo();

        Paladin paladin1 = Paladin.builder()
                .name("Tiny")
                .health(117)
                .damage(12)
                .build();
        paladin1.showInfo();

        System.out.println();
        mag1.attack(paladin1, 17);
        System.out.println(paladin1.health);
    }
}
