package Prak6;

import java.util.Comparator;

public class Sort implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return Integer.compare(s1.getPoints(), s2.getPoints());
    }
    public void quickSort(Student[] students, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (compare(students[i], students[cur]) != 1)) {
                i++;
            }
            while (j > cur && (compare(students[cur], students[j]) != 1)) {
                j--;
            }
            if (i < j) {
                int temp = students[i].getPoints();
                students[i].setPoints(students[j].getPoints());
                students[j].setPoints(temp);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        quickSort(students, start, cur);
        quickSort(students, cur + 1, end);
    }
}
