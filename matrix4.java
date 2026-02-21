import java.util.Scanner;
import java.util.Arrays;
class matrix4 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int [][] a1=new int[3][3];
        int [][] a2=new int[3][3];
        int [][] a3=new int[3][3];
        float [] a4=new float[9];
        
        int h=0,x=0;
        for(int a=0;a<=2;a++)
        {
            for(int b=0;b<=2;b++)
            {
                System.out.print("Enter Arrays value "+(a+1)+" of "+(b+1)+" :");
                a1[a][b]=sc.nextInt();
            }
            System.out.println();
        }

        for(int a=0;a<=2;a++)
        {
            for(int b=0;b<=2;b++)
            {
                System.out.print("Enter Arrays value "+(a+1)+" of "+(b+1)+" :");
                a2[a][b]=sc.nextInt();
            }
            System.out.println();
        }        


        // for Multiplication
        for(int z=0;z<=2;z++)
        {
            for(int a=0;a<=2;a++)
            {
                for(int b=0;b<=2;b++)
                {
                    int c=(a1[a][a]*a2[a][b]);
                
                    h=h+c;  
                                    
                }  //System.out.println();  
                a3[z][a]=h;
                  
                h=0; 
                x+=1;     
            }
        }

        System.out.println("Multiplication");
        for(int a=0;a<=2;a++)
        {      
            for(int b=0;b<=2;b++) 
            {      
                System.out.print(" "+a3[a][b]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Multiplication");

        System.out.println(Arrays.deepToString(a3));

         //for Addition
        System.out.println();
            System.out.println("Addition");
            for(int a=0;a<=2;a++)
            {
                for(int b=0;b<=2;b++)
                {
                    System.out.print(" "+(a1[a][b]+a2[a][b]));
                                    
                }  System.out.println();         
             
            }     

            //for subtraction
        
            System.out.println("subtraction");
            for(int a=0;a<=2;a++)
            {
                for(int b=0;b<=2;b++)
                {
                    System.out.print(" "+(a1[a][b]-a2[a][b]));
                                    
                }  System.out.println();         
             
            }

             String formatted = Arrays.deepToString(a3)
                                .replace("], ", "\n")   // new line after each row
                                .replace("[[", "")      // remove first opening bracket
                                .replace("]]", "")      // remove last closing bracket
                                .replace("[", "")       // remove remaining opening brackets
                                .replace(",", "");      // remove commas

        System.out.println(formatted);       

    }
}