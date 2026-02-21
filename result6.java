class Student 
{
    String name;
    int rollNo;
    float marks;

    void displayDetails() 
    {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
class result6
{  
    public static void main(String[] args) 
    {
        Student s1 = new Student();

        s1.name = "Hardik Rajubhai Sarvaiya";
        s1.rollNo = 17;
        s1.marks = 88.5f;

        s1.displayDetails();
    }
}
