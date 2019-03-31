public class Iphone extends Phone {

//    if we inherit an abstract class we have to implement its abstract methods just like an interface
    @Override
    String getType() {
        return Phone.TYPE_IPHONE;
    }


    void talkToSiri(String message){
        System.out.println("user : "+message);
        System.out.println("siri : How can i help you?");
    }
}
