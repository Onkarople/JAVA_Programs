
//import java.lang.*;

class Base {
    public int i;
    public int j;

    public Base(int a, int b) {
        this.i = a;
        this.j = b;
    }

    public void fun() {
        System.out.println("Inside base fun");
    }

}

class Derived extends Base // class Derived : public Base
{
    public int x;
    public int y;

    public Derived() {
        super(11, 21); // 3
        System.out.println("Inside derived construtor");
        this.x = 30;
        this.y = 40;
    }

    public void sun() {
        System.out.println("inside derived sun");
        System.out.println(super.i); // 1
        super.fun(); // 2
    }
}

class Inheritance3 {

    public static void main(String arr[]) {
        System.out.println("inside main");
        Derived dobj = new Derived();
        dobj.sun();
    }
}