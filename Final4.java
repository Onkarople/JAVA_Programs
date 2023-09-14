//import java.lang.*;

final class Base {
    public int i;
    public int j;

    public void fun() {
        System.out.println("Base fun");
    }
}

/*
 * class Derived extends base {
 * 
 * }
 */

class Derived {
    public Base bobj = new Base(); // composition

    public void gun() {
        System.out.println("Derived gun");
    }
}

class Final4 {
    public static void main(String arr[]) {
        System.out.println("");

        Derived dobj = new Derived();
        dobj.bobj.fun();
        dobj.gun();
    }
}

final class System {
    public static PrintStream out = new PrintStream();

}

class PrintStream {
    public void println(String string) {

    }

    public void println(int balance) {
    }
}
