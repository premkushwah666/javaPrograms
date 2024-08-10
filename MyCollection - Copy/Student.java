
public class Student implements Comparable<Student>{
    int id;
    String name;
    String rollNumber;
    int marks;

    public Student(int id, String name, String rollNumber, int marks) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int compareTo(Student o)
    {
        return this.id-o.id;
    }
    
    @Override
    public String toString() {
        return "\nStudent{" + "id=" + id + ", name=" + name + ", rollNumber=" + rollNumber + ", marks=" + marks + '}';
    }
    
    
       
}
