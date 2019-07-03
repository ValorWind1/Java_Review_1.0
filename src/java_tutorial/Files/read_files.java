package java_tutorial.Files;

import java.io.*;
import java.util.*;

public class read_files {

    private Scanner x ;

    public void openFile(){

        try{
            x=new Scanner(new File("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\java_tutorial\\Files\\file2.txt"));
        }
        catch (Exception e){
            System.out.println("Error!");
        }
    }

    public void readFile(){

        while(x.hasNext()){     // has next = it will loop along the file until it reaches the end

            String a = x.next();
            String b = x.next();
            String c = x.next();

            System.out.printf("%s %s %s\n",a,b,c);

        }

    }

    public void closeFile(){
        x.close();
    }


}
