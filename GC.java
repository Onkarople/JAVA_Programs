//import java.lang.*;

class Demo {
    public int Arr[];

    public Demo(int size) {
        System.out.println("Allocating the rescources in constructor");
        this.Arr = new int[size];

    }

    protected void finalize() {
        System.out.println("Deallocating the rescources in finalize");
        this.Arr = null;
    }
}

class GC {

    public static void main(String args[]) {
        Demo dobj = new Demo(10);
        dobj = null;
        System.gc();
        System.out.println("end main ");

    }
}
