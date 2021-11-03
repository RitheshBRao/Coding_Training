public class DoubleEqualContainsEqual {
//    String          ->        StringBuilder     ->      StringBuffer
//    (Immutable)               (Mutable)                 (Mutable)
//                              Single thread             Multiple thread
//
//1) equals v/s == v/s contains
//
//== -> Compare same object memory (same referrence or not)
//
//    contains -> Just same characters check
//             -> Not checks whether two objects of same class
//
//    equal -> Same Characters Check
//      -> Object of same Class (String or StringBuffer or StringBuilder)

    public static void main(String[] args) {

        // Watch Vijay video from 20 minutes onwards

        String a = "abc"; // One object in SCP
        String b = new String("abc"); // One object in SSP and One object in heap
        String c = "abc"; // It will check in SCP first -> Since same string contains -> Its not creating one more object
                          // -> var c reference will be pointed to same object
                          // -> Now var a & c reference points to -> same object ->

        String d = b.intern(); // SCP object reference will be assigned and not Heap adress
        System.out.println(a == d);
        System.out.println(a.equals(b));

        String m = "xyz";
        String n = "Xyz";
        System.out.println("-------------->");
        System.out.println("here -->" + Boolean.toString(m==n));
        System.out.println("here -->" + 3);

    }
}
