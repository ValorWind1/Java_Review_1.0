package java_tutorial.Files;

import java.io.File;

public class file_class {
    public static void main(String [] args){

        File x = new File("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\file1.txt");

        if(x.exists()){
            System.out.println(x.getName()+"  exists!");
        }else{
            System.out.println("doesnt exist");
        }


    }
}
