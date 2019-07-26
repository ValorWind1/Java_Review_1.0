package intermidiate_Java;

public class StringMethods_findStrings_SubStrings {
    public static void main(String[] args) {

        String s = "DanielDanielDanielDaniel";

        System.out.println(s.indexOf("a")); // finding strings ("(string your looking for) ", starting point)

        System.out.println(s.indexOf("el")); // finding substrings



        String a = "Bacon ";
        String b = "       Monster          ";

        System.out.println(a.concat(b));// concatenate strings



        // replace strings
        System.out.println(a.replace("B","F"));


        // changing all letter to Uppercases
        System.out.println(a.toUpperCase());


        //trimming spaces
        System.out.println(b.trim());

    }
}
