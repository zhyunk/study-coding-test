import java.util.Arrays;

public abstract class MyPrint {

    public abstract void run();

    public void print(String a) {
        System.out.println("result = " + a);
    }
    public void print(int a) {
        System.out.println("result = " + a);
    }
    public void print(long a) {
        System.out.println("result = " + a);
    }
    public void print(double a) {
        System.out.println("result = " + a);
    }
    public void print(float a) {
        System.out.println("result = " + a);
    }
    public void print(int[] arr) {
        System.out.println("result = " + Arrays.toString(arr));
    }
    public void print(long[] arr) {
        System.out.println("result = " + Arrays.toString(arr));
    }
    public void print(double[] arr) {
        System.out.println("result = " + Arrays.toString(arr));
    }
    public void print(String[] arr) {
        System.out.println("result = " + Arrays.toString(arr));
    }
    public void print(int[][] arr) {
        String s = "";
        for (int[] a: arr) {
            s += Arrays.toString(a);
        }
        System.out.println("result = [" + s + "]");
    }
    public void print(double[][] arr) {
        String s = "";
        for (double[] a: arr) {
            s += Arrays.toString(a);
        }
        System.out.println("result = [" + s + "]");
    }
    public void print(String[][] arr) {
        String s = "";
        for (String[] a: arr) {
            s += Arrays.toString(a);
        }
        System.out.println("result = [" + s + "]");
    }

}
