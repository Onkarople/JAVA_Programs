import java.lang.*;

class Base {
    public int i;
    public int j;

    public void fun() {
        System.out.println("Base fun");
    }

    public final void gun() {
        System.out.println("Base gun");

    }
}

class Derived extends Base {

    public void fun() { // overriding
        System.out.println("Derived fun");

    }

    /*
     * public void gun() { // not allowed
     * System.out.println("Derived gun");
     * 
     * }
     */

}

class Final2 {
    public static void main(String arr[]) {
        System.out.println("");

        Derived dobj = new Derived();
        dobj.fun(); // derived fun
        dobj.gun(); // base gun
    }
}