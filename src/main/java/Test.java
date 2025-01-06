public class Test {

    public static void main(String[] args) {
        Hero hero1 = new Hero.Builder()
                .name("Mag")
                .damage(200)
                .health(178)
                .build();

        hero1.showInfo();

        Hero hero2 = Hero.builder()
                .name("Tiny")
                .damage(150)
                .health(290)
                .build();

        hero2.showInfo();
    }
}
