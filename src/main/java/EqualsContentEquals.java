public class EqualsContentEquals {
    public static void main(String[] args) {

        String s1 = new String("abc");

        String s2 = new String("abc");

        StringBuilder s3 = new StringBuilder("abc");

        StringBuilder s7 = new StringBuilder("abc");

        StringBuffer s4 = new StringBuffer("abc");

        StringBuffer s5 = new StringBuffer("abc");

        System.out.println(s2.contains(s7));

        System.out.println(s2.contentEquals(s1));


// the equals() method compares two Strings for equality of value
// We can compare only Strings -> We cannot compare StringBuffer/StringBuilder
// We need to convert to into String (.toString()) to compare

        StringBuilder sbld1 = new StringBuilder("Hello");
        StringBuilder sbld2 = new StringBuilder("Hello");

        if (sbld1.toString().equals(sbld2.toString())) {
            System.out.println("StringBuilder objects are equal");
        } else {
            System.out.println("StringBuilder objects are not equal");
        }


// contentEquals() method compares a String object to any implementation of the CharSequence interface (StringBuffer/StringBuilder) for equality of value.
//        first parameter should be always String

    }
}