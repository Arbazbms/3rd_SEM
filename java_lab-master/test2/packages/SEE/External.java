package SEE;
import java.util.*;

public class External
{

        int n,smarks[],sum=0;
        double avg;

        Scanner sc = new Scanner(System.in);

        public void set_data(){

            System.out.println("Enter the no of Subjects : ");
            n = sc.nextInt();
            smarks = new int[n];
            System.out.println("Enter the marks for each Subject : ");
            for(int i = 0; i<n; i++){

                System.out.println("Enter the marks in Subject " + (i+1) + ":");
                smarks[i] = sc.nextInt();
            }
        }




        public void get_data(){

            System.out.println("the marks scored  by the Students in SEE is: ");
            for(int i = 0; i<n; i++){

                System.out.println("Score in Subject  " + (i+1) + "is" + smarks[i]);
                sum+=smarks[i] ;
            }
            avg = sum/n;
            System.out.println("Average marks Scored by the Student in SEE is:" + avg);
        }


}
