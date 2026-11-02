package animals;

public class Dog extends Mammal {
    private String breed;

    public Dog() { super(); this.breed = "mixed"; }
    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor); this.breed = breed;
    }
    public Dog(String name, String breed) {
        super(name, "unknown"); this.breed = breed;
    }

    @Override public void eat() { System.out.println(getName() + " the dog eats meat and kibble."); }
    @Override public String getVoice() { return "Woof! Woof!"; }
    public void fetch() { System.out.println(getName() + " fetches the ball."); }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() { return "Dog{" + super.toString() + ", breed=" + breed + "}"; }
}
