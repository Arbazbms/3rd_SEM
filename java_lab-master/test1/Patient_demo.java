/*. Develop a java program to create a class Patients with data members patient_id, patient_name, Patient_age, doc
‌
The program should include following functionalities: 
accept n patient details, 
accept patient id and display his/her details
accept the name of doctor and display the name of all the patients related to him/her */


import java.util.*;

class Patients {
    int patient_id, patient_age;
    String patient_name, doc;
    
    void input() {
        System.out.println("Enter ID, Age, Name and Doctor Name");
        Scanner sc = new Scanner(System.in);
        patient_id = sc.nextInt();
        patient_age = sc.nextInt();
        patient_name = sc.next();
        doc = sc.next();
    }
    
    void display() {
        System.out.println(patient_id + " " + patient_age + " " + patient_name + " " + doc);
    }
}

public class PatientDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String docname;
        n = sc.nextInt();
        Patients obj[] = new Patients[n];
        
        for(int i = 0; i < n; ++i) {
            obj[i] = new Patients();
            obj[i].input();
        }
        
        docname = sc.next();
        
        for(int i = 0; i < n; ++i) {
            if (docname.equals(obj[i].doc)) obj[i].display();
        }
	}
}
