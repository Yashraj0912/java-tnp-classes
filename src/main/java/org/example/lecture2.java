package org.example;

public class lecture2 {
    public static void main(String[] args) {
        String s= "hello"; // store pool
        String t = new String("hello");// store it in heap
        System.out.println(s==t);//checks via address
        System.out.println(s.equals(t));// checks via value
        ev n= new ev();
        diesel d = new diesel();
        petrol p = new petrol();
        //ev
        n.accelerates();
        n.brake();
        n.deaccelerates();
        // petrol

        d.accelerates();
        d.brake();
        d.deaccelerates();
        // diesel
        p.accelerates();
        p.brake();
        p.deaccelerates();

    }
}

// create c;ass car
abstract class car {
    abstract void accelerates();
    abstract void  deaccelerates();
    abstract void brake() ;
}

//clas ev

class ev extends car{
    @Override
    void accelerates() {
        System.out.println("speeding up ev");
    }

    @Override
    void brake() {
        System.out.println("car stop ev");
    }

    @Override
    void deaccelerates() {
        System.out.println("speeding down ev");
    }
}

// diesel

class diesel extends car{
    @Override
    void accelerates() {
        System.out.println("speeding up diesel");
    }

    @Override
    void brake() {
        System.out.println("car stop diesel");
    }

    @Override
    void deaccelerates() {
        System.out.println("speeding down diesel");
    }
}

// petrol


class petrol extends car{
    @Override
    void accelerates() {
        System.out.println("speeding up petrol");
    }

    @Override
    void brake() {
        System.out.println("car stop petrol");
    }

    @Override
    void deaccelerates() {
        System.out.println("speeding down petrol");
    }
}
//class part3{
//
//    part3(){
//        System.out.println("part3");
//    }
//}
//interface f{
//    public void me();
//    }
//
//
//abstract class part2 extends part3 implements f{
//    //on declaring static not have to create object in main class
//  public void me(){
//      System.out.println(';');
//  }
//  abstract public void hel();
//
//    part2(){
//        //this(2);
//
//    }
//    part2(int a ){
//        super();
//        System.out.println(a);
//
//    }
//}
