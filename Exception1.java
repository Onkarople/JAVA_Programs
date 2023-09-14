import java.util.*;

class Exception1 {
    public static void main(String arr[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("please enter first number");
        int no1 = sobj.nextInt();

        System.out.println("please eneter second number");
        int no2 = sobj.nextInt();

        int ans = no1 / no2;

        System.out.println("division is :" + ans);
        sobj.close();
    }

}