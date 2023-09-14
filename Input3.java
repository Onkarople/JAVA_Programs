import java.io.*;

public class Input3 {
    public static void main(String a[]) throws IOException {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("enter string");
        String str = bobj.readLine();

        System.out.println("enter integer");
        int no = Integer.parseInt(bobj.readLine());

        System.out.println("enter floar");
        float f = Float.parseFloat(bobj.readLine());

        System.out.println("enter double");
        double d = Double.parseDouble(bobj.readLine());

        System.out.println("entered string is:" + str);
        System.out.println("entered int  is:" + no);
        System.out.println("entered float is:" + f);
        System.out.println("entered double is:" + d);

    }

}
