import java.util.Scanner;
class matrix4 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int [][] a1=new int[3][3];
        int [][] a2=new int[3][3];
        int [] a3=new int[9];
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
        for(int z=1;z<=3;z++)
        {
            for(int a=0;a<=2;a++)
            {
                for(int b=0;b<=2;b++)
                {
                    int c=(a1[a][a]*a2[a][b]);
                
                    h=h+c;
                                    
                }  //System.out.println();  
                
                a3[x]=h;  
                h=0; 
                x+=1;     
            }
        }

        System.out.println("Multiplication");
        for(int a=0;a<=8;a++)
        {       
            if(a==3 || a==6)
            {
                System.out.println();
            }      
            System.out.println(+a3[a]);
        }

        

         //for Addition
        
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

    }
}