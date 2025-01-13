public class Test {

    public static void main(String[] args) {
        Mage mag1 = Mage.builder()
                .name("Crystal Mayden")
                .health(85)
                .damage(25)
                .build();
        mag1.showInfo();

        System.out.println();

        Shaman shaman1 = Shaman.builder()
                .name("Rhasta")
                .health(50)
                .build();
        shaman1.showInfo();

        System.out.println();

        Paladin paladin1 = Paladin.builder()
                .name("Paladin")
                .damage(25)
                .health(10)
                .build();
        paladin1.showInfo();
    }
}
