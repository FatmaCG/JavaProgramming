package day38_PracticeTasks.PT1_Browser;

public class BrowserTest {
    public static void main(String[] args) {
        ChromeBrowser chromeBrowser=new ChromeBrowser();
        System.out.println(chromeBrowser);
        chromeBrowser.openBrowser();
        chromeBrowser.closeBrowser();

        System.out.println();

        FireFox fireFox=new FireFox();
        fireFox.openBrowser();
        fireFox.closeBrowser();

        System.out.println();

        Opera opera=new Opera();
        opera.openBrowser();
        opera.closeBrowser();

        System.out.println();

        Safari safari=new Safari();
        safari.openBrowser();
        safari.closeBrowser();
    }
}
