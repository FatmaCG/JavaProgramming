package day30_CustomClass;

public class Dog {
    public String name;
    public int age;
    public char gender;
    public String breed;
    public String size;
    public String color;

    public void setInfo(String dogName,String dogBreed,int dogAge,char dogGender,String dogSize,String dogColor){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void bark(){
        System.out.println(name +" is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    /*public String toString(){
        return  "Name: "+name;
    }*/
}
/*
Attributes:
    name,age,gender,bread,size,color

Actions:
    eat(), play(), bark()....
 */