/*.Implement a class called PERSON having data members as name, age and address. Derive a class STUDENT from PERSON having data members rollno, and sem. Derive another class EXAM from STUDENT which has data members marks1, marks2 and computes the average and displays the topper of the class. Use suitable methods to accept and display data in these classes.
*/

import java.util.*;

abstract class Person {
    int age; 
    float avg;
    String name, address;
    Scanner sc = new Scanner(System.in);
    
    abstract void calc();
    
    void get_data() {
        System.out.println("Enter Age, Name, Address ");
        age = sc.nextInt();
        name = sc.next();
        address = sc.next();
    }
    
    void display() {
        System.out.println(name + " " + age + " " + address);
    }
}

abstract class Student extends Person {
    int rollno, sem;
    Scanner sc = new Scanner(System.in);
    
 
    void get_data() {
        super.get_data();
        System.out.println("Enter Roll No., Sem ");
        rollno = sc.nextInt();
        sem = sc.nextInt();
    }
    
    void display() {
        super.display();
        System.out.println(rollno + " " + sem);
    }
}


class Exam extends Student {
    float marks1, marks2, marks3;
    Scanner sc = new Scanner(System.in);
    
    void get_data() {
        super.get_data();
        System.out.println("Enter Marks ");
        marks1 = sc.nextFloat();
        marks2 = sc.nextFloat();
        marks3 = sc.nextFloat();
    }
    
    void calc() {
        avg = (marks1 + marks2 + marks3) / 3;
    }
    
    void display() {
        super.display();
        System.out.println(avg);
    }
}

public class Topper {
	public static void main(String[] args) {
	    String topper = "";
	    float max = 0;
		Person obj[] = new Exam[3];
		
		for (int i = 0; i < 3; ++i) {
		    obj[i] = new Exam();
		    obj[i].get_data();
		    obj[i].calc();
		    obj[i].display();
		}
		
		for (int i = 0; i < 3; ++i) {
		    if (obj[i].avg >= max) {
		        topper = obj[i].name;
		        max = obj[i].avg;
		    }
		}
		
		System.out.println("Topper is " + topper);
	}
}
