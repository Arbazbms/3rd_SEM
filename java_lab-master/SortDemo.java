class SortThread implements Runnable
{
    int arr2[]= new int[5]; 
    int n; 
    Thread t;
    SortThread(int arr[])
    {
	arr2=arr;
	n = arr2.length;
        t = new Thread(this,"Acending");
        t.start();
      
    }

	public void run()
	{
	 try{
		 t.join();
         	
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


class SortDemo
{
    // Driver method to test above
    public static void main(String args[])
    {
	int arr[] = {64,34,12,11,90};
	int n = arr.length;
        SortThread ob = new SortThread(arr);
	
	
	try{
		
            for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] < arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
		    
                }
	     }
          }
			

		  //System.out.println("descending Order");
 	          for (int i=0; i<n; ++i)
            	  System.out.print(arr[i] + " ");
		     System.out.println();
		Thread.sleep(1000);
       		  System.out.println();


	 }catch(InterruptedException e)
	  {
		 System.out.println(e);
	  }
        

    } 
}










