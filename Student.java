public class Student {
    private String surname;
    private String name;
    private int age;
    private double average_score;

    public Student(String surname_val, String name_val, int age_val, double average_score_val) {
        this.surname = surname_val;
        this.name = name_val;
        this.age = age_val;
        this.average_score = average_score_val;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverage_score() {
        return this.average_score;
    }

    public void setAverage_score(double average_score) {
        this.average_score = average_score;
    }
}
