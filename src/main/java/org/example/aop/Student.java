package org.example.aop;

public class Student {
    private String nameSurname;
    private int course;
    private double avgGade;

    public Student(String nameSurname, int course, double avgGade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGade = avgGade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGade() {
        return avgGade;
    }

    public void setAvgGade(double avgGade) {
        this.avgGade = avgGade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avgGade=" + avgGade +
                '}';
    }
}
