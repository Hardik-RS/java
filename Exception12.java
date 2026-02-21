class NegativeValueException extends Exception 
{
    public NegativeValueException(String message) 
    {
        super(message);
    }
}

public class Exception12 {

    public static void main(String[] args) 
    {
        try {
            int[] val = new int[args.length];

            for (int a = 0; a < args.length; a++) 
            {
                int number = Integer.parseInt(args[a]);

                
                if (number <= 0) {
                    throw new NegativeValueException("Only positive integers allowed: " + number);
                }

                val[a] = number;
            }

            for (int a = 0; a < val.length; a++) 
            {
                System.out.println("Value " + a + ": " + val[a]);
            }
        } 
        catch (NegativeValueException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Error: All inputs must be valid integers.");
        } 
        catch (Exception e) 
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
