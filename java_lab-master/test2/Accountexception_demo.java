/*Implement user defined exception in a java program for Bank application which has a
class with instance variables acno, name, balance and methods like deposit(amt) and
withdraw(amt). If the balance falls below 2000/- then it should throw user defined
exception “insufficient balance”.*/


import java.util.*;
import java.lang.*;
class AmountEx extends Exception
{
    AmountEx(String msg){
        super(msg);
    }
}

class Account 
{
    String cust_name;
    int accno;
   static long balance = 0;

    Scanner sc = new Scanner(System.in);

    void getdata()
    {
        System.out.println("Enter account Number");
        accno = sc.nextInt();
        System.out.println("Enter name :");
        cust_name = sc.next();
    }

    void deposit(long amt)
    {
        
        balance += amt;
    }

    void ShowAccount()
    {
        System.out.println("..........................................");
        System.out.println("Acct_no  Name  balance");
        System.out.println(accno + "\t " + cust_name + "\t " + balance );
        System.out.println("..........................................");
    }


    void withdrawal(long amt)
    {
        try{
           
            if(amt < balance){
                balance = balance - amt;
            }else{
               System.out.println("Not sufficient balance!!");
            }


            if(balance<2000)
            {
                throw new AmountEx("insufficient balance!");
            }

        }
        catch(AmountEx e){
            System.out.println("Caught Exception in withdrawal");
            System.out.println(e.getMessage());
        }

        catch(Exception e){
            System.out.println(e);
        }

    }

}

class Accountexception_demo {
    public static void main(String args[]) {

        long amt;
        int ch;
        Scanner sc = new Scanner(System.in);

        Account a = new Account();
        a.getdata();
do{
        System.out.println("1 - deposit 2 - withdraw\n");
        ch = sc.nextInt();

        
        switch (ch) {
            case 1:
                     System.out.println("Enter the amount u want to Deposit: ");
                     amt = sc.nextLong();
                    a.deposit(amt);
                     a.ShowAccount();
                     break;

            case 2:
                    System.out.println("Enter the amount u want to withdraw");
                        amt = sc.nextInt();
                     a.withdrawal(amt);
                    break;
        
            default:
                    System.out.println("invalid choise!!");
                    break;
        }
}while(ch!=2);
    
        
    }
}  
