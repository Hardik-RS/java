import java.util.Scanner;
class charPosition3
{
	public static void main(String[] args) {
		
		int h;
		int count = 0;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter A String : ");
		String string=sc.nextLine();

		System.out.print("Enter A character : ");
        char ch = sc.next().charAt(0);

        System.out.print("Character '" + ch + "' found at positions: ");

        for(h=0;h<string.length();h++)
        {
        	if (string.charAt(h) == ch) 
        	{
                count++;
                System.out.print(h + " ");
            }
        }
        System.out.println("\nFrequency of '" + ch + "': " + count);
	}
}