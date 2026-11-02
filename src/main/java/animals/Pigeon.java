package animals;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() { super(); this.species = "Columba livia"; }
    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor); this.species = species;
    }
    public Pigeon(String name, String species) {
        super(name, "grey"); this.species = species;
    }

    @Override public void eat() { System.out.println(getName() + " the pigeon eats crumbs in the square."); }
    @Override public String getVoice() { return "Coo-coo"; }
    public void deliverMessage() { System.out.println(getName() + " delivers a message."); }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() { return "Pigeon{" + super.toString() + ", species=" + species + "}"; }
}
