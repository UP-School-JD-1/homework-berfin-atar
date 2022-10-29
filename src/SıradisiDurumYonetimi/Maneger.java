package SıradisiDurumYonetimi;

class Manager extends Employee{
    protected String departmentManaged;



    public Manager(int no, String name, int year, String workingDepartment, String departmentManaged){
        super(no, name, year, workingDepartment);
        this.departmentManaged = departmentManaged;
    }

    public Manager(int no, String name, int year, String departmentManaged){
        super(no, name, year);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void work(){
        System.out.println("manager work");
        manage();
    }

    public void manage(){
        System.out.println("Manager  " + departmentManaged);
    }



    @Override
    public String toString() {
        return "Manager [departmentManaged=" + departmentManaged + ", no=" + no + ", name=" + name + ", year=" + year
                + ", department=" + department + "]";
    }
}