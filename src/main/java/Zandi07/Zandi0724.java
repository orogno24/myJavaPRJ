package Zandi07;

class Parent{
    public Parent( ){
        System.out.print("A");
    }
    public Parent(int a){
        System.out.print("B");
    }
}
class Child extends Parent{
    public Child( ){
        System.out.print("C");
    }
    public Child(int a){
        super(a);
        System.out.print("D");
    }
}

 public class Zandi0724 {
     public static void main(String args[]) {
         Parent a = new Parent();
         Parent b = new Child();
         Child c = new Child(5);
     }
 }

