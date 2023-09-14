import java.util.*;

import javax.swing.text.IconView;

import java.lang.*;

class Array2 {
    public static void main(String a[]) {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter number of elemrnts");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        System.out.println("enetr elemrnts of arry");
        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("elements if array are");
        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            System.out.println(Arr[iCnt]);
        }

    }
}