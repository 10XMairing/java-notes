public class Phone  {

//    store a ClickListener object
    ClickListener callback;


//    this is the fucntion for click listeners / basically a setter for the callback variable
    void addOnClickListener(ClickListener callback){
        this.callback = callback;
    }


    void reset(){
        System.out.println("Phone is now resetting");
    };

    void restart(){
        System.out.println("Phone is now restarting");
    }

    void turnOff(){
        System.out.println("Phone is now turning off");
    }




//    check for null and use the callback recieved from the addOnCLicklistener
    void clickA(){
        try {
            callback.onClickButtonA();
        }catch (NullPointerException e){
            System.out.println("Callback not implemented");
        }
    }

//      check for null and use the callback recieved from the addOnCLicklistener
    void clickB(){
        if(callback != null){
            callback.onClickButtonB();
        }else {
            System.out.println("Callback not implemented");
        }
    }




}
