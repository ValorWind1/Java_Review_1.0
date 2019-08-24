package intermidiate_Java.file_class;

import java.io.File;


public class fileclass {
    public static void main(String[] args) {

        // look for file and their existence

         File x = new File("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\intermidiate_Java\\file_class\\test.txt");

            if(x.exists())
                System.out.println(x.getName() + "exist!");

            else
                System.out.println("this thing doesn't exist ");


    }


}
