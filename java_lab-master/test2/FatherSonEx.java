/*Write a program that demonstrates handling of exceptions in inheritance tree. Create a
base class called “Father” and derived class called “Son” which extends the base
class. In Father class, implement a constructor which takes the age and throws the
exception WrongAge( ) when the input age<0. In Son class, implement a constructor
that cases both father and son’s age and throws an exception if son’s age is >=father’s
age.*/

import java.util.*;
import java.lang.*;
class WrongAge extends Exception
{
    WrongAge(String msg){
        super(msg);
    }
}

class Father
{
    int father_age;
    Scanner sc = new Scanner(System.in);
    Father(){
     try{

        System.out.println("Enter the age of the father");
        father_age = sc.nextInt();
        if(father_age<0){
            throw new WrongAge("father age cannot be < 0");
        }
         System.out.println("Fathers age is :  "+father_age);
              
        }
        catch(WrongAge e){
            System.out.println("Caught Exception");
            System.out.println(e.getMessage());
        }

        catch(Exception e){
            System.out.println(e);
        }
        
    }

}

class Son extends Father
{


    int son_age;
    Scanner sc = new Scanner(System.in);
    Son(){
     try{

        System.out.println("Enter the age of the Son");
        son_age = sc.nextInt();
        if(son_age>=father_age){
            throw new WrongAge("Son age is >= father age");
        }
         System.out.println("Son's age is :  "+son_age);
              
        }
        catch(WrongAge e){
            System.out.println("Caught Exception in Son class");
            System.out.println(e.getMessage());
        }

        catch(Exception e){
            System.out.println(e);
        }
        
    }




}

class FatherSonEx{
    public static void main(String args[]) {
      
        Son s = new Son();
        
    }
}       
