package JavaExceptionHandling;

public class FinallyBlockInException {
    public static void main(String[] args) {
        int a[]= new int[5];
        try{
            System.out.println(a[9]);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I will run");
        }

    }

}
