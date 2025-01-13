public class Paladin extends GeneralAttributes implements NearbyHero{

    private Paladin(final String name, final double health, final double damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public void attack(GeneralAttributes target, double damage) {
        target.health -= damage;
    }

    @Override
    public void heal(GeneralAttributes target, double damage) {

    }

    public static class Builder {
        private String name;
        private double health;
        private double damage;

        public Builder name(String name){
            if (name.length() >= 3) {
                this.name = name;
                return this;
            }
            System.out.println("The name value must be more than three letters long");
            return null;
        }

        public Builder health(double health){
            if (health > 0) {
                this.health = health;
                return this;
            }
            System.out.println("The value of health must be greater than 0");
            return null;
        }

        public Builder damage(double damage){
            if (damage > 0) {
                this.damage = damage;
                return this;
            }
            System.out.println("The value of damage must be greater than 0");
            return null;
        }

        public boolean isValid(){
            return name != null && health > 0 && damage > 0;
        }

        public Paladin build(){
            if (isValid()) {
                return new Paladin(name, health, damage);
            }
            System.out.println("Invalid data has been entered");
            return null;
        }
    }
}
