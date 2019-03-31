public class App {
    public static void main(String[] args) {
        Phone p = new Phone();

//        initialize a Callback for button clicks
        p.addOnClickListener(new ClickListener() {
            @Override
            public void onClickButtonA() {
                p.restart();
            }

            @Override
            public void onClickButtonB() {
            p.reset();
            }
        });


//        in a real scenario this fucntion will be attatched to sensors
        p.clickA();
        p.clickB();


    }
}
