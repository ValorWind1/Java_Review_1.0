package intermidiate_Java.iterator_vs_iterable;

public class Ex {

    public static void main(String[] args) {

        CustomArrayList<String> myCustomArray = new CustomArrayList<>();

        myCustomArray.add("test value 1 ");
        myCustomArray.add("custom value 2 ");
        myCustomArray.add("test value 3 ");

        for (String i:myCustomArray){
            System.out.println(i);
        }
    }
}
