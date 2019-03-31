import javax.swing.plaf.basic.BasicEditorPaneUI;

public class BaseAnimal {

    private String name;
    private int legs;

    public BaseAnimal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }


    void walk(){
        System.out.println("Animal is now walking...........");
    }

    void eat(){
        System.out.println("Animal is now eating............");
    }
}
