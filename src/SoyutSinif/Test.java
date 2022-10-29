package SoyutSinif;

import java.util.Date;

public class Test {

    public static void main(String[] args) {

        RegistrationOffice stu = new RegistrationOffice();
        Date date = new Date();

        Student student = stu.getAStudent();
        System.out.println("student: " + student.getName());


        UndergraduateStudent student1 = new UndergraduateStudent(1, "Berfin",1996,date,"BB","CC");
        stu.registerStudent(student1);


    }


}