public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setClass(String classesName) {
        this.classes = classes;
    }

    public String toString() {
        return " Name " + this.name + " Class " + this.classes;
    }
}
