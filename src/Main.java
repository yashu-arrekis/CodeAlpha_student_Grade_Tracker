import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do{
            System.out.println("\n===== Student Grade Tracker =====");

            System.out.println("1. Add student");
            System.out.println("2. Display Students");
            System.out.println("3. Calculate Average");
            System.out.println("4. Highest Marks");
            System.out.println("5. Lowest  Marks");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    sc.nextLine();

                    System.out.println("Enter Student Name: ");
                    String name= sc.nextLine();

                    System.out.println("Enter Student Marks: ");
                    int Marks = sc.nextInt();

                    students.add(new Student(name, Marks));

                    System.out.println("Student Added Successfully!");

                    break;
                case 2:
                    System.out.println("Display Students Selected");
                    break;
                case 3:
                    System.out.println("Average Selected");
                    break;
                case 4:
                    System.out.println("Highest Marks Selected");
                    break;
                case 5:
                    System.out.println("Lowest Marks Selected");
                    break;
                case 6:
                    System.out.println("Existing...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while (choice !=6);
        sc.close();
    }
}