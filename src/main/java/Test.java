public class Test {

    public static void main(String[] args) {
        Mage mag1 = Mage.builder()
                .name("Crystal Mayden")
                .health(85)
                .damage(25)
                .build();
        mag1.showInfo();

        Shaman shaman1 = Shaman.builder()
                .name("Rhasta")
                .health(50)
                .build();
        shaman1.showInfo();

        Paladin paladin1 = Paladin.builder()
                .name("Paladin")
                .damage(25)
                .health(10)
                .build();
        paladin1.showInfo();

        System.out.println(mag1.attack(paladin1, 5));
        System.out.println(shaman1.heal(paladin1, 3));
    }
}
