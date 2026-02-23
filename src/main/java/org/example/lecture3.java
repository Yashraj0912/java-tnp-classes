package org.example;
import java.lang.Math;

//lang package is very important for building the class as it contains all main components and it is imported bby it self


//polymorphism :- one name many form

//typess/
//1 complie time :;- overloading :; inheritance is not needed
//2 run time :- overriding :-  inheritance is needed

//find anagram in string


// create a class distance and overload convert method
// meter to centimeter
//km to meter
// centimerter to meter
class  distance  {
  public int  convert(int A ){
      //for meter tio centimeter
        return A*100;
    }

    public int convert(short A ){
        return (int)A*1000;
    }
    public int convert(double A){
      return (int)(A/100);
    }
}

// for datasixze

class Datasize {
    public int size(int kb){
        return 1000*kb;
    }
    public int size(int mb , int kb){
        int b= (mb*1000)+kb;
        return b;
    }
    public int size(int gb,int mb, int kb){
        int b = (gb*1000000) + (mb*1000) + kb;
        return b;
    }
}
public class lecture3 {
    public static void main(String[] args) {
  distance obj = new distance();

        System.out.println("meter to centimeter " + obj.convert(200));
        System.out.println("km to meter" + obj.convert(20));
        System.out.println("centimeter to meter " + obj.convert(1200.00));


        System.out.println("now converting sizes ");
        Datasize bk = new Datasize();

        System.out.println("kb to bytes convertion" + bk.size(12));
        System.out.println("mb and kb to kb "  + bk.size(20,9));
        System.out.println("gb , mb,and kb to kb " + bk.size(12,34,80));

    }
}
