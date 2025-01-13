public abstract class GeneralAttributes {

    protected String name;
    protected double health;
    protected double damage;

    protected void showInfo(){
        System.out.println("{Name: " + name + "}, {Health: " + health + "}, {Damage: " + damage + "}");
    }

}