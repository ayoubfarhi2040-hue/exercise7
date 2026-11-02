package animals;

public class Blowfish extends Fish {
    private boolean poisonous;

    public Blowfish() { super(); this.poisonous = true; }
    public Blowfish(String name, int age, double weight, String waterType, boolean poisonous) {
        super(name, age, weight, waterType); this.poisonous = poisonous;
    }
    public Blowfish(String name, boolean poisonous) {
        super(name, "salt"); this.poisonous = poisonous;
    }

    @Override public void eat() { System.out.println(getName() + " the blowfish crunches on shellfish."); }
    @Override public String getVoice() { return "Blub (a quiet grunt)"; }
    public void inflate() { System.out.println(getName() + " inflates into a ball!"); }

    public boolean isPoisonous() { return poisonous; }
    public void setPoisonous(boolean poisonous) { this.poisonous = poisonous; }

    @Override
    public String toString() { return "Blowfish{" + super.toString() + ", poisonous=" + poisonous + "}"; }
}
