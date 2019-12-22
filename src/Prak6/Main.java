package Prak6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sort sortFiveStudents = new Sort();
        Student[] students = new Student[5];
        String[] names = new String[] {"Nick", "Liza", "Alex", "Julia", "Lera"};
        Scanner in = new Scanner(System.in);
        int gpa = 1;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Enter " + names[i] + " Points");
                gpa = in.nextInt();
            } while (gpa <= 0);
            students[i] = new Student(names[i], gpa);
        }
        sortFiveStudents.quickSort(students, 0, students.length - 1);
        for (int i = 4; i >= 0; i--)
            System.out.println(students[i].toString());
    }
}


