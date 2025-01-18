public class Front {
    public static void main(String[] args) {

        Mechanic mechanic = new Mechanic();

        String ask = mechanic.askHero();
        GeneralAttributes hero1 = mechanic.createHero(ask);

        String ask1 = mechanic.askHero();
        GeneralAttributes hero2 = mechanic.createHero(ask1);

        mechanic.showInfo(hero1);
        mechanic.showInfo(hero2);
    }
}
