/*Create an interface SAFE_DRIVING with an interface variable Safe_Speed and a member
function speed_Of _the_vehicle().
Create a class called drive that implements this interface. Display the following messages
1. If vehicle speed greater than Safe_Speed then display “Drive slow”
2. If vehicle speed is less than Safe_Speed then display “Safe Driving”-*/

import java.util.*;
import java.lang.*;

interface SAFE_DRIVING 
{
    final static int Safe_Speed = 40;
    void Speed_Of_the_Vehicle();
}

class drive implements SAFE_DRIVING
{
    Scanner ip = new Scanner(System.in);
    int speed;
    public void Speed_Of_the_Vehicle()
    {
        System.out.print("Enter The Speed of The Vehicle : ");
        speed = ip.nextInt();
        
        if(speed>Safe_Speed)
        {
            System.out.println("Drive Slow.!");
        }
        else if(speed<=Safe_Speed)
        {
            System.out.println("Safe Driving.!");
        }
    }
}

 class safe_driving_demo
{
	public static void main(String[] args) 
	{
		drive d = new drive();
		d.Speed_Of_the_Vehicle();
	}
}
