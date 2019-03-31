public abstract class Phone {

//    anything with keyword 'abstract' means that it is incomplete

//    these are Constants we will use to check with getType method
    public static final String TYPE_ANDROID = "Android";
    public static final String TYPE_IPHONE = "Iphone";


//this is an abstract method that is not yet implemented but we can use STILL USE IT INSIDE THIS ABSTRACT CLASS
    abstract String getType();

    void turnon(){
        System.out.println("Turning on");
    }



//    TODO we can use the getType() method even though it is not implemented
//    this is the main use case of abstract classes and methods

    void doSomething(){
        if(getType().equals(TYPE_ANDROID)){
            System.out.println("Android is better than Iphone");
        }else if(getType().equals(TYPE_IPHONE)){
            System.out.println("Iphone is much better than Android");
        }else {
            System.out.println("I don't know who i am");
        }
    }

}
