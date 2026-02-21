import java.io.*;
import java.util.*;

public class fileRead15 {
    public static void main(String[] args) {
        String fileName = "student.txt";  

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            System.out.println("Roll\tName\tSub01\tSub02\tSub03\tPercentage");
            System.out.println("----------------------------------------------------");

            while ((line = br.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");

                if (parts.length < 5) {
                    System.out.println("Invalid data format: " + line);
                    continue;
                }

                int roll = Integer.parseInt(parts[0]);
                String name = parts[1];
                int mark1 = Integer.parseInt(parts[2]);
                int mark2 = Integer.parseInt(parts[3]);
                int mark3 = Integer.parseInt(parts[4]);
                
                double percentage = (mark1 + mark2 + mark3) / 3.0;

                System.out.printf("%d\t%s\t%d\t%d\t%d\t%.2f%%\n",roll, name, mark1, mark2, mark3, percentage);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        }
    }
}
