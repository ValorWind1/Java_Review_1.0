package java_youtubeclips.reverseString;

public class ReverseForLoop {

    static String reversign(String input){
        String result = "";

        for (int i = input.length() -1; i >= 0; i-- ){
            result = result + input.charAt(i);
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {

        reversign("Hello There");

    }
}
