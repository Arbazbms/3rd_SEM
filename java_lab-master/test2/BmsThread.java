import java.lang.*;
class CSE implements Runnable
{
    Thread t;
    CSE(){
        t = new Thread(this,"CSE thread");
        t.start();
    }

    public void run(){

        try {
            for(;;){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
                System.out.println(e);
        }
    }
}

class BmsThread {

    public static void main(String args[])
    {
        CSE o = new CSE();  
        System.out.println("press ctrl + c to stop");

        try {
            for(;;){
            System.out.println("BMS college of engineering");
            Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
           System.out.println(e);
        }
    }
}
