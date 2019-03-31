public class Android extends Phone {

//     if we inherit an abstract class we have to implement its abstract methods just like an interface
    @Override
    String getType() {
        return Phone.TYPE_ANDROID;
    }


    void talkToGoogleAssistant(){
        System.out.println("Google Assistant : Hello how can i help you?");
    }


}
