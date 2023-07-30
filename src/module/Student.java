package module;

public class Student {
    private Long StudentId;
    private String lastName;
    private String firstName;
    private String secondName;



    public Student(String lastName, String firstName, String secondName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Student(Long studentId, String lastName, String firstName, String secondName) {
        StudentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Long getStudentId() {
        return StudentId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
