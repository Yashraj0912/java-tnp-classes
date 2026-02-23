package org.example;

import java.util.Scanner;

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


//question
// take user id from userr with final , take password and sett both , only getter for userid
//password should of more than
//block if more than 3 attempt

class account {
    private final String email = "yashraj@0912";
    private final int password = 1234;
    private boolean blocked =false;
    private boolean logedIn = false;

    public void setLogedIn(boolean logedIn) {
        this.logedIn = logedIn;
    }

    public boolean isLogedIn() {
        return logedIn;
    }

    public int getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
public class lecture4 {
    public static void main(String[] args) {
        safe obj = new safe();
        obj.setAge(21);
        obj.setName("yash raj singh yadav");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());


        // for the account question
        Scanner sc = new Scanner(System.in);
        account ac = new account();

        int tries=0;

        while(tries<3){
            System.out.println("enter the user name ");
            String inputName = sc.nextLine();
            if(!inputName.contains("@")){
                System.out.println("enter valid username ");
                continue;
            }
            else{
                System.out.println("enter the pasword ");
                int pas = sc.nextInt();
                if(!inputName.equals(ac.getEmail())){
                    System.out.println("email not found ");
                    continue;
                }
                else if(pas != ac.getPassword()){
                    System.out.println("worng password");
                    tries++;
                    continue;
                }

                else {
                    ac.setLogedIn(true);
                    break;
                }
            }
        }
        if(ac.isLogedIn()){
            System.out.println("you are succefully loged in");
        }
        else if (tries==2) {
            ac.setBlocked(true);
            System.out.println(" you are blocked");
        }
        else{
            System.out.println("error aoccured");
        }

    }
}
