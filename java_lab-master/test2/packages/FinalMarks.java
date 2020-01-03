import CIE.*;
import SEE.*;
import java.util.*;
class FinalMarks
{

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of Students: ");
    int n = sc.nextInt();

    Student s[] = new Student[n];
    Internals io[] = new Internals[n];
    External ei[] = new External[n];

    for(int j=0;j<n;j++){
        s[j] = new Student();
        s[j].set_data();

        io[j] = new Internals();
        io[j].set_data();
    
        ei[j] = new External();
        ei[j].set_data();
    }
   


    System.out.println("The Details of the students is as follow::-- ");
    for(int k= 0;k<n;k++){

    s[k].get_data();
    io[k].get_data();
    ei[k].get_data();

    }
    
}
}
