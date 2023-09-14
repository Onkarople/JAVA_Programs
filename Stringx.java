import java.lang.*;
import java.io.*;
import java.util.*;

public class Stringx {

    public static void main(String a[]) {
        // String litral
        String str1 = "hello";
        String str2 = "world";

        System.out.println(str1);

        System.out.println(str1.length());

        String str3 = str1 + str2;
        System.out.println(str3);
        String str4 = "Hello";

        // String objects
        String str5 = new String("hello");
        String str6 = new String("World");
        String str7 = new String("Hello");

        System.out.println("Data is:" + str1);
    }

}
