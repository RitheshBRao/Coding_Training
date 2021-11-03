import java.util.ArrayList;

public class CharForFun {

    public static void main(String[] args) {
        String name = "This is Rithesh B Rao";
        convert(name);
        System.out.println(convert(name));
    }

    public static ArrayList convert(String name) {

        char nameChar[] = name.toCharArray();

        ArrayList finalChar = new ArrayList();

        for (char c : nameChar) {
            if (Character.isUpperCase(c)) {
//                System.out.println(c);
                finalChar.add(c);

            }
        }

        return finalChar;

    }
}

