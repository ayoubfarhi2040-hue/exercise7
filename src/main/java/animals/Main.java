package animals;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[6];
        zoo[0] = new Dog();
        zoo[1] = new Dog("Rex", 5, 22.5, "brown", "Labrador");
        zoo[2] = new Pigeon("Gucio", "Columba livia");
        zoo[3] = new Pigeon("Ptyś", 2, 0.35, "white", "Rock dove");
        zoo[4] = new Blowfish();
        zoo[5] = new Blowfish("Bubble", false);

        for (Animal a : zoo) {
            System.out.println(a);
            a.eat();
            System.out.println("Voice: " + a.getVoice());
            System.out.println();
        }

        ((Dog) zoo[1]).fetch();
        ((Mammal) zoo[1]).nurseYoung();
        ((Pigeon) zoo[2]).deliverMessage();
        ((Bird) zoo[3]).fly();
        ((Blowfish) zoo[5]).inflate();
        ((Fish) zoo[4]).swim();

        zoo[0].setName("Burek");
        zoo[0].setAge(3);
        System.out.println("\nAfter setters: " + zoo[0]);

        System.out.println("\n--- AnimalBehavior (sleep) ---");
        AnimalBehavior[] behaviorsFarhi77491 = {
                new Dog("Rex", "Labrador"),
                new Pigeon("Gucio", "Columba livia"),
                new Blowfish("Bubble", false)
        };
        behaviorsFarhi77491[0].sleepFarhi77491();
        behaviorsFarhi77491[1].sleepFarhi77491();
        behaviorsFarhi77491[2].sleepFarhi77491();

        System.out.println("\n--- AnimalMove (move) + AnimalName (static) ---");
        for (Animal a : zoo) {
            a.moveFarhi77491();
            AnimalName.nameFarhi77491(a.getName());
        }
    }
}