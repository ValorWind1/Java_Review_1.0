package intermidiate_Java.file_class;

import java.util.*;

public class createFiles {

    public static void main(String[] args) {

        final Formatter x;   // formatter variable  outputs strings to a file

        try{

            x = new Formatter("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\intermidiate_Java\\file_class\\test.txt");
            System.out.println("you created a file ");

        }catch (Exception e){

            System.out.println("error ! ");
        }


    }


}
