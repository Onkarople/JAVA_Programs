import java.lang.*;

import javax.swing.Icon;

class Array1 {
    public static void main(String a[]) {
        int iCnt = 0;
        int arr[] = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Size of Array is :" + arr.length); // lenght is the property for array in java

        // System.out.println("Elemnts of arry are" + arr);

        System.out.println("data by for loop");
        for (iCnt = 0; iCnt < arr.length; iCnt++) {
            System.out.println(arr[iCnt]);
        }

        iCnt = 0;

        System.out.println("data by while loop");
        while (iCnt < arr.length) {
            System.out.println(arr[iCnt]);
            iCnt++;
        }

        System.out.println("data by for each loop");

        for (int no : arr) {
            System.out.println(no);
        }

    }

}
