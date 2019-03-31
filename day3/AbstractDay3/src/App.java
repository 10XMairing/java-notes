public class App {
    public static void main(String[] args) {
        Android a = new Android();
        Iphone p = new Iphone();


        a.talkToGoogleAssistant();
        a.getType();
        p.talkToSiri("What is the capital of India?");
        p.getType();
//see the power of abstract class
//        everything we do with abstract class can also be done with interfaces
        p.doSomething();
        a.doSomething();
    }
}
