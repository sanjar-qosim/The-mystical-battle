public class Shaman extends GeneralAttributes implements Healer{
    Shaman(final String name, final double health){
        this.name = name;
        this.health = health;
    }

    public static Builder builder(){
        return new Builder();
    }

    public void showInfo(){
        System.out.println("Name: " + name + "\nHealth: " + health);

    }

    @Override
    public void heal(GeneralAttributes target, double damage) {
        target.health += damage;
    }

    public static class Builder {
        private String name;
        private double health;
        private double damage;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder health(double health){
            this.health = health;
            return this;
        }

        public Shaman build(){
            return new Shaman(name, health);
        }
    }
}
