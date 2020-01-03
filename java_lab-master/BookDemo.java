import java.util.*;
class Book {
    String name;
    String author;
    double price;
    int pages;

    Book(){
        name = "";
        author = "";
        price = 0.0;
        pages = 0;
    }

    void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details : name : author : price : pages :");
        name = sc.next();
        author = sc.next();
        price = sc.nextDouble();
        pages = sc.nextInt();
    }

    public String toString(){
        String str = ("NAME : " + name + "\n AUTHOR :" + author + "\n PRICE :" + price + "\n PAGES :" + pages);
        return str;
    }

    void getData(){
        String str = toString();
        System.out.println(str);
    }

}

class BookDemo{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books");
        int n = sc.nextInt();
        Book b[] = new Book[n];

        for(int i = 0; i<n; i++){
            b[i] = new Book();
        }

        for(int i = 0; i<n; i++){
            b[i].setData();
        }
        for(int i = 0; i<n; i++){
            b[i].getData();
        }



    }
}