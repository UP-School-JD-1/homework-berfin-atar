package SoyutSinif;

import java.util.Date;

public class PhdStudent extends GraduateStudent{

    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }


    @Override
    public void study() {
        System.out.println("Phd Student");
    }



}