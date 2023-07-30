package service;

import module.Student;
import module.StudentGroup;

import java.util.Iterator;

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
}
