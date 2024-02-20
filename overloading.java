import java.util.*;
public class fun
{
    private int value;
    public ol()
    {
        value=0;
    }
    public ol(int val)
    {
        value=val;
    }
    public ol(int val1,int val2)
    {
        value=val1+val2;
    }
    public add(int a,int b)
    {
        return a+b;
    }
    public sadd(String a,String b)         
    {
        return a+b;
    }
    public void display value()
    {
        System.out.println("value:" +value);
    }
    
}
public static void main(String args[])
{
    
    ol ob=new ol();
    ol ob1=new ol(6);
    ol ob2=new ol(2,4);
    ol4 ob3=new sadd();
    int r1=ob3.add(2,4);
    int r2=ob3.sadd("hi","i");
    System.out.println("Result:" +r1);
    System.out.println("value:" +r2);
}    
    
    
    
    
    
    
}