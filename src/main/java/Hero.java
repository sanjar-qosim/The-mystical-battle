public class Hero {

    private final String name;
    private final double health;
    private final double damage;

    private Hero(final String name, final double health, final double damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public static Builder builder(){
        return new Builder();
    }

    public void showInfo(){
        System.out.println("Name: " + name + "\nHealth: " + health + "\nDamage: " + damage);
    }

    public static class Builder {

        private String name;
        private double health;
        private double damage;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder health(double health) {
            this.health = health;
            return this;
        }

        public Builder damage(double damage) {
            this.damage = damage;
            return this;
        }

        public Hero build(){
            return new Hero(name, health, damage);
        }

    }
}