import java.util.Arrays;
public class ao
{
    public static void main(String args[])
    {
        if(args.length==0)
        {
            System.out.println("No string provided");
            return;
        }
        String[] strings=Arrays.copyOf(args,args.length);
        Arrays.sort(strings);
        System.out.println("Sorted Strings:");
        for(String str:strings)
        {
            System.out.println(str);
        }
        
    }
}