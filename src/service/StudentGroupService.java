package service;

import comparator.StudentComparator;
import module.Student;
import module.StudentGroup;

import java.util.*;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void removeStudentByFIO(String lastName,String firstName,String secondName){
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getLastName().equals(lastName) && student.getFirstName().equals(firstName) &&
                    student.getSecondName().equals(secondName)){
                iterator.remove();
            }
        }
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public List<Student> getSortedStudentList(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }
    public List<Student> getSortedStudentListByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComparator());
        return studentList;
    }
}
