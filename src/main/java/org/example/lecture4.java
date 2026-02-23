package org.example;

// encapsulation of data
class safe{
    private int age  ;
    private String name ;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
public class lecture4 {
    public static void main(String[] args) {
        safe obj = new safe();
        obj.setAge(21);
        obj.setName("yash raj singh yadav");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
