import java.lang.reflect.Array;

public class ExceptionFun {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        try {
            System.out.println(a[5]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong.");
        }


    }

}
