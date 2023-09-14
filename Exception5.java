import java.lang.*;
import java.util.*;

class Demo {
    public int Division(int no1, int no2) throws ArithmeticException {
        return no1 / no2;
    }
}

public class Exception5 {

    public static void main(String a[]) {
        int ret = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number");
        int no1 = sobj.nextInt();

        System.out.println("enter second number");
        int no2 = sobj.nextInt();
        Demo dobj = new Demo();
        try {
            ret = dobj.Division(no1, no2);
        } catch (ArithmeticException obj) {
            System.out.println("inside catch");
        }
        System.out.println("divison is" + ret);

    }

}
