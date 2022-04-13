package day38_PracticeTasks.PT1_Browser;

public class Safari extends Browser{
    public Safari() {
        super("Safari");
    }
    public void openBrowser(){
        System.out.println("Opening "+getBrowserName()+" browser");
    }
    public void closeBrowser(){
        System.out.println("Closing "+getBrowserName()+" browser");
    }
}
