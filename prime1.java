<<<<<<< HEAD
import java.util.Scanner;
class prime1
{
    public static void main(String[] args)
    {
        int h;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value :");
        h = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= h; i++) {
            if (h % i == 0) {
                count++;
            }
        }
        
        if (count == 2) 
        {
            System.out.println(h + " is Prime");
        } 
        else 
        {
            System.out.println(h + " is Not Prime");
        }
        
        System.out.println();
        System.out.println("Using  if..else break and continue");
        int d=1;
        do
        {
            d++;
            if(d==10)
            {
                System.out.println("program stoped using Break");
                break;
            }
            else
            {
                System.out.println(+d);
                System.out.println("program continue ");
                continue;
            }
            
            
        }while(d!=0);
        


    }
=======
import java.util.Scanner;
class prime1
{
    public static void main(String[] args)
    {
        int h;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value :");
        h = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= h; i++) {
            if (h % i == 0) {
                count++;
            }
        }
        
        if (count == 2) 
        {
            System.out.println(h + " is Prime");
        } 
        else 
        {
            System.out.println(h + " is Not Prime");
        }
        
        System.out.println();
        System.out.println("Using  if..else break and continue");
        int d=1;
        do
        {
            d++;
            if(d==10)
            {
                System.out.println("program stoped using Break");
                break;
            }
            else
            {
                System.out.println(+d);
                System.out.println("program continue ");
                continue;
            }
            
            
        }while(d!=0);
        


    }
>>>>>>> e098f96e9882492d0084cb35d822a45a5553b71d
}