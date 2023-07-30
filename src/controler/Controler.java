package controler;

import module.StudentGroup;
import service.StudentGroupService;

public class Controler {
    private StudentGroupService studentGroupService = new StudentGroupService();

    public void removeStudentByFIO(String lastName,String firstName,String secondName){
        studentGroupService.removeStudentByFIO(lastName,firstName,secondName);
    }
}
