package day36_PracticeTasks.PT2_1;

public class Person {
    private String name;
    private int age;
    private char gender;

    public void setInfo(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(0);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>150){
            System.err.println("Invalid age: "+age);
            System.exit(0);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
      /*  if (gender=='M' || gender=='F'){
            System.err.println("Invalid gender");
            System.exit(0);
        }*/
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
