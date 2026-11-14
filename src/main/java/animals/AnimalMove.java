package animals;

public interface AnimalMove {
    default void moveFarhi77491() {
        System.out.println(getClass().getSimpleName() + " moves in some general way.");
    }
}