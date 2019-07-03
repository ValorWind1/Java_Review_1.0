package java_tutorial.Files;

import java.util.*;


public class create_files {

    public static void main(String[] args) {



    final Formatter x;  // outputs strings to a file

    try {

        x = new Formatter("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\java_tutorial\\Files\\file1.txt");
        System.out.println("file created");

    }
    catch (Exception e){
        System.out.println("Error occurred");
    }

    }

}
