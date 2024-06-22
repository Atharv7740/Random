package GenericAndWrapperClasses;

public class GenericClass {
    public static void main(String[] args) {
// Dog<int> d=new Dog<>(15) only non premitive data type supported.
        Dog<String> d1= new Dog<>("1df2g");
        Dog<Integer> d2 =new Dog<>(143334);

    }
}
class Dog<E>{
    E id;
    public Dog(E id){
        this.id=id;
    }
}
