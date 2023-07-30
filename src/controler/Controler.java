package controler;

import module.Student;
import module.StudentGroup;
import service.StudentGroupService;

import java.util.List;

public class Controler {
    private StudentGroupService studentGroupService = new StudentGroupService();

    public void removeStudentByFIO(String lastName,String firstName,String secondName){
        studentGroupService.removeStudentByFIO(lastName,firstName,secondName);
    }

    public List<Student> getSortedStudentList(){
        return studentGroupService.getSortedStudentList();
    }
}
