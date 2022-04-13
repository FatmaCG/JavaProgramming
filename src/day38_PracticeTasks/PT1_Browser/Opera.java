package day38_PracticeTasks.PT1_Browser;

public class Opera extends Browser{
    public Opera() {
        super("Opera");
    }
    public void openBrowser(){
        System.out.println("Opening "+getBrowserName()+" browser");
    }
    public void closeBrowser(){
        System.out.println("Closing "+getBrowserName()+" browser");
    }
}
