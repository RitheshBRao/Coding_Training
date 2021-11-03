public class ConcatPlusAppend {

    public static void main(String[] args) {
        String a = "Rithesh";
        System.out.println(a.concat(null));
//  Concat method:
//  Rule 1 -> Cannot concat null (But + operator can)
//  Rule 2 -> Cannot concat integer type -> always need String type
//  Rule 3 -> Concat is mutable -> it will create additional memory (So use append using StringBuffer) - Better idea


    }

}
