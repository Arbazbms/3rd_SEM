import java.lang.*;
class Ascending extends Thread
{
    int arr2[]= new int[5]; 
    int n;
    Ascending(int arr[]){

        arr2=arr;
        n = arr2.length;
    }

    public void run()
	{
	 try{
		// t.join();
         	
      	   for (int i = 0; i < n-1; i++){
            	for (int j = 0; j < n-i-1; j++){
                	if (arr2[j] > arr2[j+1])
               	 	{
                 	   // swap temp and arr[i]
                 	   int temp = arr2[j];
                  	  arr2[j] = arr2[j+1];
                  	  arr2[j+1] = temp;
                	}
	    	    }
		    }
		 // System.out.println("Ascending Order");
		  for (int i=0; i<n; ++i)
            	  System.out.print(arr2[i] + " ");
		  System.out.println();
		   Thread.sleep(100);
		   System.out.println();
       		  
                
 	}catch(InterruptedException e)
  	{
	System.out.println(e); 
 	 } 

     }


}

class Descending extends Thread
{


    int arr3[]= new int[5]; 
    int n;
    Descending(int arr[]){

        arr3=arr;
        n = arr3.length;
    }

    public void run()
	{
	 try{
		// t.join();
         	
      	   for (int i = 0; i < n-1; i++){
            	for (int j = 0; j < n-i-1; j++){
                	if (arr3[j] < arr3[j+1])
               	 	{
                 	   // swap temp and arr[i]
                 	   int temp = arr3[j];
                  	  arr3[j] = arr3[j+1];
                  	  arr3[j+1] = temp;
                	}
	    	    }
		    }
		 // System.out.println("Descending Order");
		  for (int i=0; i<n; ++i)
            	  System.out.print(arr3[i] + " ");
		  System.out.println();
		   Thread.sleep(100);
		   System.out.println();
       		  
                
 	}catch(InterruptedException e)
  	{
	System.out.println(e); 
 	 } 

     }
    
    
}

class SortThread
{

    public static void main(String args[]){

        int arr[] = {64,34,12,11,90};
        Ascending a = new Ascending(arr);
        Descending d = new Descending(arr);
        a.start();

        try{  
            a.join();  
           }catch(Exception e){System.out.println(e);}

        d.start();

    }
}
