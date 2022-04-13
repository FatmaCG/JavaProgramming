package week02;

import java.util.ArrayList;

public class ArrayListExamplesWithMethods {
    public static void main(String[] args) {
        //add(Object)
        //create an arraylist that holds String objects
        ArrayList<String> cities=new ArrayList<>();
        cities.add("London");
        cities.add("Denver");
        cities.add("Paris");
        System.out.println(cities);

        //add(index,Object)--->adds the element to the given index(index must exist)
        //cities.add(4,"Istanbul");//checking the size and our index bigger than size
        cities.add(1,"Istanbul");
        //What is the difference between size and capacity
        System.out.println(cities);

        //Why in arraylist we have to define index at the methods?
        //index based collection ,keeps track of the order

        //get(index)---->return the element at given index
        System.out.println("cities.get(0) = " + cities.get(0));
        String mycities=cities.get(1);

        //set(index,Object) ---> replaces the old element at the given index
        cities.set(0,"New York");

        //indexOf(Object) ---->returns us the first matching index with the given element
        //if the element does not exist it returns -1
        int indexOfParis=cities.indexOf("Paris");
        System.out.println("indexOfParis = " + indexOfParis);

        int lastIndexOfParis=cities.lastIndexOf("Paris");
        System.out.println("lastIndexOfParis = " + lastIndexOfParis);

        //size() :returns the total number of element
        System.out.println("cities = " + cities.size());

        //index of last element is cities.size()-1

        //contains(): returns boolean
        System.out.println(cities.contains("Istanbul"));

        //remove(index) ---> the element will be deleted at the given index
        System.out.println(cities.remove(0)); //return the element which is removed
        System.out.println(cities);

        //remove(Object) ----> removes the matching object
        System.out.println("cities removed = "+cities.remove("Istanbul"));
        System.out.println("cities = " + cities);
        System.out.println("cities removed = " + cities.remove("Istanbul"));

        //Bulk Operations



    }
}
