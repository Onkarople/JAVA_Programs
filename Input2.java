import java.lang.*;
import java.util.*;
import java.io.*;

public class Input2 {
    public static void main(String a[]) {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        try {

            System.out.println("Enter your name");

            String name = bobj.readLine();

            System.out.println("Your name is: " + name);

            System.out.println("Enter your age");
            int age = Integer.parseInt(bobj.readLine());
            System.out.println("your age is:" + age);

            System.out.println("Enter your marks");
            float percenatge = Float.parseFloat(bobj.readLine());

            System.out.println("your per are :" + percenatge);
        } catch (IOException obj) {
            System.out.println("Exception occurs :");
        } finally {
            iobj = null;
            bobj = null;
        }
    }
}
