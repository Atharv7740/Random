package JavaExceptionHandling;
import java.util.Scanner;

class NewException extends Exception{
    NewException(String text){
        super(text);

    }
}
//class InvalidAgeException extends Exception{
//    InvalidAgeException(String mssg){
//        System.out.println(mssg);
//    }
//
//
//}

public class CustomException {
    public static void main(String[] args) {
        System.out.print("Enter value of A: ");
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            if (a > 20) {
                throw new NewException("Age must be under 20");
            } else {
                System.out.println("nothing");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
//        try{
//            vote(17);
//        }
//        catch(InvalidAgeException e){
//            System.out.println(e);
//        }
//
//
//    }
//    static void vote(int age) throws InvalidAgeException{
//        if(age<18){
//            throw new InvalidAgeException("Not Eligible");
//        }
//        else
//        System.out.println("Eligible for vote");
//
//    }
//}

