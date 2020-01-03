package CIE;
import java.util.*;

public class Internals
{

        int n,marks[],sum=0;
        double avg;

        Scanner sc = new Scanner(System.in);

        public void set_data(){

            System.out.println("Enter the no of Subjects : ");
            n = sc.nextInt();
            marks = new int[n];
            System.out.println("Enter the marks for each Subject : ");
            for(int i = 0; i<n; i++){

                System.out.println("Enter the marks in Subject " + (i+1) + ":");
                marks[i] = sc.nextInt();
            }
        }




        public void get_data(){

            System.out.println("the marks scored  by the Students in CIE is: ");
            for(int i = 0; i<n; i++){

                System.out.println("Score in Subject  " + (i+1) + "is" + marks[i]);
                sum+=marks[i] ;
            }
            avg = sum/n;
            System.out.println("Average marks Scored by the Student in CIE is:" + avg);
        }


}