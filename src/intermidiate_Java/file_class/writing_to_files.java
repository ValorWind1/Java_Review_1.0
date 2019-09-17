package intermidiate_Java.file_class;

import java.io.*;
import java.lang.*;
import java.util.*;

public class writing_to_files {

    private Formatter x ;

    public void openFile(){

        try{
            x = new Formatter("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\intermidiate_Java\\file_class\\chinese.txt");
        }
        catch(Exception e){
            System.out.println("error");
        }
    }

    public void addRecords(){
        x.format("%s%s%s","20 ","aamd ","ley"); // print whatever you want to file
        x.format("%s%s%s","40 ","intel ","marg");
        x.format("%s%s%s","70 ","sony ","noman");
        x.format("%s%s%s","49 ","ibm ","lee");
    }
    public void closeFile(){
        x.close();
    }

    public static void main(String[] args) {
        writing_to_files  cobj = new writing_to_files();

        cobj.openFile();
        cobj.addRecords();
        cobj.closeFile();
    }
}
