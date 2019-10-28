package intermidiate_Java.compareTo1;

public class CompareTo1 {
    public static void main(String[] args) {

        String string1 = "Harry";
        String string2 = "Henry";

        System.out.println(string1.compareTo(string2));

        if(string1.compareTo(string2) < 0 ){
            System.out.println("string 1 comes first");
        }
        else if (string1.compareTo(string2) > 0 ){
            System.out.println("string 2 comes first");
        }
        else {
            System.out.println("they are equal");
        }

    }
}