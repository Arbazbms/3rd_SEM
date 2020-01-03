package CIE;
import java.util.*;

public class Student
{

    String name,usn;
    int sem;

    Scanner sc = new Scanner(System.in);
    
    public void set_data(){
        System.out.println("Enter the Name: ");
        name = sc.next();
        System.out.println("Enter the usn :");
        usn = sc.next();
        System.out.println("Enter the Sem: ");
        sem = sc.nextInt();
        
    }

    public void get_data(){
        System.out.println("Student details are: ");
        System.out.println("Name: "+ name + "usn: "+ usn + "sem :"+ sem);

    }
}
