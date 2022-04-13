package day38_PracticeTasks.PT1_Browser;

public class FireFox extends Browser{

    public FireFox() {
        super("FireFox");
    }
    public void openBrowser(){
        System.out.println("Opening "+getBrowserName()+" browser");
    }
    public void closeBrowser(){
        System.out.println("Closing "+getBrowserName()+" browser");
    }
}
