public class App {
    public static void main(String[] args) {
        Deer deer1 = new Deer( 4) {
            @Override
            void walk() {
                System.out.println(" cool deer is walking");
            }
        };

        Deer deer2 = new Deer( 5);

        deer1.walk();
        deer2.walk();




    }
}
