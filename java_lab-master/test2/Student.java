/*Create a class Student which includes instance variables usn, name and marks of three
subjects. Accept the input through command line arguments. Raise an user defined
exception ‘noargs’ if no arguments are given in command line . Also raise an
exception when negative marks are given.*/

import java.lang.*;
class Noargs extends Exception
{
	Noargs(String msg){
		super(msg);
	}
}

class Student{
	public static void main(String args[]){

try{
	String usn,name;
	int m1,m2,m3;
	
	if(args.length<=0){
		throw new Noargs("no arguments!!!");
	}

	m1 = Integer.parseInt(args[2]);
	m2 = Integer.parseInt(args[3]);
	m3 = Integer.parseInt(args[4]);
	
	if(m1<0 || m2<0 || m3<0)
		throw new Noargs("negative marks Exception!!!");
	
	for(int i =0;i<args.length;i++){
		System.out.println(args[i]);
	}


}
catch(Noargs e){
		System.out.println(e.getMessage());
	}
}	
}


