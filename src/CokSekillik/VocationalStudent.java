package CokSekillik;

public class VocationalStudent extends AbstractStudent {

    public VocationalStudent(int no, String name, int year, String major) {
        super(no, name, year, major);
    }

    @Override
    public void study ( ) {
        System.out.println("Graduate student ");
    }

    @Override
    public void register ( ) {
        System.out.println("Graduate student ");
    }

    @Override
    String toString (String info) {
        info = "Vocational Student: " + getName() + "(No: " + getNo() + ",Year: " + getYear() + ", Major: " + getMajor() + ")";
        return info;
    }

}