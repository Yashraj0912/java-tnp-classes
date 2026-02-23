package org.example;

import java.util.Scanner;

abstract class hello {
    abstract  void hello2();

    void run(){
        System.out.println("baagh bsdk");
    }
}
class helloTo extends hello{

    void hello2() {
        System.out.println("aag ");
    }
}
// writev an program for abstract class employee
abstract class employe{
    String name ="yash";
    int id =0132;
    int Salary = 23000;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    abstract void calculate ();
    abstract  void display();
}
class manager extends employe{
    int bonus ;

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    void calculate() {
        Salary += bonus;

    }


    @Override
    void display() {
        System.out.println("thee name of employee with bonus ");
        System.out.println(name);
        System.out.println(id);
        System.out.println(Salary);
    }
}
class progarmer extends employe{
    int overtimeRate ;
    int overtime ;
   void setOvertimeRate(int overtime){
       this.overtimeRate= overtime;
   }
   void setOvertime(int overtime){
       this.overtime= overtime;
   }

    @Override
    void calculate() {
        Salary+=(overtime*overtimeRate);
    }

    @Override
    void display() {
        System.out.println("the details and salary with overtime ");
        System.out.println(name);
        System.out.println(id);
        System.out.println(Salary);
    }
}
public class Main {

    public static void main(String[] args) {
        // scanner
        Scanner obj = new Scanner(System.in);
        //for overetime


        progarmer hi2 = new progarmer();
        hi2.setName("yash");
        hi2.setId(90977);
        hi2.setSalary(54000);
        System.out.println("give overtime");
        int ot= obj.nextInt();
        System.out.println("give overtime rate");
        int otr = obj.nextInt();
        hi2.setOvertime(ot);
        hi2.setOvertimeRate(otr);
        hi2.calculate();
        hi2.display();


        // object of manager class


        manager hi3 = new manager();
        hi3.setName("yash");
        hi3.setId(90977);
        hi3.setSalary(54000);
        System.out.println("enter bonus ");
        int bo = obj.nextInt();
        hi3.setBonus(bo);
        hi3.calculate();
        hi3.display();
//        helloTo hi = new helloTo();
//        hi.hello2();
//        hi.run();
//        System.out.println("Hello world!");
    }
}