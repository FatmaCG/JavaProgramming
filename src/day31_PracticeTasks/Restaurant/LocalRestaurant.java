package day31_PracticeTasks.Restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {
        Server[] servers={
                new Server("Fatma",39,15,false),
                new Server("Ali",23,10,false),
                new Server("Meryem",45,12,false),
                new Server("Meltem",65,20,true),
                new Server("Berra",25,23,true),

        };
        Chef[] chefs={
                new Chef("Halim",23,35,true),
                new Chef("Habib",22,26,false),
                new Chef("Bojan",21,27,true),
        };
        Restaurant restaurant1=new Restaurant("Fatma","Wigston",5);

        restaurant1.hireServer(servers);
        restaurant1.hireChef(chefs);

        System.out.println(restaurant1);
    }
}
