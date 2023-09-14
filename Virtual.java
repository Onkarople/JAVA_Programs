//import java.lang.*;

class Base {
    public int i, j;

    public void fun() { // defination
        System.out.println("Base fun");
    }

    public void gun() { // defination
        System.out.println("Base gun");

    }

    public void sun() { // defination
        System.out.println("Base sun");
    }
}

class Derived extends Base {
    public int x, y;

    public void fun() { // overriding
        System.out.println("Derived fun");
    }

    public void sun() { // overriding
        System.out.println("Derived sun");
    }

    public void run() { // defination
        System.out.println("Derived sun");
    }

}

class Virtual {
    public static void main(String arr[]) {

        // Base bobj = new Base();
        // Derived dobj = new Derived();

        Base obj = new Derived(); // base *ptr = new Derived
        // Derived obj2= new Base();

        obj.fun(); // Derived fun // ptr->fun()
        obj.gun(); // base gun
        obj.sun(); // derived sun
        // obj.run();
    }
}