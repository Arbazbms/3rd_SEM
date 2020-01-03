//PROGRAM 6
/*[MULTILEVEL] Develop a Java Program to create a class EMPLOYEE with data 
member: empno,name. Derive two classes REGULAR with data member regular_pay and 
another class OVERTIME from class REGULAR with data member: addn_pay. Include a method in OVERTIME that calculate the total pay by adding the above two. Create n 
OVERTIME objects. Display the details of employees who have earned more in overtime 
than the regular pay.  */
import java.util.*;
class employee
{
    String emp_name;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER EMPLYEE NAME:");
        emp_name=sc.nextLine();
    }
}   

class regular extends employee
{
    int regular_pay;
    void getdata()
    {
        super.getdata();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter regular pay");
    regular_pay=sc.nextInt();
}
    void display()
    {
        System.out.println("EMPLOYEE NAME: "+emp_name);
        System.out.println("REGULAR PAY: "+regular_pay);
    }
}


class overtime extends regular
{
    int add_pay;
    int total;
    void getdata()
    {
        super.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter overtime pay");
        add_pay=sc.nextInt();
        total=add_pay+regular_pay;
    }
    
    void more()
    {
        if(add_pay>regular_pay)
        {
            super.display();
            System.out.println("OVERTIME PAY: "+add_pay);
            System.out.println("TOTAL PAY:  "+total);
        }
    }
}
class employeemain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employess");
        int n=sc.nextInt();
        overtime ot[]=new overtime[n];
        for(int i=0;i<n;i++)
        {
            ot[i]=new overtime();
            ot[i].getdata();
        }
        System.out.println("Employees who earned more in overtime");
        for(int i=0;i<n;i++)
        {
            ot[i].more();
        }
    }
}
