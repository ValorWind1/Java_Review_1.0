package intermidiate_Java.Intermidiate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda_iterating {
    public static void main(String[] args) {

        String [] array1 = {"Tom","Harris","Eric"};

        Arrays.stream(array1).forEach(i -> System.out.println(i));

        System.out.println();

        List<String> list = new ArrayList<>();
        list.add("hey");
        list.add("hi");
        list.add("hello");
        list.forEach((x)-> System.out.println(x));

    }
}
