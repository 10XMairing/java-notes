public class Deer extends BaseAnimal {

    private int horns;


    public Deer(int legs) {
        super("Deer", legs);

    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Deer says i can hop too.....");
    }

    @Override
    void eat() {
        System.out.println("Deer is now eating.....");
    }
}
