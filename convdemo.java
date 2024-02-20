package converter;
imort java.uti;.Scanner;
public class distconv
{
    double me,km,mi;
    public void meterto(double m)
    {
        Scanner s=new Scanner(System.in);
        int me=s.nextInt();
        me=m;
        km=m/1000;
        mi=m/1610;
        System.out.println("meter to Km "+km);
        System.out.println("meter to miles"+mi);
    }

    public void milesto(double m)
    {
        Scanner s=new Scanner(System.in);
        int mi=s.nextInt();
        mi=m;
        km=mi*1.61;
        m=km*1000;
        System.out.println("Miles to km"+km);
        System.out.println("miles to meter"+m);
}
package converter;
import java.util.Scanner;
public class timeconv{
    int h,m,s;
    public void hoursto(int hour)
    {
       
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        h=hour;
        m=h*60;
        s=m*60;
        System.out.println("hours to min"+m);
        System.out.println("hour to sec"+s);
    }
    public void secto(int sec)
    {
        Scanner s=new Scanner(System.in);
        int s=s.nextInt();
        s=sec;
        h=s/60;
        m=h/60;
        System.out.println("sec to hour"+m);
        System.out.println("sec to min"+m);
    }
}
import converter.distconv;
import converter.timeconv;
import java.util.Scanner;

public class convdemo{
    public static void main(String args[])
    {
        System.out.println("1.distance converter");
        System.out.println("2.Time converter");
        Scanner s=new Scanner(System.in);
        int ch=s.next();
        switch(ch)
        {
            case 1:
                distconv();
            case 2:
                timeconv();
        }
    }
}