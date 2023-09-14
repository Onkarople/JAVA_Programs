
class Employee {
    public String name;
    public int Salary;

    public Employee(String str, int no) {
        this.name = str;
        this.Salary = no;
    }

    public String toString() {
        return "Emplyoee name is " + name + " Having salary " + Salary;
    }

}

public class Object1 {

    public static void main(String a[]) {
        Employee eobj = new Employee("onkar", 10000);
        System.out.println(eobj.toString());
    }
}
