import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class student14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "student.txt";
        FileWriter fw = null;

        try {
            fw = new FileWriter(filename, true);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details for Student " + i + ":");

                try {
                    System.out.print("Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    int m1 = getValidMark(sc, 1);
                    int m2 = getValidMark(sc, 2);
                    int m3 = getValidMark(sc, 3);

                    fw.write(roll + "\t" + name + "\t" + m1 + "\t" + m2 + "\t" + m3 + "\n");

                } catch (InputMismatchException ime) {
                    System.out.println("Invalid input. Please enter the correct data type.");
                    sc.nextLine();
                    i--;
                }
            }

            System.out.println("\nData successfully written to " + filename);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } catch (InputMismatchException ime) {
            System.out.println("Invalid number of students entered. Please enter an integer.");
        } catch (Exception ex) {
            System.out.println("An unexpected error occurred: " + ex.getMessage());
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                System.out.println("Failed to close the file writer.");
            }
            sc.close();
        }
    }

    public static int getValidMark(Scanner sc, int subjectNumber) {
        int mark;
        while (true) {
            try {
                System.out.print("Marks of Subject " + subjectNumber + ": ");
                mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid mark. Please enter a value between 0 and 100.");
                } else {
                    break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Please enter a valid integer mark.");
                sc.nextLine();
            }
        }
        return mark;
    }
}
