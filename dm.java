import java.util.*;
class dm
{
    public staic void main(String args[])
    {
        int m,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year:");
        y=sc.nextInt();
        System.out.println("Enter the month:");
        m=sc.nextInt();
        if((m==2)&&(y%4==0)||(y%100==0)&&(y%400==0))
        {
           System.out.println("Number of days is 29"); 
        }
        else if(m==2)
        {
            System.out.println("no of days 28");
        }
        else if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
        {
            System.out.println("no of days is 31");
        }
        else
        {
            System.out.println("no of days is 30");
        }
        
    }
    
}