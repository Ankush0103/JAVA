/*The annual examination result of 5 students in a class is tabulated in a Single Dimensional Array (SDA) is as follows:

Roll No.	Subject A	Subject B	Subject C
…….	…….	…….	…….
…….	…….	…….	…….
…….	…….	…….	…….
Write a program to read the data, calculate and display the following:
(a) Average marks obtained by each student.
(b) Print the roll number and the average marks of the students whose average is above. 80.
(c) Print the roll number and the average marks of the students whose average is below 40.*/

import java.util.Scanner;

public class Stud
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of students");
        int n = sc.nextInt();
        int rollNo[] = new int[n];
        int sA[] = new int[n];
        int sB[] = new int[n];
        int sC[] = new int[n];
        double avg[] = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Roll No of " + (i+1));
            rollNo[i] = sc.nextInt();
            System.out.println("Subject A Marks of "+ (i+1));
            sA[i] = sc.nextInt();
            System.out.println("Subject B Marks of "+ (i+1));
            sB[i] = sc.nextInt();
            System.out.println("Subject C Marks of "+ (i+1));
            sC[i] = sc.nextInt();
            avg[i] = (sA[i] + sB[i] + sC[i]) / 3.0;
        }
        
        System.out.println("\nRoll No\tAverage Marks");
        for (int i = 0; i < n; i++) {
            System.out.println(rollNo[i] + "\t" + avg[i]);
        }
        
        System.out.println("\nStudents with Average above 80:");
        for (int i = 0; i < n; i++) {
            if (avg[i] > 80)
                System.out.println(rollNo[i] + "\t" + avg[i]);
        }
        
        System.out.println("\nStudents with Average below 40:");
        for (int i = 0; i < n; i++) {
            if (avg[i] < 40)
                System.out.println(rollNo[i] + "\t" + avg[i]);
        }
    }
}

