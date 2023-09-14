import java.lang.*;
import java.util.*;

class Array4 {
    public static void main(String arg[]) {

        int i = 0, j = 0;
        int size = 0;
        int size1 = 0;
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter rows");
        size = sobj.nextInt();

        int arr[][] = new int[size][];
        for (iCnt = 0; iCnt < size; iCnt++) {
            System.out.println("enter number of columns");
            size1 = sobj.nextInt();
            arr[iCnt] = new int[size1];

        }

        System.out.println("Enter the elements");
        for (i = 0; i < arr.length; i++) // For Rows
        {
            for (j = 0; j < arr[i].length; j++) // For Columns
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        /*
         * System.out.println("Enter colouns for 1st array");
         * int size1=sobj.nextInt();
         * 
         * arr[0] = new int[size1];
         * 
         * System.out.println("Enter colouns for 2nd array");
         * int size2=sobj.nextInt();
         * 
         * 
         * arr[1] = new int[size2];
         * System.out.println("Enter colouns for 3rd array");
         * 
         * arr[2] = new int[2];
         */

        System.out.println("elemnets are ");

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }

    }

}
