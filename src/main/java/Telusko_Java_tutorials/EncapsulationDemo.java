package Telusko_Java_tutorials;

public class EncapsulationDemo {
    public static void main(String[] args) {
         A1 obj=new A1();
         obj.setI(5);
        System.out.println(obj.getI());

        Employee e1=new Employee();
        e1.setEmpId(3);
        e1.setEmpName("Navin");

        Employee e2=new Employee();
        e2.setEmpId(5);
        e2.setEmpName("Rizwan");

        System.out.println(e1.getEmpName());
    }
}
class A1{
    private int i;
    public void setI(int j){
        i=j;
    }
    public int getI(){
        return i;
    }
}
class Employee{
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}