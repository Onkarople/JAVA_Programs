import java.util.*;

class Exception2 {
    public static void main(String arr[]) {

        int ans = 0, no1 = 0, no2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("please enter first number");
        no1 = sobj.nextInt();

        System.out.println("please eneter second number");
        no2 = sobj.nextInt();

        try {

            ans = no1 / no2; // exception prone code //aghat honara marg ahe

        } catch (ArithmeticException obj) {

            System.out.println("Exception occured as :" + obj);
        } finally {
            sobj.close();

        }

        System.out.println("division is :" + ans);
    }

}
