import java.lang.*;

class Demo {
    public int iNo = 0;
    public int iCnt = 0;

    public int iSum = 0;

    public int Add() {
        for (iCnt = 1; iCnt <= 4; iCnt++) {
            iSum = iSum + iCnt;

        }

        return iSum;
    }
}

class program22 {
    static public void main(String arr[]) {
        System.out.println("");
        Demo dobj = new Demo();
        int iret = 0;
        iret = dobj.Add();

        System.out.println(iret);
    }
}