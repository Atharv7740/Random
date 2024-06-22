package GenericAndWrapperClasses;

public class GenericClass {
    public static void main(String[] args) {
// Dog<int> d=new Dog<>(15) only non premitive data type supported.
        Dog<String> d1= new Dog<>("1df2g");
        Dog<Integer> d2 =new Dog<>(143334);
        Cat<Integer> c1 =new Cat<>(12342);

    }
}
class Dog<E>{
    E id;
    public Dog(E id){
        this.id=id;
    }
}
class Cat<C>{
    C id;
    public Cat(C id){
        this.id =id;
    }
}
