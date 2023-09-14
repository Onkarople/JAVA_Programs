
class Mythread1 {
    public static void main(String a[]) {

        System.out.println("inside main");

        Thread tobj = Thread.currentThread();

        System.out.println("name of cureent thread is :" + tobj.getName());
    }
}
