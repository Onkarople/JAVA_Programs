//import java.lang.*;

class Base {
    public int i;
    public int j;

    public Base() {
        System.out.println("Inside base construtor");
    }

    public void fun() {
        System.out.println("Inside base fun");
    }

    public void fun(int x) {
        System.out.println("Inside base fun with ineteger argument");
    }

    public void gun() {
        System.out.println("Inside base gun");
    }
}

class Derived extends Base // class Derived : public Base
{
    public int x;
    public int y;

    public Derived() {
        System.out.println("Inside derived construtor");
    }

    public void sun() {
        System.out.println("inside derived sun");
    }
}

class Inheritance1 {

    static {
        System.out.println("inside Static block");
    }

    public static void main(String arr[]) {
        System.out.println("inside main");
        Derived dobj = new Derived();

        dobj.fun();
        dobj.fun(11);
        dobj.gun();
        dobj.sun();

    }
}