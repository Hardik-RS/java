<<<<<<< HEAD
import java.util.Arrays;
public class commandline2
{
    public static void main(String[] args)
    {
        int h,min=0,max=0;
        int []v=new int[5];
        
        for(int a=0;a<=4;a++)
        {
            v[a]=Integer.parseInt(args[a]);
        }

        if(args.length ==4)
        {
            System.out.println("Values out of range"); 
            System.out.println("Pass any five Values"); 

        }
        else
        {
            Arrays.sort(v);
        
            System.out.println("sorted Values");

            for(h=0;h<=4;h++)
            {
                System.out.println(+v[h]);
            }

            System.out.println("minimum value is : "+v[0]);
            System.out.println("maximum value is : "+v[4]);
        }
        
        
    }
=======
import java.util.Arrays;
public class commandline2
{
    public static void main(String[] args)
    {
        int h,min=0,max=0;
        int []v=new int[5];
        
        for(int a=0;a<=4;a++)
        {
            v[a]=Integer.parseInt(args[a]);
        }

        if(args.length ==4)
        {
            System.out.println("Values out of range"); 
            System.out.println("Pass any five Values"); 

        }
        else
        {
            Arrays.sort(v);
        
            System.out.println("sorted Values");

            for(h=0;h<=4;h++)
            {
                System.out.println(+v[h]);
            }

            System.out.println("minimum value is : "+v[0]);
            System.out.println("maximum value is : "+v[4]);
        }
        
        
    }
>>>>>>> e098f96e9882492d0084cb35d822a45a5553b71d
}