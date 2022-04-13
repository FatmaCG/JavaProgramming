package day38_PracticeTasks.PT1_Browser;

public class ChromeBrowser extends Browser{

    public ChromeBrowser() {
        super("Chrome");
    }

    public void openBrowser(){
        System.out.println("Opening "+super.getBrowserName()+" browser");
    }
    public void closeBrowser(){
        System.out.println("Closing "+super.getBrowserName()+" browser");
    }


}
