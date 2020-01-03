//PROGRAM 1


/*.Imagine a publishing company that markets both book and audiocassette. The company 
uses the publication class to store the title (a string) and price (type double) of a publication. 
The publication class is extended by two other classes: book and tape. 
The book class contains the member variable page_count (type int), and the tape class 
contains the member variable playing_time (type double). 
Ask the user to fill in data with getdata() and then display the data with putdata( ). Create m 
book objects and n tape objects. 
Display details of the book that has more than 500 pages   */
import java.util.*;
class publication
{
    String title;
    double price;
    void getdata()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER TITLE AND PRICE");
        title=sc.nextLine();
        price=sc.nextDouble();
    }
    void putdata()
    {
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
    }
}
      

class book extends publication
{
    int page_count;
    
    void getdata()
    {
        super.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of pages");
        page_count=sc.nextInt();
    }
    void putdata()
    {
        super.putdata();
        System.out.println("Pages: "+page_count);
    }
    
        
}


class tape extends publication
{
    double playing_time;
    void getdata()
    {
        super.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter playing time");
        playing_time=sc.nextDouble();
    }
    void putdata()
    {
        super.putdata();
        System.out.println("Playing time: "+playing_time);
    }
}


class publisher
{
    public static void main(String args[])
    { 
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of books");
        m=sc.nextInt();
        System.out.println("Enter number of tapes");
        n=sc.nextInt();
        book b[]=new book[m];
        tape t[]=new tape[n];
        for( ; ;)
        {
        System.out.println("1.BOOK");
        System.out.println("2.TAPE");
        System.out.println("3.exit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            for(int i=0;i<m;i++)
            {
                b[i]=new book();
                b[i].getdata();
                b[i].putdata();
            }
            System.out.println("***Books with pages greater than 500***");
            for(int i=0;i<m;i++)
            {
                if(b[i].page_count>=500)
                System.out.print(b[i].title+"    ");
                
                
            }
            System.out.println();
            break;
            case 2:
            for(int i=0;i<n;i++)
            {
                t[i]=new tape();
                t[i].getdata();
                t[i].putdata();
            }
            break;
            case 3:
            System.exit(0);
        }
    }
}
}
        
