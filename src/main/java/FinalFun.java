public class FinalFun {

    void method1(int i){
        System.out.println("method2");
    }

    public static void main(String[] args) {
        SecondClass s = new SecondClass();
        System.out.println(s.i);
        s.method1();
//        FinalFun f = new FinalFun();
//        f.method1(5);

    }

    private static class SecondClass{
        int i = 1;

        final void method1(){
            i = 2;
            System.out.println("Method1 value: " + i);
        }

    }
}



//  3 Rules are there -->
//  Rule 1: If you declare class as final    -> that class cannot be extended (Class Inheritance is not allowed)
//  Rule 2: If you declare method as final   -> that method overriding is not allowed (But method overloading is allowed)
//  Rule 3: If you declare variable as final -> that variable value cannot be changed anywhere
//  In order to prevent inheritance (method overriding)
//  -> final -> private -> static


//   method overriding in the same class not allowed
//
//   Command + Option + L
//
//    Static method cannot override -> only object methods can override
//
//  1) Method override -> Expetion should be subtype or same type of the method
//
//  2) return type should be subtype of
//
//  3) access modifier class
//
//    Overloading no above rules
//
//    Overloaded methods can be overriden