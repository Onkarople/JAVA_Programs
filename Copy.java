//import java.lang.*;

class Employee implements Cloneable {
    public int EID;
    public String Ename;
    public int Esalary;

    public Employee(int id, String str, int no) {
        this.EID = id;
        this.Ename = str;
        this.Esalary = no;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Copy {
    public static void main(String a[]) throws Exception {
        Employee eobj = new Employee(11, "onkar", 21000);
        System.out.println("EID: " + eobj.EID + "Name: " + eobj.Ename + "Salary : " + eobj.Esalary);

        Employee eobjx = (Employee) eobj.clone(); // typecating
        System.out.println("EID: " + eobjx.EID + "Name: " + eobjx.Ename + "Salary: " + eobjx.Esalary);

        eobj.Ename = "Shubham";
        System.out.println("EID: " + eobjx.EID + "Name: " + eobjx.Ename + "Salary: " + eobjx.Esalary);
        System.out.println("EID: " + eobj.EID + "Name: " + eobj.Ename + "Salary : " + eobj.Esalary);

    }
}
