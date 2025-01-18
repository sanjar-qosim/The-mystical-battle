public class Shaman extends GeneralAttributes implements Healer{

    private final double damage = 0;

    private Shaman(final String name, final double health){
        this.name = name;
        this.health = health;
    }

    public static Builder builder(){
        return new Builder();
    }
    @Override
    public double heal(GeneralAttributes target, double damage) {
        if (damage > 0) {
            target.health += damage;
            return target.health;
        }
        System.out.println("Not valid number");
        return target.health;
    }

    public void showInfo(){
        System.out.println("{Name: " + name + "; Health: " + health + "}");
    }

    public static class Builder {
        private String name;
        private double health;

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

        public boolean isValid(){
            return name != null && health > 0;
        }

        public Shaman build(){
            if (isValid()) {
                return new Shaman(name, health);
            }
            System.out.println("Invalid data has been entered");
            return null;
        }
    }
}
