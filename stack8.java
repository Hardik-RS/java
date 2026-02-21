import java.util.Scanner;
import java.util.InputMismatchException;

class Stack 
{
    int arr[]; 
    int top = -1;
    int val;
    Stack(int size)
    {
        arr=new int[size];
    }

    public void push(int val)
    {
        if(top==arr.length-1)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            arr[++top]=val;
            System.out.println(val+" pushed");
        }        
    }

    public int pop()
    {
        if(top==-1)
        {
             System.out.println("Stack Underflow");
        }
        else
        {
            int val=arr[top--];
            System.out.println(val + " popped");
        }
        return val;
    }

    public void traverse()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Stack elements");

            for (int i = 0; i <= top; i++) 
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

   
}
class stack8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean trues=false;
        int choise=0,val,size;        
        
        while (true) 
        {
            try {
                System.out.print("Enter Stack size: ");
                size = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter only numbers.");
                sc.next();
            }
        }
        
        Stack st=new Stack(size);
        while(!trues)
        {
            System.out.println("\n choose any one \n push : 1 \n pop : 2 \n display : 3 \n Exit : 4");

            while (true) 
                {
                    try 
                    {
                        System.out.print("\n Enter your Choise :");                        
                        choise=sc.nextInt();                        
                        break;
                    } 
                    catch (InputMismatchException e) 
                    {
                        System.out.println("Invalid input! Please enter only numbers.");
                        sc.next();
                        continue;
                        
                    }
                }           
            
            
            if(choise==1)
            {
                while (true) 
                {
                    try 
                    {
                        System.out.print("\n  Enter value to push : ");
                        val=sc.nextInt();
                        st.push(val);
                        break;
                    } 
                    catch (InputMismatchException e) 
                    {
                        System.out.println("Invalid input! Please enter only numbers.");
                        sc.next();
                        continue;
                        
                    }
                }
                
            }
            else if(choise==2)
            {
                st.pop();
            }
            else if(choise==3)
            {
                st.traverse();
            }
            else if(choise==4)
            {
                break ;
            }
            else 
            {
                System.out.println("Enter Valid Choise..");
            }
        }

         

    }

   

}