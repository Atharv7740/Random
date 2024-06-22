package JavaExceptionHandling;

public class JavaRuntimeException {
    public static void main(String[] args) {
        int[] a =new int[4];
        try {
            System.out.println(a[8]);
        }
        catch(Exception e){
            System.out.println("Handling Exception ");
        }
        System.out.println("byee");

    }

}
