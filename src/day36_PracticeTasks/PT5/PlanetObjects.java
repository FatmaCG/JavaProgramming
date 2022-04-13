package day36_PracticeTasks.PT5;

public class PlanetObjects {
    public static void main(String[] args) {
        Earth earth=new Earth();
        earth.setInfo("Earth","land",2345.6,"gravity true","land and water",56.3,100032);

        Moon moon=new Moon();
        moon.setInfo("Moon","Moon",0.073,"1737.5","1.6",9_479_365,61_000);

        System.out.println(earth);

        System.out.println();

        System.out.println(moon);


    }
}
