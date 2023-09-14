import java.util.*;
import java.lang.*;

public class V {
    public static void main(String arg[]) {
        Vector<Integer> obj = new Vector<Integer>(12);
        obj.add(11);
        obj.add(20);
        obj.add(51);
        obj.add(101);
        obj.add(110);
        obj.add(111);

        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
        }

        Iterator iobj = obj.iterator();
        while (iobj.hasNext()) {
            System.out.println(iobj.next());
        }

        int Cnt = 0;
        int no = 0;
        for (int i = 0; i < obj.size(); i++) {
            no = obj.get(i);
            if (no % 2 == 0) {
                Cnt++;
            }
        }
        System.out.println("Even element are:" + Cnt);

        System.out.println("Capicity of vector is" + obj.capacity());
        System.out.println("Size of vector is" + obj.size());

        obj.clear();
    }

}
