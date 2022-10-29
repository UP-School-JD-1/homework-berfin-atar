package SoyutSinif;

import java.util.Date;

public class RegistrationOffice {

    public Student getAStudent(){

        Date date = new Date();
        Student stu = null;

        return stu;
    }

    public void registerStudent(Student student) {

        if (student instanceof VocationalStudent) {
            System.out.println("VocationalStudent " + student.getName() + "  registered ");
        }

        if (student instanceof GraduateStudent) {
            System.out.println("GraduateStudent " + student.getName());
        }

    }

}