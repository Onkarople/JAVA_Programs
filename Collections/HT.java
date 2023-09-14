import java.lang.*;
import java.util.*;

public class HT {

    public static void main(String arg[]) {
        Hashtable<Integer, String> obj = new Hashtable<Integer, String>();

        obj.put(11, "Amit");
        obj.put(21, "Piyush sir");
        obj.put(22, "mayur");
        obj.put(30, "sagar");
        obj.put(34, "dinsesh");

        System.out.println(obj.get(30));
        System.out.println("paduka alya:" + obj.get(21));

        System.out.println("data from hash table");
        Enumeration eobj = obj.keys();
        while (eobj.hasMoreElements()) {

            System.out.println(eobj.nextElement());
        }

    }
}
