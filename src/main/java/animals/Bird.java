package animals;

public class Bird extends Animal {
    private String featherColor;

    public Bird() { super(); this.featherColor = "unknown"; }
    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight); this.featherColor = featherColor;
    }
    public Bird(String name, String featherColor) {
        super(name); this.featherColor = featherColor;
    }

    @Override public void eat() { System.out.println(getName() + " (bird) pecks at seeds."); }
    @Override public String getVoice() { return "Tweet"; }
    public void fly() { System.out.println(getName() + " flies away."); }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() { return "Bird{" + super.toString() + ", featherColor=" + featherColor + "}"; }
}
