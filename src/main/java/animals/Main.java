package animals;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[6];
        zoo[0] = new Dog();                                         // default
        zoo[1] = new Dog("Rex", 5, 22.5, "brown", "Labrador");      // all params
        zoo[2] = new Pigeon("Gucio", "Columba livia");              // some params
        zoo[3] = new Pigeon("Ptyś", 2, 0.35, "white", "Rock dove"); // all params
        zoo[4] = new Blowfish();                                    // default
        zoo[5] = new Blowfish("Bubble", false);                     // some params

        for (Animal a : zoo) {
            System.out.println(a);
            a.eat();
            System.out.println("Voice: " + a.getVoice());
            System.out.println();
        }

        // class-specific methods via casting
        ((Dog) zoo[1]).fetch();
        ((Mammal) zoo[1]).nurseYoung();
        ((Pigeon) zoo[2]).deliverMessage();
        ((Bird) zoo[3]).fly();
        ((Blowfish) zoo[5]).inflate();
        ((Fish) zoo[4]).swim();

        zoo[0].setName("Burek");
        zoo[0].setAge(3);
        System.out.println("\nAfter setters: " + zoo[0]);
    }
}