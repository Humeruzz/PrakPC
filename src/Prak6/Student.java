package Prak6;

public class Student {
    private String name;
    private int points;
    public Student(String name, int points) {
        this.name = name;
        this.points = points;
    }
    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public String toString () {
        return name + "GPA equals = " + points;
    }
}
