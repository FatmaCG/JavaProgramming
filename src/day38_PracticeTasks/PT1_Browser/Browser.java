package day38_PracticeTasks.PT1_Browser;

public class Browser {
    private String browserName;
    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        if(browserName==null){
            System.err.println("Browser name  can not be null");
            System.exit(1); // 1:something went wrong
        }
        if (browserName.isEmpty() || browserName.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.browserName = browserName;
    }

    public Browser(String browserName) {
        setBrowserName(browserName);
    }

    public void openBrowser(){
        System.out.println("opening chrome browser");
    }
    public void closeBrowser(){
        System.out.println("close chrome browser");
    }

    public String toString() {
        return "Browser{" +
                "BrowserName='" + browserName + '\'' +
                '}';
    }
}
