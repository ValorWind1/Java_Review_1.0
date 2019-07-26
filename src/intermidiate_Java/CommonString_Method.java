package intermidiate_Java;

public class CommonString_Method {
    public static void main(String[] args) {

        String[] words = {"funk", "chunk", "furry", "baconator"};

        for (String w : words) {
            if (w.startsWith("fu")) {
                System.out.println(w + " starts with fu");
            }
        }
        for (String a : words) {
            if (a.endsWith("or")) {
                System.out.println(a + " ends with or");
            }
        }
    }
}
