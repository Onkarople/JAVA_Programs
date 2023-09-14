import java.lang.*;
import java.util.*;

public class LL {

    public static void main(String arg[]) {

        LinkedList<String> obj = new LinkedList<String>();
        obj.add("January");
        obj.add("Febuary");
        obj.add("March");
        obj.add("Marvellous");
        obj.add("April");
        obj.add(2, "New");
        obj.add("May");
        obj.add("Marvellous");
        obj.add("Marvellous");
        obj.add("Marvellous");

        System.out.println("Array list contains" + obj);
        System.out.println("size is:" + obj.size());

        System.out.println("Elments using for loop");
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
        }

        if (obj.contains("April")) {
            System.out.println("Element is there");
        }

        int ret = obj.indexOf("April");
        System.out.println("Element is at:" + ret);

        System.out.println("Elemnt at index 3 is:" + obj.get(3));

        obj.remove(3);
        obj.remove("April");
        System.out.println("Upadted list is" + obj);

        String str;
        int Cnt = 0;

        for (int i = 0; i < obj.size(); i++) {
            str = obj.get(i);
            if (str.equals("Marvellous")) {
                Cnt++;
            }
        }

        System.out.println("Count is" + Cnt);

        Iterator iobj = obj.iterator();
        while (iobj.hasNext()) {
            System.out.println(iobj.next());
        }

        obj.clear();

    }
}
